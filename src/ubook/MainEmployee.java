/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubook;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author AZHAR
 */
public class MainEmployee extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    String idAdmin;

    public MainEmployee(String idAdmin) {
        this.idAdmin = idAdmin;
        initComponents();
        showStatusMonitor();
        showGuestBook();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    public MainEmployee() {
    }

    public ArrayList<StatusMonitor> statusList() {
        ArrayList<StatusMonitor> statusList = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=UBOOK;user=acer;password=123456";
            Connection con = DriverManager.getConnection(url);
            String query1 = "Select * from STATUSMONITOR where ID_ADMIN=\'" + idAdmin + "\'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);

            StatusMonitor statusMonitor;
            while (rs.next()) {
                statusMonitor = new StatusMonitor(rs.getString("ID_PESANAN"), rs.getInt("JUMLAH_TRANSFER"), rs.getString("STATUS_TRANSAKSI"), rs.getString("ID_ADMIN"), rs.getInt("NO_KTP"));

                statusList.add(statusMonitor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        }
        return statusList;
    }
    
    public ArrayList<GuestBook> guestList() {
        ArrayList<GuestBook> guestList = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=UBOOK;user=acer;password=123456";
            Connection con = DriverManager.getConnection(url);
            String query1 = "Select * from GUESTBOOK where ID_ADMIN=\'" + idAdmin + "\'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);

            GuestBook guestBook;
            StatusMonitor statusMonitor;
            while (rs.next()) {
                guestBook=new GuestBook(rs.getInt("NO_KTP"), rs.getString("NAMA"), rs.getString("JENIS_KAMAR"), rs.getString("TGLCHECKIN"), rs.getString("TGLCHECKOUT"), rs.getString("ID_ADMIN"));
                guestList.add(guestBook);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        }
        return guestList;
    }

    public void showStatusMonitor() {
        ArrayList<StatusMonitor> list = statusList();
        DefaultTableModel model = (DefaultTableModel) tblTransactionMonitor.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getIdPesanan();
            row[1] = list.get(i).getNoKtp();
            row[2] = list.get(i).getTotal();
            row[3] = list.get(i).getStatus();
            try {

            } catch (Exception e) {
            }
            model.addRow(row);
        }
    }
    
    public void showGuestBook() {
        ArrayList<GuestBook> list = guestList();
        DefaultTableModel model = (DefaultTableModel) tblGuestBook.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getNoKtp();
            row[1] = list.get(i).getNamaCus();
            row[2] = list.get(i).getJenis();
            row[3] = list.get(i).getCheckIn();
            row[4] = list.get(i).getCheckOut();
            try {

            } catch (Exception e) {
            }
            model.addRow(row);
        }
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
        btnSignOutEmp = new javax.swing.JButton();
        pnlMainEmp = new javax.swing.JPanel();
        pnlGuest = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGuestBook = new javax.swing.JTable();
        pnlStatus = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTransactionMonitor = new javax.swing.JTable();
        btnBatalkan = new javax.swing.JButton();
        btnTerima = new javax.swing.JButton();
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
        jLabel2.setText("Transaction Monitor");

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
                .addContainerGap(21, Short.MAX_VALUE))
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

        btnSignOutEmp.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnSignOutEmp.setText("Sign Out");
        btnSignOutEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sdbrFinancial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sdbrStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sdbrProfileHotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sdbrGuest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btnSignOutEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(30, 30, 30)
                .addComponent(btnSignOutEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        pnlMainEmp.setBackground(new java.awt.Color(255, 255, 255));
        pnlMainEmp.setLayout(new java.awt.CardLayout());

        tblGuestBook.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblGuestBook);

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

        tblTransactionMonitor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Pesanan", "No. KTP", "Jumlah Transfer", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTransactionMonitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTransactionMonitorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTransactionMonitor);

        btnBatalkan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnBatalkan.setText("Batalkan");
        btnBatalkan.setPreferredSize(new java.awt.Dimension(84, 25));

        btnTerima.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnTerima.setText("Terima");
        btnTerima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerimaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlStatusLayout = new javax.swing.GroupLayout(pnlStatus);
        pnlStatus.setLayout(pnlStatusLayout);
        pnlStatusLayout.setHorizontalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
            .addGroup(pnlStatusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBatalkan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTerima, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        pnlStatusLayout.setVerticalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatusLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTerima, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatalkan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
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
                "ID Pesanan", "Tangal Check In", "Jumlah Pendapatan"
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

    private void tblTransactionMonitorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTransactionMonitorMouseClicked
        // TODO add your handling code here:
        int a = tblTransactionMonitor.getSelectedRow();
        TableModel tabModel = tblTransactionMonitor.getModel();

    }//GEN-LAST:event_tblTransactionMonitorMouseClicked

    private void btnTerimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerimaActionPerformed
        // TODO add your handling code here:
        int a = tblTransactionMonitor.getSelectedRow();
        TableModel tabModel = tblTransactionMonitor.getModel();
        String idPesanan = tabModel.getValueAt(a, 0).toString();
        int noKtp = Integer.parseInt(tabModel.getValueAt(a, 1).toString());
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=UBOOK;user=acer;password=123456";
            Connection con = DriverManager.getConnection(url);
            
           
            String namauser="";
            String jenisKamar="";
            String CheckIn="";
            String CheckOut="";
            String idAdminn="";
            
            
            String query1 = "update STATUSMONITOR set STATUS_TRANSAKSI=? where ID_PESANAN=\'"+idPesanan+"\'";
            PreparedStatement pst1 = con.prepareStatement(query1);
            pst1.setString(1, "Sukses");
            pst1.executeUpdate();
            
            String query2 = "update KERANJANG set STATUS_TRANSAKSI=? where ID_PESANAN=\'"+idPesanan+"\'";
            PreparedStatement pst2 = con.prepareStatement(query2);
            pst2.setString(1, "Sukses");
            pst2.executeUpdate();
            
            String query3 = "Select * from KERANJANG join KERANJANG_ALAMATHOTEL on KERANJANG.ID_PESANAN=KERANJANG_ALAMATHOTEL.ID_PESANAN where KERANJANG.ID_PESANAN=\'" + idPesanan + "\'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query3);
            if (rs.next()) {
                namauser=rs.getString("NO_KTP");
                jenisKamar=rs.getString("JENIS_KAMAR");
                CheckIn=rs.getString("TGLCHECKIN");
                CheckOut=rs.getString("TGLCHECKOUT");
            }
                idAdminn=idAdmin;
                
            String query5 = "Select * from CUSTOMER where NO_KTP=" + noKtp + "";
            Statement st5 = con.createStatement();
            ResultSet rs5 = st5.executeQuery(query5);
            
            if (rs5.next()) {
                namauser = rs5.getString("NAMA_DEPAN")+" "+rs5.getString("NAMA_BELAKANG");
            }
            
            String query4 = "insert into GUESTBOOK(NO_KTP,NAMA,JENIS_KAMAR,TGLCHECKIN,TGLCHECKOUT,ID_ADMIN) values(?,?,?,?,?,?)";
            PreparedStatement pst3 = con.prepareStatement(query4);
            pst3.setInt(1, noKtp);
            pst3.setString(2, namauser);
            pst3.setString(3, jenisKamar);
            pst3.setString(4, CheckIn);
            pst3.setString(5, CheckOut);
            pst3.setString(6, idAdminn);
            pst3.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Berhasil mengubah transaksi");
            DefaultTableModel tableModel = (DefaultTableModel) tblTransactionMonitor.getModel(); tableModel.setRowCount(0);
            showStatusMonitor();
            DefaultTableModel tableModel2 = (DefaultTableModel) tblGuestBook.getModel(); tableModel2.setRowCount(0);
            showGuestBook();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        }

    }//GEN-LAST:event_btnTerimaActionPerformed

    private void btnSignOutEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutEmpActionPerformed
        // TODO add your handling code here:
        Login login=new Login();
        login.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnSignOutEmpActionPerformed

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
    private javax.swing.JButton btnBatalkan;
    private javax.swing.JButton btnSignOutEmp;
    private javax.swing.JButton btnTerima;
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
    private javax.swing.JTable tblGuestBook;
    private javax.swing.JTable tblTransactionMonitor;
    // End of variables declaration//GEN-END:variables
}
