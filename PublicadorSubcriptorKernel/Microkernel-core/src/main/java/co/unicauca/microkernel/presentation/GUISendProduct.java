/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.microkernel.presentation;

import co.unicauca.microkernel.infra.Publisher;
import co.unicauca.microkernel.business.ServicioMedicion;
import co.unicauca.microkernel.business.ProductService;
import co.unicauca.microkernel.common.entities.Medicion;
import co.unicauca.microkernel.common.entities.Product;
import com.google.gson.Gson;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Juan C
 */
public class GUISendProduct extends javax.swing.JFrame{
    
    
    //private ProductService productService;
    private ServicioMedicion servicioMedicion;
    List<Product> products;
    Publisher publisher;

    /**
     * Creates new form GUISendProduct
     */
    public GUISendProduct() {
        initComponents();
        ProductService productService = new ProductService();
        publisher = new Publisher();
        products = productService.getAll();
        for (int index = 0; index < products.size(); index++) {
        jComboBox1.addItem(products.get(index).getName());
        }
        txtEstado.setEnabled(false);
        txtEstado.setText("...");
        jButton2.setVisible(false);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtLargo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDiametro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("MENU");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Ingrese los siguientes datos del producto.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 30));

        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 133, 30));

        jLabel3.setText("Largo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 40, 30));
        jPanel1.add(txtLargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 130, 30));

        jLabel4.setText("Peso");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 50, 30));
        jPanel1.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 133, 30));

        jLabel6.setText("Codigo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 50, 30));

        jLabel5.setText("Diametro");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 60, 30));
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 130, 30));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 130, 30));

        jLabel7.setText("Estado");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 50, 30));

        txtDiametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiametroActionPerformed(evt);
            }
        });
        jPanel1.add(txtDiametro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 130, 30));

        jLabel8.setText("Seleccione el producto");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 133, 30));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Analizar Calidad");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Verificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Product selectedProduct = products.get(this.jComboBox1.getSelectedIndex());
        selectedProduct.setLargo(Double.parseDouble(txtLargo.getText()));
        selectedProduct.setDiametro(Double.parseDouble(txtDiametro.getText()));
        selectedProduct.setPeso(Double.parseDouble(txtPeso.getText()));
        Medicion entidadMedicion = new Medicion(selectedProduct,txtCodigo.getText());
        try {
            servicioMedicion = new ServicioMedicion();
            String estado = servicioMedicion.calculateDeliveryCost(entidadMedicion);
            txtEstado.setText(estado);
            selectedProduct.setEstado(estado);
            jButton2.setVisible(true);
        } catch (Exception exception) {
            System.out.println("No es posible verificar el estado del producto. " + exception.getMessage());
        }

        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Product selectedProduct = products.get(this.jComboBox1.getSelectedIndex());
        Gson gson = new Gson();
        String msgJson = gson.toJson(selectedProduct);
        publisher.publish(msgJson);
        jButton2.setVisible(false);
        txtLargo.setText("");
        txtDiametro.setText("");
        txtCodigo.setText("");
        txtPeso.setText("");
        txtEstado.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtDiametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiametroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiametroActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDiametro;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtLargo;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables

}
