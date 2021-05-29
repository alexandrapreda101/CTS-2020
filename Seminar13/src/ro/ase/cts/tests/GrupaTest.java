package ro.ase.cts.tests;

import org.junit.Test;
import ro.ase.cts.clase.Grupa;

import static org.junit.Assert.*;

public class GrupaTest {

    @Test
    public void testRight(){
        Grupa grupa = new Grupa(1085);
        assertEquals(1085, grupa.getNrGrupa());
    }
    @Test
    public void testBoundaryLimitaInferioara(){
        Grupa grupa = new Grupa(1000);
        assertEquals(1000, grupa.getNrGrupa());
    }
    @Test
    public void testBoundaryLimitaSuperioara(){
        Grupa grupa = new Grupa(1100);
        assertEquals(1100, grupa.getNrGrupa());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testErrorLimitaInferioara(){
        Grupa grupa = new Grupa(700);
        assertEquals(700, grupa.getNrGrupa());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testErrorLimitaSuperioara() {
        Grupa grupa = new Grupa(1700);
        assertEquals(1700, grupa.getNrGrupa());
    }
    @Test(timeout = 500)
    public  void testPerformanta(){
        Grupa grupa = new Grupa(1085);
    }
    @Test
    public void testExistance(){
        Grupa grupa = new Grupa(1085);
        assertNotNull(grupa.getStudenti());
    }
    }