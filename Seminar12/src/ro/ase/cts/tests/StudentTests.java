package ro.ase.cts.tests;

import org.junit.Test;
import ro.ase.cts.clase.Student;

import static org.junit.Assert.*;

public class StudentTests {

    @Test
    public void testCorectitudineConstructorCuParametru(){
        String nume = "Mihai";
        Student student = new Student(nume);

//        if(nume.equals(student.getNume())){
//            System.out.println("Corect");
//        }
//        else{
//            System.out.println("Gresit");
//        }

        assertEquals(nume,student.getNume());
    }
    @Test
    public void testInitializareListaInConstructorCuParametri(){
        Student student = new Student("Gigel");
        assertNotNull(student.getNote());
    }

    @Test
    public void testCorectitudineContructorDefault(){
        Student student = new Student();
        assertNotNull("numele nu a fost initializat",student.getNote());
        assertNotNull("notele nu au fost initializate",student.getNote());
    }

    @Test
    public void testMetodaAdaugareNotaInLista(){
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals(nota,student.getNota(0));
    }
    @Test
    public void testDimensiuneLista(){
        Student student = new Student();
        student.adaugaNota(10);
        student.adaugaNota(9);
        assertEquals(2, student.getNote().size());
    }
    @Test
    public void testCalculeazaMedie(){
        Student student = new Student();
        student.adaugaNota(10);
        student.adaugaNota(9);
        assertEquals(9.5f,student.calculeazaMedie(),0.1);
    }
    @Test
    public void testStudentCuRestanta(){
        Student student = new Student();
        student.adaugaNota(4);
        assertTrue(student.areRestante());
    }
    @Test
    public void testStudentFaraRestanta(){
        Student student = new Student();
        student.adaugaNota(10);
        assertFalse(student.areRestante());
    }
    @Test
    public void testGetNotaIndexInvalid(){
        Student student = new Student();
        student.adaugaNota(7);
   //1
        try{
            //2
            int nota = student.getNota(-1);
            //3 -nu se ajunge
            fail("Nu trebuia sa ajunga aici, metoda nu arunca exceptie");
        }
        catch (IndexOutOfBoundsException exception){
            //4
        }
        catch (Exception e){
            //5-nu se ajunge
            fail("Tipul exceptiei aruncate nu este corect");
        }
        //6
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNotaIndexInvalidJunit4(){
        Student student = new Student();
        student.adaugaNota(9);

        int nota = student.getNota(-1);
    }

}