/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.table.DefaultTableModel;
import modelo.CategoriaPro;
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
public class CategoriaDAOTest {
    CategoriaDAO dao;
    CategoriaPro cate;
    
    public CategoriaDAOTest() {
        dao = new CategoriaDAO();
        cate = new CategoriaPro();
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
     * Test of guardarCategoria method, of class CategoriaDAO.
     */
//    @Test
//    public void testGuardarCategoria() {
//        System.out.println("guardarCategoria");
//        cate = new CategoriaPro("limpieza");           
//                            
//        
//        boolean resultObtenido = true;
//        boolean resultEsperado = dao.guardarCategoria(cate);
//        
//        assertEquals(resultObtenido, resultEsperado);
//    }

    /**
     * Test of eliminarCategoria method, of class CategoriaDAO.
     */
//    @Test
//    public void testEliminarCategoria() {
//        System.out.println("eliminarCategoria");
//        int codigo = 5;
//        boolean EliminarCategoria = dao.eliminarCategoria(codigo);
//        boolean resultEsperado = true;
//        
//        assertEquals(EliminarCategoria, resultEsperado);
//    }

    /**
     * Test of editarCategoria method, of class CategoriaDAO.
     */
//    @Test
//    public void testEditarCategoria() {
//        System.out.println("editarCategoria");
//        cate = new CategoriaPro(5,"limpieza 2");           
//                            
//        
//        boolean resultObtenido = true;
//        boolean resultEsperado = dao.editarCategoria(cate);
//        
//        assertEquals(resultObtenido, resultEsperado);
//    }

    /**
     * Test of buscarCategoria method, of class CategoriaDAO.
     */
//    @Test
//    public void testBuscarCategoria() {
//        System.out.println("buscarCategoria");
//        int codigo = 5;
//        
//        CategoriaPro Buscarcategoria = dao.buscarCategoria(codigo);
//        if (Buscarcategoria.getCodigo_cate() == codigo) {
//            System.out.println("Se encontro");
//            System.out.println("Este es el nombre: " + Buscarcategoria.getNombre());
//        }else{
//            System.out.println("No se encontro");
//        
//    }
//        
//        assertEquals(Buscarcategoria.getCodigo_cate(), codigo);
//        
//    }
//        
    

    
    
}
