/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.tihtih.root;

import com.jp.tihtih.studentmanagementsystem.Jdbc;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class TeacherAdd extends javax.swing.JFrame {

    /**
     * Creates new form TeacherAdd
     */
    public TeacherAdd() {
        initComponents();
    }

    //編集画面に既定情報を記載
    public void getDate(Teacher teacher) {

        jTextField1.setText(String.valueOf(teacher.getId()));
        jTextField2.setText(teacher.getName());
        jTextField3.setText(teacher.getPass());
        jComboBox1.setSelectedItem(teacher.getSubject());
        if ("男".equals(teacher.getSex())) {
            jRadioButton1.setSelected(true);
        } else if ("女".equals(teacher.getSex())) {
            jRadioButton2.setSelected(true);
        }
        System.out.println(teacher.getId() + "," + teacher.getName() + "," + teacher.getSex());
    }

    //編集画面に既定情報を記載
    public void setClass(List<Aclass> list) {
        for (Aclass aclass : list) {
            if ("Aクラス".equals(aclass.getClassName())) {
                jCheckBox1.setSelected(true);
            } else if ("Bクラス".equals(aclass.getClassName())) {
                jCheckBox2.setSelected(true);
            } else if ("Cクラス".equals(aclass.getClassName())) {
                jCheckBox3.setSelected(true);
            } else if ("Dクラス".equals(aclass.getClassName())) {
                jCheckBox4.setSelected(true);

            }
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
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("先生新規登録/編集");

        jLabel1.setText("先生ID");

        jLabel2.setText("名前");

        jLabel3.setText("クラス");

        jLabel4.setText("科目");

        jLabel6.setText("性別");

        jLabel5.setText("パスワード");

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "なし", "国語", "数学", "英語", "理科", "歴史" }));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("男");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("女");

        jLabel8.setForeground(new java.awt.Color(255, 51, 0));

        jCheckBox1.setText("Aクラス");

        jCheckBox2.setText("Bクラス");

        jCheckBox3.setText("Cクラス");

        jCheckBox4.setText("Dクラス");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(19, 19, 19)
                .addComponent(jButton2)
                .addGap(19, 19, 19)
                .addComponent(jButton3)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    追加
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        Jdbc jdbc = new Jdbc();
        Teacher teacher = new Teacher();
        List<Aclass> list = new ArrayList<>();
        Aclass aclass = null;
        TeachersDate td = null;

        try {
            jdbc.getDbcom();

            if (jTextField1.getText().isEmpty()) {
                jLabel8.setText("先生IDを入力してください！");
                return;
            } else if (Integer.parseInt(jTextField1.getText()) < 100 || Integer.parseInt(jTextField1.getText()) >= 1000) {
                jLabel8.setText("先生IDは101～999以内です！");
                return;

                //追加するとき先生のIDが重複しているかを判断
            } else if (jdbc.checkTeacherID(Integer.parseInt(jTextField1.getText()))) {
                jLabel8.setText("先生IDすでに存在しています！");
                return;
            } else {
                teacher.setId(Integer.parseInt(jTextField1.getText()));
            }

            if (jTextField2.getText().isEmpty()) {
                jLabel8.setText("名前を入力してください！");
                return;
            } else {
                teacher.setName(jTextField2.getText());
            }

            if (jTextField3.getText().isEmpty()) {
                jLabel8.setText("パスワードを設定してください！");
                return;
            } //            else if (jdbc.checkPass(jTextField3.getText())) {
            //                jLabel8.setText("パスワードが重複しています！");
            //                return;
            //            } 
            else {
                teacher.setPass(jTextField3.getText());
            }

            if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) {
                jLabel8.setText("性別を選択していません！");
                return;
            }

            if ("なし".equals(jComboBox1.getSelectedItem().toString())) {
                jLabel8.setText("科目を選んでください！");
                return;
            } else {
                teacher.setSubject(jComboBox1.getSelectedItem().toString());
            }

            if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) {
                jLabel8.setText("性別を選択していません！");
                return;
            }

            if (jRadioButton1.isSelected()) {
                teacher.setSex("男");
            } else {
                teacher.setSex("女");
            }

            //t_classにクラス情報を追加
            jdbc.deleteClass(Integer.parseInt(jTextField1.getText()));
            //t_classにクラス情報を編集
            if (jCheckBox1.isSelected()) {
                if (jdbc.checkClass(jCheckBox1.getText(), jComboBox1.getSelectedItem().toString())) {
                    aclass = new Aclass();
                    aclass.setTeacherId(Integer.parseInt(jTextField1.getText()));
                    aclass.setClassName(jCheckBox1.getText());
                    aclass.setSubject(teacher.getSubject());
                    jdbc.insertClass(aclass);
                } else {
                    jLabel8.setText(teacher.getSubject() + "先生すでにいます！");
                }
            }
            if (jCheckBox2.isSelected()) {
                if (jdbc.checkClass(jCheckBox2.getText(), jComboBox1.getSelectedItem().toString())) {
                    aclass = new Aclass();
                    aclass.setTeacherId(Integer.parseInt(jTextField1.getText()));
                    aclass.setClassName(jCheckBox2.getText());
                    aclass.setSubject(teacher.getSubject());
                    jdbc.insertClass(aclass);
                } else {
                    jLabel8.setText(teacher.getSubject() + "先生すでにいます！");
                }
            }
            if (jCheckBox3.isSelected()) {
                if (jdbc.checkClass(jCheckBox3.getText(), jComboBox1.getSelectedItem().toString())) {
                    aclass = new Aclass();
                    aclass.setTeacherId(Integer.parseInt(jTextField1.getText()));
                    aclass.setClassName(jCheckBox3.getText());
                    aclass.setSubject(teacher.getSubject());
                    jdbc.insertClass(aclass);
                } else {
                    jLabel8.setText(teacher.getSubject() + "先生すでにいます！");
                }
            }
            if (jCheckBox4.isSelected()) {
                if (jdbc.checkClass(jCheckBox4.getText(), jComboBox1.getSelectedItem().toString())) {
                    aclass = new Aclass();
                    aclass.setTeacherId(Integer.parseInt(jTextField1.getText()));
                    aclass.setClassName(jCheckBox4.getText());
                    aclass.setSubject(teacher.getSubject());
                    jdbc.insertClass(aclass);
                } else {
                    jLabel8.setText(teacher.getSubject() + "先生すでにいます！");
                }

            }

            //先生情報を追加
            jdbc.insertTeacher(teacher);

            //loginIDとパスワードを追加
            jdbc.insertTeacherUser(jTextField1.getText(), jTextField3.getText());

            td = new TeachersDate();

            this.dispose();
            td.setVisible(true);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeacherAdd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TeacherAdd.class.getName()).log(Level.SEVERE, null, ex);
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

        Jdbc jdbc = new Jdbc();
        Teacher teacher = new Teacher();
        TeachersDate td = new TeachersDate();
        Aclass aclass = null;

        try {
            jdbc.getDbcom();

            if (jTextField1.getText().isEmpty()) {
                jLabel8.setText("先生IDを入力してください！");
                return;
            } else if (Integer.parseInt(jTextField1.getText()) < 100 || Integer.parseInt(jTextField1.getText()) >= 1000) {
                jLabel8.setText("先生IDは101～999以内です！");
                return;
            } else {
                teacher.setId(Integer.parseInt(jTextField1.getText()));
            }

            if (jTextField2.getText().isEmpty()) {
                jLabel8.setText("名前を入力してください！");
                return;
            } else {
                teacher.setName(jTextField2.getText());
            }

            if (jTextField3.getText().isEmpty()) {
                jLabel8.setText("パスワードを設定してください！");
                return;
            } else {
                teacher.setPass(jTextField3.getText());
            }

            if ("なし".equals(jComboBox1.getSelectedItem().toString())) {
                jLabel8.setText("科目を選んでください！");
                return;
            } else {
                teacher.setSubject(jComboBox1.getSelectedItem().toString());
            }

            if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) {
                jLabel8.setText("性別を選択していません！");
                return;
            }
            if (jRadioButton1.isSelected()) {
                teacher.setSex("男");
            } else {
                teacher.setSex("女");
            }

            //先に一回削除してから
            jdbc.deleteClass(Integer.parseInt(jTextField1.getText()));
            //t_classにクラス情報を編集
            if (jCheckBox1.isSelected()) {
                aclass = new Aclass();
                aclass.setTeacherId(Integer.parseInt(jTextField1.getText()));
                aclass.setClassName(jCheckBox1.getText());
                aclass.setSubject(teacher.getSubject());
                jdbc.insertClass(aclass);
            }
            if (jCheckBox2.isSelected()) {
                aclass = new Aclass();
                aclass.setTeacherId(Integer.parseInt(jTextField1.getText()));
                aclass.setClassName(jCheckBox2.getText());
                aclass.setSubject(teacher.getSubject());
                jdbc.insertClass(aclass);
            }
            if (jCheckBox3.isSelected()) {
                aclass = new Aclass();
                aclass.setTeacherId(Integer.parseInt(jTextField1.getText()));
                aclass.setClassName(jCheckBox3.getText());
                aclass.setSubject(teacher.getSubject());
                jdbc.insertClass(aclass);
            }
            if (jCheckBox4.isSelected()) {
                aclass = new Aclass();
                aclass.setTeacherId(Integer.parseInt(jTextField1.getText()));
                aclass.setClassName(jCheckBox4.getText());
                aclass.setSubject(teacher.getSubject());
                jdbc.insertClass(aclass);

            }

            //先生データを変更
            jdbc.updateTeacher(teacher);

            //loginIDとパスワードを更新
            jdbc.updateTeacherUser(jTextField1.getText(), jTextField3.getText());

            td.readTeacherDb();
            this.dispose();
            td.setVisible(true);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeacherAdd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TeacherAdd.class.getName()).log(Level.SEVERE, null, ex);
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
        TeachersDate teacher = new TeachersDate();
        this.dispose();
        teacher.setVisible(true);
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
            java.util.logging.Logger.getLogger(TeacherAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
