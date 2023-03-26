/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author roger
 */
public class MyUtilsTest {
    
    public MyUtilsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of inverteix method, of class MyUtils.
     */
    @Test
    public void testInverteix() {
        System.out.println("inverteix");
        String cadena = "hola";
        String expResult = "aloh";
        String result = MyUtils.inverteix(cadena);
        assertTrue(expResult.equals(result));
        assertEquals(expResult, result);
        assertFalse(result.isEmpty());
    }
    
    @Test
    public void testInverteixNull() {
        System.out.println("inverteix");
        String cadena = "";
        String expResult = null;
        String result = MyUtils.inverteix(cadena);
        assertEquals(expResult, result);
        assertTrue(result == expResult);
        //assertFalse(result.equals(expResult));//Falla porque son iguales
    }

    /**
     * Test of edat method, of class MyUtils.
     */
    @Test
    public void testEdatCorrecte() {
        System.out.println("edat");
        int day = 15;
        int month = 03;
        int year = 2004;
        int expResult = 19;
        int result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);
        assertTrue(expResult == result);
        assertFalse(expResult != result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    public void testEdatMajor150() {
        System.out.println("edat");
        int day = 15;
        int month = 03;
        int year = 1823;
        int expResult = -1;
        int result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);
        assertTrue(result == expResult);
        assertFalse(result != expResult);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    public void testEdatImposible() {
        System.out.println("edat");
        int day = 42;
        int month = 23;
        int year = 2777;
        int expResult = -2;
        int result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);
        assertTrue(result == expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of factorial method, of class MyUtils.
     */
    @Test
    public void testFactorialNormal() {
        System.out.println("factorial");
        int numero = 5;
        int expResult = 120;
        int result = MyUtils.factorial(numero);
        assertEquals(expResult, result, 0);
        assertTrue(result == expResult);
        assertFalse(expResult != 0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testFactorialNegatiu() {
        System.out.println("factorial");
        int numero = -5;
        int expResult = -1;
        int result = MyUtils.factorial(numero);
        assertEquals(expResult, result, 0);
        assertTrue(result == expResult);
        assertFalse(result == -1);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testFactorialCero() {
        System.out.println("factorial");
        int numero = 0;
        int expResult = 1;
        int result = MyUtils.factorial(numero);
        assertEquals(expResult, result, 0);
        assertTrue(result == expResult);
        assertFalse(result == 0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
