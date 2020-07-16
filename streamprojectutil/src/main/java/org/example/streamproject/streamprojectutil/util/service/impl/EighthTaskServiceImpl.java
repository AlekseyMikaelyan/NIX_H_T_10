package org.example.streamproject.streamprojectutil.util.service.impl;

import org.example.streamproject.streamprojectutil.util.service.interfaces.EighthTaskService;

import java.util.List;
import java.util.function.UnaryOperator;

public class EighthTaskServiceImpl implements EighthTaskService {

    @Override
    public void createGeneralUnaryOperator(List<UnaryOperator<Integer>> unaryOperators, Integer number) {

        UnaryOperator<Integer> result = unaryOperators.stream()
                .reduce(s -> s,(a,b) -> s -> b.apply(a.apply(s)));
        System.out.println(result.apply(number));
    }
}
