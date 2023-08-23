package com.stankevichivan.javacore.chapter18;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<>();
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);
        System.out.print("Исходное содержимое массива vals: \n");
        Spliterator<Double> spliterator = vals.spliterator();
        while(spliterator.tryAdvance((n) -> System.out.println(n)));
        System.out.println();
        spliterator = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while(spliterator.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));
        System.out.print("Coдepжимoe списочного массива sqrs : \n");
        spliterator = sqrs.spliterator();
        spliterator.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
