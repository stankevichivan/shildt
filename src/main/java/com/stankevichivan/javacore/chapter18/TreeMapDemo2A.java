package com.stankevichivan.javacore.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2A {
    public static void main(String[] args) {
        CompLastName compLN = new CompLastName();
        Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstName());
        TreeMap<String, Double> tm = new TreeMap<>(compLastThenFirst);
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

class CompLastName implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int i, j;
        i = o1.lastIndexOf(' ');
        j = o2.lastIndexOf(' ');
        return o1.substring(i).compareToIgnoreCase(o2.substring(j));
    }
}

class CompThenByFirstName implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}
