package io.github.kduferreira.mercadinho.Controller;

import io.github.kduferreira.mercadinho.Item;
import io.github.kduferreira.mercadinho.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping
    public Item addItem(@RequestParam String name) {
        return itemService.addItem(name);
    }

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }
}
