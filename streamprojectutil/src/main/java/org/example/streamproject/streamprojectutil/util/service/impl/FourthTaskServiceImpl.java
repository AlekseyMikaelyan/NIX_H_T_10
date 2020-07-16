package org.example.streamproject.streamprojectutil.util.service.impl;

import org.example.streamproject.streamprojectutil.util.service.interfaces.FourthTaskService;
import java.util.List;

public class FourthTaskServiceImpl implements FourthTaskService {

    @Override
    public void returnAllPalindromesFromList(List<String> list) {

        list.stream().forEach(s -> {
            String [] array = s.split("[\\s]+");
            for(String string : array) {
                if(string.length() != 0) {
                    StringBuilder stringBuilder = new StringBuilder(string);
                    if(stringBuilder.reverse().toString().equals(string)){
                        System.out.println(string);
                    }
                }
            }
        });
    }
}
