package org.example.streamproject.streamprojectutil.util.service.impl;

import org.example.streamproject.streamprojectutil.util.service.NecessaryMethods;
import org.example.streamproject.streamprojectutil.util.service.interfaces.SecondTaskService;
import java.util.List;
import java.util.stream.Collectors;

public class SecondTaskServiceImpl implements SecondTaskService {

    @Override
    public List<Integer> makeListWithLeapYears() {

        return NecessaryMethods.createCollectionOfYears().stream().filter(n -> n % 4 == 0)
                .sorted()
                .collect(Collectors.toList());
    }
}
