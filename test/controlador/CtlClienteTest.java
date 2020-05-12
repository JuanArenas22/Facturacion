/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class CtlClienteTest {
    
    public CtlClienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of guardarCliente method, of class CtlCliente.
     */
    @Test
    public void testGuardarCliente() {
        System.out.println("guardarCliente");
        Cliente cliente = new Cliente(55,"kira", "kira22", "25 mayo", "9876543","kira@gmail.com", "kira");          
        
        CtlCliente instance = new CtlCliente();
        boolean expResult = true;
        boolean result = instance.guardarCliente(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(result ==expResult)){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of buscarCliente method, of class CtlCliente.
     */
    @Test
    public void testBuscarCliente() {
        System.out.println("buscarCliente");
        int cedula = 0;
        CtlCliente instance = new CtlCliente();
        Cliente expResult = null;
        Cliente result = instance.buscarCliente(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarClienteLogin method, of class CtlCliente.
     */
    @Test
    public void testBuscarClienteLogin() {
        System.out.println("buscarClienteLogin");
        String nombre = "";
        String contrasena = "";
        CtlCliente instance = new CtlCliente();
        Cliente expResult = null;
        Cliente result = instance.buscarClienteLogin(nombre, contrasena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarCliente method, of class CtlCliente.
     */
    @Test
    public void testModificarCliente() {
        System.out.println("modificarCliente");
        Cliente cliente = null;
        CtlCliente instance = new CtlCliente();
        boolean expResult = false;
        boolean result = instance.modificarCliente(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarCliente method, of class CtlCliente.
     */
    @Test
    public void testEliminarCliente() {
        System.out.println("eliminarCliente");
        int cedula = 0;
        CtlCliente instance = new CtlCliente();
        boolean expResult = false;
        boolean result = instance.eliminarCliente(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SolicitudListar method, of class CtlCliente.
     */
    @Test
    public void testSolicitudListar() {
        System.out.println("SolicitudListar");
        CtlCliente instance = new CtlCliente();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.SolicitudListar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
