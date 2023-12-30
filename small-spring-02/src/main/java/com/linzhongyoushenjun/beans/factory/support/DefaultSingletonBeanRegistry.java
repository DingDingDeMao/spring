package com.linzhongyoushenjun.beans.factory.support;

import com.linzhongyoushenjun.beans.factory.config.SingletonBeanRegistry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory.support
 * @Date：2023/12/30 16:44
 * @Filename：DefaultSingletonBeanRegistry
 * @description:
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    public static final Map<String,Object> singletonObjects = new ConcurrentHashMap<>();
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName,Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
