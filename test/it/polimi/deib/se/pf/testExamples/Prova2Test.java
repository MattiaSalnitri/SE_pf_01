package it.polimi.deib.se.pf.testExamples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Prova2Test {

    Prova2 p2 = null;

    @Before
    public void setUp() throws Exception
    {
        p2 = new Prova2(new Integer(2));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getInternalAttribute_ok()
    {
        assertThat(p2.getInternalAttribute(),is (equalTo(new Integer(2))));
    }

    @Test (expected = IllegalArgumentException.class)
    public void setInternalAttribute_wrongParam()
    {
        p2.setInternalAttribute("ciao");
    }
}