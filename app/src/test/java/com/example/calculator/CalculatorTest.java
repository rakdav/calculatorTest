package com.example.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest
{
    private Calc calc;
    @Before
    public void setUp() throws Exception{
        calc=new Calc();
    }

    @Test
    public void operations() throws Exception
    {
        assertEquals(3,calc.Add(1,2));
        assertEquals(1,calc.Add(1,0));

        assertEquals(3,calc.Sub(5,2));
        assertEquals(1,calc.Sub(1,0));

        assertEquals(6,calc.Mul(2,3));
        assertEquals(0,calc.Mul(1,0));

        assertEquals(3,calc.Div(6,2));
        //assertEquals(0,calc.Add(1,0));
    }
    @After
    public void tearDown(){calc=null;}

}
