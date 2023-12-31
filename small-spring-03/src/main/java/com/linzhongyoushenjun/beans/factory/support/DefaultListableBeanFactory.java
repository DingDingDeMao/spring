package com.linzhongyoushenjun.beans.factory.support;

import com.linzhongyoushenjun.beans.BeansException;
import com.linzhongyoushenjun.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory.support
 * @Date：2023/12/31 19:34
 * @Filename：DefaultListableBeanFactory
 * @description:
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{

    private Map<String,BeanDefinition>  beanDefinitionMap = new HashMap<>();
    @Override
    protected BeanDefinition getBeanDefinition(String name) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(name);
        if(beanDefinition==null) throw new BeansException("No bean named '" + name + "' is defined");
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
         beanDefinitionMap.put(beanName,beanDefinition);
    }
}
