/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;
import model.produto;
import services.produtoServicos;

/**
 *
 * @author 182120001
 */
public class menuTenis extends javax.swing.JFrame {

    /**
     * Creates new form menuProduto
     */
    public menuTenis() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jlSHEIN = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jbCalça = new javax.swing.JButton();
        jbCamiseta = new javax.swing.JButton();
        jlNome2 = new javax.swing.JLabel();
        jlNome3 = new javax.swing.JLabel();
        jbTenisAirJordan = new javax.swing.JButton();
        jbSetasProsseguir = new javax.swing.JButton();
        jbTenis = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jbTenisHyperBeast = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlNome4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlNome6 = new javax.swing.JLabel();
        jlNome5 = new javax.swing.JLabel();
        jbLafundeFlex = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbTenisPetite = new javax.swing.JButton();
        jlNome7 = new javax.swing.JLabel();
        jlNome8 = new javax.swing.JLabel();
        jlNome9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jlNome10 = new javax.swing.JLabel();
        jlNome11 = new javax.swing.JLabel();
        jbCavelo = new javax.swing.JButton();
        jlNome12 = new javax.swing.JLabel();
        jlNome13 = new javax.swing.JLabel();
        jbNapoleao = new javax.swing.JButton();
        jbVasco = new javax.swing.JButton();
        jlNome14 = new javax.swing.JLabel();
        jlNome15 = new javax.swing.JLabel();
        jbAirPurple = new javax.swing.JButton();
        jlNome16 = new javax.swing.JLabel();
        jlNome17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlSHEIN.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jlSHEIN.setForeground(new java.awt.Color(255, 255, 255));
        jlSHEIN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSHEIN.setText("S H E I N");
        jPanel1.add(jlSHEIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 387, 71));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quadrado.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, -1, -1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/air.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, 130));

        jbCalça.setBackground(new java.awt.Color(128, 128, 128));
        jbCalça.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbCalça.setForeground(new java.awt.Color(255, 255, 255));
        jbCalça.setText("Calça");
        jbCalça.setBorder(null);
        jbCalça.setBorderPainted(false);
        jbCalça.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalçaActionPerformed(evt);
            }
        });
        jPanel1.add(jbCalça, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, -1, -1));

        jbCamiseta.setBackground(new java.awt.Color(128, 128, 128));
        jbCamiseta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbCamiseta.setForeground(new java.awt.Color(255, 255, 255));
        jbCamiseta.setText("Camiseta");
        jbCamiseta.setBorder(null);
        jbCamiseta.setBorderPainted(false);
        jbCamiseta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCamisetaActionPerformed(evt);
            }
        });
        jPanel1.add(jbCamiseta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        jlNome2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlNome2.setForeground(new java.awt.Color(255, 255, 255));
        jlNome2.setText("R$ 788,90");
        jPanel1.add(jlNome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 60, -1));

        jlNome3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlNome3.setForeground(new java.awt.Color(255, 255, 255));
        jlNome3.setText("Hyper Beast");
        jPanel1.add(jlNome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 70, -1));

        jbTenisAirJordan.setBackground(new java.awt.Color(51, 51, 51));
        jbTenisAirJordan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/correto.png"))); // NOI18N
        jbTenisAirJordan.setBorder(null);
        jbTenisAirJordan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTenisAirJordanActionPerformed(evt);
            }
        });
        jPanel1.add(jbTenisAirJordan, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

        jbSetasProsseguir.setBackground(new java.awt.Color(51, 51, 51));
        jbSetasProsseguir.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jbSetasProsseguir.setForeground(new java.awt.Color(255, 255, 255));
        jbSetasProsseguir.setText(">>>>>>>>>>>>>");
        jbSetasProsseguir.setBorder(null);
        jbSetasProsseguir.setBorderPainted(false);
        jbSetasProsseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSetasProsseguirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSetasProsseguir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 40, -1, -1));

        jbTenis.setBackground(new java.awt.Color(61, 61, 61));
        jbTenis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbTenis.setForeground(new java.awt.Color(255, 255, 255));
        jbTenis.setText("Tênis");
        jbTenis.setBorder(null);
        jbTenis.setBorderPainted(false);
        jbTenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTenisActionPerformed(evt);
            }
        });
        jPanel1.add(jbTenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 100, 10));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/selecaoCategoria.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 180, 30));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoTabelaCategorias.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 640));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/anuncio1.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        jbTenisHyperBeast.setBackground(new java.awt.Color(51, 51, 51));
        jbTenisHyperBeast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/correto.png"))); // NOI18N
        jbTenisHyperBeast.setBorder(null);
        jbTenisHyperBeast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTenisHyperBeastActionPerformed(evt);
            }
        });
        jPanel1.add(jbTenisHyperBeast, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tenisHypeBeast.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, -1, 130));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quadrado.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        jlNome4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlNome4.setForeground(new java.awt.Color(255, 255, 255));
        jlNome4.setText("Air Jordan");
        jPanel1.add(jlNome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 120, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quadrado.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, -1));

        jlNome6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlNome6.setForeground(new java.awt.Color(255, 255, 255));
        jlNome6.setText("Petite");
        jPanel1.add(jlNome6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 410, 40, -1));

        jlNome5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlNome5.setForeground(new java.awt.Color(255, 255, 255));
        jlNome5.setText("R$ 345,20");
        jPanel1.add(jlNome5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 660, 60, -1));

        jbLafundeFlex.setBackground(new java.awt.Color(51, 51, 51));
        jbLafundeFlex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/correto.png"))); // NOI18N
        jbLafundeFlex.setBorder(null);
        jbLafundeFlex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLafundeFlexActionPerformed(evt);
            }
        });
        jPanel1.add(jbLafundeFlex, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tenisPetite.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 300, 140, 100));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quadrado.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 270, -1, -1));

        jbTenisPetite.setBackground(new java.awt.Color(51, 51, 51));
        jbTenisPetite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/correto.png"))); // NOI18N
        jbTenisPetite.setBorder(null);
        jbTenisPetite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTenisPetiteActionPerformed(evt);
            }
        });
        jPanel1.add(jbTenisPetite, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 420, -1, -1));

        jlNome7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlNome7.setForeground(new java.awt.Color(255, 255, 255));
        jlNome7.setText("Lafunde Flex");
        jPanel1.add(jlNome7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, 80, -1));

        jlNome8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlNome8.setForeground(new java.awt.Color(255, 255, 255));
        jlNome8.setText("R$ 1200,00");
        jPanel1.add(jlNome8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 90, -1));

        jlNome9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlNome9.setForeground(new java.awt.Color(255, 255, 255));
        jlNome9.setText("R$ 300,00");
        jPanel1.add(jlNome9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, 60, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quadrado.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 490, -1, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quadrado.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 490, -1, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quadrado.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, -1, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quadrado.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, -1));

        jlNome10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlNome10.setForeground(new java.awt.Color(255, 255, 255));
        jlNome10.setText("R$ 1000,90");
        jPanel1.add(jlNome10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 660, 70, -1));

        jlNome11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlNome11.setForeground(new java.awt.Color(255, 255, 255));
        jlNome11.setText("Cavelo");
        jPanel1.add(jlNome11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 640, 40, -1));

        jbCavelo.setBackground(new java.awt.Color(51, 51, 51));
        jbCavelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/correto.png"))); // NOI18N
        jbCavelo.setBorder(null);
        jbCavelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCaveloActionPerformed(evt);
            }
        });
        jPanel1.add(jbCavelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 640, -1, -1));

        jlNome12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlNome12.setForeground(new java.awt.Color(255, 255, 255));
        jlNome12.setText("Napoleao");
        jPanel1.add(jlNome12, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 640, 60, -1));

        jlNome13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlNome13.setForeground(new java.awt.Color(255, 255, 255));
        jlNome13.setText("R$ 666,99");
        jPanel1.add(jlNome13, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 660, 60, -1));

        jbNapoleao.setBackground(new java.awt.Color(51, 51, 51));
        jbNapoleao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/correto.png"))); // NOI18N
        jbNapoleao.setBorder(null);
        jbNapoleao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNapoleaoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNapoleao, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 640, -1, -1));

        jbVasco.setBackground(new java.awt.Color(51, 51, 51));
        jbVasco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/correto.png"))); // NOI18N
        jbVasco.setBorder(null);
        jbVasco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVascoActionPerformed(evt);
            }
        });
        jPanel1.add(jbVasco, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 640, -1, -1));

        jlNome14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlNome14.setForeground(new java.awt.Color(255, 255, 255));
        jlNome14.setText("Vasco");
        jPanel1.add(jlNome14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 640, 40, -1));

        jlNome15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlNome15.setForeground(new java.awt.Color(255, 255, 255));
        jlNome15.setText("R$ 2200,00");
        jPanel1.add(jlNome15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 440, 70, -1));

        jbAirPurple.setBackground(new java.awt.Color(51, 51, 51));
        jbAirPurple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/correto.png"))); // NOI18N
        jbAirPurple.setBorder(null);
        jbAirPurple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAirPurpleActionPerformed(evt);
            }
        });
        jPanel1.add(jbAirPurple, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 420, -1, -1));

        jlNome16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlNome16.setForeground(new java.awt.Color(255, 255, 255));
        jlNome16.setText("Air Purple");
        jPanel1.add(jlNome16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 420, 60, -1));

        jlNome17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlNome17.setForeground(new java.awt.Color(255, 255, 255));
        jlNome17.setText("R$ 50,00");
        jPanel1.add(jlNome17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 660, 60, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tenisAirPurple.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 300, -1, 100));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tenisVasco.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 510, 150, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tenisCavelo.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, -1, 120));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tenisLafundeFlex.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, -1, 120));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tenisNapoleao.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, -1, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSetasProsseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSetasProsseguirActionPerformed
        setVisible(false);
        dispose();

        menuCarrinho janelaCarrinho = new menuCarrinho();
        janelaCarrinho.setVisible(true);
    }//GEN-LAST:event_jbSetasProsseguirActionPerformed

    private void jbTenisAirJordanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTenisAirJordanActionPerformed
        produtoServicos proS = services.servicosFactory.getProdutoServicos();
        produto p = new produto(WIDTH, "Tenis Air Jordan", 1, (float) 1200.00, "");

        proS.adicionaProduto(p);
    }//GEN-LAST:event_jbTenisAirJordanActionPerformed

    private void jbTenisHyperBeastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTenisHyperBeastActionPerformed
        produtoServicos proS = services.servicosFactory.getProdutoServicos();
        produto p = new produto(WIDTH, "Tenis Hyper Beast", 1, (float) 788.70, "");

        proS.adicionaProduto(p);
    }//GEN-LAST:event_jbTenisHyperBeastActionPerformed

    private void jbLafundeFlexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLafundeFlexActionPerformed
        produtoServicos proS = services.servicosFactory.getProdutoServicos();
        produto p = new produto(WIDTH, "Tenis Lafunde Flex", 1, (float) 345.20, "");

        proS.adicionaProduto(p);
    }//GEN-LAST:event_jbLafundeFlexActionPerformed

    private void jbTenisPetiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTenisPetiteActionPerformed
        produtoServicos proS = services.servicosFactory.getProdutoServicos();
        produto p = new produto(WIDTH, "Tenis Petite", 1, (float) 300.00, "");

        proS.adicionaProduto(p);
    }//GEN-LAST:event_jbTenisPetiteActionPerformed

    private void jbCaveloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCaveloActionPerformed
        produtoServicos proS = services.servicosFactory.getProdutoServicos();
        produto p = new produto(WIDTH, "Tenis Cavelo", 1, (float) 1000.90, "");

        proS.adicionaProduto(p);
    }//GEN-LAST:event_jbCaveloActionPerformed

    private void jbNapoleaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNapoleaoActionPerformed
        produtoServicos proS = services.servicosFactory.getProdutoServicos();
        produto p = new produto(WIDTH, "Tenis Napoleao", 1, (float) 666.99, "");

        proS.adicionaProduto(p);
    }//GEN-LAST:event_jbNapoleaoActionPerformed

    private void jbVascoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVascoActionPerformed
        produtoServicos proS = services.servicosFactory.getProdutoServicos();
        produto p = new produto(WIDTH, "Tenis Vasco", 1, (float) 50.00, "");

        proS.adicionaProduto(p);
    }//GEN-LAST:event_jbVascoActionPerformed

    private void jbAirPurpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAirPurpleActionPerformed
        produtoServicos proS = services.servicosFactory.getProdutoServicos();
        produto p = new produto(WIDTH, "Tenis Air Purple", 1, (float) 2200.00, "");

        proS.adicionaProduto(p);
    }//GEN-LAST:event_jbAirPurpleActionPerformed

    private void jbCamisetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCamisetaActionPerformed
        setVisible(false);
        dispose();
        
        menuCamiseta janelaCamiseta = new menuCamiseta();
        janelaCamiseta.setVisible(true);
    }//GEN-LAST:event_jbCamisetaActionPerformed

    private void jbCalçaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalçaActionPerformed
        setVisible(false);
        dispose();
        
        menuCalca janelCalca = new menuCalca();
        janelCalca.setVisible(true);
    }//GEN-LAST:event_jbCalçaActionPerformed

    private void jbTenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbTenisActionPerformed

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
            java.util.logging.Logger.getLogger(menuTenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuTenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuTenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuTenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuTenis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAirPurple;
    private javax.swing.JButton jbCalça;
    private javax.swing.JButton jbCamiseta;
    private javax.swing.JButton jbCavelo;
    private javax.swing.JButton jbLafundeFlex;
    private javax.swing.JButton jbNapoleao;
    private javax.swing.JButton jbSetasProsseguir;
    private javax.swing.JButton jbTenis;
    private javax.swing.JButton jbTenisAirJordan;
    private javax.swing.JButton jbTenisHyperBeast;
    private javax.swing.JButton jbTenisPetite;
    private javax.swing.JButton jbVasco;
    private javax.swing.JLabel jlNome10;
    private javax.swing.JLabel jlNome11;
    private javax.swing.JLabel jlNome12;
    private javax.swing.JLabel jlNome13;
    private javax.swing.JLabel jlNome14;
    private javax.swing.JLabel jlNome15;
    private javax.swing.JLabel jlNome16;
    private javax.swing.JLabel jlNome17;
    private javax.swing.JLabel jlNome2;
    private javax.swing.JLabel jlNome3;
    private javax.swing.JLabel jlNome4;
    private javax.swing.JLabel jlNome5;
    private javax.swing.JLabel jlNome6;
    private javax.swing.JLabel jlNome7;
    private javax.swing.JLabel jlNome8;
    private javax.swing.JLabel jlNome9;
    private javax.swing.JLabel jlSHEIN;
    // End of variables declaration//GEN-END:variables
}
