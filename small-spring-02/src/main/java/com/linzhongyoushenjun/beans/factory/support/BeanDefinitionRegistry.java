package com.linzhongyoushenjun.beans.factory.support;

import com.linzhongyoushenjun.beans.factory.config.BeanDefinition;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory.support
 * @Date：2023/12/30 17:59
 * @Filename：BeanDefinitionRegistry
 * @description:
 */
public interface BeanDefinitionRegistry {
    /**
     *  向注册表中注册 BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
