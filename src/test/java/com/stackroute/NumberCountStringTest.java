package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberCountStringTest {
    NumberCountString numberCountString;

    @Before
    public  void setUp(){
        this.numberCountString=new NumberCountString();
    }

    @After
    public  void teardown(){
        this.numberCountString=null;
    }

    @Test
    public void checkFrequency() {
        String expected="{one=5, two=2, three=2}";
        String actual=numberCountString.checkCount("one one -one___two,,three,one @three*one?two");
        assertEquals(expected,actual);
    }

    @Test
    public void checkFrequencyNull() {

        String actual=numberCountString.checkCount(null);
        assertNull(actual);
    }
    @Test
    public void checkFrequencyNotNull() {

        String actual=numberCountString.checkCount("i am Batman");
        assertNotNull(actual);
    }
}