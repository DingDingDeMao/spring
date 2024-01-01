package com.linzhongyoushenjun.bean;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.bean
 * @Date：2024/1/1 20:36
 * @Filename：UserService
 * @description:
 */
public class UserService {
    private String uId;
    private UserDao userDao;

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + userDao.queryUserName(uId));
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
