package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
   public void initTest(){
    assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void twoTest(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void threeTest(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }
    @Test
    public void fourTest(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }
    @Test
    public void fiveTest(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]"));
    }
    @Test
    public void sixTest(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LAUN]CH]"));
    }
    @Test
    public void sevenTest(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
    }
    @Test
    public void eightTest(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LA[UN]CH]]"));
    }
    @Test
    public void nineTest() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }
    @Test
    public void tenTest(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]]"));
    }
    @Test
    public void elevenTest() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][]]"));
    }
    @Test
    public void twelveTest(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]"));
    }
}
