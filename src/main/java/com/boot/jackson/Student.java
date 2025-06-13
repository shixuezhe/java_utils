package com.boot.jackson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author ： liyang
 * &#064;@date    ： 2025/6/12 16:37
 * &#064;@description：
 */
@Data
@Setter
public class Student {
    private String name;
    private int age;
    private List<String> hobbies;

    public Student() {
    }

    public Student(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void addHobby() {
        this.hobbies.add("sfkla");
    }
}
