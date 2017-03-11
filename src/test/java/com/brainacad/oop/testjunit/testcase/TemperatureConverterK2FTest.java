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
public class TemperatureConverterK2FTest {
    TemperatureConverter temperatureConverter;
    double degreesFahrenheit;
    double kelvin;
    double delta;

    // порядок параметрів конструктора співпадає з порядком елементів масиву K / F
    public TemperatureConverterK2FTest(double kelvin, double  degreesFahrenheit) {
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
    public static Collection tableK2F() {
        return Arrays.asList(new Object[][] {
         // Kelvin (K)      Fahrenheit (°F)     
            {   0   ,   -459.67 }   ,
            {   10  ,   -441.67 }   ,
            {   20  ,   -423.67 }   ,
            {   30  ,   -405.67 }   ,
            {   40  ,   -387.67 }   ,
            {   50  ,   -369.67 }   ,
            {   60  ,   -351.67 }   ,
            {   70  ,   -333.67 }   ,
            {   80  ,   -315.67 }   ,
            {   90  ,   -297.67 }   ,
            {   100 ,   -279.67 }   ,
            {   110 ,   -261.67 }   ,
            {   120 ,   -243.67 }   ,
            {   130 ,   -225.67 }   ,
            {   140 ,   -207.67 }   ,
            {   150 ,   -189.67 }   ,
            {   160 ,   -171.67 }   ,
            {   170 ,   -153.67 }   ,
            {   180 ,   -135.67 }   ,
            {   190 ,   -117.67 }   ,
            {   200 ,   -99.67  }   ,
            {   210 ,   -81.67  }   ,
            {   220 ,   -63.67  }   ,
            {   230 ,   -45.67  }   ,
            {   240 ,   -27.67  }   ,
            {   250 ,   -9.67   }   ,
            {   260 ,   8.33    }   ,
            {   270 ,   26.33   }   ,
            {   280 ,   44.33   }   ,
            {   290 ,   62.33   }   ,
            {   300 ,   80.33   }   ,
            {   400 ,   260.33  }   ,
            {   500 ,   440.33  }   ,
            {   600 ,   620.33  }   ,
            {   700 ,   800.33  }   ,
            {   800 ,   980.33  }   ,
            {   900 ,   1160.33 }   ,
            {   1000,   1340.33 }   


        });
        
    }



    @Test
    public void convertKtoF() throws Exception {
        double actual = temperatureConverter.convertKtoF(kelvin);
        assertEquals("K2F incorrect ", degreesFahrenheit, actual, delta);
    }

}