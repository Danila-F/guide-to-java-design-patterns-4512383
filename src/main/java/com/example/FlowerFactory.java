package com.example;

import java.util.HashMap;
import java.util.Map;

public class FlowerFactory {

    private static final Map<String, Flower> flowers = new HashMap<>();

    public static Flower createFlower(String type) {
        if(flowers.get(type) != null) {
            return flowers.get(type);
        }
        var flower = new Flower(type);
        flowers.put(type, flower);
        return flower;
    }

}
