package com.linzhongyoushenjun.beans.factory.support;

import com.linzhongyoushenjun.beans.BeansException;
import com.linzhongyoushenjun.beans.factory.BeanFactory;
import com.linzhongyoushenjun.beans.factory.config.BeanDefinition;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory.support
 * @Date：2023/12/31 17:50
 * @Filename：AbstractBeanFactory
 * @description:
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String beanName) throws BeansException {
        return getBeanDefinition(beanName);
    }

    @Override
    public Object getBean(String beanName, Object... args) throws BeansException {
        return doGetBean(beanName, args);
    }

    protected <T> T doGetBean(String name, final Object[] args) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String name) throws BeansException;


    protected abstract Object createBean(String beanName,BeanDefinition beanDefinition,Object[] args) throws BeansException;
}
