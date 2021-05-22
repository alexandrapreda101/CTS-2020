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

}