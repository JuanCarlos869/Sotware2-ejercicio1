/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.unicauca.figures.domain.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author usuario
 */
public class TriangleTest {
    
    public TriangleTest() {
    }
    /**
     * Test of calculateArea method, of class Triangle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        double base = 3.0;
        double height = 4.0;
        Triangle triangle = new Triangle(base, height);

        // Aserción para un valor pequeño
        double smallExpectedArea = 6.0; // (3.0 * 4.0) / 2
        double smallActualArea = triangle.calculateArea();
        assertEquals(smallExpectedArea, smallActualArea, 0.001);

        // Aserción para un valor medio
        base = 500.0;
        height = 1000.0;
        triangle = new Triangle(base, height);
        double mediumExpectedArea = 250000.0; // (500.0 * 1000.0) / 2
        double mediumActualArea = triangle.calculateArea();
        assertEquals(mediumExpectedArea, mediumActualArea, 0.001);

        // Aserción para un valor grande
        base = 1.0E6; // 1.0 * 10^6
        height = 2.0E6; // 2.0 * 10^6
        triangle = new Triangle(base, height);
        double maxExpectedArea = 1.0E12; // (1.0 * 10^6 * 2.0 * 10^6) / 2
        double maxActualArea = triangle.calculateArea();
        assertEquals(maxExpectedArea, maxActualArea, 0.001); // caso parecido al cuadrado
    }

    /**
     * Test of calculatePerimeter method, of class Triangle.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        double base = 3.0;
        double height = 4.0;
        Triangle triangle = new Triangle(base, height);

        // Aserción para un valor pequeño
        double smallExpectedPerimeter = 9.0; // 3.0 * 3
        double smallActualPerimeter = triangle.calculatePerimeter();
        assertEquals(smallExpectedPerimeter, smallActualPerimeter, 0.001);

        // Aserción para un valor medio
        base = 500.0;
        height = 1000.0;
        triangle = new Triangle(base, height);
        double mediumExpectedPerimeter = 1500.0; // 500.0 * 3
        double mediumActualPerimeter = triangle.calculatePerimeter();
        assertEquals(mediumExpectedPerimeter, mediumActualPerimeter, 0.001);

        // Aserción para un valor grande
        base = 1.0E6; // 1.0 * 10^6
        height = 2.0E6; // 2.0 * 10^6
        triangle = new Triangle(base, height);
        double maxExpectedPerimeter = 3.0E6; // 1.0 * 10^6 * 3
        double maxActualPerimeter = triangle.calculatePerimeter();
        assertEquals(maxExpectedPerimeter, maxActualPerimeter, 0.001); // Margen de comparación razonable
    }
    
}
