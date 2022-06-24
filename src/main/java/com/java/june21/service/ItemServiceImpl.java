package com.java.june21.service;

import com.java.june21.model.Item;
import com.java.june21.repository.CartRepository;
import com.java.june21.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    ItemRepository itemRepo;

    @Override
    public Item addItem(Item item) {
        return itemRepo.save(item);
    }

    @Override
    public List<Item> fetchItemList() {
        //  return ItemRepo.findAll();
        return (List<Item>) itemRepo.findAll();
    }

    @Override
    public Item updateItem(Item item, Long ItemId) {
        itemRepo.save(item);
        return item;
    }

    @Override
    public void deleteItemById(Long itemId) {
        itemRepo.deleteById(itemId);
    }
}
