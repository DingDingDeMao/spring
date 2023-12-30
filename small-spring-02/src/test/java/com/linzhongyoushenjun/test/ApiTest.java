package com.linzhongyoushenjun.test;

import com.linzhongyoushenjun.beans.factory.config.BeanDefinition;
import com.linzhongyoushenjun.beans.factory.support.DefaultListableBeanFactory;
import com.linzhongyoushenjun.test.bean.UserService;
import org.junit.Test;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.test
 * @Date：2023/12/30 18:44
 * @Filename：ApiTest
 * @description:
 */
public class ApiTest {
    @Test
    public void test() {
        //1、初始化bean工厂
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //2、注册bean
            //初始化bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("UserService", beanDefinition);

        //3、第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("UserService");
        userService.queryUserInfo();
        System.out.println("userService的hashCode = " + userService.hashCode());

        //4、获取单例bean   看hashcode是否一样
        UserService userService2 = (UserService) beanFactory.getBean("UserService");
        userService2.queryUserInfo();
        System.out.println("userService2的hashcode = " + userService2.hashCode());
    }
}
