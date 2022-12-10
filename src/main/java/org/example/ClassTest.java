package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassTest implements StringList{
    public static ArrayList<String> list1 = new ArrayList<>();
    public static int size;

    public ClassTest(ArrayList<String> list1) {
        this.list1 = list1;
    }

    public ClassTest() {
        this.list1 = new ArrayList<>(10);
    }


    @Override
    public String add(String item) {
        validateItem(item);
       this.list1.add(size++,item);
        return item;
    }

    public  ArrayList<String> getList1() {
        return this.list1;
    }

    @Override
    public String add(int index, String item) {
       validateItem(item);
       validateSize(index);
        this.list1.add(index, item);
        size++;
        return item;
    }

    @Override
    public String set(int index, String item) {
        validateItem(item);
        validateSize(index);
        this.list1.set(index, item);
        return item;
    }

    @Override
    public String remove(String item) {
        validateItem(item);

        this.list1.remove( this.list1.indexOf(item));
        size--;
        return item;
    }

    @Override
    public String remove(int index) {

        validateSize(index);
        String item =  this.list1.get(index);
        this.list1.remove(index);
        size--;
        return item;
    }

    @Override
    public boolean contains(String item) {
        return  this.list1.equals(item);
    }

    @Override
    public int indexOf(String item) {
        return  this.list1.indexOf(item);
    }

    @Override
    public int lastIndexOf(String item) {
        return  this.list1.lastIndexOf(item);
    }

    @Override
    public String get(int index) {
                validateSize(index);

        return  this.list1.get(index);
    }

    @Override
    public boolean equals(StringList otherList) {
        return  this.list1.equals(otherList);
    }

    @Override
    public int size() {
        return  size;
    }

    @Override
    public boolean isEmpty() {
        return  size==0;
    }

    @Override
    public void clear() {
        this.list1.clear();
        size=0;
    }

    @Override
    public String[] toArray() {
        String[] array =  this.list1.toArray(new String[size]);
        Arrays.copyOf(array, size);

        return array;
    }

    private void validateItem(String item)  {
        if(item==null){
            throw new NullPointerException();
        }
    }

    private void validateSize(int index) {
        if(index > this.getList1().size()-1){
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
