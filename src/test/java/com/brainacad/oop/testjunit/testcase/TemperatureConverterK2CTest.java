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
public class TemperatureConverterK2CTest {
    TemperatureConverter temperatureConverter;
    double degreesCelsius;
    double kelvin;
    double delta;

    // порядок параметрів конструктора співпадає з порядком елементів масиву C / K
    public TemperatureConverterK2CTest(double  kelvin, double degreesCelsius) {
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
        //  Kelvin (K)      Celsius (°C)            
            {   0   ,   -273.15 }   ,   //absolute zero temperature
            {   10  ,   -263.15 }   ,   
            {   20  ,   -253.15 }   ,   
            {   30  ,   -243.15 }   ,   
            {   40  ,   -233.15 }   ,   
            {   50  ,   -223.15 }   ,   
            {   60  ,   -213.15 }   ,   
            {   70  ,   -203.15 }   ,   
            {   80  ,   -193.15 }   ,   
            {   90  ,   -183.15 }   ,   
            {   100 ,   -173.15 }   ,   
            {   110 ,   -163.15 }   ,   
            {   120 ,   -153.15 }   ,   
            {   130 ,   -143.15 }   ,   
            {   140 ,   -133.15 }   ,   
            {   150 ,   -123.15 }   ,   
            {   160 ,   -113.15 }   ,   
            {   170 ,   -103.15 }   ,   
            {   180 ,   -93.15  }   ,   
            {   190 ,   -83.15  }   ,   
            {   200 ,   -73.15  }   ,   
            {   210 ,   -63.15  }   ,   
            {   220 ,   -53.15  }   ,   
            {   230 ,   -43.15  }   ,   
            {   240 ,   -33.15  }   ,   
            {   250 ,   -23.15  }   ,   
            {   260 ,   -13.15  }   ,   
            {   270 ,   -3.15   }   ,   
            {   273.15  ,   0   }   ,   //freezing/melting point of water
            {   294.15  ,   21  }   ,   //room temperature
            {   300 ,   26.85   }   ,   
            {   310.15  ,   37  }   ,   //average body temperature
            {   373.15  ,   100 }   ,   //boiling point of water
            {   400 ,   126.85  }   ,   
            {   500 ,   226.85  }   ,   
            {   600 ,   326.85  }   ,   
            {   700 ,   426.85  }   ,   
            {   800 ,   526.85  }   ,   
            {   900 ,   626.85  }   ,   
            {   1000    ,   726.85  }       

        });
        
    }


    @Test
    public void convertKtoC() throws Exception {
        double actual = temperatureConverter.convertKtoC(kelvin);
        assertEquals("K2C incorrect ", degreesCelsius, actual, delta);
    }

}