package org.example.streamproject.streamprojectmain;

import org.example.streamproject.streamprojectutil.util.service.NecessaryMethods;
import org.example.streamproject.streamprojectutil.util.service.impl.*;
import org.example.streamproject.streamprojectutil.util.service.interfaces.*;

public class Main {
    public static void main(String[] args) {
        FirstTaskService firstTask = new FirstTaskServiceImpl();
        System.out.println("Task1 : ");
        firstTask.findMaxMinSumAverageFromArray();
        System.out.println("\n");

        SecondTaskService secondTask = new SecondTaskServiceImpl();
        System.out.println("Task2 : ");
        System.out.println(secondTask.makeListWithLeapYears());
        System.out.println("\n");

        ThirdTaskService thirdTask = new ThirdTaskServiceImpl();
        System.out.println("Task3 : ");
        System.out.println(thirdTask.cutRegexFromString());
        System.out.println("\n");

        FourthTaskService fourthTask = new FourthTaskServiceImpl();
        System.out.println("Task4 : ");
        fourthTask.returnAllPalindromesFromList(NecessaryMethods.creatListForPalindromeMethod());
        System.out.println("\n");

        FifthTaskService fifthTask = new FifthTaskServiceImpl();
        System.out.println("Task5 : ");
        System.out.println(fifthTask.primeNumb(5));
        System.out.println("\n");

        SixthTaskService sixthTask = new SixthTaskServiceImpl();
        System.out.println("Task6 : ");
        sixthTask.createMapWithEmployeesBirthDayDates(NecessaryMethods.createListOfLocalDates());
        System.out.println("\n");

        SeventhTaskService seventhTask = new SeventhTaskServiceImpl();
        System.out.println("Task7 : ");
        seventhTask.createNewArraysFromArray(NecessaryMethods.createIntArray());
        System.out.println("\n");

        EighthTaskService eighthTask = new EighthTaskServiceImpl();
        System.out.println("Task8 : ");
        eighthTask.createGeneralUnaryOperator(NecessaryMethods.createListOfUnaryOperators(), 5);


    }
}
