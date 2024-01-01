package com.linzhongyoushenjun.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans
 * @Date：2024/1/1 0:19
 * @Filename：PropertyValues
 * @description:
 */
public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<PropertyValue>();
    public void addPropertyValue(PropertyValue pv) {
        propertyValueList.add(pv);
    }
    public  PropertyValue[] getPropertyValues() {
        return propertyValueList.toArray(new PropertyValue[0]);
    }
    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue pv : propertyValueList) {
            if (pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }
}
