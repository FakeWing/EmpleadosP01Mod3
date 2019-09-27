/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Fake Wings
 */
public class TestCrear {

    public TestCrear() {
    }

    @Test
    public void testCrear() {
        System.out.println("Crear");
        Empleado empleado = new Empleado("66633322", "PepeHands", 80, 9);
        BussEmpleado instance = new BussEmpleado();
        boolean esperado = true;
        boolean obtenido = instance.Crear(empleado);
        Assert.assertEquals(esperado, obtenido);
    }
}
