package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFunctions {

	@Test
	public void testLeapYear() {
        assertEquals("29/02/2004", UnitTest.findPreviousDate("01/03/2004"));
        assertEquals("28/02/2007", UnitTest.findPreviousDate("01/03/2007"));
        assertEquals("INVALID", UnitTest.findPreviousDate("29/02/2007"));
        assertEquals("INVALID", UnitTest.findPreviousDate("30/02/2004"));
    }
    
    @Test
    public void testNonLeapYear() {
        assertEquals("31/12/1899", UnitTest.findPreviousDate("01/01/1900"));
        assertEquals("30/12/2015", UnitTest.findPreviousDate("31/12/2015"));
        assertEquals("INVALID", UnitTest.findPreviousDate("31/12/1899"));
        assertEquals("INVALID", UnitTest.findPreviousDate("31/13/1900"));
        assertEquals("INVALID", UnitTest.findPreviousDate("32/12/1900"));
        assertEquals("17/05/2001", UnitTest.findPreviousDate("18/05/2001"));
    }
	
    @Test
    public void testLinearSearch() {
        int[] a1 = {-3,4,-1,1,1,13,5};
        int v1 = 1;
        assertEquals(3,  UnitTest.linearSearch(v1, a1));
        
        int[] a2 = {-3,4,-1,-1,0,13,5};
        int v2 = 2;
        assertEquals(-1, UnitTest.linearSearch(v2, a2));
        
        int[] a3 = {};
        int v3 = 5;
        assertEquals(-1, UnitTest.linearSearch(v3, a3));
        
        int[] a4 = {7};
        int v4 = 7;
        assertEquals(0, UnitTest.linearSearch(v4, a4));
    }
    
    @Test
    public void testCountItem() {
        int[] a1 = {1,1,2,4,6,1,4,32,1,5,76,2,1};
        int v1 = 1;
        assertEquals(5, UnitTest.countItem(v1, a1));
        
        int[] a2 = {1,2,3,4,5,6,7};
        int v2 = 0;
        assertEquals(0, UnitTest.countItem(v2, a2));
        
        int[] a3 = {6,6,6};
        int v3 = 6;
        assertEquals(3, UnitTest.countItem(v3, a3));
        
        int[] a4 = {};
        int v4 = 5;
        assertEquals(0, UnitTest.countItem(v4, a4));
    }
    
    @Test
    public void testBinarySearch() {
        int[] a1 = {0,1,2,3,4,5,6,7};
        int v1 = 6;
        assertEquals(6, UnitTest.binarySearch(v1, a1));
        
        int[] a2 = {-100,-90,-80,100,1000};
        int v2 = -90;
        assertEquals(1, UnitTest.binarySearch(v2, a2));
        
        int[] a3 = {0,1,2,4};
        int v3 = 5;
        assertEquals(-1, UnitTest.binarySearch(v3, a3));
        
        int[] a4 = {4};
        int v4 = 4;
        assertEquals(0, UnitTest.binarySearch(v4, a4));
        
        int[] a5 = {};
        int v5 = 5;
        assertEquals(-1, UnitTest.binarySearch(v5, a5));
        
        int[] a6 = {0,3};
        int v6 = 3;
        assertEquals(1, UnitTest.binarySearch(v6, a6));
    }
	
    @Test
    public void testTriangleInvalid() {
        assertEquals(3, UnitTest.triangle(0, 0, 0));
        assertEquals(3, UnitTest.triangle(9, 8, 100));
        assertEquals(3, UnitTest.triangle(-8, -8, -8));
    }
    
    @Test
    public void testTriangleEquilateral() {
        assertEquals(0, UnitTest.triangle(10, 10, 10));
    }
    
    @Test
    public void testTriangleIsosceles() {
        assertEquals(1, UnitTest.triangle(10, 10, 12));
        assertEquals(1, UnitTest.triangle(12, 10, 10));
        assertEquals(1, UnitTest.triangle(150, 100, 150));
    }
    
    @Test
    public void testTriangleScalene() {
        assertEquals(2, UnitTest.triangle(5, 6, 10));
    }
    
    @Test
    public void testPrefix() {
        assertTrue(UnitTest.prefix("", ""));
        assertTrue(UnitTest.prefix("hell", "hello"));
        assertTrue(UnitTest.prefix("hell", "hell"));
        assertTrue(UnitTest.prefix("", "hell"));
        assertFalse(UnitTest.prefix("hello", "hell"));
        assertFalse(UnitTest.prefix("he ll", "hell"));
    }
}
