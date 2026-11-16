package com.soit.inventoryapp.service;
import com.soit.inventoryapp.entity.InventoryItem;

import java.util.List;
public interface InventoryItemService {

    public List<InventoryItem> findAll();

    public InventoryItem findById(int theId);

    public void save(InventoryItem theInventoryItem);

    public void deleteById(int theId);
}
