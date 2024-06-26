/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pokemon;

import java.awt.FontFormatException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class EvolutionPage extends javax.swing.JFrame {

    static int saveNumber;
    static String pokemonName;

    /**
     * Creates new form EvolutionPage
     */
    public EvolutionPage(int saveNumber, String pokemonName) {
        this.saveNumber = saveNumber;
        this.pokemonName = pokemonName;
        initComponents();

        ImageIcon backgroundImage = null;
        switch (pokemonName) {
            case "Bulbasaur":
            case "Ivysaur":
                backgroundImage = new ImageIcon("C:\\Users\\User\\Downloads\\Evolving\\1.png");
                Background.setIcon(backgroundImage);
            case "Venusaur":
                backgroundImage = new ImageIcon("C:\\Users\\User\\Downloads\\Evolving\\2.png");
                Background.setIcon(backgroundImage);
                break;
            case "Charmander":
            case "Charmeleon":
                backgroundImage = new ImageIcon("C:\\Users\\User\\Downloads\\Evolving\\3.png");
                Background.setIcon(backgroundImage);
                break;
            case "Charizard":
                backgroundImage = new ImageIcon("C:\\Users\\User\\Downloads\\Evolving\\4.png");
                Background.setIcon(backgroundImage);
                break;
            case "Squirtle":
            case "Wartortle":
                backgroundImage = new ImageIcon("C:\\Users\\User\\Downloads\\Evolving\\5.png");
                Background.setIcon(backgroundImage);
                break;
            case "Blastoise":
                backgroundImage = new ImageIcon("C:\\Users\\User\\Downloads\\Evolving\\6.png");
                Background.setIcon(backgroundImage);
                break;
            default:
                // If the pokemon is not in the specified list, do nothing
                break;
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

        jPanel1 = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 675));
        setMinimumSize(new java.awt.Dimension(1200, 675));
        setPreferredSize(new java.awt.Dimension(1200, 675));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setText("NICE!");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 570, 170, 60));

        Background.setMaximumSize(new java.awt.Dimension(1200, 675));
        Background.setMinimumSize(new java.awt.Dimension(1200, 675));
        Background.setPreferredSize(new java.awt.Dimension(1200, 675));
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -200, 1920, 1080));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
         try {
            MainMenuPage mainMenuPageFrame = new MainMenuPage(saveNumber);
            this.dispose();
            mainMenuPageFrame.setVisible(true);
            mainMenuPageFrame.pack();
            mainMenuPageFrame.setLocationRelativeTo(null);
        } catch (FontFormatException ex) {
            Logger.getLogger(LoadGamePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EvolutionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EvolutionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EvolutionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EvolutionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EvolutionPage(saveNumber, pokemonName).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Background;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
