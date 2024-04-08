package com.softtek.modelo.ej7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {

    private String ID;
    private String nombre;
    private double precio;
    private String proveedor;
    private String descripcion;

    public void comprobar() throws ProductoException{
        if(ID==null){
            throw new ProductoException("Producto sin ID");
        }
    }

}
