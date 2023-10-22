package io.github.kduferreira.mercadinho.Service;

import io.github.kduferreira.mercadinho.Item;
import org.springframework.stereotype.Service;


import java.util.*;

@Service
public class ItemService {
    private List<Item> items = new ArrayList<>();

    public Item addItem(String name) {
        Item item = new Item((long) (items.size() + 1), name);
        items.add(item);
        return item;
    }

    public List<Item> getAllItems() {
        return items;
    }
}
