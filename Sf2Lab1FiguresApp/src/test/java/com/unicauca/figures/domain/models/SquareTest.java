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
public class SquareTest {
    
    public SquareTest() {
    }

    /**
     * Test of calculateArea method, of class Square.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        double side = 1.0;
        Square square = new Square(side);

        // Aserción para un valor pequeño
        double smallExpectedArea = 1.0; // 1.0 * 1.0
        double smallActualArea = square.calculateArea();
        assertEquals(smallExpectedArea, smallActualArea, 0.001);

        // Aserción para un valor medio
        side = 1000.0;
        square = new Square(side);
        double mediumExpectedArea = 1000000.0; // 1000.0 * 1000.0
        double mediumActualArea = square.calculateArea();
        assertEquals(mediumExpectedArea, mediumActualArea, 0.001);

        // Aserción para un valor grande
        side = 3.3E6; // 3.3 * 10^6
        square = new Square(side);
        double maxExpectedArea = 1.089E13; // 3.3 * 10^6 * 3.3 * 10^6
        double maxActualArea = square.calculateArea();
        assertEquals(maxExpectedArea, maxActualArea, 0.001); // este me dio mas exacto al no estar involucrado pi que tiene decimales infinitas

    }

    /**
     * Test of calculatePerimeter method, of class Square.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        double side = 1.0;
        Square square = new Square(side);

        // Aserción para un valor pequeño
        double smallExpectedPerimeter = 4.0; // 1.0 * 4
        double smallActualPerimeter = square.calculatePerimeter();
        assertEquals(smallExpectedPerimeter, smallActualPerimeter, 0.001);

        // Aserción para un valor medio
        side = 1000.0;
        square = new Square(side);
        double mediumExpectedPerimeter = 4000.0; // 1000.0 * 4
        double mediumActualPerimeter = square.calculatePerimeter();
        assertEquals(mediumExpectedPerimeter, mediumActualPerimeter, 0.001);

        // Aserción para un valor grande
        side = 3.3E6; // 3.3 * 10^6
        square = new Square(side);
        double maxExpectedPerimeter = 13200000; // 3.3 * 10^6 * 4
        double maxActualPerimeter = square.calculatePerimeter();
        assertEquals(maxExpectedPerimeter, maxActualPerimeter, 0.001); // Margen de comparación razonable
    }
    
}
