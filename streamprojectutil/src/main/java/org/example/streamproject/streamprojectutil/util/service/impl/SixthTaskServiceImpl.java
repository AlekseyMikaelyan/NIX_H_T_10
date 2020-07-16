package org.example.streamproject.streamprojectutil.util.service.impl;

import org.example.streamproject.streamprojectutil.util.service.interfaces.SixthTaskService;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SixthTaskServiceImpl implements SixthTaskService {


    @Override
    public void createMapWithEmployeesBirthDayDates(List<LocalDate> list) {

        Map<Month, Integer> mapOfBirthDayDates = new HashMap<>();

        list.stream().forEach(l -> {
                Month month = l.getMonth();
            mapOfBirthDayDates.merge(month, 1, Integer::sum);
        });

        mapOfBirthDayDates.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
