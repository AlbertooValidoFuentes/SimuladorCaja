package com.alberto.utils;

public class SuperMarketUtils {
    private static final String[] NOMBRES_PERSONA = {
            "Alberto",
            "Lucrecia",
            "Montse",
            "Montxo",
            "Lionel",
            "Francisco",
            "Nicolás",
            "Yolanda",
            "Pedro",
            "Alexis"
    };

    public static final String[] NOMBRES_PRODUCTOS = {
            "Leche",
            "Huevos",
            "Galletas",
            "Salami",
            "Chorizo",
            "Pan",
            "Queso",
            "Agua",
            "Carne",
            "Millo"
    };

    public static String generarNombreAleatorio() {
        return NOMBRES_PERSONA[(int) (Math.random() * NOMBRES_PERSONA.length)];
    }

    public static String generarProductoAleatorio() {
        return NOMBRES_PRODUCTOS[(int) (Math.random() * NOMBRES_PRODUCTOS.length)];
    }
}
