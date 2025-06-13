package com.boot.utils;


import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * @author ： liyang
 * &#064;@date    ： 2025/6/12 18:37
 * &#064;@description：
 */
public class StringUtilsTest {
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = " ";
        String str3 = null;
        String str4 = "1234";

        System.out.println(StringUtils.isEmpty(str1));
        System.out.println(StringUtils.isEmpty(str2));
        System.out.println(StringUtils.isEmpty(str3));

        System.out.println("-----------------------");

        System.out.println(StringUtils.isBlank(str2));

        System.out.println(StringUtils.substring(str1, 0, 5));
        System.out.println(Arrays.toString(StringUtils.split(str1, " ")));

        System.out.println(StringUtils.truncate(str1, 5));

        System.out.println(StringUtils.join(Arrays.asList("hello", "world", "java", "boot"), "-"));

        System.out.println(StringUtils.reverse(str1));
        System.out.println(StringUtils.defaultIfBlank(str2, "hello,wawwwa"));

        System.out.println(StringUtils.countMatches(str1, "l"));

        System.out.println(StringUtils.isNumeric(str4));

        System.out.println(StringUtils.contains(str1, "world"));
    }
}
