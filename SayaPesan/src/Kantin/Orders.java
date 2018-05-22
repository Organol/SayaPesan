/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kantin;


import Entity.Menu;
import Entity.Tenant;
import Entity.orders;
import Koneksi.OrdersCon;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Cerberus
 */
public class Orders extends javax.swing.JFrame {
       OrdersCon order = new OrdersCon();
       List<orders> data=new ArrayList<>();
       int value;
       String a,b;
       OrdersCon orderTenant = new OrdersCon();
       Menu dataMenu = new Menu();
       List<orders> dataTenant=new ArrayList<>();
      
    /**
     * Creates new form Orders
     */
        private void load_table(){
        //hapusIsiTable();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("IdOrder");
        model.addColumn("Id Pemesan");
        model.addColumn("Id Menu");
        //model.addColumn("Jumlah");
        TabelOrders.setModel(model);
        
        data = order.showData(value);
            for (int i = 0; i < data.size(); i++) {
                Object[] ob = new Object[3];
                ob[0] = data.get(i).getidOrder();
                ob[1] = data.get(i).p.getIdpemesan();
                ob[2] = data.get(i).m.getidmenu();
                model.addRow(ob);
            }

    }
    public Orders() {
        initComponents();
        load_table();
    }
    public Orders(int value){
        initComponents();
        this.value = value;
        load_table();
        detailsKantin();
    }
    private void detailsKantin(){
        System.out.println(value);
        dataTenant = orderTenant.DetailsKantin(value);
        b = dataTenant.get(0).t.getNamaPemilik();
        System.out.println(b);
        namaPemilikText.setText(b);
        NamaKantin.setText(dataTenant.get(0).t.getNamaTenant());
        IdKantinForm.setText(String.valueOf(value));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelOrders = new javax.swing.JTable();
        NamaKantin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        namaPemilikText = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IdKantinForm = new javax.swing.JLabel();
        BackBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Order");

        TabelOrders.setModel(new javax.swing.table.DefaultTableModel(
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
        TabelOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelOrdersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelOrders);

        NamaKantin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NamaKantin.setText("Nama Kantin");

        jLabel1.setText("Nama Pemilik :");

        namaPemilikText.setText("jLabel2");

        jLabel3.setText("Id Kantin       :");

        IdKantinForm.setText("jLabel4");

        BackBut.setText("Back");
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(NamaKantin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackBut))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namaPemilikText))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IdKantinForm)))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaKantin)
                    .addComponent(BackBut))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(namaPemilikText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(IdKantinForm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void TabelOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelOrdersMouseClicked
        // TODO add your handling code here:
        
        int index = TabelOrders.getSelectedRow();
        TableModel model = TabelOrders.getModel();
        
        a = model.getValueAt(index,1).toString();
        System.out.println(a);
        new OrderDetails(Integer.parseInt(a)).setVisible(true);

    }//GEN-LAST:event_TabelOrdersMouseClicked

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        // TODO add your handling code here:
        new KantinMenu(value).setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButActionPerformed

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
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBut;
    private javax.swing.JLabel IdKantinForm;
    private javax.swing.JLabel NamaKantin;
    private javax.swing.JTable TabelOrders;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namaPemilikText;
    // End of variables declaration//GEN-END:variables
}
