package com.soit.inventoryapp;

import com.soit.inventoryapp.entity.InventoryItem;
import com.soit.inventoryapp.service.InventoryItemService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Controller
@RequestMapping("/Inventory")
public class InventoryItemController {

    //This gives the InventoryItem Controller access to the InventoryItem service
    public InventoryItemService inventoryItemService;

    public InventoryItemController(InventoryItemService theInventoryItemService) {
        inventoryItemService = theInventoryItemService;
    }

    @GetMapping("/list")
    public String listInventory(Model theModel) {

        //return inventory items from the database.
        List<InventoryItem> theInventoryItems = inventoryItemService.findAll();

        theModel.addAttribute("inventoryItems", theInventoryItems);
        return "list-inventory";
    }
    @PostMapping("/save")
    public String saveInventoryItem(@ModelAttribute("inventoryItem") InventoryItem theInventoryItem){
        inventoryItemService.save(theInventoryItem);
        return "redirect:/Inventory/list";

    }
    @GetMapping("/viewAddForm")
    public String viewAddForm (Model theModel){
        InventoryItem theInventoryItem = new InventoryItem();
        theModel.addAttribute("inventoryItem", theInventoryItem);
        return "inventory-form";
    }
    @GetMapping("/viewUpdateForm")
    public String viewUpdateForm(@RequestParam("inventoryItemId") int theId, Model theModel){

        //retrieve the InventoryItem info from the service layer
        InventoryItem theInventoryItem = inventoryItemService.findById(theId);

        //pre-populate the form by setting the inventoryItem as a model
        theModel.addAttribute("inventoryItem", theInventoryItem);

        //redirect ro the inventoryItem form
        return "/inventory-form";

    }

    @GetMapping("/delete")
    public String delete(@RequestParam("theInventoryItemId") int theId){
        inventoryItemService.deleteById(theId);
        return "redirect:/Inventory/list";
    }
}
