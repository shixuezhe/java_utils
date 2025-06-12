package com.boot.utils;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtilsTest {
    public static void main(String[] args) {
        ArrayList<String> alist1 = new ArrayList<String>(Arrays.asList("a", "b", "c"));
        ArrayList<String> alist2 = new ArrayList<String>(Arrays.asList("h", "j", "k"));

        int[] list3 = new int[]{1,2,3};
        int[] list4 = new int[]{4,5,6};

        int[] mergeList1 = new int[list3.length + list4.length];
        System.arraycopy(list4, 0, mergeList1, 0, list4.length);
        System.arraycopy(list3, 0, mergeList1, list4.length, list3.length);
        Arrays.sort(mergeList1);
        for (int i = 0; i < mergeList1.length; i++) {
            System.out.println(mergeList1[i]);
        }

        System.out.println(Arrays.binarySearch(mergeList1, 5));

        ArrayList<String> mergeList2 = new ArrayList<String>();
        mergeList2.addAll(alist1);
        mergeList2.addAll(alist2);
        System.out.println(mergeList2);
    }


}
