package com.simplgility.training;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        System.out.println("In Test");
        System.out.println("In Test");
        System.out.println("In Test");
        System.out.println("In Test");
        System.out.println("In Test");
        System.out.println("In Test");
        System.out.println("In Test");
        System.out.println("In Test");
        System.out.println("In Test");
        System.out.println("In Test");
        assertTrue(true);
        assertTrue(true);
        assertTrue(true);
        assertTrue(true);
    }

    public void simple(){
        System.out.println("some jar");
    }

    public void diff(){
        System.out.println("some jar");
    }
}
