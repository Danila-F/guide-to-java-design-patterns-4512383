package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public enum VendingMachine {

    INSTANCE;

    private VendingMachine() {}

    private static final Map<String, Supplier<Snack>> SnackTypes = new HashMap<>();

    public synchronized static VendingMachine getVendingMachine() {
        return INSTANCE;
    }

    static {
        SnackTypes.put("ChocolateBar", ChocolateBar::new);
        SnackTypes.put("Chips", Chips::new);
        SnackTypes.put("Drink", Drink::new);
    }

    public Snack getSnack(String snackType) {
        if (SnackTypes.get(snackType) != null) {
            return SnackTypes.get(snackType).get();
        } else {
            throw new IllegalArgumentException("Invalid snack type: " + snackType);
        }
    }


}
