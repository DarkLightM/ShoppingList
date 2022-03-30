package com.example.shoppinglist.model;

public class Product {
    private final int _id;
    private String _text;
    private boolean _isBought;

    public Product(int id, String text){
        _id = id;
        _text = text;
        _isBought = false;
    }

    public int getId(){
        return _id;
    }

    public String getText(){
        return _text;
    }
    public void setText(String text){
        _text = text;
    }

    public boolean getIsBought(){
        return _isBought;
    }
    public void setIsBought(){
        _isBought = !_isBought;
    }
}
