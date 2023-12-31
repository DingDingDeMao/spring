package com.linzhongyoushenjun.test.beans;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.test.beans
 * @Date：2023/12/31 17:39
 * @Filename：UserService
 * @description:
 */
public class UserService {
    private String name;

    public UserService() {
    }

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息");
    }

    @Override
    public String toString() {
        return "UserService{" +
                "name='" + name + '\'' +
                '}';
    }
}
