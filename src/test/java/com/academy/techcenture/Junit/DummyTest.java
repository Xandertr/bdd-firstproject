package com.academy.techcenture.Junit;

import org.junit.*;

public class DummyTest {


    @BeforeClass

    public static void beforeClassConfiguration() {

        System.out.println("Doing some configuration in before class method");
    }

    @AfterClass
    public static void afterClassConfiguration() {
        System.out.println("Doing some configuration in after class method");
    }

    @Before
    public void setUp() {


        System.out.println("before method running");

    }

    @After

    public void tearDown() {
        System.out.println("after method running...");

    }

    @Test
    public void test1() {

        System.out.println("Starting test1");
        Assert.assertEquals("Numbers are not equal", 25, 25);
        System.out.println("Ending test1");
    }

    @Test
    public void test2() {
        System.out.println("Starting test2");
        Assert.assertTrue("something went wrong",6>3);
        System.out.println("Ending test2");

    }

    @Test
    public void test3() {

        System.out.println("Starting test3");
        Assert.assertArrayEquals("not the same",new int[]{1,2,3}, new int[]{2,3,4});
        System.out.println("Ending test3");
    }

}
