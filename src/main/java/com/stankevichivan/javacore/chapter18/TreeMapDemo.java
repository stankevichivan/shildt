package com.stankevichivan.javacore.chapter18;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>();
        tm.put("Джон Доу", new Double(3434.34));
        tm.put("Том Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double(1378.00));
        tm.put("Тод Халл", new Double(99.22));
        tm.put("Ральф Смит", new Double(-19.08));
        Set<Map.Entry<String, Double>> entries = tm.entrySet();
        for (Map.Entry<String, Double> me : entries) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        var balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счёте Джон Доу: " + tm.get("Джон Доу"));
    }
}
