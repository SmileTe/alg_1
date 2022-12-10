package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

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
        ClassTest2 classTest1 = new ClassTest2(arrayList);
        //второй массив
        Integer[] arrayList2 = new Integer[10];
        arrayList2[0] = 1;
        arrayList2[1] = 2;
        arrayList2[2] = 3;
        arrayList2[3] = 4;
        arrayList2[4] = 5;
        arrayList2[5] = 6;
        arrayList2[6] = 7;
        arrayList2[7] = 8;
        arrayList2[8] = 9;
        arrayList2[9] = 10;
        ClassTest2 cl = new ClassTest2(arrayList2);

        //третий массив
        Integer[] arrayList3 = new Integer[10];
        arrayList3[0] = 51;
        arrayList3[1] = 102;
        arrayList3[2] = 3;
        arrayList3[3] = 4;
        arrayList3[4] = 45;
        arrayList3[5] = 6;
        arrayList3[6] = 7;
        arrayList3[7] = 98;
        arrayList3[8] = 9;
        arrayList3[9] = 10;
        ClassTest2 classTest3 = new ClassTest2(arrayList3);

        //1-я сортировка
        //long start1 = System.currentTimeMillis();
        //classTest1.sort(arrayList);
        //System.out.println(" скорость-" +(System.currentTimeMillis() - start1));

//        long start2 = System.currentTimeMillis();
//        cl.sort(arrayList2);
//        System.out.println(" скорость-" +(System.currentTimeMillis() - start2));
//
//        long start3 = System.currentTimeMillis();
//        classTest3.sort(arrayList3);
//        System.out.println(" скорость-" +(System.currentTimeMillis() - start3));



    //2-я сортировка
//1
        long start1 = System.currentTimeMillis();
        //classTest1.sort(arrayList);
        quickSort(arrayList, 0, arrayList.length - 1);

        System.out.println(" скорость-" + (System.currentTimeMillis() - start1));

        for (Integer i :
                arrayList) {
            System.out.print(i + " ");

        }
        //2
        long start2 = System.currentTimeMillis();
        quickSort(arrayList2, 0, arrayList.length - 1);

        System.out.println(" скорость-" + (System.currentTimeMillis() - start1));

        for (Integer i :
                arrayList2) {
            System.out.print(i + " ");

        }

        //3
        long start3 = System.currentTimeMillis();
        quickSort(arrayList3, 0, arrayList.length - 1);

        System.out.println(" скорость-" + (System.currentTimeMillis() - start1));

        for (Integer i :
                arrayList3) {
            System.out.print(i + " ");

        }
    }




    public static void quickSort(Integer[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private static int partition(Integer[] arr, int begin, int end) {
        Integer pivot = arr[end];
        Integer i = (begin - 1);

        for (Integer j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                swapElements(arr, i, j);
            }
        }

        swapElements(arr, i + 1, end);
        return i + 1;
    }

    private static void swapElements(Integer[] arr, int left, int right) {
        Integer temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }



}