package com.dish;

enum Type{
    STARTERS,
    MAIN_COURSE,
    CURRY,
    DESSERTS,
    OTHERS
}

public class Dish {
    private String dish_name;
    private boolean is_vegetarian;
    private int price;
    private Type type;

    Dish(String dishname, boolean isVeg, int price, Type type){
        this.dish_name = dishname;
        this.is_vegetarian = isVeg;
        this.price = price;
        this.type = type;
    }

    public String getDishName() {
        return dish_name;
    }

    public boolean getIsVeg(){
        return is_vegetarian;
    }

    public int getPrice() {
        return price;
    }

    public Type getType() {
        return type;
    }
}

