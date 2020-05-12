/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.table.DefaultTableModel;
import modelo.Vendedor;
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
public class VendedorDAOTest {
    VendedorDAO dao;
    Vendedor ven;
    
    public VendedorDAOTest() {
        dao = new VendedorDAO();
        ven = new Vendedor();
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
     * Test of guardarVendedor method, of class VendedorDAO.
     */
//    @Test
//    public void testGuardarVendedor() {
//        System.out.println("guardarVendedor");
//        ven = new Vendedor(777, "nombre_vendedor", "nombre_usuario", "contrasena");
//                            
//        
//        boolean resultObtenido = true;
//        boolean resultEsperado = dao.guardarVendedor(ven);
//        
//        assertEquals(resultObtenido, resultEsperado);
//    }

    

    /**
     * Test of eliminarVendedor method, of class VendedorDAO.
     */
    @Test
    public void testEliminarVendedor() {
        System.out.println("eliminarVendedor");
        int cedula = 777;
        boolean EliminarVendedor = dao.eliminarVendedor(cedula);
        boolean resultEsperado = true;
        
        assertEquals(EliminarVendedor, resultEsperado);
    }

    /**
     * Test of editarVendedor method, of class VendedorDAO.
     */
//    @Test
//    public void testEditarVendedor() {
//        System.out.println("editarVendedor");
//        ven = new Vendedor(777, "nombre_vendedor2", "nombre_usuario2", "contrasena2");
//                            
//        
//        boolean resultObtenido = true;
//        boolean resultEsperado = dao.editarVendedor(ven);
//        
//        assertEquals(resultObtenido, resultEsperado);
//    }

    /**
     * Test of buscarVendedor method, of class VendedorDAO.
     */
//    @Test
//    public void testBuscarVendedor() {
//        System.out.println("buscarVendedor");
//        int cedula = 777;
//        
//        Vendedor BuscarVendedor = dao.buscarVendedor(cedula);
//        if (BuscarVendedor.getCedula_vendedor() == cedula) {
//            System.out.println("Se encontro");
//            System.out.println("Nombre: " + BuscarVendedor.getNombre_vendedor());
//            
//        }else{
//            System.out.println("No se encontro");
//        
//    }
//        
//        assertEquals(BuscarVendedor.getCedula_vendedor(), cedula);
//    }

//    /**
//     * Test of listarVendedor method, of class VendedorDAO.
//     */
//    @Test
//    public void testListarVendedor() {
//        System.out.println("listarVendedor");
//        VendedorDAO instance = new VendedorDAO();
//        DefaultTableModel expResult = null;
//        DefaultTableModel result = instance.listarVendedor();
//        assertEquals(expResult, result);
//        
//    }
    
}
