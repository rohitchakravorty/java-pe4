package com.stackroute.pe4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabetStringSortTest {
    AlphabetStringSort ob;
    @Before
    public void setUp(){
        ob=new AlphabetStringSort();
    }

    @After
    public void tearDown() {
        ob=null;
    }
    @Test
    public void givenStringShouldReturnSorted()
    {
        String result=ob.wordAlphabetSorter("rohit chakravorty");
        assertEquals("[chakravorty, rohit]",result);
    }

}