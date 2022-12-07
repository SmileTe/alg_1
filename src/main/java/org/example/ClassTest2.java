package org.example;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.StreamHandler;

public class ClassTest2 implements StringListInteger{
    public static Integer[] list1 ;
    public static int size;

    public ClassTest2(Integer[] list) {
        this.list1 = list;
    }

    public ClassTest2() {
        this.list1 = new Integer[10];
    }

    @Override
    public Integer add(Integer item) {
        validateItem(item);
        this.list1[size++] =item;
        return item;
    }

    public Integer[] getList1() {
        return this.list1;
    }

    @Override
    public Integer add(int index, Integer item) {
        validateItem(item);
        validateSize(index);
        this.list1[index] =item;
        size++;
        return item;
    }

    @Override
    public Integer set(int index, Integer item) {
        validateItem(item);
        validateSize(index);
        this.list1[index] =item;
        return item;
    }

    @Override
    public Integer remove(Integer item) {
        validateItem(item);

        int index = indexOf(item);

            return remove(index);


    }

      @Override
    public Integer remove(int index) {

        validateSize(index);
        Integer item =  this.list1[index];
      if(index!=size) {
          System.arraycopy(list1, index + 1, list1, index, size - index);
          size--;
      }
        return item;
    }

    @Override
    public boolean contains(Integer item) {
       // return  this.list1.equals(item);
        Integer[] array =this.getList1();
        sort(array);
        return contains(array,item);
    }

    @Override
    public int indexOf(Integer item) {
        for (int i = 0; i <size; i++) {
           if(list1[i].equals(item)) {
               return i;
           }
        }

            return -1;

    }

    @Override
    public int lastIndexOf(Integer item) {

        for (int i = size-1; i >=0; i--) {
            if(list1[i].equals(item)) {
                return i;
            }
        }

        return -1;


    }

    @Override
    public Integer get(int index) {
        validateSize(index);

        return  list1[index];
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

        size=0;
    }

    @Override
    public Integer[] toArray() {
        return  Arrays.copyOf(list1, size);
    }

    private void validateItem(Integer item)  {
        if(item==null){
            throw new NullPointerException();
        }
    }

    private void validateSize(int index) {
        if(index > this.getList1().length-1){
            throw new ArrayIndexOutOfBoundsException();
        }
    }


    public void sort(Integer[] arrayList) {

        //сортировка

        sortSelection(arrayList);

        //вывод результата

        for (Integer i :
                arrayList) {
            System.out.print(i+ " ");
        }

    }

    public static void sortSelection(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            swapElements(arr, i, minElementIndex);
        }
    }

    public static void swapElements(Integer[] arr, int i, int minElementIndex) {
    Integer a = arr[i];
    Integer b = arr[minElementIndex];
        arr[minElementIndex] = a;
        arr[i] = b;


    }


    //бинрный поиск
    public static boolean contains(Integer[] arr, Integer element) {
        Integer min = 0;
        Integer max = arr.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (element == arr[mid]) {
                return true;
            }

            if (element < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }

}
