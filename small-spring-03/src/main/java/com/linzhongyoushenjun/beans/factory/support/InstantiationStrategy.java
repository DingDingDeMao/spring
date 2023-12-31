package com.linzhongyoushenjun.beans.factory.support;

import com.linzhongyoushenjun.beans.BeansException;
import com.linzhongyoushenjun.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory.support
 * @Date：2023/12/31 18:45
 * @Filename：InstantiationStrategy
 * @description:  实例化策略
 */
public interface InstantiationStrategy {
    Object InstantiationStrategy(BeanDefinition beanDefinition, String beanName, Constructor ctor,Object[] args) throws BeansException;
}
