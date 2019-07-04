package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharReplaceTest {
    CharReplace ob;
    @Before
    public void setUp(){
        ob=new CharReplace();
    }

    @After
    public void tearDown() {
        ob=null;
    }
    @Test
    public void givenCharShouldReturnOccurence()
    {
        String result=ob.replaceChar("daily dry");
        assertEquals("faity fry",result);
    }
}

