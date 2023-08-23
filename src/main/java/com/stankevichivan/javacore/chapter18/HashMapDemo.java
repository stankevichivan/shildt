package com.stankevichivan.javacore.chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("Джoн Доу", new Double(3434.34));
        hm.put("Toм Смит", new Double(123.22));
        hm.put("Джейн Бейкер", new Double(1378.00));
        hm.put("Toд Холл", new Double(99.22));
        hm.put("Paльф Смит", new Double(-19.08));
        Set<Map.Entry<String, Double>> entries = hm.entrySet();
        for (Map.Entry<String, Double> me : entries) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        var balance = hm.get("Джoн Доу");
        hm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счёте Джон Доу: " + hm.get("Джон Доу"));
    }
}
