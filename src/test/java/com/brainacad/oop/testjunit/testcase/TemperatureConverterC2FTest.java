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
public class TemperatureConverterC2FTest {
    TemperatureConverter temperatureConverter;
    double degreesFahrenheit;
    double degreesCelsius;
    double kelvin;
    double delta;

    // порядок параметрів конструктора співпадає з порядком елементів масиву C / F
    public TemperatureConverterC2FTest(double  degreesCelsius, double degreesFahrenheit) {
        this.degreesFahrenheit = degreesFahrenheit;
        this.degreesCelsius = degreesCelsius;
    }

    @Before
    public void setUp() throws Exception {
        temperatureConverter = new TemperatureConverter();
        delta = 0.01;
    }

    @After
    public void tearDown() throws Exception {
        temperatureConverter = null;
    }

    @Parameters
    public static Collection tableC2F() {
        return Arrays.asList(new Object[][] {
        //Celsius (°C),  Fahrenheit (°F)        
            {-273.15,   -459.67 }   ,   // absolute zero temperature
            {   -50 ,   -58.0   }   ,   
            {   -40 ,   -40.0   }   ,   
            {   -30 ,   -22.0   }   ,   
            {   -20 ,   -4.0    }   ,   
            {   -10 ,   14.0    }   ,   
            {   -9  ,   15.8    }   ,   
            {   -8  ,   17.6    }   ,   
            {   -7  ,   19.4    }   ,   
            {   -6  ,   21.2    }   ,   
            {   -5  ,   23.0    }   ,   
            {   -4  ,   24.8    }   ,   
            {   -3  ,   26.6    }   ,   
            {   -2  ,   28.4    }   ,   
            {   -1  ,   30.2    }   ,   
            {   0   ,   32.0    }   ,   // freezing/melting point of water
            {   1   ,   33.8    }   ,   
            {   2   ,   35.6    }   ,   
            {   3   ,   37.4    }   ,   
            {   4   ,   39.2    }   ,   
            {   5   ,   41.0    }   ,   
            {   6   ,   42.8    }   ,   
            {   7   ,   44.6    }   ,   
            {   8   ,   46.4    }   ,   
            {   9   ,   48.2    }   ,   
            {   10  ,   50.0    }   ,   
            {   20  ,   68.0    }   ,   
            {   21  ,   69.8    }   ,   // room temperature
            {   30  ,   86.0    }   ,   
            {   37  ,   98.6    }   ,   // average body temperature
            {   40  ,   104.0   }   ,   
            {   50  ,   122.0   }   ,   
            {   60  ,   140.0   }   ,   
            {   70  ,   158.0   }   ,   
            {   80  ,   176.0   }   ,   
            {   90  ,   194.0   }   ,   
            {   100 ,   212.0   }   ,   // boiling point of water
            {   200 ,   392.0   }   ,   
            {   300 ,   572.0   }   ,   
            {   400 ,   752.0   }   ,   
            {   500 ,   932.0   }   ,   
            {   600 ,   1112.0  }   ,   
            {   700 ,   1292.0  }   ,   
            {   800 ,   1472.0  }   ,   
            {   900 ,   1652.0  }   ,   
            {   1000,   1832.0  }       
        });
        
    }

    @Test
    public void convertCtoF() throws Exception {
        double actual = temperatureConverter.convertCtoF(degreesCelsius);
        assertEquals("C2F incorrect ", degreesFahrenheit, actual, delta);
    }
}