/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Insertar.java
 *
 * Created on 10/08/2011, 03:38:13 PM
 */

package cuenta;

import Imagenes.JFondo3;
import consultaEurekaBank.FormPrincipal;
import java.awt.BorderLayout;
import entidades.Cuenta;
import entidades.Fecha;
import javax.swing.JOptionPane;
import negocio.CuentaBL;
import static javax.swing.JOptionPane.showMessageDialog;
/**
 *
 * @author David
 */
public class InsertarC extends javax.swing.JFrame {

    /** Creates new form Insertar */
    public InsertarC() {
        initComponents();
        setLocationRelativeTo(null);
        JFondo3 p=new JFondo3(this);
        this.add(p,BorderLayout.CENTER);
        this.pack();
        llenarAnios();

    }


    public void llenarAnios(){
        for(int i=2000;i<3000;i++)
            cboAnio.addItem(i);
    }

    public void limpiarTextos(){
        txtcuen1.setText("");
        txtcuen2.setText("");
        txtcuen3.setText("");
        txtcuen4.setText("");
        txtcuen5.setText("");
        txtcuen6.setText("");
        cboAnio.setSelectedIndex(0);
        cboMes.setSelectedIndex(0);
        cboDia.setSelectedIndex(0);
        txtcuen8.setText("");
        txtcuen9.setText("");
        txtcuen10.setText("");
    }
    public void activarCajas(boolean estado){
        txtcuen1.setEnabled(estado);
        txtcuen2.setEnabled(estado);
        txtcuen3.setEnabled(estado);
        txtcuen4.setEnabled(estado);
        txtcuen5.setEnabled(estado);
        txtcuen6.setEnabled(estado);
        txtcuen8.setEnabled(estado);
        txtcuen9.setEnabled(estado);
        txtcuen10.setEnabled(estado);
        btnInsertar.setEnabled(estado);

    }


    public void AgregarCodigoEmpl(String codigo){
        txtcuen4.setEnabled(true);
        txtcuen4.setText(codigo);
        txtcuen4.setEnabled(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcuen5 = new javax.swing.JTextField();
        txtcuen6 = new javax.swing.JTextField();
        txtcuen1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtcuen10 = new javax.swing.JTextField();
        txtcuen9 = new javax.swing.JTextField();
        txtcuen4 = new javax.swing.JTextField();
        txtcuen8 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        cboAnio = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        txtcuen2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtcuen3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboMes = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cboDia = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("INSERTANDO CUENTA");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel9.setText("Clave de la cuenta :");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel8.setText("Numero de Movimientos :");

        txtcuen5.setEnabled(false);

        txtcuen6.setEnabled(false);

        txtcuen1.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel10.setText("Codigo del Cliente :");

        txtcuen10.setEnabled(false);

        txtcuen9.setEnabled(false);

        txtcuen4.setEnabled(false);
        txtcuen4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcuen4ActionPerformed(evt);
            }
        });

        txtcuen8.setEnabled(false);

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnInsertar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnInsertar.setText("INSERTAR");
        btnInsertar.setEnabled(false);
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        cboAnio.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cboAnio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AÑO" }));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel11.setText("CREANDO CUENTA :");

        txtcuen2.setEnabled(false);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setText("NUEVO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel2.setText("Codigo de Moneda :");

        txtcuen3.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel1.setText("Codigo de Cuenta :");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel3.setText("Codigo de la Sucursal :");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel4.setText("Codigo del Empleado :");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel5.setText("Saldo :");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel6.setText("Fecha de Creacion :");

        cboMes.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cboMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MES", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel7.setText("estado de la Cuenta :");

        cboDia.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cboDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DIA", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcuen1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcuen6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcuen5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcuen3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcuen2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcuen4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcuen10, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcuen9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtcuen8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInsertar)
                        .addGap(22, 22, 22)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcuen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcuen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcuen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcuen4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtcuen5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcuen6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcuen8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtcuen9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtcuen10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
        String param1= txtcuen1.getText();
        String param2= txtcuen2.getText();
        String param3= txtcuen3.getText();
        String param4= txtcuen4.getText();
        String param5= txtcuen5.getText();
        float param6= Float.valueOf(txtcuen6.getText());
        int dia= Integer.parseInt( String.valueOf(cboDia.getSelectedItem()));
        int mes= Integer.parseInt(String.valueOf( cboMes.getSelectedItem()));
        int anyo= Integer.parseInt(String.valueOf(cboAnio.getSelectedItem()));
        Fecha fecha= new Fecha(dia,mes,anyo);
        String param8= txtcuen8.getText();
        int param9= Integer.parseInt(txtcuen9.getText());
        String param10= txtcuen10.getText();


        if(fecha.VerificarFecha()){
            Cuenta cuenta= new Cuenta(param1,param2,param3,param4,param5,param6,fecha,param8,param9,param10);
             int rpta =new CuentaBL().insertarCuenta(param1, param2, param3, param4, param5, param6, fecha, param8, param9, param10);
        } else
             showMessageDialog(null, "Error al fecha Incorrecta", "Error", 0);

       activarCajas(false);
}//GEN-LAST:event_btnInsertarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        activarCajas(true);
        limpiarTextos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtcuen4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcuen4ActionPerformed
    }//GEN-LAST:event_txtcuen4ActionPerformed

    /**
    * @param args the command line arguments
//    */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InsertarC().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertar;
    private javax.swing.JComboBox cboAnio;
    private javax.swing.JComboBox cboDia;
    private javax.swing.JComboBox cboMes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtcuen1;
    private javax.swing.JTextField txtcuen10;
    private javax.swing.JTextField txtcuen2;
    private javax.swing.JTextField txtcuen3;
    private javax.swing.JTextField txtcuen4;
    private javax.swing.JTextField txtcuen5;
    private javax.swing.JTextField txtcuen6;
    private javax.swing.JTextField txtcuen8;
    private javax.swing.JTextField txtcuen9;
    // End of variables declaration//GEN-END:variables

}
