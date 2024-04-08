package com.softtek.presentacion;

import com.softtek.modelo.ej7.Producto;
import com.softtek.modelo.ej7.ProductoException;

public class PruebaEj7 {

    public static void main(String[] args) throws ProductoException {
        Producto p1 = new Producto();
        p1.comprobar();
    }
}
