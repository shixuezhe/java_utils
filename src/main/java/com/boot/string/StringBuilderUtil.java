package com.boot.string;

/**
 * @author ： liyang
 * &#064;@date    ： 2025/6/12 18:24
 * &#064;@description：
 */
public class StringBuilderUtil {
    //创建每个线程的ThreadLocal对象，并缓存一个StringBuilder对象
    private static final ThreadLocal<StringBuilder> threadLocalStringBuilder =
            ThreadLocal.withInitial(StringBuilder::new);


    public static void main(String[] args) {
        String append = append("hello", "world", "java", "boot");
        System.out.println(append);

        String append1 = append("hello", "world", "java", "spring");
        System.out.println(append1);
    }
    public static String append(String... values) {
        StringBuilder sb = threadLocalStringBuilder.get();
        for (String value : values) {
            sb.append(value);
        }

        String result  = sb.toString();

        //操作完就置为空
        sb.setLength(0);

        return result;
    }
}
