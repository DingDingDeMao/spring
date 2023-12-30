package com.linzhongyoushenjun.beans.factory.config;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory.config
 * @Date：2023/12/30 16:28
 * @Filename：SingletonBeanRegistry
 * @description: 单例注册
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
