package org.example.streamproject.streamprojectutil.util.service.impl;

import org.example.streamproject.streamprojectutil.util.service.interfaces.FirstTaskService;
import org.example.streamproject.streamprojectutil.util.service.NecessaryMethods;

import java.util.function.Supplier;
import java.util.stream.DoubleStream;

public class FirstTaskServiceImpl implements FirstTaskService {

    @Override
    public void findMaxMinSumAverageFromArray() {
        Supplier<DoubleStream> streamSupplier = () -> DoubleStream.of(NecessaryMethods.createDoubleArray());

        System.out.println(streamSupplier.get().min().getAsDouble());
        System.out.println(streamSupplier.get().max().getAsDouble());
        System.out.println(streamSupplier.get().sum());
        System.out.println(streamSupplier.get().average().getAsDouble());
    }
}
