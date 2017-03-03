package com.softgroup.common.utils;

import java.lang.reflect.ParameterizedType;

/**
 * Created by yuriy on 03.03.17.
 */
public class ReflectionUtils {

    public static Class getParamter(Class thatClass) {
        ParameterizedType type = (ParameterizedType) thatClass.getGenericSuperclass();
        return (Class) type.getActualTypeArguments()[0];
    }

}
