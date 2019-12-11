package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/11 10:24
 */
public class Person implements Cloneable {
    private String name;
    private byte gender;
    private long birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getGender() {
        return gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    @Override
    public Person clone() {
        Person person = new Person();
        try {
            person = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }
}
