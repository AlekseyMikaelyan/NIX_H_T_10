package org.example.streamproject.streamprojectutil.util.service.impl;

import org.example.streamproject.streamprojectutil.util.service.interfaces.FifthTaskService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class FifthTaskServiceImpl implements FifthTaskService {

    public boolean isPrime(long n) {
        return LongStream.rangeClosed(2, (long)Math.sqrt(n))
                .allMatch(i -> n % i != 0);
    }

    @Override
    public List<Long> primeNumb(long n) {
        return LongStream.iterate(0, l -> l +1)
                .filter(this::isPrime)
                .limit(n)
                .boxed()
                .collect(Collectors.toList());
    }
}
