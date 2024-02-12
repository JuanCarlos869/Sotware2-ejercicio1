/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicauca.figures.domain.models;

/**
 *
 * @author usuario
 */
public class Square extends Figure {

    // Atributos
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }
    
    // Getters y Setters
    public double getSide() {
        return side;
    }
    
    public void setSide(double side) {    
        this.side = side;
    }

    // Otros métodos
    //implementacion de calcular area para cuadrado, multiplicar lado por lado
    @Override
    public double calculateArea() {
        return side*side;
    }

    //implementacion de calcular perimetro para cuadrado, multiplicar lado por 4 o suma de todos los lados
    @Override
    public double calculatePerimeter() {
        return 4*side;
    }

}
