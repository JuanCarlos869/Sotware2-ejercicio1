/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicauca.figures.domain.models;

/**
 *
 * @author usuario
 */
public class Triangle extends Figure {
    // Atributos
    private double base;
    private double height;

    // Constructor
    public Triangle(double base,double height) {
        this.base = base;
        this.height = height;
    }
    
    // Getters y Setters
    public double getBase() {    
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {    
        this.height = height;
    }

    // Otros métodos
    //implementacion de calcular area para triangulo, multiplicar base por altura y dividr sobre 2
    @Override
    public double calculateArea() {
        return (base*height)/2;
    }

    //implementacion de calcular perimetro para triangulo, multiplicar la base por 3 
    //ya que asumimos que es equilatero
    @Override
    public double calculatePerimeter() {
        return 3*base;
    }
}
