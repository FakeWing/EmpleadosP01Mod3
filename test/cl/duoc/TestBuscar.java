/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Fake Wings
 */
public class TestBuscar {

    public TestBuscar() {
    }

    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        String rut = "99999999";
        BussEmpleado instance = new BussEmpleado();
        String esperado = rut;
        String obtenido = instance.Buscar(rut).getRut();
        Assert.assertEquals(esperado, obtenido);
    }

}
