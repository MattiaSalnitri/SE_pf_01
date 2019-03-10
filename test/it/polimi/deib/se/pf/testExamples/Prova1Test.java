package it.polimi.deib.se.pf.testExamples;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class Prova1Test {

    Prova1 p1 = null;

    @Before
    public void setUp() throws Exception
    {
        p1 = new Prova1("ciao");

    }

    @After
    public void tearDown() throws Exception
    {
        p1= null;
    }

    @Test
    public void getFirstAttribute_ok() {
        //I can use assert equals since it uses the method equals of string
        assertEquals("ciao", p1.getFirstAttribute());

    }

    @Test
    public void getFirstAttribute_fail() {
        assertThat(p1.getFirstAttribute(), not(equalTo("ciao1")));

    }

    @Test
    public void setFirstAttribute()
    {
        p1.setFirstAttribute("ciao1");
        assertEquals("ciao1", p1.getFirstAttribute());

    }
}