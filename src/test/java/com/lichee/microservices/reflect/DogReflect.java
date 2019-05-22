package com.lichee.microservices.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DogReflect {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class<?> mainClass = Dog.class;
        Method mainMethod = mainClass.getDeclaredMethod("main", String[].class);
        mainMethod.invoke(new Dog(), new Object[] { null });
    }
}
