package com.linzhongyoushenjun.beans.factory.support;

import com.linzhongyoushenjun.beans.BeansException;
import com.linzhongyoushenjun.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory.support
 * @Date：2023/12/31 18:15
 * @Filename：AbstractAutowireCapableBeanFactory
 * @description:
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

  private CglibSubclassingInstantiationStrategy instantiationStrategy  = new CglibSubclassingInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException {
        Object bean = null;
        try {
            bean = createBeanInstance(beanName, beanDefinition, args);
        } catch (Exception e) {
            throw new BeansException("实例化bean失败",e);
        }
        addSingleton(beanName,bean);
        return bean;
    }

    protected  Object createBeanInstance(String beanName, BeanDefinition beanDefinition,Object[] args){
        Constructor<?> constructorToUse = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructors  = beanClass.getDeclaredConstructors();
        for (Constructor ctor  : declaredConstructors) {
            if(null != args && ctor.getParameterTypes().length == args.length){
                constructorToUse = ctor;
                break;
            }
        }
        return instantiationStrategy.InstantiationStrategy(beanDefinition, beanName, constructorToUse, args);
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = (CglibSubclassingInstantiationStrategy) instantiationStrategy;
    }

}
