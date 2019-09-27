/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Fake Wings
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
            TestBuscar.class,
            TestCrear.class,
            TestModificar.class,
            TestEliminar.class,
            TestMontoBono.class
        }
)
public class TestTodos {
    
}
