/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.tihtih.teacher;

import com.jp.tihtih.root.*;
import com.jp.tihtih.studentmanagementsystem.Jdbc;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class StudentAdd2 extends javax.swing.JFrame {

    /**
     * Creates new form StudentAdd
     */
    public StudentAdd2() {
        initComponents();
    }

    //編集の基本データを表示
    public void setDate(Student student) {
        jTextField1.setText(String.valueOf(student.getId()));
        jComboBox1.setSelectedItem(student.getAclass());
        jTextField2.setText(student.getName());
        jTextField3.setText(student.getPass());
        if("男".equals(student.getSex())){
            jRadioButton1.setSelected(true);
        }else if("女".equals(student.getSex())){
            jRadioButton2.setSelected(true);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("学生情報追加/編集");

        jLabel1.setText("学生ID");

        jLabel2.setText("クラス");

        jLabel3.setText("名前");

        jLabel4.setText("性別");

        jButton1.setText("追加");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("編集");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("キャンセル");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "なし", "Aクラス", "Bクラス", "Cクラス", "Dクラス" }));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("男");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("女");

        jLabel10.setForeground(new java.awt.Color(255, 51, 0));

        jLabel11.setText("パスワード");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jRadioButton1)
                                        .addGap(45, 45, 45)
                                        .addComponent(jRadioButton2)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
   追加
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Student student = new Student();

        StudentsDate sd = new StudentsDate();

        Jdbc jdbc = new Jdbc();
        try {
            jdbc.getDbcom();

            //null判断
            if (jTextField1.getText().isEmpty()) {
                jLabel10.setText("IDを空欄にしてはいけません！");
                return;
            } else if (Integer.parseInt(jTextField1.getText()) < 1000 || Integer.parseInt(jTextField1.getText()) >= 10000) {
                jLabel10.setText("IDは1001から9999以内です！");
                return;

                //IDが重複しているかを判断する
            } else if (jdbc.checkStudentId(Integer.parseInt(jTextField1.getText()))) {
                jLabel10.setText("IDがすでに存在しています！");
                return;
            } else {
                student.setId(Integer.parseInt(jTextField1.getText()));
            }

            //クラス判断
            if ("なし".equals(jComboBox1.getSelectedItem().toString())) {
                jLabel10.setText("クラスを選択してください！");
                return;
            } else {
                student.setAclass(jComboBox1.getSelectedItem().toString());
            }

            //null判断
            if (jTextField2.getText().isEmpty()) {
                jLabel10.setText("名前を空欄にしてはいけません！");
                return;
            } else {
                student.setName(jTextField2.getText());
            }

            if (jTextField3.getText().isEmpty()) {
                jLabel10.setText("パスワードを設定してください！");
                return;
            } else if (jdbc.checkPasss(jTextField3.getText())) {
                jLabel10.setText("パスワードが重複しています！");
                return;
            } else {
                student.setPass(jTextField3.getText());
            }

            //選択しているか判断
            if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) {
                jLabel10.setText("性別を選択していません！");
                return;
            }
            if (jRadioButton1.isSelected()) {
                student.setSex("男");
            } else {
                student.setSex("女");
            }

            jdbc.insertStudent(student);
            jdbc.insertStudentUser(Integer.parseInt(jTextField1.getText()), jTextField3.getText());

            sd.readeStudents();

            this.dispose();
            sd.setVisible(true);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentAdd2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentAdd2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (jdbc != null) {
                try {
                    jdbc.closeDbcom();
                } catch (SQLException ex) {
                    Logger.getLogger(TeachersDate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    /*
    編集
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Student student = new Student();

        StudentsDate sd = new StudentsDate();

        Jdbc jdbc = new Jdbc();
        try {
            jdbc.getDbcom();

            //null判断
            if (jTextField1.getText().isEmpty()) {
                jLabel10.setText("IDを空欄にしてはいけません！");
                return;
            } else if (Integer.parseInt(jTextField1.getText()) < 1000 || Integer.parseInt(jTextField1.getText()) >= 10000) {
                jLabel10.setText("IDは1001から9999以内です！");
                return;

            } else {
                student.setId(Integer.parseInt(jTextField1.getText()));
            }

            //クラス判断
            if ("なし".equals(jComboBox1.getSelectedItem().toString())) {
                jLabel10.setText("クラスを選択してください！");
                return;
            } else {
                student.setAclass(jComboBox1.getSelectedItem().toString());
            }

            //null判断
            if (jTextField2.getText().isEmpty()) {
                jLabel10.setText("名前を空欄にしてはいけません！");
                return;
            } else {
                student.setName(jTextField2.getText());
            }

            //編集時重複おｋ
            if (jTextField3.getText().isEmpty()) {
                jLabel10.setText("パスワードを設定してください！");
                return;
            } else {
                student.setPass(jTextField3.getText());
            }

            //選択しているか判断
            if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) {
                jLabel10.setText("性別を選択していません！");
                return;
            }
            if (jRadioButton1.isSelected()) {
                student.setSex("男");
            } else {
                student.setSex("女");
            }

            jdbc.updateStudent(student);
            jdbc.updateStudentUser(jTextField1.getText(), jTextField3.getText());
            
            sd.readeStudents();

            this.dispose();
            sd.setVisible(true);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentAdd2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentAdd2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (jdbc != null) {
                try {
                    jdbc.closeDbcom();
                } catch (SQLException ex) {
                    Logger.getLogger(TeachersDate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed
    /*
    キャンセル
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        StudentsDate sd = new StudentsDate();
//        asd.readeStudents();
        this.dispose();
        sd.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentAdd2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentAdd2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentAdd2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentAdd2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentAdd2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
