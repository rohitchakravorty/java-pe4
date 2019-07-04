package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    TransposeString ob;
    @Before
    public void setUp(){
        ob=new TransposeString();
    }

    @After
    public void tearDown() {
        ob=null;
    }
    @Test
    public void givenStringShouldReturnTransposeString()
    {
        String result=ob.stringTranspose("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god ",result);
    }

}