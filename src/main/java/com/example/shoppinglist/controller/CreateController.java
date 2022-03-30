package com.example.shoppinglist.controller;

import com.example.shoppinglist.ShoppingList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CreateController {

    @RequestMapping(path = "/list/new", method = RequestMethod.GET)
    public String create(Model model){
        return "create";
    }

    @RequestMapping(path = "/list", method = RequestMethod.POST)
    private String doCreate(@ModelAttribute("text") String text){
        ShoppingList.add(text);
        return "redirect:/list";
    }
}
