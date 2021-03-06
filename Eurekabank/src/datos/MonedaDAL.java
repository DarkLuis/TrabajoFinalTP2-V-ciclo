/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.*;
import entidades.*;
import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Sistemas
 */
public class MonedaDAL {

    private Connection cn = null;
    private PreparedStatement ps = null;
    private Statement st = null;
    private ResultSet rs = null;

    public String insertarMoneda(Moneda moneda) {
        String mensaje = null;
        try {
            cn = Conexion.realizarConexion();
            String sql =
                    "insert into moneda values(?,?)";
            ps = cn.prepareStatement(sql);
            ps.setString(1, moneda.getCodigo());
            ps.setString(2, moneda.getDescripcion());
            ps.executeUpdate();
        } catch (ClassNotFoundException ex) {
            mensaje = ex.getMessage();
        } catch (SQLException ex) {
            mensaje = ex.getMessage();
        } finally {
            try {
                ps.close();
                cn.close();
            } catch (Exception ex) {
                mensaje = ex.getMessage();
            }
        }
        return mensaje;
    }

    public String buscarMoneda(String monecodigo) {
        try {
            cn = Conexion.realizarConexion();
            st = cn.createStatement();
            String sql = "select chr_monecodigo "
                    + "from moneda where chr_monecodigo = '"
                    + monecodigo + "'";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                return rs.getString("chr_monecodigo");
            }
        } catch (ClassNotFoundException ex) {
            showMessageDialog(null, ex.getMessage(),
                    "Excepcion", 0);
        } catch (SQLException ex) {
            showMessageDialog(null, ex.getMessage(),
                    "Excepción", 0);
        } finally {
            try {
                rs.close();
                st.close();
                cn.close();
            } catch (Exception ex) {
                showMessageDialog(null, ex.getMessage(),
                        "Excepción", 0);
            }
        }
        return null;
    }

public ArrayList<Moneda> listarMoneda() {
        ArrayList<Moneda> monedas = new ArrayList<Moneda>();
        try {
            cn = Conexion.realizarConexion();
            st = cn.createStatement();
            String sql = "select * from moneda";
            rs = st.executeQuery(sql);
            while(rs.next()) {
                monedas.add(new Moneda(
                  rs.getString(1), rs.getString(2)));
            }
        } catch (ClassNotFoundException ex) {
            showMessageDialog(null,ex.getMessage(),"Error",0);
        } catch (SQLException ex) {
            showMessageDialog(null,ex.getMessage(),"Error",0);
        } finally {
            try {
                rs.close();
                st.close();
                cn.close();
            }catch(Exception ex) {
                showMessageDialog(null,ex.getMessage(),"Error",0);
            }
        }
        return monedas;
    }

    public void ejecutarReporte(String codigo) {
        try {
            cn = Conexion.realizarConexion();
            String master = System.getProperty("user.dir") +
                    "\\src\\reportes\\ReporteMonedas.jasper";
            System.out.println("master: " + master);
            if(master == null) {
                showMessageDialog(null, "No se encontro el archivo",
                        "Error", 0);
                System.exit(2);
            }

            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } catch(JRException ex) {
                showMessageDialog(null, "MasterReport:" + ex.getMessage(), "Error", 0);
                System.exit(3);
            }

            Map parametro = new HashMap();
            parametro.put("chr_monecodigo", codigo);

            JasperPrint jasperPrint = JasperFillManager.fillReport(
                    masterReport, parametro, cn);

            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setTitle("Listado");
            jviewer.setVisible(true);
        } catch(ClassNotFoundException ex) {
            showMessageDialog(null, ex.getMessage(), "Error", 0);
        } catch(SQLException ex) {
            showMessageDialog(null, ex.getMessage(), "Error", 0);
        } catch(Exception ex) {
              showMessageDialog(null, ex.getMessage(), "Error", 0);
        } finally {
            try {
                cn.close();
            } catch(Exception ex) {
                showMessageDialog(null, ex.getMessage(), "Error", 0);
            }
        }
    }
}
