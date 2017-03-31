package com.example.util.json;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author James-CSH
 * @since 17-3-31 下午10:47
 */
public class TestJsonUtil {

    @Test
    public void testObject() {
        Person person = new Person();
        person.setId(1);
        person.setName("James陈");
        person.setAge(23);
        person.setGender(1);

        Person child = new Person();
        child.setId(2);
        child.setName("James陈 儿子");
        child.setAge(2);
        child.setGender(1);

        List<Person> children = new ArrayList<Person>();
        children.add(child);
        person.setChildren(children);

        String personsJson = JsonUtil.object2json(person);
System.out.println(personsJson); //{"age":23,"children":[{"age":2,"children":[],"gender":1,"id":2,"name":"James陈 儿子"}],"gender":1,"id":1,"name":"James陈"}
        Person person2 = (Person) JsonUtil.json2object(personsJson, Person.class);
System.out.println(person2.toString()); //Person{id=1, name='James陈', age=23, gender=1, children=[Person{id=2, name='James陈 儿子', age=2, gender=1, children=[]}]}
    }

    @Test
    public void testArray() {

    }

    @Test
    public void testList() {

    }

    @Test
    public void testMap() {

    }


}
