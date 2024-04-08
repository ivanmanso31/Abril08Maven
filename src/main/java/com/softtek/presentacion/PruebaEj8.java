package com.softtek.presentacion;

import com.softtek.modelo.ej8.Calculadora;

public class PruebaEj8 {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println(c.sumar(2.6,5.7));
        System.out.println(c.restar(3.33,4.5));
        System.out.println(c.multiplicar(3.5,0.25));
        try {
            System.out.println(c.dividir(4,0));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println(c.dividir(5.7,2));


    }
}
