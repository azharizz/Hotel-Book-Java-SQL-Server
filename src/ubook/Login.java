/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubook;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author AZHAR
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    CardLayout cardLayout;

    public Login() {
        initComponents();
        cardLayout = (CardLayout) (pnlLogin.getLayout());
        txtSignUp.setText("<HTML><U>Sign Up Now</U></HTML>");
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

        rgGender = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        pnlSideLogin = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnLoginSelect = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        pnlLoginCus = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fieldUsernameCus = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        fieldPasswordCus = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnSignIn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtSignUp = new javax.swing.JLabel();
        pnlLoginEmp = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        fieldUsernameEmp = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        fieldPasswordEmp = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnSignInEmp = new javax.swing.JButton();
        pnlSignUp = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPasswordField4 = new javax.swing.JPasswordField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(284);
        jSplitPane1.setDividerSize(0);

        pnlSideLogin.setBackground(new java.awt.Color(246, 114, 128));
        pnlSideLogin.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(246, 114, 128));

        btnLoginSelect.setBackground(new java.awt.Color(53, 92, 125));
        btnLoginSelect.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnLoginSelect.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginSelect.setText("Customer");
        btnLoginSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginSelectActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login as:");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Copyright Azhar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLoginSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(106, 106, 106))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLoginSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pnlSideLogin.add(jPanel1, "card5");

        jSplitPane1.setLeftComponent(pnlSideLogin);

        pnlLogin.setBackground(new java.awt.Color(53, 92, 125));
        pnlLogin.setLayout(new java.awt.CardLayout());

        pnlLoginCus.setBackground(new java.awt.Color(53, 92, 125));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Customer Login");

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\BasisData\\icon\\outline_person_white_18dp.png")); // NOI18N

        fieldUsernameCus.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        fieldUsernameCus.setText("Masukkan Username / Email");
        fieldUsernameCus.setToolTipText("");
        fieldUsernameCus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldUsernameCusFocusGained(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\BasisData\\icon\\outline_lock_white_18dp.png")); // NOI18N

        fieldPasswordCus.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        fieldPasswordCus.setText("jPasswordField1");
        fieldPasswordCus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldPasswordCusFocusGained(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Password");

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Username");

        btnSignIn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSignIn.setText("Sign In");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Dont Have Account ? ");

        txtSignUp.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        txtSignUp.setForeground(new java.awt.Color(255, 255, 255));
        txtSignUp.setText("Sign Up Now");
        txtSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSignUpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginCusLayout = new javax.swing.GroupLayout(pnlLoginCus);
        pnlLoginCus.setLayout(pnlLoginCusLayout);
        pnlLoginCusLayout.setHorizontalGroup(
            pnlLoginCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginCusLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(pnlLoginCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginCusLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlLoginCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(pnlLoginCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pnlLoginCusLayout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSignUp))
                                .addComponent(fieldUsernameCus, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginCusLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlLoginCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(fieldPasswordCus, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginCusLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(32, 32, 32)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        pnlLoginCusLayout.setVerticalGroup(
            pnlLoginCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginCusLayout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(pnlLoginCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtSignUp))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLoginCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldUsernameCus)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLoginCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldPasswordCus)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26)
                .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pnlLogin.add(pnlLoginCus, "card2");

        pnlLoginEmp.setBackground(new java.awt.Color(108, 91, 123));

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Employee Login");

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\BasisData\\icon\\outline_person_white_18dp.png")); // NOI18N

        fieldUsernameEmp.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        fieldUsernameEmp.setText("Masukkan Username / Email");
        fieldUsernameEmp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldUsernameEmpFocusGained(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\BasisData\\icon\\outline_lock_white_18dp.png")); // NOI18N

        fieldPasswordEmp.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        fieldPasswordEmp.setText("jPasswordField1");
        fieldPasswordEmp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldPasswordEmpFocusGained(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Password");

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Username");

        btnSignInEmp.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSignInEmp.setText("Sign In");
        btnSignInEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginEmpLayout = new javax.swing.GroupLayout(pnlLoginEmp);
        pnlLoginEmp.setLayout(pnlLoginEmpLayout);
        pnlLoginEmpLayout.setHorizontalGroup(
            pnlLoginEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginEmpLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(pnlLoginEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginEmpLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlLoginEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(fieldUsernameEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginEmpLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlLoginEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(fieldPasswordEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSignInEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginEmpLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(32, 32, 32)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        pnlLoginEmpLayout.setVerticalGroup(
            pnlLoginEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginEmpLayout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel17)
                .addGap(52, 52, 52)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLoginEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldUsernameEmp)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLoginEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldPasswordEmp)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26)
                .addComponent(btnSignInEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pnlLogin.add(pnlLoginEmp, "card3");

        pnlSignUp.setBackground(new java.awt.Color(192, 108, 132));

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Sign Up");

        jTextField5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jPasswordField4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Password");

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Full Name");

        btnSignUp.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("No. KTP");

        jTextField6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jTextField7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextField7.setToolTipText("");

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Email");

        jTextField8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Alamat");

        jTextField9.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("No. Telp");

        jLabel31.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Gender");

        jRadioButton1.setBackground(new java.awt.Color(192, 108, 132));
        rgGender.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(192, 108, 132));
        rgGender.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Female");

        javax.swing.GroupLayout pnlSignUpLayout = new javax.swing.GroupLayout(pnlSignUp);
        pnlSignUp.setLayout(pnlSignUpLayout);
        pnlSignUpLayout.setHorizontalGroup(
            pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSignUpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(233, 233, 233))
            .addGroup(pnlSignUpLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSignUpLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(48, 48, 48)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSignUpLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(30, 30, 30)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSignUpLayout.createSequentialGroup()
                        .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlSignUpLayout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(18, 18, 18))
                            .addGroup(pnlSignUpLayout.createSequentialGroup()
                                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel31))
                                .addGap(29, 29, 29)))
                        .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlSignUpLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlSignUpLayout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jRadioButton1)
                            .addGap(42, 42, 42)
                            .addComponent(jRadioButton2))
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        pnlSignUpLayout.setVerticalGroup(
            pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSignUpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(43, 43, 43)
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel31)
                    .addComponent(jRadioButton2))
                .addGap(38, 38, 38)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        pnlLogin.add(pnlSignUp, "card4");

        jSplitPane1.setRightComponent(pnlLogin);

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

    private void txtSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSignUpMouseClicked
        // TODO add your handling code here:
        btnLoginSelect.setBackground(new java.awt.Color(192, 108, 132));
        btnLoginSelect.setText("Back");
        pnlLogin.removeAll();
        pnlLogin.add(pnlSignUp);
        pnlLogin.repaint();
        pnlLogin.revalidate();
    }//GEN-LAST:event_txtSignUpMouseClicked

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void fieldUsernameCusFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldUsernameCusFocusGained
        // TODO add your handling code here:
        if (fieldUsernameCus.getText().trim().equals("Masukkan Username / Email")) {
            fieldUsernameCus.setText("");
        }
    }//GEN-LAST:event_fieldUsernameCusFocusGained

    private void fieldPasswordCusFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldPasswordCusFocusGained
        // TODO add your handling code here:
        String myPass = String.valueOf(fieldPasswordCus.getPassword());
        if (myPass.equals("jPasswordField1")) {
            fieldPasswordCus.setText("");
        }
    }//GEN-LAST:event_fieldPasswordCusFocusGained

    private void fieldUsernameEmpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldUsernameEmpFocusGained
        // TODO add your handling code here:
        if (fieldUsernameEmp.getText().trim().equals("Masukkan Username / Email")) {
            fieldUsernameEmp.setText("");
        }
    }//GEN-LAST:event_fieldUsernameEmpFocusGained

    private void fieldPasswordEmpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldPasswordEmpFocusGained
        // TODO add your handling code here:
        String myPass = String.valueOf(fieldPasswordEmp.getPassword());
        if (myPass.equals("jPasswordField1")) {
            fieldPasswordEmp.setText("");
        }
    }//GEN-LAST:event_fieldPasswordEmpFocusGained

    private void btnLoginSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginSelectActionPerformed
        // TODO add your handling code here:
        if (btnLoginSelect.isSelected()) {
            btnLoginSelect.setBackground(new java.awt.Color(108, 91, 123));
            btnLoginSelect.setText("Employee");
            pnlLogin.removeAll();
            pnlLogin.add(pnlLoginEmp);
            pnlLogin.repaint();
            pnlLogin.revalidate();
        } else {
            btnLoginSelect.setBackground(new java.awt.Color(53, 92, 125));
            btnLoginSelect.setText("Customer");
            pnlLogin.removeAll();
            pnlLogin.add(pnlLoginCus);
            pnlLogin.repaint();
            pnlLogin.revalidate();
        }
    }//GEN-LAST:event_btnLoginSelectActionPerformed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Berhasil Login");
        setVisible(false);
        MainCustomer main = new MainCustomer();
        main.setVisible(true);
    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnSignInEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInEmpActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Berhasil Login");
        System.exit(0);
        setVisible(false);
        MainEmployee main = new MainEmployee();
        main.setVisible(true);
    }//GEN-LAST:event_btnSignInEmpActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnLoginSelect;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JButton btnSignInEmp;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JPasswordField fieldPasswordCus;
    private javax.swing.JPasswordField fieldPasswordEmp;
    private javax.swing.JTextField fieldUsernameCus;
    private javax.swing.JTextField fieldUsernameEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlLoginCus;
    private javax.swing.JPanel pnlLoginEmp;
    private javax.swing.JPanel pnlSideLogin;
    private javax.swing.JPanel pnlSignUp;
    private javax.swing.ButtonGroup rgGender;
    private javax.swing.JLabel txtSignUp;
    // End of variables declaration//GEN-END:variables
}