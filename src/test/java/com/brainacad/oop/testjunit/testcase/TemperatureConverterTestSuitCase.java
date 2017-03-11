package com.brainacad.oop.testjunit.testcase;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@Suite.SuiteClasses({TemperatureConverterC2FTest.class, 
                     TemperatureConverterC2KTest.class, 
                     TemperatureConverterF2CTest.class,
                     TemperatureConverterF2KTest.class,
                     TemperatureConverterK2CTest.class,
                     TemperatureConverterK2FTest.class})
public class TemperatureConverterTestSuitCase {

}
