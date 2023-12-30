package com.linzhongyoushenjun.springfarmework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun
 * @Date：2023/12/30 2:25
 * @Filename：BeanFactory
 * @description:
 */
public class BeanFactory {
    private Map<String,BeanDefinition> beanDefinitionMap  = new ConcurrentHashMap();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name,BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
