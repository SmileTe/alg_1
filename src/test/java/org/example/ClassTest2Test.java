package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ClassTest2Test {
    ClassTest2 test1 = new ClassTest2();

    @Before
    public void setUp(){
        Integer[] arrayList = new Integer[10];
        arrayList[0] = 105;
        arrayList[1] = 2;
        arrayList[2] = 1;
        arrayList[3] = 19;
        arrayList[4] = 79;
        arrayList[5] = 39;
        arrayList[6] = 29;
        arrayList[7] = 69;
        arrayList[8] = 59;
        arrayList[9] = 99;
        ClassTest2 test1 = new ClassTest2(arrayList);

    }
    @Test
    public void testAdd(){
        Integer a1 = test1.add(10);
        Integer a2 =  test1.add(2,125);
    }

    @Test
    public void testQuickSort(){

        test1.quickSort(test1.getList1(), 0, test1.getList1().length - 1);
    }





}
