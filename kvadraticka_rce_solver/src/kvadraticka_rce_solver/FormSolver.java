/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kvadraticka_rce_solver;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author tobias
 */
public class FormSolver extends javax.swing.JFrame {
    private final Graphics GRAFIKA;
    /**
     * Creates new form FormSolver
     */
    public FormSolver() {
        initActions();
        initComponents();
        GRAFIKA = new Graphics();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        txf_x = new javax.swing.JFormattedTextField();
        txf_y = new javax.swing.JFormattedTextField();
        txf_z = new javax.swing.JFormattedTextField();
        lbl_x = new javax.swing.JLabel();
        lbl_y = new javax.swing.JLabel();
        lbl_z = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Výpočet kvadratické rovnice");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txf_x.setActionCommand("<Not Set>");
        txf_x.setName(""); // NOI18N
        txf_x.setNextFocusableComponent(txf_y);
        txf_x.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txf_xFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txf_xFocusLost(evt);
            }
        });
        txf_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_xActionPerformed(evt);
            }
        });
        txf_x.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txf_xKeyPressed(evt);
            }
        });

        txf_y.setNextFocusableComponent(txf_z);
        txf_y.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txf_yFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txf_yFocusLost(evt);
            }
        });
        txf_y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_yActionPerformed(evt);
            }
        });

        txf_z.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txf_zFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txf_zFocusLost(evt);
            }
        });

        lbl_x.setText("x:");

        lbl_y.setText("y:");

        lbl_z.setText("z:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_x)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txf_x, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_y)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txf_y, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_z)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txf_z, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_z, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_x)
                    .addComponent(lbl_y)
                    .addComponent(lbl_z))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        jMenu1.setAction(exitAction);
        jMenu1.setText("Soubor");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.setDelay(0);

        jMenuItem2.setAction(exitAction);
        jMenuItem2.setText("Ukončit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Nastavení");

        jMenuItem1.setAction(backgroundColorAction);
        jMenuItem1.setText("Barva");
        jMenu2.add(jMenuItem1);

        jMenuItem3.setAction(fontAction);
        jMenuItem3.setText("Změna fontu");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Nápověda");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initActions(){
        exitAction = new ExitAction();
        backgroundColorAction = new BackgroundColorAction();
        fontAction = new FontAction();
    }
    
    private void txf_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_xActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_xActionPerformed

    private void txf_xFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txf_xFocusGained
        // TODO add your handling code here:
        GRAFIKA.hasFocus(txf_x);
    }//GEN-LAST:event_txf_xFocusGained

    private void txf_xFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txf_xFocusLost
        // TODO add your handling code here:
        GRAFIKA.noFocus(txf_x);
    }//GEN-LAST:event_txf_xFocusLost

    private void txf_yFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txf_yFocusGained
        // TODO add your handling code here:
        GRAFIKA.hasFocus(txf_y);
    }//GEN-LAST:event_txf_yFocusGained

    private void txf_yFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txf_yFocusLost
        // TODO add your handling code here:
        GRAFIKA.noFocus(txf_y);
    }//GEN-LAST:event_txf_yFocusLost

    private void txf_zFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txf_zFocusGained
        // TODO add your handling code here:
        GRAFIKA.hasFocus(txf_z);
    }//GEN-LAST:event_txf_zFocusGained

    private void txf_zFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txf_zFocusLost
        // TODO add your handling code here:
        GRAFIKA.noFocus(txf_z);        
    }//GEN-LAST:event_txf_zFocusLost

    private void txf_yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_yActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_yActionPerformed

    private void txf_xKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_xKeyPressed
        // TODO add your handling code here:
        if(evt.isActionKey()){
            
        }
    }//GEN-LAST:event_txf_xKeyPressed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormSolver().setVisible(true);
        });
    }
    
    class ExitAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(JOptionPane.YES_OPTION == 
                JOptionPane.showConfirmDialog(rootPane, "Přejete si ukončit aplikaci?", "Ukončení", JOptionPane.YES_NO_OPTION)){
                exit(0);
            }
        }   
    }
    
    class BackgroundColorAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent ae) {
            Color color = JColorChooser.showDialog(rootPane, "Vyberte barvu pozadí", GRAFIKA.getDefaultBackground(rootPane));
            jPanel1.setBackground(color);
        }
    }
    
    class FontAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent ae) {
               JFontChooser fontChooser = new JFontChooser();
               int result = fontChooser.showDialog(rootPane);
               if (result == JFontChooser.OK_OPTION)
               {
                    Font font = fontChooser.getSelectedFont(); 
                    changeFont(font); 
               }
                

        }
    
        
    }
    
    public void changeFont (Font font){
            List<Component> comp = new ArrayList();
            Collections.addAll(comp, jMenuBar1.getComponents());
            Collections.addAll(comp, jMenuItem1.getComponents());
            Collections.addAll(comp, jMenuItem2.getComponents());
            Collections.addAll(comp, jMenuItem3.getComponents());
            Collections.addAll(comp, jPanel1.getComponents());
            comp.add(jColorChooser1);

            
            for(Component _comp : comp){
                _comp.setFont(font);
            }
        } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_x;
    private javax.swing.JLabel lbl_y;
    private javax.swing.JLabel lbl_z;
    private javax.swing.JFormattedTextField txf_x;
    private javax.swing.JFormattedTextField txf_y;
    private javax.swing.JFormattedTextField txf_z;
    // End of variables declaration//GEN-END:variables
    // vlastní proměnné
    private Action exitAction;
    private Action backgroundColorAction;
    private Action fontAction;
}
