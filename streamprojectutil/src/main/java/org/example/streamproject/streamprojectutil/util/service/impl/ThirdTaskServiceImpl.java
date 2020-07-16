package org.example.streamproject.streamprojectutil.util.service.impl;

import org.example.streamproject.streamprojectutil.util.service.NecessaryMethods;
import org.example.streamproject.streamprojectutil.util.service.interfaces.ThirdTaskService;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdTaskServiceImpl implements ThirdTaskService {

    @Override
    public List<String> cutRegexFromString() {

        String regex = "[a]";
        return NecessaryMethods.createListOfStrings().stream()
                .map(n -> n.replaceAll(regex, ""))
                .collect(Collectors.toList());
    }
}
