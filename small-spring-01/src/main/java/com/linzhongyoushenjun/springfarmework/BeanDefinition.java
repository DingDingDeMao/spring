package com.linzhongyoushenjun.springfarmework;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun
 * @Date：2023/12/30 2:22
 * @Filename：BeanDefinition
 * @description:
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
