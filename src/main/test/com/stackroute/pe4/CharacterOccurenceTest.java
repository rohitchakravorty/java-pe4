package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterOccurenceTest {
    CharacterOccurence ob;
    @Before
    public void setUp(){
        ob=new CharacterOccurence();
    }

    @After
    public void tearDown() {
        ob=null;
    }
    @Test
    public void givenCharShouldReturnOccurence()
    {
        int result=ob.charOccurenceChecker("rohit","i");
        assertEquals(1,result);
    }
    @Test
    public void givenCharNotPresentShouldReturnOccurence()
    {
        int result=ob.charOccurenceChecker("roht","i");
        assertEquals(0,result);
    }
}