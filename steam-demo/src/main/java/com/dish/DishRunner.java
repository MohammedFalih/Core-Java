package com.dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DishRunner {
    static List<Dish> menu = null;
    public static void getNonvegItemsLowToHigh(){
        List<Dish> nonVegListItems = new ArrayList<Dish>();
        for(Dish dish : menu){
            if(!dish.getIsVeg()){
                nonVegListItems.add(dish);
            }
        }

        Collections.sort(nonVegListItems, new Comparator<Dish>() {

            @Override
            public int compare(Dish dish1, Dish dish2) {
                return Integer.compare(dish1.getPrice(), dish2.getPrice());
            }
            
        });

        System.out.println("\n\nAfter sorting: ");
        for(Dish dish : nonVegListItems){
            System.out.println("Dishname: " + dish.getDishName() + " and DishPrice " + dish.getPrice());
        }
    }

    public static void usingStream() {
        List<String> streamedData = menu.stream()
                                        .filter(dish -> dish.getIsVeg()==false)
                                        .sorted(Comparator.comparing(Dish::getPrice).reversed())
                                        .map(dish -> dish.getDishName())
                                        .collect(Collectors.toList());

        System.out.println("\n\nUsing Streams to filter: ");
        streamedData.forEach(dish -> {
            System.out.println(dish);
        });
    }
    
    public static void main(String args[]) {
        Dish dish1 = new Dish("Spring Rolls", true, 200, Type.STARTERS);
        Dish dish2 = new Dish("Chicken Wings", false, 300, Type.STARTERS);
        Dish dish3 = new Dish("Paneer Butter Masala", true, 400, Type.CURRY);
        Dish dish4 = new Dish("Mutton Rogan Josh", false, 500, Type.CURRY);
        Dish dish5 = new Dish("Veg Biryani", true, 350, Type.MAIN_COURSE);
        Dish dish6 = new Dish("Chicken Biryani", false, 450, Type.MAIN_COURSE);
        Dish dish7 = new Dish("Gulab Jamun", true, 150, Type.DESSERTS);
        Dish dish8 = new Dish("Ice Cream", true, 100, Type.DESSERTS);
        Dish dish9 = new Dish("French Fries", true, 120, Type.OTHERS);
        Dish dish10 = new Dish("Fish Fingers", false, 250, Type.OTHERS);

        menu = Arrays.asList(dish1, dish2, dish3, dish4, dish5, dish6, dish7, dish8, dish9, dish10);
        System.out.println("\n-----MENU-----");
        menu.forEach(dish -> System.out.println(dish.getDishName()));
        System.out.println("-----End of Menu-----");

        DishRunner.getNonvegItemsLowToHigh();
        DishRunner.usingStream();
    }
}
