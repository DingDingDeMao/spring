package com.linzhongyoushenjun.beans.factory;

import com.linzhongyoushenjun.beans.BeansException;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory
 * @Date：2024/1/1 0:30
 * @Filename：BeanFactory
 * @description:
 */
public interface BeanFactory {

    Object getBean(String name);
    Object getBean(String name, Object... args) throws BeansException;
}
