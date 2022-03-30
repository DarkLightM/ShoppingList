package com.example.shoppinglist;

import com.example.shoppinglist.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private static final List<Product> ProductList = new ArrayList<Product>();
    private String name;
    private int id;

    public ShoppingList(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public static void add(String text){
        ProductList.add(new Product(ProductList.size(),text));
    }

    public static void add(Product item){
        ProductList.add(item);
    }

    public static void remove(int id){
        ProductList.remove(id);
    }

    public static List<Product> getProductList(){
        return ProductList;
    }

    public static Product get(int id){
        return ProductList.get(id);
    }

}
