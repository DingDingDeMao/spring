package com.linzhongyoushenjun.beans.factory.support;

import com.linzhongyoushenjun.beans.BeansException;
import com.linzhongyoushenjun.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory.support
 * @Date：2023/12/31 19:45
 * @Filename：SimpleInstantiationStrategy
 * @description:
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object InstantiationStrategy(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Class clazz = beanDefinition.getBeanClass();
        try {
            if(null!= ctor){
                return clazz.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
            }else{
                return clazz.newInstance();
            }
        } catch (InstantiationException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new BeansException("Failed to instantiate [" + clazz.getName() + "]", e);
        }
    }
}
