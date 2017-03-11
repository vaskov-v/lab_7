package com.brainacad.oop.testjunit.testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.brainacad.oop.testjunit.testjunit.TemperatureConverter;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

/**
 * 
 General TestClass Simple
 http://www.rapidtables.com/convert/temperature/how-fahrenheit-to-celsius.htm
 
 */
@RunWith(Parameterized.class)
public class TemperatureConverterF2KTest {
    TemperatureConverter temperatureConverter;
    double degreesFahrenheit;
    double kelvin;
    double delta;

    // порядок параметрів конструктора співпадає з порядком елементів масиву F / K
    public TemperatureConverterF2KTest(double  degreesFahrenheit, double kelvin) {
        this.kelvin = kelvin;
        this.degreesFahrenheit = degreesFahrenheit;
    }

    @Before
    public void setUp() throws Exception {
        temperatureConverter = new TemperatureConverter();
        delta = 0.05; // 0.01 - precision
    }

    @After
    public void tearDown() throws Exception {
        temperatureConverter = null;
    }

    @Parameters
    public static Collection tableF2K() {
        return Arrays.asList(new Object[][] {
         // Fahrenheit (°F)     Kelvin (K)      
            {   -459.67 ,   0   }   ,
            {   -50 ,   227.59  }   ,
            {   -40 ,   233.15  }   ,
            {   -30 ,   238.71  }   ,
            {   -20 ,   244.26  }   ,
            {   -10 ,   249.82  }   ,
            {   0   ,   255.37  }   ,
            {   10  ,   260.93  }   ,
            {   20  ,   266.48  }   ,
            {   30  ,   272.04  }   ,
            {   40  ,   277.59  }   ,
            {   50  ,   283.15  }   ,
            {   60  ,   288.71  }   ,
            {   70  ,   294.26  }   ,
            {   80  ,   299.82  }   ,
            {   90  ,   305.37  }   ,
            {   100 ,   310.93  }   ,
            {   110 ,   316.48  }   ,
            {   120 ,   322.04  }   ,
            {   130 ,   327.59  }   ,
            {   140 ,   333.15  }   ,
            {   150 ,   338.71  }   ,
            {   160 ,   344.26  }   ,
            {   170 ,   349.82  }   ,
            {   180 ,   355.37  }   ,
            {   190 ,   360.93  }   ,
            {   200 ,   366.48  }   ,
            {   300 ,   422.04  }   ,
            {   400 ,   477.59  }   ,
            {   500 ,   533.15  }   ,
            {   600 ,   588.71  }   ,
            {   700 ,   644.26  }   ,
            {   800 ,   699.82  }   ,
            {   900 ,   755.37  }   ,
            {   1000,   810.93  }   

        });
        
    }


    @Test
    public void convertFtoK() throws Exception {
        double actual = temperatureConverter.convertFtoK(degreesFahrenheit);
        assertEquals("K2F incorrect ", kelvin, actual, delta);
    }

}