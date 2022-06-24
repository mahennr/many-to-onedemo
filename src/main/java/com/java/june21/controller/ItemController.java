package com.java.june21.controller;

import com.java.june21.model.Item;
import com.java.june21.service.ItemService;
import com.java.june21.service.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/item-api")
public class ItemController {
    @Autowired
    private ItemService itemService;

    // Save operation
    @PostMapping("/addItem")
    public Item saveItem(
            @Valid @RequestBody Item item)
    {
        return itemService.addItem(item);
    }

    // Read operation
    @GetMapping("/items")
    public List<Item> fetchItemList()
    {
        return itemService.fetchItemList();
    }

    // Update operation
    @PutMapping("/items/{id}")
    public Item updateItem(@RequestBody Item item, @PathVariable("id") Long itemId)
    {
        return itemService.updateItem(item, itemId);
    }

    // Delete operation
    @DeleteMapping("/items/{id}")
    public String deleteItemById(@PathVariable("id") Long itemId)
    {
        itemService.deleteItemById(itemId);
        return "Deleted Item Successfully";
    }
}
