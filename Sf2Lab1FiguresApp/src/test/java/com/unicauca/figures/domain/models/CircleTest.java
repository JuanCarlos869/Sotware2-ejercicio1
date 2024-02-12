/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.unicauca.figures.domain.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author usuario
 */
public class CircleTest {

    public CircleTest() {
    }

    /**
     * Test of calculateArea method, of class Circle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        double radius = 1.0;
        Circle circle = new Circle(radius);

        // Aserción para un valor pequeño
        double smallExpected = 3.1416;
        double smallActual = circle.calculateArea();
        assertEquals(smallExpected, smallActual, 0.001);

        // Aserción para un valor medio
        radius = 1000.0;
        circle = new Circle(radius);
        double mediumExpected = 3141592.654;
        double mediumActual = circle.calculateArea();
        assertEquals(mediumExpected, mediumActual, 0.001);

        // Aserción para un valor grande 
        radius = 1.0E12;
        circle = new Circle(radius);
        double maxExpected = 3.141592653589E24; // Área esperada para un radio de 1.0E12
        double maxActual = circle.calculateArea();
        assertEquals(maxExpected, maxActual, 1.00E12); // Margen de comparación grandisimo
        //por que al ser numeros muy grandes da mucha impresicion
    }

    /**
     * Test of calculatePerimeter method, of class Circle.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        double radius = 1.0;
        Circle circle = new Circle(radius);

        // Aserción para un valor pequeño
        double smallExpectedPerimeter = 6.2832; // 2 * π * 1.0
        double smallActualPerimeter = circle.calculatePerimeter();
        assertEquals(smallExpectedPerimeter, smallActualPerimeter, 0.001);

        // Aserción para un valor medio
        radius = 1000.0;
        circle = new Circle(radius);
        double mediumExpectedPerimeter = 6283.1853; // 2 * π * 1000.0
        double mediumActualPerimeter = circle.calculatePerimeter();
        assertEquals(mediumExpectedPerimeter, mediumActualPerimeter, 0.001);

        // Aserción para un valor grande 
        radius = 1.0E12;
        circle = new Circle(radius);
        double maxExpectedPerimeter = 6.283185307179E12; // 2 * π * 1.0E12
        double maxActualPerimeter = circle.calculatePerimeter();
        assertEquals(maxExpectedPerimeter, maxActualPerimeter, 1.00E10); // Margen de comparación grande
    }

}
