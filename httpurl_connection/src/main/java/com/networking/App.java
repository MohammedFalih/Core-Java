package com.networking;

import com.google.gson.Gson;
import static spark.Spark.*;

public class App 
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();

        Employee[] emp = {
            new Employee(1, "Mohammed", "Falih", "Male"),
            new Employee(2, "Pavlov", "Goncaves", "Male"),
            new Employee(3, "Ariela", "Grahamslaw", "Female"),
            new Employee(4, "Carissa", "Fairbrass", "Female"),
        };

        get("/employees", (req, res) -> {
            res.type("application/json");
            return emp;
        }, gson::toJson );

        System.out.println("Server running on http://localhost:4567/employees");
    }
}
