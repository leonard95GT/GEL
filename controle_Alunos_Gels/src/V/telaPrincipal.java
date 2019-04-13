package V;

import M.configurarBotao;

/**
 *
 * @author Leonardo Renê
 */
public class telaPrincipal extends javax.swing.JFrame {
    //variável instanciada para realizar as alterações de efeito
    configurarBotao configB = new configurarBotao();
 
    public telaPrincipal() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bt_listChamada = new javax.swing.JPanel();
        textBotaoChamada = new javax.swing.JLabel();
        bt_GELs = new javax.swing.JPanel();
        textBotaoGel = new javax.swing.JLabel();
        bt_Instrutor = new javax.swing.JPanel();
        textBotaoInstr = new javax.swing.JLabel();
        bt_Aluno = new javax.swing.JPanel();
        textBotaoAluno = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 2, 24)); // NOI18N
        jLabel4.setText("Gamaliel - Controle de GEL's");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        bt_listChamada.setBackground(new java.awt.Color(153, 204, 0));
        bt_listChamada.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_listChamada.setPreferredSize(new java.awt.Dimension(222, 87));
        bt_listChamada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_listChamadaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_listChamadaMouseExited(evt);
            }
        });

        textBotaoChamada.setFont(new java.awt.Font("Tw Cen MT", 2, 24)); // NOI18N
        textBotaoChamada.setForeground(new java.awt.Color(255, 255, 255));
        textBotaoChamada.setText("Lista de Chamada");

        javax.swing.GroupLayout bt_listChamadaLayout = new javax.swing.GroupLayout(bt_listChamada);
        bt_listChamada.setLayout(bt_listChamadaLayout);
        bt_listChamadaLayout.setHorizontalGroup(
            bt_listChamadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bt_listChamadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textBotaoChamada)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        bt_listChamadaLayout.setVerticalGroup(
            bt_listChamadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bt_listChamadaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(textBotaoChamada)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        bt_GELs.setBackground(new java.awt.Color(153, 204, 0));
        bt_GELs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_GELs.setPreferredSize(new java.awt.Dimension(222, 87));
        bt_GELs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_GELsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_GELsMouseExited(evt);
            }
        });

        textBotaoGel.setFont(new java.awt.Font("Tw Cen MT", 2, 24)); // NOI18N
        textBotaoGel.setForeground(new java.awt.Color(255, 255, 255));
        textBotaoGel.setText("GEL's");

        javax.swing.GroupLayout bt_GELsLayout = new javax.swing.GroupLayout(bt_GELs);
        bt_GELs.setLayout(bt_GELsLayout);
        bt_GELsLayout.setHorizontalGroup(
            bt_GELsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bt_GELsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textBotaoGel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bt_GELsLayout.setVerticalGroup(
            bt_GELsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bt_GELsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(textBotaoGel)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        bt_Instrutor.setBackground(new java.awt.Color(153, 204, 0));
        bt_Instrutor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Instrutor.setPreferredSize(new java.awt.Dimension(222, 87));
        bt_Instrutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_InstrutorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_InstrutorMouseExited(evt);
            }
        });

        textBotaoInstr.setFont(new java.awt.Font("Tw Cen MT", 2, 24)); // NOI18N
        textBotaoInstr.setForeground(new java.awt.Color(255, 255, 255));
        textBotaoInstr.setText("Instrutores");

        javax.swing.GroupLayout bt_InstrutorLayout = new javax.swing.GroupLayout(bt_Instrutor);
        bt_Instrutor.setLayout(bt_InstrutorLayout);
        bt_InstrutorLayout.setHorizontalGroup(
            bt_InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bt_InstrutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textBotaoInstr)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bt_InstrutorLayout.setVerticalGroup(
            bt_InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bt_InstrutorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(textBotaoInstr)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        bt_Aluno.setBackground(new java.awt.Color(153, 204, 0));
        bt_Aluno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Aluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_AlunoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_AlunoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_AlunoMouseExited(evt);
            }
        });

        textBotaoAluno.setFont(new java.awt.Font("Tw Cen MT", 2, 24)); // NOI18N
        textBotaoAluno.setForeground(new java.awt.Color(255, 255, 255));
        textBotaoAluno.setText("Alunos");

        javax.swing.GroupLayout bt_AlunoLayout = new javax.swing.GroupLayout(bt_Aluno);
        bt_Aluno.setLayout(bt_AlunoLayout);
        bt_AlunoLayout.setHorizontalGroup(
            bt_AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bt_AlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textBotaoAluno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bt_AlunoLayout.setVerticalGroup(
            bt_AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bt_AlunoLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(textBotaoAluno)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bt_Aluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_Instrutor, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(bt_GELs, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(bt_listChamada, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(bt_Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_Instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_GELs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_listChamada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setText("Painel de Acesso Rápido");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(300, 300, 300)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//efeitos para quando o mouse invadir o espaço dos botões    
    private void bt_AlunoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AlunoMouseEntered
       configB.efeitosBotao(bt_Aluno, textBotaoAluno);
    }//GEN-LAST:event_bt_AlunoMouseEntered

    private void bt_GELsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_GELsMouseEntered
        configB.efeitosBotao(bt_GELs, textBotaoGel);
    }//GEN-LAST:event_bt_GELsMouseEntered

    private void bt_InstrutorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_InstrutorMouseEntered
        configB.efeitosBotao(bt_Instrutor, textBotaoInstr);
    }//GEN-LAST:event_bt_InstrutorMouseEntered

    //Listener para realizar abertura da tela selecionada
    private void bt_AlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AlunoMouseClicked
        Tela_Alunos tAluno = new Tela_Alunos(this, true);
        tAluno.setLocationRelativeTo(null);
        tAluno.setVisible(true);
        configB.efeitosBotaoSair(bt_Aluno,textBotaoAluno);
    }//GEN-LAST:event_bt_AlunoMouseClicked

    private void bt_listChamadaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_listChamadaMouseEntered
        configB.efeitosBotao(bt_listChamada, textBotaoChamada);
    }//GEN-LAST:event_bt_listChamadaMouseEntered

    private void bt_AlunoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AlunoMouseExited
        configB.efeitosBotaoSair(bt_Aluno,textBotaoAluno);
    }//GEN-LAST:event_bt_AlunoMouseExited

    private void bt_InstrutorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_InstrutorMouseExited
        configB.efeitosBotaoSair(bt_Instrutor,textBotaoInstr);
    }//GEN-LAST:event_bt_InstrutorMouseExited

    private void bt_GELsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_GELsMouseExited
        configB.efeitosBotaoSair(bt_GELs,textBotaoGel);
    }//GEN-LAST:event_bt_GELsMouseExited

    private void bt_listChamadaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_listChamadaMouseExited
        configB.efeitosBotaoSair(bt_listChamada,textBotaoChamada);
    }//GEN-LAST:event_bt_listChamadaMouseExited
    
//classe aonde é realizada a montagem da tela    
    public void abrirTela() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {  
                new telaPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bt_Aluno;
    private javax.swing.JPanel bt_GELs;
    private javax.swing.JPanel bt_Instrutor;
    private javax.swing.JPanel bt_listChamada;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel textBotaoAluno;
    private javax.swing.JLabel textBotaoChamada;
    private javax.swing.JLabel textBotaoGel;
    private javax.swing.JLabel textBotaoInstr;
    // End of variables declaration//GEN-END:variables
}
