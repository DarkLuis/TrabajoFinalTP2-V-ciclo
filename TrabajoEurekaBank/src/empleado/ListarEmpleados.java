/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmListadoEmpleados.java
 *
 * Created on 21/07/2011, 04:18:06 PM
 */

package empleado;

import Imagenes.JFondo3;
import negocio.*;
import entidades.*;
import java.awt.BorderLayout;
import javax.swing.table.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.*;

/**
 *
 * @author Sistemas
 */
public class ListarEmpleados extends javax.swing.JFrame {

    /** Creates new form frmListadoEmpleados */
    public ListarEmpleados() {
        initComponents();
        setLocationRelativeTo(this);
        JFondo3 p=new JFondo3(this);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        btrGrupos = new javax.swing.ButtonGroup();
        scrEmpleados = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbtnOrdenarCodigo = new javax.swing.JRadioButton();
        rbtnOrdenarApellido = new javax.swing.JRadioButton();
        btnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Ap.Paterno", "Ap. Materno", "Nombre", "Cuidad", "Direccion", "Usuario", "Clave"
            }
        ));
        scrEmpleados.setViewportView(tblEmpleados);

        btnSalir.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Segun :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 13))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 153, 204));

        btrGrupos.add(rbtnOrdenarCodigo);
        rbtnOrdenarCodigo.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        rbtnOrdenarCodigo.setText("Ordenar por Codigo");

        btrGrupos.add(rbtnOrdenarApellido);
        rbtnOrdenarApellido.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        rbtnOrdenarApellido.setText("Ordenar por Apellidos Paternos");

        btnMostrar.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        btnMostrar.setText("Mostrar listado");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbtnOrdenarCodigo)
                        .addGap(36, 36, 36)
                        .addComponent(rbtnOrdenarApellido))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnOrdenarApellido)
                    .addComponent(rbtnOrdenarCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(535, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(scrEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnSalir)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       lista = new EmpleadoBL().listarEmpleado();
       // Sirve para generar la consulta
    }//GEN-LAST:event_formWindowOpened

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        if(rbtnOrdenarCodigo.isSelected()) {
            Collections.sort(lista);
            llenarTabla();
        }else {
            if(rbtnOrdenarApellido.isSelected()) {
                Collections.sort(lista, new EmpleadoCompararPaterno());
                llenarTabla();
            }else {
                showMessageDialog(null, "Debe seleccionar un boton", "ERROR", 2);
            }
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void llenarTabla() {
        modelo = new DefaultTableModel();
        Iterator<Empleado> iterador = lista.iterator();
        String columnas[] = {"Codigo", "Ap. Paterno", "Ap. Materno", "Nombre", "Ciudad", "Direccion", "Usuario", "Clave"};
        modelo.setColumnIdentifiers(columnas);
        Object fila[] = new Object[columnas.length];
        Empleado empleado = null;
        while(iterador.hasNext()) {
            empleado = iterador.next();
            fila[0] = empleado.getCodigo();
            fila[1] = empleado.getPaterno();
            fila[2] = empleado.getMaterno();
            fila[3] = empleado.getNombre();
            fila[4] = empleado.getCiudad();
            fila[5] = empleado.getDireccion();
            fila[6] = empleado.getUsuario();
            fila[7] = empleado.getClave();
            modelo.addRow(fila);
        }
        tblEmpleados.setModel(modelo);
    }

    /**
    * @param args the command line arguments
    */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ListarEmpleados().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup btrGrupos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbtnOrdenarApellido;
    private javax.swing.JRadioButton rbtnOrdenarCodigo;
    private javax.swing.JScrollPane scrEmpleados;
    private javax.swing.JTable tblEmpleados;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Empleado> lista = null;
    private DefaultTableModel modelo = null;

}
