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
public class TestModificar {

    public TestModificar() {
    }

    @Test
    public void testModificar() {
        System.out.println("Modificar");
        BussEmpleado instance = new BussEmpleado();
        Empleado empleado = instance.Buscar("11111111");
        empleado.setNombre("Nuevo Nombre");
        empleado.setEdad(40);
        empleado.setAntiguedad(10);
        boolean esperado = true;
        boolean obtenido = instance.Modificar(empleado);
        Assert.assertEquals(esperado, obtenido);
    }

}

