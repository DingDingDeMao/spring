package com.linzhongyoushenjun.beans.factory.support;

import cn.hutool.core.bean.BeanUtil;
import com.linzhongyoushenjun.beans.BeansException;
import com.linzhongyoushenjun.beans.PropertyValue;
import com.linzhongyoushenjun.beans.PropertyValues;
import com.linzhongyoushenjun.beans.factory.config.BeanDefinition;
import com.linzhongyoushenjun.beans.factory.config.BeanReference;

import java.lang.reflect.Constructor;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory.support
 * @Date：2024/1/1 12:00
 * @Filename：AbstractAutowireCapableBeanFactory
 * @description:
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
  private InstantiationStrategy instantiationStrategy =   new CglibSubclassingInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException {
        Object bean = null;
        try {
            bean = createBeanInstance(beanDefinition,beanName,args);
            applyPropertyValues(beanName,bean,beanDefinition);
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed",e);
        }
        addSingleton(beanName,bean);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition,String beanName,Object[] args){
        Class beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructors  = beanClass.getDeclaredConstructors();

        Constructor<?> constructorToUse  = null;

        for (Constructor<?> ctor  : declaredConstructors) {
           if(args!=null && ctor.getParameterTypes().length==args.length){
               constructorToUse    = ctor;
               break;
           }
        }
       return getInstantiationStrategy().instantiate(beanDefinition,beanName,constructorToUse,args);
    }


    /**
     * 属性填充
     * @param beanName
     * @param bean
     * @param beanDefinition
     */
    protected  void applyPropertyValues(String beanName,Object bean,BeanDefinition beanDefinition){
        try {
            PropertyValues propertyValues = beanDefinition.getPropertyValues();
            for (PropertyValue propertyValue : propertyValues.getPropertyValues()) {
                String name = propertyValue.getName();
                Object value = propertyValue.getValue();
                if(value instanceof BeanReference){
                    // A 依赖 B，获取 B 的实例化
                    BeanReference beanReference = (BeanReference) value;
                    value = getBean(beanReference.getBeanName());
                }
                // 属性填充
                BeanUtil.setFieldValue(bean,name,value);
            }
        } catch (Exception e) {
            throw new BeansException("设置属性值失败",e);
        }
    }

    public  InstantiationStrategy  getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public  void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }
}
