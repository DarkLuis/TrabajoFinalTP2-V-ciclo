/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ConsultaCuentas.java
 *
 * Created on 10/08/2011, 02:36:58 PM
 */

package consultaEurekaBank;
import Imagenes.JFondo2;
import cuenta.*;
import java.awt.BorderLayout;

/**
 *
 * @author David
 */
public class ConsultaCuentas extends javax.swing.JFrame {

    /** Creates new form ConsultaCuentas */
    public ConsultaCuentas() {
        initComponents();
        setLocationRelativeTo(null);
        JFondo2 p=new JFondo2(this);
        this.add(p,BorderLayout.CENTER);
        this.pack();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmInsertarCuenta = new javax.swing.JMenuItem();
        jmBuscarCuenta = new javax.swing.JMenuItem();
        jmEliminarCuenta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta Cuentas");

        jMenu1.setForeground(new java.awt.Color(0, 0, 204));
        jMenu1.setText("TABLA CUENTA");

        jmInsertarCuenta.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jmInsertarCuenta.setText("Insertar ");
        jmInsertarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInsertarCuentaActionPerformed(evt);
            }
        });
        jMenu1.add(jmInsertarCuenta);

        jmBuscarCuenta.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jmBuscarCuenta.setText("Buscar ");
        jmBuscarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBuscarCuentaActionPerformed(evt);
            }
        });
        jMenu1.add(jmBuscarCuenta);

        jmEliminarCuenta.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jmEliminarCuenta.setText("Eliminar ");
        jmEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEliminarCuentaActionPerformed(evt);
            }
        });
        jMenu1.add(jmEliminarCuenta);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(0, 0, 204));
        jMenu2.setText("SALIR");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem4.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jMenuItem4.setText("SALIR");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmInsertarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInsertarCuentaActionPerformed
        // TODO add your handling code here:
        InsertarC Ic= new InsertarC();
        Ic.setVisible(true);

    }//GEN-LAST:event_jmInsertarCuentaActionPerformed

    private void jmBuscarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBuscarCuentaActionPerformed
        // TODO add your handling code here:
        BuscarC Bc = new BuscarC();
        Bc.setVisible(true);

    }//GEN-LAST:event_jmBuscarCuentaActionPerformed

    private void jmEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEliminarCuentaActionPerformed
        // TODO add your handling code here:
           EliminarC Ec= new EliminarC();
        Ec.setVisible(true);
    }//GEN-LAST:event_jmEliminarCuentaActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
    * @param args the command line arguments
    */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ConsultaCuentas().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jmBuscarCuenta;
    private javax.swing.JMenuItem jmEliminarCuenta;
    private javax.swing.JMenuItem jmInsertarCuenta;
    // End of variables declaration//GEN-END:variables

}
