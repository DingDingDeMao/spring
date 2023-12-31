package com.linzhongyoushenjun.beans.factory;

import com.linzhongyoushenjun.beans.BeansException;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans
 * @Date：2023/12/31 16:12
 * @Filename：BeanFactory
 * @description:
 */
public interface BeanFactory {
    Object getBean(String beanName) throws BeansException;
    Object getBean(String beanName, Object... args) throws BeansException;
}
