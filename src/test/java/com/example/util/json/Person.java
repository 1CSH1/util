package com.example.util.json;

import java.util.List;

/**
 * @author James-CSH
 * @since 17-3-31 下午10:49
 */
public class Person {

    private int id;
    private String name;
    private int age;
    private int gender;
    private List<Person> children;

    public Person() {
    }

    public Person(int id, String name, int age, int gender, List<Person> children) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.children = children;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", children=" + children +
                '}';
    }
}
