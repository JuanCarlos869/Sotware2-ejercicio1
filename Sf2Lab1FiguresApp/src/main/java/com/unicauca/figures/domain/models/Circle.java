/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicauca.figures.domain.models;

/**
 *
 * @author usuario
 */
public class Circle extends Figure {
    // Atributos
    private double radius;

    // Constructor
    public Circle(double radius){
        this.radius = radius;
    }
    
    // Getters y Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Otros métodos
    //implementacion de calcular area para circulo, multiplicar pi por radio cuadrado
    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    //implementacion de calcular perimetro para circulo, multiplicar pi por radio por dos
    @Override
    public double calculatePerimeter() {
        return Math.PI*radius*2;
    }
}
