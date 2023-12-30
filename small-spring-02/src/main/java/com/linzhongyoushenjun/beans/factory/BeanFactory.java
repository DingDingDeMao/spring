package com.linzhongyoushenjun.beans.factory;

import com.linzhongyoushenjun.beans.BeansException;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory
 * @Date：2023/12/30 16:36
 * @Filename：BeanFactory
 * @description: bean工厂
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
