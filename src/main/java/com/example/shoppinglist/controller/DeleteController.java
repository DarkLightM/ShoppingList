package com.example.shoppinglist.controller;

import com.example.shoppinglist.ShoppingList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DeleteController {
    @RequestMapping(path = "/list/{id}", method = RequestMethod.POST)
    private String delete(@PathVariable("id") int id) {
        ShoppingList.remove(id);
        return "redirect:/list";
    }
}
