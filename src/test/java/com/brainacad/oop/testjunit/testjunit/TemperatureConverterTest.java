package com.brainacad.oop.testjunit.testjunit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 
 General TestClass Simple
 http://www.rapidtables.com/convert/temperature/how-fahrenheit-to-celsius.htm
 
 */
public class TemperatureConverterTest {
    TemperatureConverter temperatureConverter;
    double degreesFahrenheit;
    double degreesCelsius;
    double kelvin;


    @Before
    public void setUp() throws Exception {
        temperatureConverter = new TemperatureConverter();
        this.degreesFahrenheit = 1200;
        this.kelvin = 1000;
        this.degreesCelsius = 600;
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void convertFtoC() throws Exception {
        double expected = (degreesFahrenheit - 32.0) / (9.0 / 5.0);
        double actual = temperatureConverter.convertFtoC(degreesFahrenheit);
        assertEquals("F2C incorrect ", expected, actual, 0.1);
    }

    @Test
    public void convertCtoF() throws Exception {
        double expected = (degreesCelsius * (9/5)) + 32;
        double actual = temperatureConverter.convertCtoF(degreesCelsius);
        assertEquals("C2F incorrect ", expected, actual, 0.1);
    }

    @Test
    public void convertCtoK() throws Exception {
        double expected = degreesCelsius + 237.15;
        double actual = temperatureConverter.convertCtoK(degreesCelsius);
        assertEquals("C2K incorrect ", expected, actual, 0.1);
    }

    @Test
    public void convertKtoC() throws Exception {
        double expected = kelvin - 237.15;
        double actual = temperatureConverter.convertKtoC(kelvin);
        assertEquals("K2C incorrect ", expected, actual, 0.1);
    }

    @Test
    public void convertFtoK() throws Exception {
        double expected = (degreesFahrenheit - 459.67) * (5/9);
        double actual = temperatureConverter.convertFtoK(degreesFahrenheit);
        assertEquals("F2K incorrect ", expected, actual, 0.1);
    }

    @Test
    public void convertKtoF() throws Exception {
        double expected = kelvin * (9/5) - 459.67;
        double actual = temperatureConverter.convertKtoF(kelvin);
        assertEquals("K2F incorrect ", expected, actual, 0.1);
    }

}