/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubook;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author AZHAR
 */
public class MainCustomer extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    String noKtp;

    public MainCustomer(String noKtp) {
        this.noKtp = noKtp;
        initComponents();
        showUser();
        showCart();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    public MainCustomer() {
        initComponents();
        showUser();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    public ArrayList<Hotel> hotelList() {
        ArrayList<Hotel> hotelList = new ArrayList<>();

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=UBOOK;user=acer;password=123456";
            Connection con = DriverManager.getConnection(url);
            String query1 = "Select * from HOTEL, HOTEL_ALAMAT";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);

            Hotel hotel;
            while (rs.next()) {

                hotel = new Hotel(rs.getString("ID_HOTEL"), rs.getString("NAMA_HOTEL"), rs.getInt("HARGA_HOTEL"), rs.getInt("KUOTA"),
                        rs.getString("EMAIL"), rs.getBytes("GAMBAR"), rs.getString("DESKRIPSI"), rs.getInt("NOREKHOTE"), rs.getString("ALAMAT_HOTAEL"));

                hotelList.add(hotel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        }
        return hotelList;
    }

    public ArrayList<Cart> cartList() {
        ArrayList<Cart> cartList = new ArrayList<>();

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=UBOOK;user=acer;password=123456";
            Connection con = DriverManager.getConnection(url);
            String query1 = "Select * from KERANJANG join KERANJANG_ALAMATHOTEL on KERANJANG.ID_PESANAN=KERANJANG_ALAMATHOTEL.ID_PESANAN where NO_KTP=" + noKtp;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);

            Cart cart;
            while (rs.next()) {
                cart = new Cart(rs.getString("ID_PESANAN"), rs.getString("NAMA_HOTEL"), rs.getString("ID_HOTEL"), rs.getBytes("GAMBAR"), rs.getInt("HARGA_HOTEL"),
                        rs.getString("STATUS_TRANSAKSI"), rs.getString("TGLCHECKIN"), rs.getString("TGLCHECKOUT"), rs.getString("JENIS_KAMAR"), rs.getInt("NO_KAMAR"),
                        rs.getInt("TOTAL_TAGIHAN"), rs.getInt("NO_KTP"), rs.getString("ALAMAT_HOTEL"));
                
                cartList.add(cart);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        }
        return cartList;
    }

    public void showUser() {
        ArrayList<Hotel> list = hotelList();
        DefaultTableModel model = (DefaultTableModel) HotelTable.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getNama();
            row[2] = list.get(i).getAlamat();
            row[3] = list.get(i).getHarga();
            row[4] = list.get(i).getKuota();
            try {

            } catch (Exception e) {
            }
            model.addRow(row);
        }
    }

    public void showCart() {
        ArrayList<Cart> list = cartList();
        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getIdPesanan();
            row[1] = list.get(i).getNama();
            row[2] = list.get(i).getAlamat();
            row[3] = list.get(i).getTotal();
            row[4] = list.get(i).getStatus();
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
        pnlSideBarCus = new javax.swing.JPanel();
        sdbrHotel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sdbrFavorite = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sdbrCart = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sdbrProfil = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSignOutCus = new javax.swing.JButton();
        pnlMain = new javax.swing.JPanel();
        pnlHotelBook = new javax.swing.JPanel();
        txtDisplayID = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtDisplayHarga = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HotelTable = new javax.swing.JTable();
        btnBook = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDisplayDeskripsi = new javax.swing.JTextArea();
        txtDisplayAlamat = new javax.swing.JLabel();
        txtDisplayNama = new javax.swing.JLabel();
        imgHotel = new javax.swing.JLabel();
        btnFavorite = new javax.swing.JButton();
        pnlFavorite = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnlCart = new javax.swing.JPanel();
        cartIDPesanan = new javax.swing.JLabel();
        cartAlamat = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        btnBook1 = new javax.swing.JButton();
        cartNama = new javax.swing.JLabel();
        imgCart = new javax.swing.JLabel();
        cartCheckIn = new javax.swing.JLabel();
        cartCheckOut = new javax.swing.JLabel();
        cartJenis = new javax.swing.JLabel();
        cartTotal = new javax.swing.JLabel();
        pnlProfileCus = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(192, 108, 132));

        jSplitPane1.setDividerLocation(284);
        jSplitPane1.setDividerSize(1);

        pnlSideBarCus.setBackground(new java.awt.Color(53, 92, 125));

        sdbrHotel.setBackground(new java.awt.Color(192, 108, 132));
        sdbrHotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sdbrHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sdbrHotelMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hotel");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\BasisData\\icon\\outline_apartment_white_18dp.png")); // NOI18N

        javax.swing.GroupLayout sdbrHotelLayout = new javax.swing.GroupLayout(sdbrHotel);
        sdbrHotel.setLayout(sdbrHotelLayout);
        sdbrHotelLayout.setHorizontalGroup(
            sdbrHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sdbrHotelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sdbrHotelLayout.setVerticalGroup(
            sdbrHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sdbrHotelLayout.createSequentialGroup()
                .addGroup(sdbrHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sdbrFavorite.setBackground(new java.awt.Color(108, 91, 123));
        sdbrFavorite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sdbrFavorite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sdbrFavoriteMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Favorite");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\BasisData\\icon\\outline_favorite_border_white_18dp.png")); // NOI18N

        javax.swing.GroupLayout sdbrFavoriteLayout = new javax.swing.GroupLayout(sdbrFavorite);
        sdbrFavorite.setLayout(sdbrFavoriteLayout);
        sdbrFavoriteLayout.setHorizontalGroup(
            sdbrFavoriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sdbrFavoriteLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        sdbrFavoriteLayout.setVerticalGroup(
            sdbrFavoriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sdbrCart.setBackground(new java.awt.Color(108, 91, 123));
        sdbrCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sdbrCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sdbrCartMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cart");

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\BasisData\\icon\\outline_shopping_cart_white_18dp.png")); // NOI18N

        javax.swing.GroupLayout sdbrCartLayout = new javax.swing.GroupLayout(sdbrCart);
        sdbrCart.setLayout(sdbrCartLayout);
        sdbrCartLayout.setHorizontalGroup(
            sdbrCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sdbrCartLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        sdbrCartLayout.setVerticalGroup(
            sdbrCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        sdbrProfil.setBackground(new java.awt.Color(108, 91, 123));
        sdbrProfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sdbrProfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sdbrProfilMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Profile");

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\BasisData\\icon\\outline_person_white_18dp.png")); // NOI18N

        javax.swing.GroupLayout sdbrProfilLayout = new javax.swing.GroupLayout(sdbrProfil);
        sdbrProfil.setLayout(sdbrProfilLayout);
        sdbrProfilLayout.setHorizontalGroup(
            sdbrProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sdbrProfilLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        sdbrProfilLayout.setVerticalGroup(
            sdbrProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sdbrProfilLayout.createSequentialGroup()
                .addGroup(sdbrProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnSignOutCus.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnSignOutCus.setText("Sign Out");
        btnSignOutCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutCusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSideBarCusLayout = new javax.swing.GroupLayout(pnlSideBarCus);
        pnlSideBarCus.setLayout(pnlSideBarCusLayout);
        pnlSideBarCusLayout.setHorizontalGroup(
            pnlSideBarCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sdbrCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sdbrFavorite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sdbrProfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sdbrHotel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSideBarCusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSignOutCus, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        pnlSideBarCusLayout.setVerticalGroup(
            pnlSideBarCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSideBarCusLayout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addComponent(sdbrHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sdbrFavorite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sdbrCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sdbrProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnSignOutCus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(pnlSideBarCus);

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setLayout(new java.awt.CardLayout());

        txtDisplayID.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtDisplayID.setText("AB1234");
        txtDisplayID.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel13.setText("Alamat :");

        txtDisplayHarga.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtDisplayHarga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtDisplayHarga.setText("Rp. 100.000");
        txtDisplayHarga.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPane1.setBackground(new java.awt.Color(192, 108, 132));
        jScrollPane1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        HotelTable.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        HotelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Hotel", "Nama Hotel", "Alamat", "Harga", "Status Kuota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        HotelTable.setGridColor(new java.awt.Color(192, 108, 132));
        HotelTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HotelTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(HotelTable);

        btnBook.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnBook.setText("Pesan");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        txtDisplayDeskripsi.setColumns(20);
        txtDisplayDeskripsi.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtDisplayDeskripsi.setRows(5);
        txtDisplayDeskripsi.setText("Deskripsi");
        jScrollPane2.setViewportView(txtDisplayDeskripsi);

        txtDisplayAlamat.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtDisplayAlamat.setText("Jalan Suhat");

        txtDisplayNama.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        txtDisplayNama.setText("Nama Hotel");

        imgHotel.setBackground(new java.awt.Color(0, 51, 51));
        imgHotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgHotel.setText("NO IMAGE");
        imgHotel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnFavorite.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnFavorite.setText("Favorite");

        javax.swing.GroupLayout pnlHotelBookLayout = new javax.swing.GroupLayout(pnlHotelBook);
        pnlHotelBook.setLayout(pnlHotelBookLayout);
        pnlHotelBookLayout.setHorizontalGroup(
            pnlHotelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(pnlHotelBookLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHotelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHotelBookLayout.createSequentialGroup()
                        .addGroup(pnlHotelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imgHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDisplayNama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlHotelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(pnlHotelBookLayout.createSequentialGroup()
                                .addComponent(txtDisplayID)
                                .addGap(191, 191, 191)
                                .addComponent(txtDisplayHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlHotelBookLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDisplayAlamat))))
                    .addGroup(pnlHotelBookLayout.createSequentialGroup()
                        .addComponent(btnFavorite, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlHotelBookLayout.setVerticalGroup(
            pnlHotelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHotelBookLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlHotelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDisplayID)
                    .addComponent(txtDisplayHarga)
                    .addComponent(txtDisplayNama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHotelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHotelBookLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlHotelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDisplayAlamat)
                            .addComponent(jLabel13)))
                    .addGroup(pnlHotelBookLayout.createSequentialGroup()
                        .addComponent(imgHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlHotelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFavorite, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pnlMain.add(pnlHotelBook, "card2");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nama Hotel", "Image"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable1);

        javax.swing.GroupLayout pnlFavoriteLayout = new javax.swing.GroupLayout(pnlFavorite);
        pnlFavorite.setLayout(pnlFavoriteLayout);
        pnlFavoriteLayout.setHorizontalGroup(
            pnlFavoriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );
        pnlFavoriteLayout.setVerticalGroup(
            pnlFavoriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFavoriteLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 83, Short.MAX_VALUE))
        );

        pnlMain.add(pnlFavorite, "card3");

        cartIDPesanan.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cartIDPesanan.setText("ID Pesanan             :");
        cartIDPesanan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cartAlamat.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cartAlamat.setText("Alamat                     :");

        jScrollPane3.setBackground(new java.awt.Color(192, 108, 132));
        jScrollPane3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        tblCart.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pesanan", "Nama Hotel", "Alamat", "Harga", "Status Transaksi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCart.setGridColor(new java.awt.Color(192, 108, 132));
        tblCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCartMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCart);

        btnBook1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnBook1.setText("Bayar / Invoice");
        btnBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBook1ActionPerformed(evt);
            }
        });

        cartNama.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        cartNama.setText("Nama Hotel");

        imgCart.setBackground(new java.awt.Color(0, 51, 51));
        imgCart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCart.setText("NO IMAGE");
        imgCart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cartCheckIn.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cartCheckIn.setText("Tanggal Check In    :");

        cartCheckOut.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cartCheckOut.setText("Tanggal Check Out :");

        cartJenis.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cartJenis.setText("Jenis Kamar            :");

        cartTotal.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cartTotal.setText("Total Tagihan          :");

        javax.swing.GroupLayout pnlCartLayout = new javax.swing.GroupLayout(pnlCart);
        pnlCart.setLayout(pnlCartLayout);
        pnlCartLayout.setHorizontalGroup(
            pnlCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
            .addGroup(pnlCartLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgCart, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cartNama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cartCheckOut)
                    .addGroup(pnlCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cartIDPesanan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cartCheckIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cartJenis)
                    .addComponent(cartAlamat)
                    .addComponent(cartTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCartLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBook1)
                .addContainerGap())
        );
        pnlCartLayout.setVerticalGroup(
            pnlCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCartLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cartNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCartLayout.createSequentialGroup()
                        .addComponent(cartIDPesanan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cartCheckIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cartCheckOut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cartJenis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cartAlamat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cartTotal))
                    .addComponent(imgCart, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(btnBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlMain.add(pnlCart, "card4");

        javax.swing.GroupLayout pnlProfileCusLayout = new javax.swing.GroupLayout(pnlProfileCus);
        pnlProfileCus.setLayout(pnlProfileCusLayout);
        pnlProfileCusLayout.setHorizontalGroup(
            pnlProfileCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );
        pnlProfileCusLayout.setVerticalGroup(
            pnlProfileCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );

        pnlMain.add(pnlProfileCus, "card5");

        jSplitPane1.setRightComponent(pnlMain);

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

    private void sdbrHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdbrHotelMouseClicked
        // TODO add your handling code here:
        sdbrHotel.setBackground(new java.awt.Color(192, 108, 132));
        sdbrFavorite.setBackground(new java.awt.Color(108, 91, 123));
        sdbrCart.setBackground(new java.awt.Color(108, 91, 123));
        sdbrProfil.setBackground(new java.awt.Color(108, 91, 123));

        pnlMain.removeAll();
        pnlMain.add(pnlHotelBook);
        pnlMain.repaint();
        pnlMain.revalidate();
    }//GEN-LAST:event_sdbrHotelMouseClicked

    private void sdbrFavoriteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdbrFavoriteMouseClicked
        // TODO add your handling code here:
        sdbrHotel.setBackground(new java.awt.Color(108, 91, 123));
        sdbrFavorite.setBackground(new java.awt.Color(192, 108, 132));
        sdbrCart.setBackground(new java.awt.Color(108, 91, 123));
        sdbrProfil.setBackground(new java.awt.Color(108, 91, 123));

        pnlMain.removeAll();
        pnlMain.add(pnlFavorite);
        pnlMain.repaint();
        pnlMain.revalidate();
    }//GEN-LAST:event_sdbrFavoriteMouseClicked

    private void sdbrCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdbrCartMouseClicked
        // TODO add your handling code here:
        sdbrHotel.setBackground(new java.awt.Color(108, 91, 123));
        sdbrFavorite.setBackground(new java.awt.Color(108, 91, 123));
        sdbrCart.setBackground(new java.awt.Color(192, 108, 132));
        sdbrProfil.setBackground(new java.awt.Color(108, 91, 123));

        pnlMain.removeAll();
        pnlMain.add(pnlCart);
        pnlMain.repaint();
        pnlMain.revalidate();
    }//GEN-LAST:event_sdbrCartMouseClicked

    private void sdbrProfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdbrProfilMouseClicked
        // TODO add your handling code here:
        sdbrHotel.setBackground(new java.awt.Color(108, 91, 123));
        sdbrFavorite.setBackground(new java.awt.Color(108, 91, 123));
        sdbrCart.setBackground(new java.awt.Color(108, 91, 123));
        sdbrProfil.setBackground(new java.awt.Color(192, 108, 132));

        pnlMain.removeAll();
        pnlMain.add(pnlProfileCus);
        pnlMain.repaint();
        pnlMain.revalidate();
    }//GEN-LAST:event_sdbrProfilMouseClicked

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
//        setVisible(false);
        int i = HotelTable.getSelectedRow();
        TableModel model = HotelTable.getModel();
        String id = (model.getValueAt(i, 0).toString());
        DatePicker date = new DatePicker(id, noKtp);
        date.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnBookActionPerformed

    private void btnBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBook1ActionPerformed
        // TODO add your handling code here:
        Invoice invoice = new Invoice();
        invoice.setVisible(true);
    }//GEN-LAST:event_btnBook1ActionPerformed

    private void HotelTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HotelTableMouseClicked
        // TODO add your handling code here:
        int i = HotelTable.getSelectedRow();
        TableModel model = HotelTable.getModel();
        txtDisplayID.setText(model.getValueAt(i, 0).toString());
        txtDisplayNama.setText(model.getValueAt(i, 1).toString());
        txtDisplayAlamat.setText(model.getValueAt(i, 2).toString());
        txtDisplayHarga.setText("Rp. " + model.getValueAt(i, 3).toString());
        String desk = hotelList().get(i).getDeskripsi();
        txtDisplayDeskripsi.setText(desk);
        byte[] img=(hotelList().get(i).getGambar());
        ImageIcon imageIcon=new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(imgHotel.getWidth(), imgHotel.getHeight(), Image.SCALE_SMOOTH));
        imgHotel.setIcon(imageIcon);

    }//GEN-LAST:event_HotelTableMouseClicked

    private void tblCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCartMouseClicked
        // TODO add your handling code here:
        int i = tblCart.getSelectedRow();
        TableModel model = tblCart.getModel();

        cartIDPesanan.setText("ID Pesanan             :" + model.getValueAt(i, 0).toString());
        cartNama.setText(model.getValueAt(i, 1).toString());
        cartCheckIn.setText("Tanggal Check In    :" + cartList().get(i).getCheckIn());
        cartCheckOut.setText("Tanggal Check Out :" + cartList().get(i).getCheckOut());
        cartJenis.setText("Jenis Kamar            :" + cartList().get(i).getJenis());
        cartAlamat.setText("Alamat                    :" + model.getValueAt(i, 2).toString());
        cartTotal.setText("Total Tagihan          :" + model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_tblCartMouseClicked

    private void btnSignOutCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutCusActionPerformed
        // TODO add your handling code here:
        Login login=new Login();
        login.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnSignOutCusActionPerformed

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
            java.util.logging.Logger.getLogger(MainCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable HotelTable;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnBook1;
    private javax.swing.JButton btnFavorite;
    private javax.swing.JButton btnSignOutCus;
    private javax.swing.JLabel cartAlamat;
    private javax.swing.JLabel cartCheckIn;
    private javax.swing.JLabel cartCheckOut;
    private javax.swing.JLabel cartIDPesanan;
    private javax.swing.JLabel cartJenis;
    private javax.swing.JLabel cartNama;
    private javax.swing.JLabel cartTotal;
    private javax.swing.JLabel imgCart;
    private javax.swing.JLabel imgHotel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnlCart;
    private javax.swing.JPanel pnlFavorite;
    private javax.swing.JPanel pnlHotelBook;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlProfileCus;
    private javax.swing.JPanel pnlSideBarCus;
    private javax.swing.JPanel sdbrCart;
    private javax.swing.JPanel sdbrFavorite;
    private javax.swing.JPanel sdbrHotel;
    private javax.swing.JPanel sdbrProfil;
    private javax.swing.JTable tblCart;
    private javax.swing.JLabel txtDisplayAlamat;
    private javax.swing.JTextArea txtDisplayDeskripsi;
    private javax.swing.JLabel txtDisplayHarga;
    private javax.swing.JLabel txtDisplayID;
    private javax.swing.JLabel txtDisplayNama;
    // End of variables declaration//GEN-END:variables
}
