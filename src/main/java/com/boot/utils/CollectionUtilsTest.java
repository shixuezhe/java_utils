package com.boot.utils;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionUtilsTest {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("a","b","c"));
        System.out.println(list1);
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("e","b","c"));
        System.out.println(list2);

        System.out.println("------------------");
        System.out.println(CollectionUtils.isEmpty(list1));
        System.out.println(CollectionUtils.union(list1,list2));
        System.out.println(CollectionUtils.intersection(list1,list2));
        System.out.println(CollectionUtils.subtract(list1,list2));
        System.out.println(CollectionUtils.isEqualCollection(list1,list2));
        System.out.println(CollectionUtils.containsAny(list1,list2));
    }
}
