package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {

    private static Map<String, Supplier<UserInterfaceFactory>> userInterfaceTypes = new HashMap<>();
    
    static {
        userInterfaceTypes.put("BLUE", BlueUserInterfaceFactory::new);
        userInterfaceTypes.put("RED", RedUserInterfaceFactory::new);
    }

    public static UserInterfaceFactory createFactory(String userInterfaceType) {
        if(userInterfaceTypes.get(userInterfaceType) != null) {
            return userInterfaceTypes.get(userInterfaceType).get();
        } else {
            throw new IllegalArgumentException("Such interface color is not supported!");
        }
    }

}
