package Frontend;

import java.awt.Color;
import java.awt.Font;
import Backend.Validate_login;

public class AddDisciplina extends javax.swing.JFrame {

    public AddDisciplina() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        disciplinaNome_jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        termino_jFormattedTextField1 = new javax.swing.JFormattedTextField();
        inicio_jFormattedTextField2 = new javax.swing.JFormattedTextField();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(389, 450));

        jPanel1.setBackground(new java.awt.Color(255, 211, 16));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Adicionar Disciplina");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jPanel2.setBackground(new java.awt.Color(127, 80, 121));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setBackground(new java.awt.Color(255, 211, 16));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Adicionar");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        disciplinaNome_jTextField1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        disciplinaNome_jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        disciplinaNome_jTextField1.setText("Nome da disciplina");
        disciplinaNome_jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        disciplinaNome_jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                disciplinaNome_jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                disciplinaNome_jTextField1FocusLost(evt);
            }
        });
        disciplinaNome_jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                disciplinaNome_jTextField1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                disciplinaNome_jTextField1MouseExited(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione os dias", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(71, 26));

        termino_jFormattedTextField1.setBorder(null);
        termino_jFormattedTextField1.setForeground(new java.awt.Color(153, 153, 153));
        termino_jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        termino_jFormattedTextField1.setText("Término...");
        termino_jFormattedTextField1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        inicio_jFormattedTextField2.setBorder(null);
        inicio_jFormattedTextField2.setForeground(new java.awt.Color(153, 153, 153));
        inicio_jFormattedTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inicio_jFormattedTextField2.setText("Início...");
        inicio_jFormattedTextField2.setToolTipText("");
        inicio_jFormattedTextField2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(disciplinaNome_jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(inicio_jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(termino_jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(disciplinaNome_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicio_jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(termino_jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void disciplinaNome_jTextField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disciplinaNome_jTextField1MouseExited
        // TODO add your handling code here:
        disciplinaNome_jTextField1.setBackground(new Color(240, 230, 140));
    }//GEN-LAST:event_disciplinaNome_jTextField1MouseExited

    private void disciplinaNome_jTextField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disciplinaNome_jTextField1MouseEntered
        // TODO add your handling code here:
        disciplinaNome_jTextField1.setBackground(Color.white);
        
    }//GEN-LAST:event_disciplinaNome_jTextField1MouseEntered

    private void disciplinaNome_jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_disciplinaNome_jTextField1FocusLost
        // TODO add your handling code here:
        if (disciplinaNome_jTextField1.getText().equals("")) {
            disciplinaNome_jTextField1.setText("Nome da matéria");
            disciplinaNome_jTextField1.setForeground(new Color(153, 153, 153));
            disciplinaNome_jTextField1.setFont(Font.decode("Arial Black"));
        }
    }//GEN-LAST:event_disciplinaNome_jTextField1FocusLost

    private void disciplinaNome_jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_disciplinaNome_jTextField1FocusGained
        // TODO add your handling code here:
        if (disciplinaNome_jTextField1.getText().equals("Nome da matéria")) {
            disciplinaNome_jTextField1.setText("");
            disciplinaNome_jTextField1.setForeground(Color.black);
            disciplinaNome_jTextField1.setFont(Font.decode("Arial"));
        }
    }//GEN-LAST:event_disciplinaNome_jTextField1FocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBackground(new Color(255, 211, 16));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(new Color(0, 191, 255));
    }//GEN-LAST:event_jButton1MouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField disciplinaNome_jTextField1;
    private javax.swing.JFormattedTextField inicio_jFormattedTextField2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JFormattedTextField termino_jFormattedTextField1;
    // End of variables declaration//GEN-END:variables
}
