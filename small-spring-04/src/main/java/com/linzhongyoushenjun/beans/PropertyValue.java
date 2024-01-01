package com.linzhongyoushenjun.beans;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans
 * @Date：2024/1/1 0:17
 * @Filename：PropertyValue
 * @description:
 */
public class PropertyValue {
    private final String name;
    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
