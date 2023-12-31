package com.linzhongyoushenjun.beans.factory.support;

import com.linzhongyoushenjun.beans.factory.config.BeanDefinition;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory.support
 * @Date：2023/12/31 18:11
 * @Filename：BeanDefinitionRegistry
 * @description:
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
