package org.example;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ClassTestTest extends TestCase {
    ClassTest test1 = new ClassTest();

    @Before
    public void setUp(){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("22");
        list1.add("221");
        list1.add("222");
        list1.add("223");
        list1.add("224");
        ClassTest test1 = new ClassTest(list1);

    }

    @Test
    public void testAdd(){
       String a1 = test1.add("89898");
        String a2 =  test1.add(2,"111");
    }

    @Test
    public void testSet() {
        String a1 = test1.set(2,"777");
    }
    @Test
    public void testRemove() {
        String a1 = test1.remove("555");
        String a2 =  test1.remove(10);
    }


    @Test
    public void testContains() {
     boolean a1=  test1.contains("fk");
    }
    @Test
    public void testIndexOf() {
       int i = test1.indexOf("66");
    }
    @Test
    public void testLastIndexOf() {
        int i = test1.lastIndexOf("sdsd");
    }
    @Test
    public void testGet() {
     String a1 = test1.get(3);
    }
    @Test
    public void testTestEquals() {
       ArrayList<String> list2 = new ArrayList<>();

        boolean a1 = test1.equals(list2);
    }
    @Test
    public void testSize() {
        int a1 = test1.size();
    }
    @Test
    public void testIsEmpty() {
        boolean a1 =test1.isEmpty();
    }
    @Test
    public void testClear() {
       test1.clear();
    }
    @Test
    public void testToArray() {
        var a1 = test1.toArray();
    }



}