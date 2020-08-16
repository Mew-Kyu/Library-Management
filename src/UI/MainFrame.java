/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.table.JTableHeader;

/**
 *
 * @author nhlon
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form BanDoc
     */
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        btnQlbandoc.doClick();
        tableHeader();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        pnlMenu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnQlbandoc = new javax.swing.JButton();
        btnQltailieu = new javax.swing.JButton();
        btnQlphieumuon = new javax.swing.JButton();
        pnlHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        pnlTailieu = new javax.swing.JPanel();
        txtLoai = new javax.swing.JTextField();
        lblLoai = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTailieu = new javax.swing.JTable();
        lblNguon = new javax.swing.JLabel();
        lblMatailieu = new javax.swing.JLabel();
        txtNguon = new javax.swing.JTextField();
        txtMatailieu = new javax.swing.JTextField();
        lblVitri = new javax.swing.JLabel();
        txtTentailieu = new javax.swing.JTextField();
        txtVitri = new javax.swing.JTextField();
        lblTentailieu = new javax.swing.JLabel();
        pnlPhieumuon = new javax.swing.JPanel();
        txtMTL = new javax.swing.JTextField();
        lblMTL = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPhieumuon = new javax.swing.JTable();
        lblNgaymuon = new javax.swing.JLabel();
        lblMahoadon = new javax.swing.JLabel();
        txtNgaymuon = new javax.swing.JTextField();
        txtMahoadon = new javax.swing.JTextField();
        lblHoantra = new javax.swing.JLabel();
        txtMBĐ = new javax.swing.JTextField();
        lblMBĐ = new javax.swing.JLabel();
        chkHoantra = new javax.swing.JCheckBox();
        pnlBandoc = new javax.swing.JPanel();
        lblMabandoc = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        txtTenbandoc = new javax.swing.JTextField();
        lblTenbandoc = new javax.swing.JLabel();
        txtNgaysinh = new javax.swing.JTextField();
        lblNgaysinh = new javax.swing.JLabel();
        lblCCCD = new javax.swing.JLabel();
        txtCCCD = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBandoc = new javax.swing.JTable();
        lblSĐT = new javax.swing.JLabel();
        txtSĐT = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtNgaytao = new javax.swing.JTextField();
        lblNgaytao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lirbary Management System");

        pnlMenu.setBackground(new java.awt.Color(0, 204, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logofpt.png"))); // NOI18N

        btnQlbandoc.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btnQlbandoc.setText("<html><center>Quản lí<br>bạn đọc</center></html> ");
        btnQlbandoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQlbandocActionPerformed(evt);
            }
        });

        btnQltailieu.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btnQltailieu.setText("<html><center>Quản lí<br>tài liệu</center></html> ");
        btnQltailieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQltailieuActionPerformed(evt);
            }
        });

        btnQlphieumuon.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btnQlphieumuon.setText("<html><center>Quản lí<br>phiếu mượn</center></html> ");
        btnQlphieumuon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQlphieumuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQlphieumuonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQltailieu, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnQlbandoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnQlphieumuon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnQlbandoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnQltailieu, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnQlphieumuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlHeader.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("User");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Hi,");

        lblTitle.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Quản lí bạn đọc");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(34, 34, 34))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lblTitle))
                .addContainerGap())
        );

        pnlMain.setLayout(new java.awt.CardLayout());

        txtLoai.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblLoai.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblLoai.setText("Loại");

        tblTailieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên", "Loại", "Nguồn", "Vị trí"
            }
        ));
        jScrollPane3.setViewportView(tblTailieu);

        lblNguon.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNguon.setText("Nguồn");

        lblMatailieu.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblMatailieu.setText("Mã tài liệu");

        txtNguon.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtMatailieu.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblVitri.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblVitri.setText("Vị trí");

        txtTentailieu.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtVitri.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblTentailieu.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTentailieu.setText("Tên tài liệu");

        javax.swing.GroupLayout pnlTailieuLayout = new javax.swing.GroupLayout(pnlTailieu);
        pnlTailieu.setLayout(pnlTailieuLayout);
        pnlTailieuLayout.setHorizontalGroup(
            pnlTailieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTailieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTailieuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTailieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTailieuLayout.createSequentialGroup()
                        .addComponent(lblTentailieu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTentailieu, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTailieuLayout.createSequentialGroup()
                        .addComponent(lblMatailieu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatailieu, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTailieuLayout.createSequentialGroup()
                        .addComponent(lblLoai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlTailieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTailieuLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lblNguon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNguon, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTailieuLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(lblVitri)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVitri, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(143, 143, 143))
        );
        pnlTailieuLayout.setVerticalGroup(
            pnlTailieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTailieuLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnlTailieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatailieu)
                    .addComponent(txtMatailieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNguon)
                    .addComponent(txtNguon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnlTailieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTentailieu)
                    .addComponent(txtTentailieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVitri)
                    .addComponent(txtVitri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnlTailieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoai)
                    .addComponent(txtLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlMain.add(pnlTailieu, "card3");

        txtMTL.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblMTL.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblMTL.setText("Mã tài liệu");

        tblPhieumuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu mượn", "Mã bạn đọc", "Mã tài liệu", "Ngày mượn", "Hoàn trả"
            }
        ));
        jScrollPane2.setViewportView(tblPhieumuon);

        lblNgaymuon.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNgaymuon.setText("Ngày mượn");

        lblMahoadon.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblMahoadon.setText("Mã phiếu mượn");

        txtNgaymuon.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtMahoadon.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblHoantra.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblHoantra.setText("Hoàn trả");

        txtMBĐ.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblMBĐ.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblMBĐ.setText("Mã bạn đọc");

        chkHoantra.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout pnlPhieumuonLayout = new javax.swing.GroupLayout(pnlPhieumuon);
        pnlPhieumuon.setLayout(pnlPhieumuonLayout);
        pnlPhieumuonLayout.setHorizontalGroup(
            pnlPhieumuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPhieumuonLayout.createSequentialGroup()
                .addGroup(pnlPhieumuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPhieumuonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(pnlPhieumuonLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(pnlPhieumuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMTL)
                            .addComponent(lblMahoadon)
                            .addComponent(lblMBĐ))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPhieumuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMTL, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMBĐ, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMahoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127)
                        .addGroup(pnlPhieumuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNgaymuon)
                            .addComponent(lblHoantra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPhieumuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgaymuon, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkHoantra))
                        .addGap(0, 85, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPhieumuonLayout.setVerticalGroup(
            pnlPhieumuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPhieumuonLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlPhieumuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMahoadon)
                    .addComponent(txtMahoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNgaymuon)
                    .addComponent(txtNgaymuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnlPhieumuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoantra)
                    .addComponent(chkHoantra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMBĐ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMBĐ))
                .addGap(26, 26, 26)
                .addGroup(pnlPhieumuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMTL)
                    .addComponent(txtMTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlMain.add(pnlPhieumuon, "card4");

        lblMabandoc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblMabandoc.setText("Mã bạn đọc");

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtTenbandoc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblTenbandoc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTenbandoc.setText("Tên bạn đọc");

        txtNgaysinh.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblNgaysinh.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNgaysinh.setText("Ngày sinh");

        lblCCCD.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCCCD.setText("CCCD");

        txtCCCD.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        tblBandoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên", "Ngày sinh", "CCCD", "SĐT", "Email", "Ngày tạo"
            }
        ));
        jScrollPane1.setViewportView(tblBandoc);
        if (tblBandoc.getColumnModel().getColumnCount() > 0) {
            tblBandoc.getColumnModel().getColumn(5).setHeaderValue("Email");
            tblBandoc.getColumnModel().getColumn(6).setHeaderValue("Ngày tạo");
        }

        lblSĐT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSĐT.setText("SĐT");

        txtSĐT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEmail.setText("Email");

        txtEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtNgaytao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblNgaytao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNgaytao.setText("Ngày tạo");

        javax.swing.GroupLayout pnlBandocLayout = new javax.swing.GroupLayout(pnlBandoc);
        pnlBandoc.setLayout(pnlBandocLayout);
        pnlBandocLayout.setHorizontalGroup(
            pnlBandocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBandocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(pnlBandocLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(pnlBandocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBandocLayout.createSequentialGroup()
                        .addComponent(lblTenbandoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenbandoc, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBandocLayout.createSequentialGroup()
                        .addComponent(lblMabandoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBandocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBandocLayout.createSequentialGroup()
                            .addComponent(lblCCCD)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlBandocLayout.createSequentialGroup()
                            .addComponent(lblNgaysinh)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(103, 103, 103)
                .addGroup(pnlBandocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBandocLayout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBandocLayout.createSequentialGroup()
                        .addGroup(pnlBandocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNgaytao)
                            .addComponent(lblSĐT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBandocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSĐT, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgaytao, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        pnlBandocLayout.setVerticalGroup(
            pnlBandocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBandocLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlBandocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMabandoc)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSĐT)
                    .addComponent(txtSĐT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnlBandocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenbandoc)
                    .addComponent(txtTenbandoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnlBandocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgaysinh)
                    .addComponent(txtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNgaytao)
                    .addComponent(txtNgaytao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnlBandocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCCCD)
                    .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlMain.add(pnlBandoc, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQlbandocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQlbandocActionPerformed
        lblTitle.setText("Quản Lí Bạn Đọc");

        pnlMain.removeAll();
        pnlMain.add(pnlBandoc);
        pnlMain.repaint();
        pnlMain.revalidate();
    }//GEN-LAST:event_btnQlbandocActionPerformed

    private void btnQltailieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQltailieuActionPerformed
        lblTitle.setText("Quản Lí Tài Liệu");

        pnlMain.removeAll();
        pnlMain.add(pnlTailieu);
        pnlMain.repaint();
        pnlMain.revalidate();
    }//GEN-LAST:event_btnQltailieuActionPerformed

    private void btnQlphieumuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQlphieumuonActionPerformed
        lblTitle.setText("Quản Lí Phiếu Mượn");

        pnlMain.removeAll();
        pnlMain.add(pnlPhieumuon);
        pnlMain.repaint();
        pnlMain.revalidate();
    }//GEN-LAST:event_btnQlphieumuonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    public final void tableHeader() {
        JTableHeader nw = tblBandoc.getTableHeader();
        nw.setFont(new Font("Dialog", Font.PLAIN, 17));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQlbandoc;
    private javax.swing.JButton btnQlphieumuon;
    private javax.swing.JButton btnQltailieu;
    private javax.swing.JCheckBox chkHoantra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCCCD;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHoantra;
    private javax.swing.JLabel lblLoai;
    private javax.swing.JLabel lblMBĐ;
    private javax.swing.JLabel lblMTL;
    private javax.swing.JLabel lblMabandoc;
    private javax.swing.JLabel lblMahoadon;
    private javax.swing.JLabel lblMatailieu;
    private javax.swing.JLabel lblNgaymuon;
    private javax.swing.JLabel lblNgaysinh;
    private javax.swing.JLabel lblNgaytao;
    private javax.swing.JLabel lblNguon;
    private javax.swing.JLabel lblSĐT;
    private javax.swing.JLabel lblTenbandoc;
    private javax.swing.JLabel lblTentailieu;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVitri;
    private javax.swing.JPanel pnlBandoc;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPhieumuon;
    private javax.swing.JPanel pnlTailieu;
    private javax.swing.JTable tblBandoc;
    private javax.swing.JTable tblPhieumuon;
    private javax.swing.JTable tblTailieu;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLoai;
    private javax.swing.JTextField txtMBĐ;
    private javax.swing.JTextField txtMTL;
    private javax.swing.JTextField txtMahoadon;
    private javax.swing.JTextField txtMatailieu;
    private javax.swing.JTextField txtNgaymuon;
    private javax.swing.JTextField txtNgaysinh;
    private javax.swing.JTextField txtNgaytao;
    private javax.swing.JTextField txtNguon;
    private javax.swing.JTextField txtSĐT;
    private javax.swing.JTextField txtTenbandoc;
    private javax.swing.JTextField txtTentailieu;
    private javax.swing.JTextField txtVitri;
    // End of variables declaration//GEN-END:variables
}
