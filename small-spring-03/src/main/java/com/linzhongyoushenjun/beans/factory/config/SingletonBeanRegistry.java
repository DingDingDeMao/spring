package com.linzhongyoushenjun.beans.factory.config;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory.config
 * @Date：2023/12/31 16:07
 * @Filename：SingletonBeanRegistry
 * @description: 单例注册表
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
