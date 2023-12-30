package com.linzhongyoushenjun.beans.factory.support;

import com.linzhongyoushenjun.beans.BeansException;
import com.linzhongyoushenjun.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory.support
 * @Date：2023/12/30 18:02
 * @Filename：DefaultListableBeanFactory
 * @description:
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{
    public static final Map<String,BeanDefinition> beanDefinitionMap = new HashMap<>();
    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if(beanDefinition == null) throw new BeansException("No bean named '" + beanName + "' is defined");
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName,beanDefinition);
    }
}
