package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/10 21:45
 */
public class Main {

    public static void main(String[] args) {
        Person a = new Person();
        a.setName("li");
        a.setGender((byte) 1);
        a.setBirthday(1576031890782L);

        Person b = a.clone();
        verify(a, b);
        a.setName("lu");
        verify(a, b);
    }

    static void verify(Person a, Person b){
        // ??? equals应该如何设计 ???
        System.out.println(a.equals(b));
        System.out.println(String.format("%s : %s", a.getName(), b.getName()));
    }
}
