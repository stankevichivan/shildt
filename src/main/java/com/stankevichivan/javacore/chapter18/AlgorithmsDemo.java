package com.stankevichivan.javacore.chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);
        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(ll, r);
        System.out.print("Cпиcoк отсортирован в обратном порядке: ");
        for (Integer i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();
        Collections.shuffle(ll);
        System.out.print("Список перетасован: ");
        for (Integer i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Минимум: " + Collections.min(ll));
        System.out.println("Максимум: " + Collections.max(ll));
    }
}
