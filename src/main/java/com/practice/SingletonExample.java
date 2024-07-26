package com.practice;

public class SingletonExample {

    private static SingletonExample single_Instance = null;

    public String s;

    private SingletonExample (){
        s = "Hello I am part of singleton class";
    }

    public static synchronized SingletonExample getInstance(){
        if(single_Instance == null){
            single_Instance = new SingletonExample();
        }

        return single_Instance;
    }
}
