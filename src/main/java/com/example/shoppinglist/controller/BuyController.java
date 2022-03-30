package com.example.shoppinglist.controller;

import com.example.shoppinglist.ShoppingList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BuyController {
    @RequestMapping(path = "/list/{id}/buy", method = RequestMethod.POST)
    private String buy(@PathVariable("id") int id){
        ShoppingList.get(id).setIsBought();
        return "redirect:/list";
    }
}
