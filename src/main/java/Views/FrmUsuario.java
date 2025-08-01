/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Views;

import Controller.Utilidades;
import Modelos_de_Tablas.Tabla_Unidad;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Zumba
 */
public class FrmUsuario extends javax.swing.JDialog {

    Utilidades u = new Utilidades();
    Tabla_Unidad tb = new Tabla_Unidad();
    String[][] Matriz;

    /**
     * Creates new form FrmUsuario
     */
    public FrmUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tbtTablaMatiz.setModel(tb);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtTablaMatiz = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNumeros = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Operaciones de Matrices");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 20, 300, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Indique el numero de columnas que desea:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 110, 380, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Indique el numero de filas que desea:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 50, 330, 25);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, null, 100, 1));
        jPanel1.add(jSpinner1);
        jSpinner1.setBounds(400, 50, 80, 30);

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, null, 100, 1));
        jPanel1.add(jSpinner2);
        jSpinner2.setBounds(400, 110, 80, 30);

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Matriz", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24)))); // NOI18N
        jPanel2.setLayout(null);

        tbtTablaMatiz.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbtTablaMatiz);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 890, 340);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(50, 170, 910, 380);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("Generar Matriz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(540, 90, 230, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("¿Que desea hacer con esta Matriz?");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 550, 390, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Elimine todos los numeros primos de la Matriz:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 630, 420, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Escriba los numeros que desea borrar de la Matriz:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 590, 440, 25);

        txtNumeros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txtNumeros);
        txtNumeros.setBounds(460, 590, 150, 31);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(630, 590, 130, 30);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(460, 630, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 0, 1000, 700);

        setSize(new java.awt.Dimension(1006, 711));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (((int) jSpinner1.getValue() < 0) || ((int) jSpinner2.getValue() < 0)) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese numero mayor a cero", "Error ", JOptionPane.ERROR_MESSAGE);
        } else {
            Matriz = (u.ConstrutorMatriz((int) jSpinner1.getValue(), (int) jSpinner2.getValue()));
            tb.setData(Matriz);
        }

// for (int i = 0; i < ; i++) {
//            tbtTablaMatiz.getColumnModel().getColumn(i).setPreferredWidth(15); 
//        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!txtNumeros.getText().isEmpty()) {
            Matriz = u.EliminarNumero(txtNumeros.getText(), Matriz);
            tb.setData(Matriz);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor querido Usuario escriba un numero ", "Error ", JOptionPane.ERROR_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if ((((int) jSpinner1.getValue() == 0) && ((int) jSpinner2.getValue() == 0))) {
            JOptionPane.showMessageDialog(null, "Por favor primero genere la tabla ", "Error ", JOptionPane.ERROR_MESSAGE);
        } else {
            Matriz = u.EliminarPrimos(Matriz);
            tb.setData(Matriz);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmUsuario dialog = new FrmUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTable tbtTablaMatiz;
    private javax.swing.JTextField txtNumeros;
    // End of variables declaration//GEN-END:variables
}
