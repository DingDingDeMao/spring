package com.linzhongyoushenjun.beans.factory.support;

import com.linzhongyoushenjun.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory.support
 * @Date：2024/1/1 0:38
 * @Filename：DefaultSingletonBeanRegistry
 * @description:
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry  {
    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

}
