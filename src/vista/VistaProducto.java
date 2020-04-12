/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.CtlProducto;
import dao.ProductoDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.CategoriaPro;
import modelo.Producto;
import modelo.Proveedor;

/**
 *
 * @author Usuario
 */
public class VistaProducto extends javax.swing.JFrame {

    CtlProducto controllerProducto;
    ProductoDAO cargarcombo = new ProductoDAO();

    /**
     * Creates new form VistaProducto
     */
    public VistaProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        controllerProducto = new CtlProducto();

        cargarcombo.CargarComboProveedor(CmbProveedor);
        cargarcombo.CargarComboCategoria(CmbCategoria);
        listar();
        txtCodigoProducto.setEnabled(false);
    }

    

    //LIMPIA LOS CAMPOS 
    public void limpiarCampos() {
        txtCodigoProducto.setText("");
        txtNombre_pro.setText("");
        txtPrecio.setText("");
        cmbUnidad.setSelectedIndex(0);
        CmbProveedor.setSelectedIndex(0);
        CmbCategoria.setSelectedIndex(0);
        

    }

    //CARGA LA INFORMACION A LOS CAMPOS DE TEXTOS Y A LOS COMBOBOX
    public void cargarInformacion(Producto pro) {
        txtCodigoProducto.setText(pro.getCodigo_producto() + "");
        txtNombre_pro.setText(pro.getNombre_producto() + "");
        txtPrecio.setText(pro.getPrecio() + "");
        cmbUnidad.setSelectedItem(pro.getUnidad());

    }

    //CARGA LA INFORMACION A LA TABLA
    public void listar() {
        Tabla1.setModel(controllerProducto.SolicitudListar());
    }

    //METODO QUE SIRVE PARA LOS CAMPOS QUE SON SOLO NUMEROS
    public void SoloNumeros(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }

    //METODO QUE SIRVE PARA LOS CAMPOS QUE SON SOLO LETRAS
    public void SoloLetras(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ELIMINAR = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cmbUnidad = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JTextField();
        CmbProveedor = new javax.swing.JComboBox<>();
        CmbCategoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        GUARDAR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre_pro = new javax.swing.JTextField();
        BUSCAR = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        MODIFICAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FACTURACION");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("PRODUCTOS");

        jButton5.setText("VOLVER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addGap(260, 260, 260)
                .addComponent(jLabel1)
                .addContainerGap(367, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("UNIDAD:");

        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        jLabel7.setText("PROVEEDOR:");

        jButton6.setText("LIMPIAR CAMPOS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel8.setText("CATEGORIA:");

        cmbUnidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "KG", "LITROS", "LIBRAS", "PAQUETE", "DOCENA", "UNIDAD" }));

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla1);

        GUARDAR.setText("GUARDAR");
        GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDARActionPerformed(evt);
            }
        });

        jLabel2.setText("CODIGO DEL PRODUCTO:");

        txtCodigoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoProductoKeyTyped(evt);
            }
        });

        jLabel3.setText("SOLO PARA BUSCAR");

        jLabel4.setText("NOMBRE DEL PRODUCTO:");

        txtNombre_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre_proActionPerformed(evt);
            }
        });
        txtNombre_pro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre_proKeyTyped(evt);
            }
        });

        BUSCAR.setText("BUSCAR");
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });

        jLabel5.setText("PRECIO:");

        MODIFICAR.setText("MODIFICAR");
        MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ELIMINAR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MODIFICAR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BUSCAR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUARDAR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre_pro)
                            .addComponent(txtPrecio)
                            .addComponent(CmbProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CmbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombre_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(CmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(CmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(GUARDAR)
                .addGap(18, 18, 18)
                .addComponent(BUSCAR)
                .addGap(18, 18, 18)
                .addComponent(MODIFICAR)
                .addGap(18, 18, 18)
                .addComponent(ELIMINAR)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombre_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre_proActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre_proActionPerformed

    private void GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDARActionPerformed
        // TODO add your handling code here:
        try {

            String nombre = txtNombre_pro.getText();
            double precio = Double.parseDouble(txtPrecio.getText());
            String unidad = cmbUnidad.getSelectedItem().toString();

            Proveedor pro = (Proveedor) CmbProveedor.getSelectedItem();
            int proveedor_id = pro.getCodigo_proveedor();

            CategoriaPro ca = (CategoriaPro) CmbCategoria.getSelectedItem();
            int categoria_id = ca.getCodigo_cate();

            Producto prod = new Producto(nombre, precio, unidad, proveedor_id, categoria_id);

            if (cmbUnidad.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Debe tener la unidad sin seleccionar");
            } else if (controllerProducto.guardarProducto(prod)) {
                JOptionPane.showMessageDialog(null, "Se a guardado el producto");
                txtCodigoProducto.setEnabled(false);
                limpiarCampos();
                listar();

            } else {
                JOptionPane.showMessageDialog(null, "No Se a guardado el proveedor");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe llenar los campos", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_GUARDARActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        // TODO add your handling code here:

        try {
            int codigo = Integer.parseInt(txtCodigoProducto.getText());

            Producto pro = controllerProducto.buscarProducto(codigo);

            //Este for es para poder cargar el proveedor y la categoria a los comboBox
            if (pro.getCodigo_producto() == codigo) {
                cargarInformacion(pro);
                for (int i = 0; i <= pro.getProveedor_id(); i++) {
                    for (int j = 0; j <= pro.getCategoria_id(); j++) {
                        CmbProveedor.setSelectedIndex(i);
                        CmbCategoria.setSelectedIndex(j);
                    }
                }
                
                txtCodigoProducto.setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el producto");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR EL CODIGO A BUSCAR ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtCodigoProducto.setEnabled(true);
            txtCodigoProducto.setBackground(Color.PINK);
        }

    }//GEN-LAST:event_BUSCARActionPerformed

    private void MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICARActionPerformed
        // TODO add your handling code here:
        try {

            int codigo_producto = Integer.parseInt(txtCodigoProducto.getText());
            String nombre = txtNombre_pro.getText();
            double precio = Double.parseDouble(txtPrecio.getText());
            String unidad = cmbUnidad.getSelectedItem().toString();

            Proveedor pro = (Proveedor) CmbProveedor.getSelectedItem();
            int proveedor_id = pro.getCodigo_proveedor();

            CategoriaPro ca = (CategoriaPro) CmbCategoria.getSelectedItem();
            int categoria_id = ca.getCodigo_cate();

            Producto prod = new Producto(codigo_producto, nombre, precio, unidad, proveedor_id, categoria_id);

            if (controllerProducto.modificarProducto(prod)) {
                JOptionPane.showMessageDialog(null, "Se a guardado el proveedor");
                txtCodigoProducto.setEnabled(false);
                limpiarCampos();
                listar();

            } else {
                JOptionPane.showMessageDialog(null, "No Se a guardado el proveedor");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DEBE BUSCAR EL PRODUCTO Y LUEGO MODIFICARLO", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_MODIFICARActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        // TODO add your handling code here:
        try {
            int codigo = Integer.parseInt(txtCodigoProducto.getText());

            if (controllerProducto.eliminarProducto(codigo)) {
                JOptionPane.showMessageDialog(null, "Se elimino el producto");
                txtCodigoProducto.setEnabled(false);
                listar();
                limpiarCampos();

            } else {
                JOptionPane.showMessageDialog(null, "No se elimino el proveedor");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR EL CODIGO A ELIMINAR ", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        VistaMenuVendedor pro = new VistaMenuVendedor();
        pro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtCodigoProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProductoKeyTyped
        // TODO add your handling code here:
        SoloNumeros(evt);
    }//GEN-LAST:event_txtCodigoProductoKeyTyped

    private void txtNombre_proKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre_proKeyTyped
        // TODO add your handling code here:
        SoloLetras(evt);
    }//GEN-LAST:event_txtNombre_proKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:
        SoloNumeros(evt);
    }//GEN-LAST:event_txtPrecioKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUSCAR;
    private javax.swing.JComboBox<String> CmbCategoria;
    private javax.swing.JComboBox<String> CmbProveedor;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JButton GUARDAR;
    private javax.swing.JButton MODIFICAR;
    private javax.swing.JTable Tabla1;
    private javax.swing.JComboBox<String> cmbUnidad;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtNombre_pro;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
