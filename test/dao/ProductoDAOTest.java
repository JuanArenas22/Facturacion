/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
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
public class ProductoDAOTest {
    Producto pro;
    ProductoDAO dao;
    
    public ProductoDAOTest() {
        pro = new Producto();
        dao = new ProductoDAO();
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
     * Test of guardarProducto method, of class ProductoDAO.
     */
//    @Test
//    public void testGuardarProducto() {
//        System.out.println("guardarProducto");
//         pro = new Producto("prueba", 50, "unidad", 1, 1);           
//                            
//        
//        boolean resultObtenido = true;
//        boolean resultEsperado = dao.guardarProducto(pro);
//        
//        assertEquals(resultObtenido, resultEsperado);
//    }

    /**
     * Test of eliminarProducto method, of class ProductoDAO.
     */
//    @Test
//    public void testEliminarProducto() {
//        System.out.println("eliminarProducto");
//        int codigo = 5;
//        boolean Eliminarcliente = dao.eliminarProducto(codigo);
//        boolean resultEsperado = true;
//        
//        assertEquals(Eliminarcliente, resultEsperado);
//    }

    /**
     * Test of editarProducto method, of class ProductoDAO.
     */
//    @Test
//    public void testEditarProducto() {
//        System.out.println("editarProducto");
//        pro = new Producto(5,"prueba2", 60, "unidad2", 1, 1);   
//                            
//        
//        boolean resultObtenido = true;
//        boolean resultEsperado = dao.editarProducto(pro);
//        
//        assertEquals(resultObtenido, resultEsperado);
//    }

    /**
     * Test of buscarProducto method, of class ProductoDAO.
     */
    @Test
    public void testBuscarProducto() {
        System.out.println("buscarProducto");
        int codigo = 5;
        
        Producto BuscarProducto = dao.buscarProducto(codigo);
        if (BuscarProducto.getCodigo_producto() == codigo) {
            System.out.println("Se encontro");
            System.out.println("nombre del producto: " + BuscarProducto.getNombre_producto());
        }else{
            System.out.println("No se encontro");
        
    }
        
        assertEquals(BuscarProducto.getCodigo_producto(), codigo);
    }

    
    

    

    
    
}
