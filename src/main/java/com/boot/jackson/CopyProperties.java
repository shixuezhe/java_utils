package com.boot.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ： liyang
 * &#064;@date    ： 2025/6/12 16:30
 * &#064;@description：
 */
public class CopyProperties {
    public static void main(String[] args) {
//        BeanUtilsCopy();

        jackSonCopy();
    }

    public static void BeanUtilsCopy() {
        Student source = new Student("jack", 18, new ArrayList<>(Arrays.asList("football", "basketball")));
        System.out.println(source);

        Student target = new Student();

        //copy的对象引用地址相同，会造成连锁修改
        BeanUtils.copyProperties(source, target);
        System.out.println(target);


        source.addHobby();
        System.out.println(target);

    }

    public static void jackSonCopy() {
        Student source = new Student("jack", 18, new ArrayList<>(Arrays.asList("football", "basketball")));
        System.out.println(source);

        Student target = new Student();

        try {
            target = JacksonUtils.parse(JacksonUtils.toJson(source), Student.class);
            System.out.println(target);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        source.addHobby();
        System.out.println(target);
    }


}

