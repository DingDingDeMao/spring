package com.linzhongyoushenjun.beans.factory.support;

import com.linzhongyoushenjun.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory.support
 * @Date：2023/12/31 16:27
 * @Filename：DefaultSingletonBeanRegistry
 * @description: 注册单例bean
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    public Map<String,Object> singletonObjects = new HashMap<>();
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }
    protected void addSingleton(String beanName,Object singletonObject){
        singletonObjects.put(beanName,singletonObject);
    }
}
