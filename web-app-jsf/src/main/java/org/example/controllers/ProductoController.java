package org.example.controllers;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Model;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;

@Model
public class ProductoController {

    @Produces
    @Model
    public String titulo(){
        return "Productos";
    }

}
