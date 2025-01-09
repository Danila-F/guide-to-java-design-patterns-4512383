package com.example;

public class ItemRegistry {

    public static void main(String[] args) {

        var item1 = new StoreItem.StoreItemBuilder("Pretzel", 2.0)
        .shortDescription("A tasty snack")
        .stockAvailable(7)
        .build();

        var item2 = new StoreItem.StoreItemBuilder("Soup", 1.5)
        .longDescription("A meal that you can warm up at home. It can come in different flavours including tomato, chicken, and vegetable")
        .packagingType("Can")
        .build();

        var itemInventory = new ItemInventory();
        itemInventory.addItem(item1);
        itemInventory.addItem(item2);
        System.out.println("The items in the inventory are: \n" + itemInventory.getItems());
        // System.out.println(itemInventory.getSpecificItem(item2.getName(), item2.getPrice()));

        // addToItemRegistry(item1);
        // addToItemRegistry(item2);
    }

    // private static void addToItemRegistry(StoreItem storeItem) {
    //     System.out.println("A new item was added to the registry: \n" + storeItem);
    // }

}
