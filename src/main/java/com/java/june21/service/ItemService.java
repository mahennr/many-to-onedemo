package com.java.june21.service;

import com.java.june21.model.Item;

import java.util.List;

public interface ItemService {
    // Save operation
    Item addItem(Item Item);

    // Read operation
    List<Item> fetchItemList();

    // Update operation
    Item updateItem(Item Item, Long ItemId);

    // Delete operation
    void deleteItemById(Long ItemId);

}
