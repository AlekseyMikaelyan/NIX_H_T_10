package org.example.streamproject.streamprojectutil.util.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.UnaryOperator;

public class NecessaryMethods {

    public static double [] createDoubleArray() {
        double [] array = new double[10];
        for(int i = 0; i < 10; i++) {
            array[i] = Math.random() * 10;
        }
        return array;
    }
    public static Collection<Integer> createCollectionOfYears() {

        Collection<Integer> collection = new ArrayList<>();
        collection.add(2000);
        collection.add(2001);
        collection.add(2002);
        collection.add(2003);
        collection.add(2004);
        collection.add(2005);
        collection.add(2006);
        collection.add(2007);
        collection.add(2008);
        collection.add(2009);
        collection.add(2010);
        collection.add(2011);
        collection.add(2012);

        return collection;
    }

    public static List<String> createListOfStrings() {

        List<String> list = new ArrayList<>();
        list.add("Aleksandra");
        list.add("Masha");
        list.add("Sasha");
        list.add("Taras");
        list.add("Malefisenta");
        list.add("Alan");

        return list;
    }

    public static List<String> creatListForPalindromeMethod() {

        List<String> list = new ArrayList<>();
        list.add("  ротор");
        list.add("да нет");
        list.add("привет  пока");
        list.add("заправляюсь только на окко");

        return list;
    }

    public static int [] createIntArray() {

        int [] array = new int[10];
        for(int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static List<UnaryOperator<Integer>> createListOfUnaryOperators() {

        List<UnaryOperator<Integer>> list = new ArrayList<>();
        list.add(x -> x * 3);
        list.add(x -> x / 2);
        list.add(x -> x + (x+7));
        list.add(x -> x -1);

        return list;
    }

    public static List<LocalDate> createListOfLocalDates() {

        List<LocalDate> list = new ArrayList<>();
        list.add(LocalDate.of(1990,7,2));
        list.add(LocalDate.of(1988,12,31));
        list.add(LocalDate.of(1995,7,17));
        list.add(LocalDate.of(1991,4,11));
        list.add(LocalDate.of(1991,1,12));
        list.add(LocalDate.of(1990,8,21));
        list.add(LocalDate.of(1993,6,29));
        list.add(LocalDate.of(1992,10,13));
        list.add(LocalDate.of(1997,7,10));
        list.add(LocalDate.of(1991,5,12));

        return list;

    }
}
