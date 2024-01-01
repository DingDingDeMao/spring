package com.linzhongyoushenjun.bean;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.bean
 * @Date：2024/1/1 20:32
 * @Filename：UserDao
 * @description:
 */
public class UserDao {
    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "张无忌");
        hashMap.put("10002", "周芷若");
        hashMap.put("10003", "朱元璋");
    }
    public String queryUserName(String uId){
        return "用户查询中..."+hashMap.get(uId);
    }
}
