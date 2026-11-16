package com.soit.inventoryapp.service;

import com.soit.inventoryapp.dao.InventoryItemRepository;
import com.soit.inventoryapp.entity.InventoryItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryItemService {

    private InventoryItemRepository inventoryItemRepository;
@Autowired
    public InventoryServiceImpl (InventoryItemRepository theInventoryItemRepository){
        inventoryItemRepository = theInventoryItemRepository;
    }


    @Override
    public List<InventoryItem> findAll() {
        return inventoryItemRepository.findAll();
    }

    @Override
    public InventoryItem findById(int theId) {
        return inventoryItemRepository.findById(theId).get();
    }

    @Override
    public void save(InventoryItem theInventoryItem) {
    inventoryItemRepository.save(theInventoryItem);

    }

    @Override
    public void deleteById(int theId) {

    inventoryItemRepository.deleteById(theId);
    }
}
