package org.example.streamproject.streamprojectutil.util.service.impl;

import org.example.streamproject.streamprojectutil.util.service.interfaces.SeventhTaskService;
import java.util.Arrays;
import java.util.Collections;

public class SeventhTaskServiceImpl implements SeventhTaskService {

    @Override
    public void createNewArraysFromArray(int[] array) {

        int[] evenArray = Arrays.stream(array)
                .filter(i -> i % 2 == 0)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        for(int i : evenArray) {
            System.out.print(i + " ");
        }

        System.out.println();

        int[] unEvenArray = Arrays.stream(array)
                .filter(i -> i % 2 != 0)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        for(int i :unEvenArray) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
