package com.example;

import java.util.HashSet;
import java.util.Set;

public class ItemInventory {
  private Set<StoreItem> items;
  
  public ItemInventory() {
    items = new HashSet<>();
  }

  public void addItem(StoreItem item) {
    items.add(item);
  }

  public Set<StoreItem> getItems() {
    return items;
  }
}
