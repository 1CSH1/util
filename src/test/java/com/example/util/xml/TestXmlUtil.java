package com.example.util.xml;

import com.example.util.json.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author James-CSH
 * @since 17-4-6 下午9:08
 */
public class TestXmlUtil {

    @Test
    public void testObject2Xml() {
        Person person = new Person();
        person.setId(12);
        person.setName("James勒布朗");
        person.setAge(32);
        person.setGender(1);
        Person child = new Person();
        child.setId(1);
        child.setName("James勒布朗11");
        child.setAge(1);
        child.setGender(1);
        child.setChildren(null);

        List<Person> children = new ArrayList<Person>();
        children.add(child);

//        person.setChildren(children);
System.out.println(XmlUtil.object2xml(person));
    }


}
