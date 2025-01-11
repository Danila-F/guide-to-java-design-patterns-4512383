package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VendingMachine {

    private static final Map<String, Supplier<Snack>> SnackTypes = new HashMap<>();

    static {
        SnackTypes.put("ChocolateBar", ChocolateBar::new);
        SnackTypes.put("Chips", Chips::new);
        SnackTypes.put("Drink", Drink::new);
    }

    Snack getSnack(String snackType) {
        if (SnackTypes.get(snackType) != null) {
            return SnackTypes.get(snackType).get();
        } else {
            throw new IllegalArgumentException("Invalid snack type: " + snackType);
        }
    }


}
