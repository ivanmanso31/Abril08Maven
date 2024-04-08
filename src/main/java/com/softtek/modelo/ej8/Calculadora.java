package com.softtek.modelo.ej8;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Calculadora {

    public double sumar(double op1, double op2){
        return op1+op2;
    }

    public double restar(double op1, double op2){
        return op1-op2;
    }

    public double multiplicar(double op1, double op2){
        return op1*op2;
    }

    public double dividir(double op1, double op2) throws ArithmeticException{
        if (op2 == 0) {
            throw new ArithmeticException("Division entre 0");
        }
        return op1 / op2;
    }

}
