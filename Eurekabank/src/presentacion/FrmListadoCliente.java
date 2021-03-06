/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmListadoCliente.java
 *
 * Created on 02-jul-2012, 19:41:10
 */

package presentacion;
import entidades.Cliente;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import logica.ClienteBL;
/**
 *
 * @author SNS
 */
public class FrmListadoCliente extends javax.swing.JFrame {

    /** Creates new form FrmListadoCliente */
    public FrmListadoCliente(JFrame frmPrincipal) {
        initComponents();
        setLocationRelativeTo(frmPrincipal);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnListadoCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LISTADO CLIENTE");

        btnListadoCliente.setText("Listado Cliente");
        btnListadoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoClienteActionPerformed(evt);
            }
        });

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Paerno", "Maerno", "Nombre", "DNI", "Ciudad", "Direccion", "Telefono", "Email"
            }
        ));
        jScrollPane1.setViewportView(tblCliente);
        tblCliente.getColumnModel().getColumn(0).setResizable(false);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(btnListadoCliente)
                .addContainerGap(301, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(313, 313, 313))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnListadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListadoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoClienteActionPerformed
        modelo = new DefaultTableModel();
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        lista = new ClienteBL().listarCliente();
        String columnas[] = {"Código","Paterno","Materno","Nombre","DNI","Ciudad","Direccion","Telefono","Email"};
        Iterator<Cliente> iterador = lista.iterator();
        modelo.setColumnIdentifiers(columnas);
        Object fila[] = new Object[columnas.length];
        Cliente cliente = null;
        while(iterador.hasNext()) {
            cliente = iterador.next();
            fila[0] = cliente.getCodigo();
            fila[1] = cliente.getPaterno();
            fila[2] = cliente.getMaterno();
            fila[3] = cliente.getNombre();
            fila[4] = cliente.getDni();
            fila[5] = cliente.getCiudad();
            fila[6] = cliente.getDireccion();
            fila[7] = cliente.getTelefono();
            fila[8] = cliente.getEmail();
            modelo.addRow(fila);
        }
        tblCliente.setModel(modelo);
    }//GEN-LAST:event_btnListadoClienteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
    * @param args the command line arguments
    */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmListadoCliente(null).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListadoCliente;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCliente;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel modelo;
}
