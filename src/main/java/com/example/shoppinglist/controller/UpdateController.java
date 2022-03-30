package com.example.shoppinglist.controller;

import com.example.shoppinglist.ShoppingList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UpdateController {
    @RequestMapping(path = "/list/{id}/update", method = RequestMethod.POST)
    private String update(@PathVariable("id") int id, @ModelAttribute("text") String text){
        ShoppingList.get(id).setText(text);
        return "redirect:/list";
    }
}
