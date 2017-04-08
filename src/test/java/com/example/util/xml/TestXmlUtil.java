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

System.out.println(XmlUtil.object2xml(person));
/*
<?xml version="1.0" encoding="utf-8"?>

<Person>
  <id>12</id>
  <name>James勒布朗</name>
  <age>32</age>
  <gender>1</gender>
</Person>

*/
    }

    @Test
    public void testArray2Xml() {
        Person[] persons = new Person[10];
        for (int i=0; i<persons.length; i++) {
            Person person = new Person();
            person.setId(i);
            person.setName("James勒布朗" + i);
            person.setAge(30 + i);
            person.setGender(i > 5 ? 1 : 0);
            Person child = new Person();
            child.setId(i * 10 + i);
            child.setName("James勒布朗" + 10 + i);
            child.setAge(i);
            child.setGender(1);
            child.setChildren(null);

            List<Person> children = new ArrayList<Person>();
            children.add(child);
            persons[i] = person;
        }
        System.out.println(XmlUtil.array2xml(persons));
/*
<?xml version="1.0" encoding="utf-8"?>
<Persons>
  <Person>
    <id>0</id>
    <name>James勒布朗0</name>
    <age>30</age>
    <gender>0</gender>
  </Person>
  <Person>
    <id>1</id>
    <name>James勒布朗1</name>
    <age>31</age>
    <gender>0</gender>
  </Person>
  <Person>
    <id>2</id>
    <name>James勒布朗2</name>
    <age>32</age>
    <gender>0</gender>
  </Person>
  <Person>
    <id>3</id>
    <name>James勒布朗3</name>
    <age>33</age>
    <gender>0</gender>
  </Person>
  <Person>
    <id>4</id>
    <name>James勒布朗4</name>
    <age>34</age>
    <gender>0</gender>
  </Person>
  <Person>
    <id>5</id>
    <name>James勒布朗5</name>
    <age>35</age>
    <gender>0</gender>
  </Person>
  <Person>
    <id>6</id>
    <name>James勒布朗6</name>
    <age>36</age>
    <gender>1</gender>
  </Person>
  <Person>
    <id>7</id>
    <name>James勒布朗7</name>
    <age>37</age>
    <gender>1</gender>
  </Person>
  <Person>
    <id>8</id>
    <name>James勒布朗8</name>
    <age>38</age>
    <gender>1</gender>
  </Person>
  <Person>
    <id>9</id>
    <name>James勒布朗9</name>
    <age>39</age>
    <gender>1</gender>
  </Person>
</Persons>

*/
    }

    @Test
    public void testList2Xml() {
        List<Person> persons = new ArrayList<Person>(10);
        for (int i = 0; i < 10; i++) {
            Person person = new Person();
            person.setId(i);
            person.setName("James勒布朗" + i);
            person.setAge(30 + i);
            person.setGender(i > 5 ? 1 : 0);
            Person child = new Person();
            child.setId(i * 10 + i);
            child.setName("James勒布朗" + 10 + i);
            child.setAge(i);
            child.setGender(1);
            child.setChildren(null);

            List<Person> children = new ArrayList<Person>();
            children.add(child);
            persons.add(person);
        }
        System.out.println(XmlUtil.list2xml(persons));
/*
<?xml version="1.0" encoding="utf-8"?>

<Persons>
  <Person>
    <id>0</id>
    <name>James勒布朗0</name>
    <age>30</age>
    <gender>0</gender>
  </Person>
  <Person>
    <id>1</id>
    <name>James勒布朗1</name>
    <age>31</age>
    <gender>0</gender>
  </Person>
  <Person>
    <id>2</id>
    <name>James勒布朗2</name>
    <age>32</age>
    <gender>0</gender>
  </Person>
  <Person>
    <id>3</id>
    <name>James勒布朗3</name>
    <age>33</age>
    <gender>0</gender>
  </Person>
  <Person>
    <id>4</id>
    <name>James勒布朗4</name>
    <age>34</age>
    <gender>0</gender>
  </Person>
  <Person>
    <id>5</id>
    <name>James勒布朗5</name>
    <age>35</age>
    <gender>0</gender>
  </Person>
  <Person>
    <id>6</id>
    <name>James勒布朗6</name>
    <age>36</age>
    <gender>1</gender>
  </Person>
  <Person>
    <id>7</id>
    <name>James勒布朗7</name>
    <age>37</age>
    <gender>1</gender>
  </Person>
  <Person>
    <id>8</id>
    <name>James勒布朗8</name>
    <age>38</age>
    <gender>1</gender>
  </Person>
  <Person>
    <id>9</id>
    <name>James勒布朗9</name>
    <age>39</age>
    <gender>1</gender>
  </Person>
</Persons>
 */
    }
}
