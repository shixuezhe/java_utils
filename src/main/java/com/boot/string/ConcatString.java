package com.boot.string;

/**
 * @author ： liyang
 * &#064;@date    ： 2025/6/12 18:01
 * &#064;@description：
 */
public class ConcatString {
    public static void main(String[] args) {
        System.out.println(concat("hello", "world", "java", "boot"));
    }

    public static String concat(String... values) {
        StringBuilder sb = new StringBuilder();
        for (String value : values) {
            sb.append(value);
            sb.append(" ");
        }
        return sb.toString();
    }

}
