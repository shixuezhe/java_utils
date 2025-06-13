package com.boot.utils;

import org.apache.commons.collections4.MapUtils;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * @author ： liyang
 * &#064;@date    ： 2025/6/12 19:04
 * &#064;@description：
 */
public class MapUtilsTest {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> map1 = new HashMap<>();
        map.put("name", "jack");
        map.put("age", 18);


        System.out.println(MapUtils.getObject(map, "name"));
        System.out.println(map.get("names"));
        System.out.println(MapUtils.getObject(map, "names"));
        System.out.println(MapUtils.getObject(map1, "names", "jacks"));

        System.out.println(MapUtils.isEmpty(map1));


        System.out.println("-------------------");
        Map<String, Object> map2 = null;
        System.out.println(MapUtils.getObject(map2, "name"));

        Map<String, Object> map3 = new HashMap<>();
        map3.put("address", "四川省成都市");

        Map<String, Object> mapTotal = new HashMap<>();
        MapUtils.putAll(mapTotal, new Object[]{"sex","man"});
        System.out.println(mapTotal);

        MapUtils.safeAddToMap(mapTotal, "age", "22");
        System.out.println(mapTotal);


    }
}
