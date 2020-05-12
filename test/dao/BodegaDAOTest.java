/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.table.DefaultTableModel;
import modelo.Bodega;
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
public class BodegaDAOTest {
    
    Bodega bodega;
    BodegaDAO dao;
    
    public BodegaDAOTest() {
        bodega = new Bodega();
        dao = new BodegaDAO();
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
     * Test of guardarBodega method, of class BodegaDAO.
     */
    @Test
    public void testGuardarBodega() {
        System.out.println("guardarBodega");
        bodega = new Bodega(1,15, "2020-04-10", "descripcion");
        
        boolean resultEsperado = true;
        boolean resultObtenido = dao.guardarBodega(bodega);
        assertEquals(resultEsperado, resultObtenido);
       
    }

    /**
     * Test of eliminarBodega method, of class BodegaDAO.
     */
//    @Test
//    public void testEliminarBodega() {
//        System.out.println("eliminarBodega");
//        int codigo = 3;
//        boolean Eliminarbodega = dao.eliminarBodega(codigo);
//        boolean resultEsperado = true;
//        
//        assertEquals(Eliminarbodega, resultEsperado);
//    }

    /**
     * Test of editarBodega method, of class BodegaDAO.
     */
//    @Test
//    public void testEditarBodega() {
//        System.out.println("editarBodega");
//        bodega = new Bodega(4,1,17, "2020-04-11", "descripcion 2");
//        
//        boolean resultEsperado = true;
//        boolean resultObtenido = dao.editarBodega(bodega);
//        assertEquals(resultEsperado, resultObtenido);
//    }

    /**
     * Test of buscarBodega method, of class BodegaDAO.
     */
    @Test
    public void testBuscarBodega() {
        System.out.println("buscarBodega");
        int codigo = 4;
        
        Bodega Buscarbodega = dao.buscarBodega(codigo);
        if (Buscarbodega.getId_bodega()== codigo) {
            System.out.println("Se encontro");
            System.out.println("Esta es la descripcion: "+Buscarbodega.getDescripcion());
        }else{
            System.out.println("No se encontro");
        
    }
        
        assertEquals(Buscarbodega.getId_bodega(), codigo);
    }

   
    
}
