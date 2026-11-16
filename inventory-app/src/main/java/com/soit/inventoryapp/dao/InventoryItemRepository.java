package com.soit.inventoryapp.dao;

import com.soit.inventoryapp.entity.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryItemRepository extends JpaRepository<InventoryItem, Integer> {

}
