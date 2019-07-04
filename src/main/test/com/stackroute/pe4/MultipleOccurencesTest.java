package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurencesTest {
    MultipleOccurences ob;
    @Before
    public void setUp(){
        ob=new MultipleOccurences();
    }

    @After
    public void tearDown() {
        ob=null;
    }
    @Test
    public void givenStringAndPatternShouldReturnIndex()
    {
        String result=ob.findMultipleOccurences("She sells seashells by the seashore","se");
        assertEquals("Found at 4-6 Found at 10-12 Found at 27-29 ",result);
    }

}