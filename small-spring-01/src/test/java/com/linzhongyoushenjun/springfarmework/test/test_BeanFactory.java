package com.linzhongyoushenjun.springfarmework.test;

import com.linzhongyoushenjun.springfarmework.BeanDefinition;
import com.linzhongyoushenjun.springfarmework.BeanFactory;
import com.linzhongyoushenjun.springfarmework.test.bean.UserService;
import org.junit.Test;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.test
 * @Date：2023/12/30 2:37
 * @Filename：test_BeanFactory
 * @description:
 */
public class test_BeanFactory {
    @Test
    public void test_BeanFactory() {
        //1、初始化bean工厂
        BeanFactory beanFactory = new BeanFactory();

        //2、注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //3、获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
