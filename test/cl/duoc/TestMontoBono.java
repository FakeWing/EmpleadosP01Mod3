/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Fake Wings
 */
public class TestMontoBono {

    public TestMontoBono() {
    }

    @Test
    public void testMontoBono() {
        System.out.println("Monto Bono");
        BussEmpleado instance = new BussEmpleado();
        Empleado empleado = instance.Buscar("88888888");
        assertTrue(empleado.montoBono() == 500000);
    }
}
