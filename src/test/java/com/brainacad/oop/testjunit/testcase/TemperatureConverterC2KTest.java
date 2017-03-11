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
public class TemperatureConverterC2KTest {
    TemperatureConverter temperatureConverter;
    double degreesCelsius;
    double kelvin;
    double delta;

    // порядок параметрів конструктора співпадає з порядком елементів масиву C / K
    public TemperatureConverterC2KTest(double  degreesCelsius, double kelvin) {
        this.kelvin = kelvin;
        this.degreesCelsius = degreesCelsius;
    }

    @Before
    public void setUp() throws Exception {
        temperatureConverter = new TemperatureConverter();
        delta = 0.1;
    }

    @After
    public void tearDown() throws Exception {
        temperatureConverter = null;
    }

    @Parameters
    public static Collection tableC2K() {
        return Arrays.asList(new Object[][] {
         // Celsius (°C)        Kelvin (K)          Description
            {-273.15,       0   }   ,  // absolute zero temperature
            {   -50 ,   223.15  }   ,   
            {   -40 ,   233.15  }   ,   
            {   -30 ,   243.15  }   ,   
            {   -20 ,   253.15  }   ,   
            {   -10 ,   263.15  }   ,   
            {   0   ,   273.15  }   ,   // freezing/melting point of water
            {   10  ,   283.15  }   ,   
            {   20  ,   293.15  }   ,   
            {   21  ,   294.15  }   ,   // room temperature
            {   30  ,   303.15  }   ,   
            {   37  ,   310.15  }   ,   // average body temperature
            {   40  ,   313.15  }   ,   
            {   50  ,   323.15  }   ,   
            {   60  ,   333.15  }   ,   
            {   70  ,   343.15  }   ,   
            {   80  ,   353.15  }   ,   
            {   90  ,   363.15  }   ,   
            {   100 ,   373.15  }   ,   // boiling point of water
            {   200 ,   473.15  }   ,   
            {   300 ,   573.15  }   ,   
            {   400 ,   673.15  }   ,   
            {   500 ,   773.15  }   ,   
            {   600 ,   873.15  }   ,   
            {   700 ,   973.15  }   ,   
            {   800 ,   1073.15 }   ,   
            {   900 ,   1173.15 }   ,   
            {   1000,   1273.15 }       

        });
        
    }

      @Test
    public void convertCtoK() throws Exception {
        double actual = temperatureConverter.convertCtoK(degreesCelsius);
        assertEquals("C2K incorrect ", kelvin, actual, delta);
    }

}