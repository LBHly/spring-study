package com.lbh2.Service;

public class HelloService {
    private String name = "hello 默认值";
    private int age = 8;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String hello() {
        return "HelloService{"+
                "name='" + name +'\'' +",age=" + age +'}';
    }
}



