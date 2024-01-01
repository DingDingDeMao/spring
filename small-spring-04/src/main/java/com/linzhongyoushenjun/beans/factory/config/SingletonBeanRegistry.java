package com.linzhongyoushenjun.beans.factory.config;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory.config
 * @Date：2024/1/1 0:29
 * @Filename：SingletonBeanRegistry
 * @description:
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
