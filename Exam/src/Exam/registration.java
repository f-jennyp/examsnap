/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class registration extends javax.swing.JFrame {

    /**
     * Creates new form registration
     */
    String score;

    public registration() {
        initComponents();
        setResizable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        password1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        username1 = new javax.swing.JTextField();
        blockNo1 = new javax.swing.JTextField();
        fname1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lname1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        submit1 = new javax.swing.JLabel();
        course1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        yearLevel1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        reset1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel1.setText("PASSWORD:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 100, 100, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel3.setText("BLOCK No.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 300, 90, 30);

        password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password1ActionPerformed(evt);
            }
        });
        getContentPane().add(password1);
        password1.setBounds(260, 130, 170, 30);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel4.setText("USERNAME:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 100, 90, 30);

        username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username1ActionPerformed(evt);
            }
        });
        getContentPane().add(username1);
        username1.setBounds(30, 130, 170, 30);

        blockNo1.setName(""); // NOI18N
        blockNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockNo1ActionPerformed(evt);
            }
        });
        getContentPane().add(blockNo1);
        blockNo1.setBounds(340, 330, 90, 30);
        blockNo1.getAccessibleContext().setAccessibleName("");
        blockNo1.getAccessibleContext().setAccessibleDescription("");

        fname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fname1ActionPerformed(evt);
            }
        });
        getContentPane().add(fname1);
        fname1.setBounds(260, 200, 170, 30);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 11)); // NOI18N
        jLabel7.setText("ex. BSBA");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 320, 60, 10);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel8.setText("FIRSTNAME");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(260, 170, 80, 30);

        lname1.setName(""); // NOI18N
        lname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lname1ActionPerformed(evt);
            }
        });
        getContentPane().add(lname1);
        lname1.setBounds(30, 200, 170, 30);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel10.setText("COURSE:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 240, 70, 30);

        submit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exam/Buttons/SUBMIT.png"))); // NOI18N
        submit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submit1MouseClicked(evt);
            }
        });
        getContentPane().add(submit1);
        submit1.setBounds(120, 380, 100, 40);

        course1.setName(""); // NOI18N
        course1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course1ActionPerformed(evt);
            }
        });
        getContentPane().add(course1);
        course1.setBounds(30, 270, 170, 30);

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel11.setText("YEAR LEVEL:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(260, 240, 130, 30);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exam/Buttons/BACK.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(10, 410, 60, 50);

        yearLevel1.setName(""); // NOI18N
        yearLevel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearLevel1ActionPerformed(evt);
            }
        });
        getContentPane().add(yearLevel1);
        yearLevel1.setBounds(260, 270, 170, 30);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel12.setText("LASTNAME");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 170, 90, 30);

        reset1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exam/Buttons/RESET.png"))); // NOI18N
        reset1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reset1MouseClicked(evt);
            }
        });
        getContentPane().add(reset1);
        reset1.setBounds(250, 380, 100, 40);

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 11)); // NOI18N
        jLabel13.setText("*Please abbreviate");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(90, 300, 110, 15);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exam/images/IMG_20200303_172951.JPG"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 50, 480, 420);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("REGISTRATION FORM");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 50, 210, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exam/images/log2.JPG"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(0, 0, 60, 60);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel5.setText("Exam");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(60, 0, 80, 50);

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel17.setText("Snap");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(110, -10, 70, 70);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 510, 60);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(120, 90, 230, 20);

        setSize(new java.awt.Dimension(478, 496));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password1ActionPerformed

    private void username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username1ActionPerformed

    private void blockNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blockNo1ActionPerformed

    private void fname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fname1ActionPerformed

    private void lname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lname1ActionPerformed

    private void yearLevel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearLevel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearLevel1ActionPerformed

    private void course1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course1ActionPerformed

    private void submit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submit1MouseClicked
        // TODO add your handling code here:
        String username, password, lname, fname, course, yearLevel, blockNo;
        username = username1.getText();
        password = String.valueOf(password1.getPassword());
        lname = lname1.getText();
        fname = fname1.getText();
        course = course1.getText();
        yearLevel = yearLevel1.getText();
        blockNo = blockNo1.getText();

//        new resultTest(username,lname,fname).setVisible(false);
        if (username.equals("") | password.equals("") | lname.equals("") | fname.equals("") | course.equals("") | yearLevel.equals("") | blockNo.equals("")) {
            JOptionPane.showMessageDialog(null, "All fields are required\nPlease fill-up all properly");
        } else {
            PreparedStatement ps;
            String query = "INSERT INTO `exam`(`USERNAME`, `PASSWORD`,  `LASTNAME`, `FIRSTNAME`, `YEAR LEVEL`, `COURSE`, `BLOCK No.`) VALUES (?,?,?,?,?,?,?)";

            try {
                ps = myConnection.getConnection().prepareStatement(query);

                ps.setString(1, username);
                ps.setString(2, password);
                ps.setString(3, lname);
                ps.setString(4, fname);
                ps.setString(5, yearLevel);
                ps.setString(6, course);
                ps.setString(7, blockNo);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "You have registered successfully.");
                    studentLogin s = new studentLogin();
                    s.setVisible(true);
                    this.dispose();
                    String query1 = "INSERT INTO `user`(`Username`, `Lastname`, `Firstname`) VALUES (?,?,?)";

                    try {
                        ps = myConnection.getConnection().prepareStatement(query1);

                        ps.setString(1, username);
                        ps.setString(2, lname);
                        ps.setString(3, fname);
                        ps.executeUpdate();
                    } catch (SQLException ex) {
                        Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Username is already exist.");
                //Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_submit1MouseClicked

    private void reset1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset1MouseClicked
        // TODO add your handling code here:
        username1.setText("");
        password1.setText("");
        lname1.setText("");
        fname1.setText("");
        yearLevel1.setText("");
        course1.setText("");
        blockNo1.setText("");

    }//GEN-LAST:event_reset1MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        studentLogin s = new studentLogin();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JTextField blockNo1;
    private javax.swing.JTextField course1;
    private javax.swing.JTextField fname1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lname1;
    private javax.swing.JPasswordField password1;
    private javax.swing.JLabel reset1;
    private javax.swing.JLabel submit1;
    public static javax.swing.JTextField username1;
    private javax.swing.JTextField yearLevel1;
    // End of variables declaration//GEN-END:variables

}
