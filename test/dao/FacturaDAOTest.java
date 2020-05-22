/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Factura;
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
public class FacturaDAOTest {
    
    Factura factura;
    FacturaDAO dao;
    public FacturaDAOTest() {
        factura = new Factura();
        dao = new FacturaDAO();
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
     * Test of guardarFactura method, of class FacturaDAO.
     */
    @Test
    public void testGuardarFactura() {
        System.out.println("guardarFactura");
        factura = new Factura(6677, "juan22", 1, "cilantro", 2, 10000, 20000, 4058100, 951900, 20000);           
                            
        
        boolean resultObtenido = true;
        boolean resultEsperado = dao.guardarFactura(factura);
        
        assertEquals(resultObtenido, resultEsperado);
    }
    
}
