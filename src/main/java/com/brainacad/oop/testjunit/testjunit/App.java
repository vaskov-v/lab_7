package com.brainacad.oop.testjunit.testjunit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Temperature convertor" );
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double degreesCelsius = 80;
        double kalvin = 100;
        System.out.println("Temperature convertor: " + degreesCelsius + " C in F is: " + temperatureConverter.convertCtoF(degreesCelsius));
        System.out.println("Temperature convertor: " + kalvin + " K in F is: " + temperatureConverter.convertKtoF(kalvin));
                
    }
}
