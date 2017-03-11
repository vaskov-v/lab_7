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
public class TemperatureConverterF2CTest {
    TemperatureConverter temperatureConverter;
    double degreesFahrenheit;
    double degreesCelsius;
    double delta;

    public TemperatureConverterF2CTest(double  degreesFahrenheit, double degreesCelsius) {
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

    @Test
    public void convertFtoC() throws Exception {        
        double actual = temperatureConverter.convertFtoC(degreesFahrenheit);
        assertEquals("F2C incorrect ", degreesCelsius, actual, delta);
    }
    
    @Parameters
    public static Collection tableF2C() {
        return Arrays.asList(new Object[][] {
        //  Fahrenheit (°F) ,   Celsius (°C)        
            {-459.67,   -273.15 }   ,
            {   -50 ,   -45.56  }   ,
            {   -40 ,   -40.00  }   ,
            {   -30 ,   -34.44  }   ,
            {   -20 ,   -28.89  }   ,
            {   -10 ,   -23.33  }   ,
            {   0   ,   -17.78  }   ,
            {   10  ,   -12.22  }   ,
            {   20  ,   -6.67   }   ,
            {   30  ,   -1.11   }   ,
            {   40  ,   4.44    }   ,
            {   50  ,   10.00   }   ,
            {   60  ,   15.56   }   ,
            {   70  ,   21.11   }   ,
            {   80  ,   26.67   }   ,
            {   90  ,   32.22   }   ,
            {   100 ,   37.78   }   ,
            {   110 ,   43.33   }   ,
            {   120 ,   48.89   }   ,
            {   130 ,   54.44   }   ,
            {   140 ,   60.00   }   ,
            {   150 ,   65.56   }   ,
            {   160 ,   71.11   }   ,
            {   170 ,   76.67   }   ,
            {   0   ,   82.22   }   , // fail,  correct: {   180 ,   82.22   }
            {   190 ,   87.78   }   ,
            {   200 ,   93.33   }   ,
            {   300 ,   148.89  }   ,
            {   400 ,   204.44  }   ,
            {   500 ,   260.00  }   ,
            {   600 ,   315.56  }   ,
            {   700 ,   371.11  }   ,
            {   800 ,   426.67  }   ,
            {   900 ,   482.22  }   ,
            {  1000 ,   537.78  }   

        });
        
    }

}