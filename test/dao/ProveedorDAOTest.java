/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.table.DefaultTableModel;
import modelo.Proveedor;
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
public class ProveedorDAOTest {
    Proveedor pro;
    ProveedorDAO dao;
    
    public ProveedorDAOTest() {
        pro = new Proveedor();
        dao = new ProveedorDAO();
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
     * Test of guardarProveedor method, of class ProveedorDAO.
     */
    @Test
    public void testGuardarProveedor() {
        System.out.println("guardarProveedor");
        pro = new Proveedor("nombre_proveedor", "telefono", "correo");           
                            
        
        boolean resultObtenido = true;
        boolean resultEsperado = dao.guardarProveedor(pro);
        
        assertEquals(resultObtenido, resultEsperado);
    }

    /**
     * Test of eliminarProveedor method, of class ProveedorDAO.
     */
    @Test
    public void testEliminarProveedor() {
        System.out.println("eliminarProveedor");
        int codigo = 6;
        boolean EliminarProveedor = dao.eliminarProveedor(codigo);
        boolean resultEsperado = true;
        
        assertEquals(EliminarProveedor, resultEsperado);
    }

    /**
     * Test of editarProveedor method, of class ProveedorDAO.
     */
    @Test
    public void testEditarProveedor() {
        System.out.println("editarProveedor");
        pro = new Proveedor(6,"nombre_proveedor2", "telefono2", "correo2");           
                            
        
        boolean resultObtenido = true;
        boolean resultEsperado = dao.editarProveedor(pro);
        
        assertEquals(resultObtenido, resultEsperado);
    }

    /**
     * Test of buscarProveedor method, of class ProveedorDAO.
     */
    @Test
    public void testBuscarProveedor() {
        System.out.println("buscarProveedor");
        int codigo = 6;
        
        Proveedor BuscarProveedor = dao.buscarProveedor(codigo);
        if (BuscarProveedor.getCodigo_proveedor() == codigo) {
            System.out.println("Se encontro");
            System.out.println("nombre: " + BuscarProveedor.getNombre_proveedor());
        }else{
            System.out.println("No se encontro");
        
    }
        
        assertEquals(BuscarProveedor.getCodigo_proveedor(), codigo);
    }

    
    
}
