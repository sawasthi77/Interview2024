package com.practice;

import java.lang.reflect.Constructor;

public class SingletonExample {

    private static SingletonExample single_Instance = null;

    public String s;

    private SingletonExample() {
        s = "Hello I am part of singleton class";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Cloning of this Object is not allowed");
    }

    public static synchronized SingletonExample getInstance() {
        if (single_Instance == null) {
            single_Instance = new SingletonExample();
        }

        return single_Instance;
    }
}

class TestSingleton{
    public static void main(String[] args) throws NoSuchMethodException {
        SingletonExample singletonExample1 = SingletonExample.getInstance();

        Constructor<SingletonExample> constructor = SingletonExample.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonExample singletonExample2 = SingletonExample.getInstance();

        System.out.println(singletonExample1);
        System.out.println(singletonExample2);
    }
}
