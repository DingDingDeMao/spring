package com.linzhongyoushenjun.beans.factory.support;

import com.linzhongyoushenjun.beans.BeansException;
import com.linzhongyoushenjun.beans.factory.BeanFactory;
import com.linzhongyoushenjun.beans.factory.config.BeanDefinition;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory.support
 * @Date：2023/12/30 18:02
 * @Filename：AbstractBeanFactory
 * @description:
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if(bean!=null){
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
       return createBean(name,beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
