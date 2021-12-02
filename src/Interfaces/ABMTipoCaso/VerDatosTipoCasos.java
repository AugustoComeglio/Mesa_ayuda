/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.ABMTipoCaso;


import DTO.DTOsTipoCaso.DTOTipoCaso;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author leand
 */
public class VerDatosTipoCasos extends javax.swing.JFrame {
    /**
     * Creates new form VerDatos
     */
    public VerDatosTipoCasos(DTOTipoCaso dtoTipoCaso) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Datos Tipo Caso -" + dtoTipoCaso.getNombreTipoCaso() );
        inputCodTipoCaso.setForeground(Color.black);
        inputNomTipoCaso.setForeground(Color.black);
        inputFechaTipoCaso.setForeground(Color.black);
        inputCodTipoCaso.setText(Integer.toString(dtoTipoCaso.getCodTipoCaso()));
        inputNomTipoCaso.setText(dtoTipoCaso.getNombreTipoCaso());
        if(dtoTipoCaso.getFechaFinVigenciaTipoCaso() == null){
            inputFechaTipoCaso.setText("vigente");
        }else{
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm");
            Date fecha = dtoTipoCaso.getFechaFinVigenciaTipoCaso();
            String fechaString = df.format(fecha);
            inputFechaTipoCaso.setText(fechaString);
        }
    }
    private VerDatosTipoCasos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jPanel3 = new javax.swing.JPanel();
        labelTituloMostrar = new javax.swing.JLabel();
        labelcodver = new javax.swing.JLabel();
        inputCodTipoCaso = new javax.swing.JTextField();
        labelnombver = new javax.swing.JLabel();
        inputNomTipoCaso = new javax.swing.JTextField();
        labelFechaFinver = new javax.swing.JLabel();
        inputFechaTipoCaso = new javax.swing.JTextField();
        botonContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(119, 148, 166));

        labelTituloMostrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelTituloMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojonegro.png"))); // NOI18N
        labelTituloMostrar.setText("DATOS DE TIPO CASO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(labelTituloMostrar)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(labelTituloMostrar)
                .addGap(37, 37, 37))
        );

        labelcodver.setBackground(new java.awt.Color(0, 0, 0));
        labelcodver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelcodver.setText("Cod. Tipo Caso:");

        inputCodTipoCaso.setEditable(false);
        inputCodTipoCaso.setBackground(new java.awt.Color(153, 153, 153));
        inputCodTipoCaso.setBorder(null);
        inputCodTipoCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCodTipoCasoActionPerformed(evt);
            }
        });
        inputCodTipoCaso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputCodTipoCasoKeyTyped(evt);
            }
        });

        labelnombver.setBackground(new java.awt.Color(0, 0, 0));
        labelnombver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelnombver.setText("Nombre Tipo Caso:");

        inputNomTipoCaso.setEditable(false);
        inputNomTipoCaso.setBackground(new java.awt.Color(153, 153, 153));
        inputNomTipoCaso.setBorder(null);
        inputNomTipoCaso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputNomTipoCasoKeyTyped(evt);
            }
        });

        labelFechaFinver.setBackground(new java.awt.Color(0, 0, 0));
        labelFechaFinver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelFechaFinver.setText("Fecha Fin Vigencia :");

        inputFechaTipoCaso.setEditable(false);
        inputFechaTipoCaso.setBackground(new java.awt.Color(153, 153, 153));
        inputFechaTipoCaso.setBorder(null);
        inputFechaTipoCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFechaTipoCasoActionPerformed(evt);
            }
        });
        inputFechaTipoCaso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputFechaTipoCasoKeyTyped(evt);
            }
        });

        botonContinuar.setBackground(new java.awt.Color(204, 204, 204));
        botonContinuar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_arrow_back_black_18dp.png"))); // NOI18N
        botonContinuar.setMnemonic('v');
        botonContinuar.setText("Volver");
        botonContinuar.setBorder(null);
        botonContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonContinuar.setPreferredSize(new java.awt.Dimension(120, 36));
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelcodver)
                            .addComponent(labelFechaFinver))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputFechaTipoCaso, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                .addComponent(labelnombver)
                                .addComponent(inputCodTipoCaso, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                .addComponent(inputNomTipoCaso, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)))
                        .addGap(0, 28, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelcodver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCodTipoCaso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelnombver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNomTipoCaso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFechaFinver, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputFechaTipoCaso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(botonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarActionPerformed
        //Botón para volver al menú de sector
       ABMTipoCaso abm = new ABMTipoCaso();
       abm.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_botonContinuarActionPerformed

    private void inputCodTipoCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCodTipoCasoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCodTipoCasoActionPerformed

    private void inputCodTipoCasoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCodTipoCasoKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor el campo solo admite numeros", "Mensaje de Error Codigo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_inputCodTipoCasoKeyTyped

    private void inputNomTipoCasoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputNomTipoCasoKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < 'a'||  car > 'z') && (car < 'A' ||  car > 'Z') && (car < '0' || car > '9') && (car == (char) KeyEvent.VK_BACK_SPACE) && (car == (char) KeyEvent.VK_SPACE) ) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "El campo no admite caracteres especiales", "Mensaje de Error Nombre", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_inputNomTipoCasoKeyTyped

    private void inputFechaTipoCasoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputFechaTipoCasoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFechaTipoCasoKeyTyped

    private void inputFechaTipoCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFechaTipoCasoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFechaTipoCasoActionPerformed

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
            java.util.logging.Logger.getLogger(VerDatosTipoCasos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerDatosTipoCasos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerDatosTipoCasos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerDatosTipoCasos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerDatosTipoCasos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonContinuar;
    private javax.swing.JTextField inputCodTipoCaso;
    private javax.swing.JTextField inputFechaTipoCaso;
    private javax.swing.JTextField inputNomTipoCaso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelFechaFinver;
    private javax.swing.JLabel labelTituloMostrar;
    private javax.swing.JLabel labelcodver;
    private javax.swing.JLabel labelnombver;
    // End of variables declaration//GEN-END:variables
}
