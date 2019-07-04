package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchRegularExpressionTest {
    SearchRegularExpression ob;
    @Before
    public void setUp(){
        ob=new SearchRegularExpression();
    }

    @After
    public void tearDown() {
        ob=null;
    }
    @Test
    public void givenStringShouldReturnContainsHarryOrNot()
    {
        boolean result=ob.regularExpressionSearcher("IU Harry...");
        assertEquals(true,result);
    }


}