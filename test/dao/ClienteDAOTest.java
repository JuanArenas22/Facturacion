/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
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
public class ClienteDAOTest{
    
    ClienteDAO dao ;
    Cliente cli;
    public ClienteDAOTest() {
       dao = new ClienteDAO();
       cli = new Cliente();
        
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
     * Test of guardarCliente method, of class ClienteDAO.
     */
//    @Test
//    public void testGuardarCliente() {
//        System.out.println("guardarCliente");
//        cli = new Cliente(55,"kira", "pepito", "25 mayo", "9876543","kiralomejor@gmail.com", "kira");           
//                            
//        
//        boolean resultObtenido = true;
//        boolean resultEsperado = dao.guardarCliente(cli);
//        
//        assertEquals(resultObtenido, resultEsperado);       
//        
//    }

    /**
     * Test of eliminarCliente method, of class ClienteDAO.
     */
//    @Test
//    public void testEliminarCliente() {
//        System.out.println("eliminarCliente");
//        int cedula = 55;
//        boolean Eliminarcliente = dao.eliminarCliente(cedula);
//        boolean resultEsperado = true;
//        
//        assertEquals(Eliminarcliente, resultEsperado);
//      
//    }

    /**
     * Test of editarCliente method, of class ClienteDAO.
     */
//    @Test
//    public void testEditarCliente() {
//        System.out.println("editarCliente");
//        cli = new Cliente(55,"kira maria", "pepito2", "yulima", "4678","kiralomejor2@gmail.com", "kiraa");        
//        
//        boolean expResult = true;
//        boolean result = dao.editarCliente(cli);
//        
//        assertEquals(expResult, result);
//    }

    /**
     * Test of buscarCliente method, of class ClienteDAO.
     */
    @Test
    public void testBuscarCliente() {
        System.out.println("buscarCliente");
        int cedula = 123;
        
        Cliente Buscarcliente = dao.buscarCliente(cedula);
        if (Buscarcliente.getCedula_cliente() == cedula) {
            System.out.println("Se encontro");
            System.out.println("Nombre: " + Buscarcliente.getNombre_cliente());
        }else{
            System.out.println("No se encontro");        
    }        
        assertEquals(Buscarcliente.getCedula_cliente(), cedula);
        
    }


}
