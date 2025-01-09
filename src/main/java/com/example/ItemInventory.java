package com.example;

import java.util.HashSet;
import java.util.Set;

public class ItemInventory {
  private Set<StoreItem> items;
  
  public ItemInventory() {
    items = new HashSet<>();
  }

  public void addItem(StoreItem newItem) {
    boolean itemExists = false;

    for (StoreItem item : items) {
      if (item.getName().equals(newItem.getName()) && item.getPrice().equals(newItem.getPrice())) {
        itemExists = true;
      }
    }

    if (itemExists) {
      throw new IllegalArgumentException("Item already exists in the inventory");
    } else {
      items.add(newItem);
    }
  }

  public Set<StoreItem> getItems() {
    return items;
  }

  public StoreItem getSpecificItem(String itemName, Double itemPrice) {
    for (StoreItem item : items) {
      if (item.getName().equals(itemName) && item.getPrice().equals(itemPrice)) {
        return item;
      }
    }
    return null;
  }
}
