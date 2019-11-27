/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubook;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author AZHAR
 */
public class MainEmployee extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainEmployee() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        sdbrGuest = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sdbrStatus = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sdbrFinancial = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sdbrProfileHotel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnlMainEmp = new javax.swing.JPanel();
        pnlGuest = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnlStatus = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        pnlFinancial = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        pnlProfileHotel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(842, 529));

        jSplitPane1.setDividerLocation(284);
        jSplitPane1.setDividerSize(1);

        jPanel1.setBackground(new java.awt.Color(53, 92, 125));

        sdbrGuest.setBackground(new java.awt.Color(192, 108, 132));
        sdbrGuest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sdbrGuest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sdbrGuestMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Guest Book");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\BasisData\\icon\\outline_menu_book_white_18dp.png")); // NOI18N

        javax.swing.GroupLayout sdbrGuestLayout = new javax.swing.GroupLayout(sdbrGuest);
        sdbrGuest.setLayout(sdbrGuestLayout);
        sdbrGuestLayout.setHorizontalGroup(
            sdbrGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sdbrGuestLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sdbrGuestLayout.setVerticalGroup(
            sdbrGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sdbrGuestLayout.createSequentialGroup()
                .addGroup(sdbrGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sdbrStatus.setBackground(new java.awt.Color(108, 91, 123));
        sdbrStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sdbrStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sdbrStatusMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Status Transaction");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\BasisData\\icon\\outline_check_box_white_18dp.png")); // NOI18N

        javax.swing.GroupLayout sdbrStatusLayout = new javax.swing.GroupLayout(sdbrStatus);
        sdbrStatus.setLayout(sdbrStatusLayout);
        sdbrStatusLayout.setHorizontalGroup(
            sdbrStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sdbrStatusLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        sdbrStatusLayout.setVerticalGroup(
            sdbrStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sdbrFinancial.setBackground(new java.awt.Color(108, 91, 123));
        sdbrFinancial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sdbrFinancial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sdbrFinancialMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Financial");

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\BasisData\\icon\\outline_insert_chart_outlined_white_18dp.png")); // NOI18N

        javax.swing.GroupLayout sdbrFinancialLayout = new javax.swing.GroupLayout(sdbrFinancial);
        sdbrFinancial.setLayout(sdbrFinancialLayout);
        sdbrFinancialLayout.setHorizontalGroup(
            sdbrFinancialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sdbrFinancialLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        sdbrFinancialLayout.setVerticalGroup(
            sdbrFinancialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        sdbrProfileHotel.setBackground(new java.awt.Color(108, 91, 123));
        sdbrProfileHotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sdbrProfileHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sdbrProfileHotelMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Profile");

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\BasisData\\icon\\outline_apartment_white_18dp.png")); // NOI18N

        javax.swing.GroupLayout sdbrProfileHotelLayout = new javax.swing.GroupLayout(sdbrProfileHotel);
        sdbrProfileHotel.setLayout(sdbrProfileHotelLayout);
        sdbrProfileHotelLayout.setHorizontalGroup(
            sdbrProfileHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sdbrProfileHotelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        sdbrProfileHotelLayout.setVerticalGroup(
            sdbrProfileHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sdbrProfileHotelLayout.createSequentialGroup()
                .addGroup(sdbrProfileHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sdbrFinancial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sdbrStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sdbrProfileHotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sdbrGuest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addComponent(sdbrGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sdbrStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sdbrFinancial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sdbrProfileHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        pnlMainEmp.setBackground(new java.awt.Color(255, 255, 255));
        pnlMainEmp.setLayout(new java.awt.CardLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No KTP", "Nama", "Jenis Kamar", "Tanggal Check In", "Tanggal Check Out"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout pnlGuestLayout = new javax.swing.GroupLayout(pnlGuest);
        pnlGuest.setLayout(pnlGuestLayout);
        pnlGuestLayout.setHorizontalGroup(
            pnlGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );
        pnlGuestLayout.setVerticalGroup(
            pnlGuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGuestLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 101, Short.MAX_VALUE))
        );

        pnlMainEmp.add(pnlGuest, "card2");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Pesanan", "No. KTP", "Jumlah Tagihan", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout pnlStatusLayout = new javax.swing.GroupLayout(pnlStatus);
        pnlStatus.setLayout(pnlStatusLayout);
        pnlStatusLayout.setHorizontalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );
        pnlStatusLayout.setVerticalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatusLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 101, Short.MAX_VALUE))
        );

        pnlMainEmp.add(pnlStatus, "card3");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Pesanan", "Tangal Check In", "Jumlah Tagihan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("TOTAL PENDAPATAN :");

        javax.swing.GroupLayout pnlFinancialLayout = new javax.swing.GroupLayout(pnlFinancial);
        pnlFinancial.setLayout(pnlFinancialLayout);
        pnlFinancialLayout.setHorizontalGroup(
            pnlFinancialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
            .addGroup(pnlFinancialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFinancialLayout.setVerticalGroup(
            pnlFinancialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFinancialLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabel9)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pnlMainEmp.add(pnlFinancial, "card4");

        javax.swing.GroupLayout pnlProfileHotelLayout = new javax.swing.GroupLayout(pnlProfileHotel);
        pnlProfileHotel.setLayout(pnlProfileHotelLayout);
        pnlProfileHotelLayout.setHorizontalGroup(
            pnlProfileHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );
        pnlProfileHotelLayout.setVerticalGroup(
            pnlProfileHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );

        pnlMainEmp.add(pnlProfileHotel, "card5");

        jSplitPane1.setRightComponent(pnlMainEmp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sdbrGuestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdbrGuestMouseClicked
        // TODO add your handling code here:
        sdbrGuest.setBackground(new java.awt.Color(192, 108, 132));
        sdbrStatus.setBackground(new java.awt.Color(108, 91, 123));
        sdbrFinancial.setBackground(new java.awt.Color(108, 91, 123));
        sdbrProfileHotel.setBackground(new java.awt.Color(108, 91, 123));
        
        pnlMainEmp.removeAll();
        pnlMainEmp.add(pnlGuest);
        pnlMainEmp.repaint();
        pnlMainEmp.revalidate();
    }//GEN-LAST:event_sdbrGuestMouseClicked

    private void sdbrStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdbrStatusMouseClicked
        // TODO add your handling code here:
        sdbrGuest.setBackground(new java.awt.Color(108, 91, 123));
        sdbrStatus.setBackground(new java.awt.Color(192, 108, 132));
        sdbrFinancial.setBackground(new java.awt.Color(108, 91, 123));
        sdbrProfileHotel.setBackground(new java.awt.Color(108, 91, 123));
        
        pnlMainEmp.removeAll();
        pnlMainEmp.add(pnlStatus);
        pnlMainEmp.repaint();
        pnlMainEmp.revalidate();
    }//GEN-LAST:event_sdbrStatusMouseClicked

    private void sdbrFinancialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdbrFinancialMouseClicked
        // TODO add your handling code here:
        sdbrGuest.setBackground(new java.awt.Color(108, 91, 123));
        sdbrStatus.setBackground(new java.awt.Color(108, 91, 123));
        sdbrFinancial.setBackground(new java.awt.Color(192, 108, 132));
        sdbrProfileHotel.setBackground(new java.awt.Color(108, 91, 123));
        
        pnlMainEmp.removeAll();
        pnlMainEmp.add(pnlFinancial);
        pnlMainEmp.repaint();
        pnlMainEmp.revalidate();
    }//GEN-LAST:event_sdbrFinancialMouseClicked

    private void sdbrProfileHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdbrProfileHotelMouseClicked
        // TODO add your handling code here:
        sdbrGuest.setBackground(new java.awt.Color(108, 91, 123));
        sdbrStatus.setBackground(new java.awt.Color(108, 91, 123));
        sdbrFinancial.setBackground(new java.awt.Color(108, 91, 123));
        sdbrProfileHotel.setBackground(new java.awt.Color(192, 108, 132));
        
        pnlMainEmp.removeAll();
        pnlMainEmp.add(pnlProfileHotel);
        pnlMainEmp.repaint();
        pnlMainEmp.revalidate();
    }//GEN-LAST:event_sdbrProfileHotelMouseClicked

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
            java.util.logging.Logger.getLogger(MainEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JPanel pnlFinancial;
    private javax.swing.JPanel pnlGuest;
    private javax.swing.JPanel pnlMainEmp;
    private javax.swing.JPanel pnlProfileHotel;
    private javax.swing.JPanel pnlStatus;
    private javax.swing.JPanel sdbrFinancial;
    private javax.swing.JPanel sdbrGuest;
    private javax.swing.JPanel sdbrProfileHotel;
    private javax.swing.JPanel sdbrStatus;
    // End of variables declaration//GEN-END:variables
}
