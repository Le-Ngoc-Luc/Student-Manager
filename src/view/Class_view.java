package view;

import com.mysql.cj.protocol.Resultset;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import databases.DatabaseConnection;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.GradeModel;
import model.StudentModel;

public class Class_view extends javax.swing.JFrame {

    private int classId;

    public Class_view() {
        initComponents();
        setLocationRelativeTo(null);
        showTableClass();
        setcombo_box();
    }

    public void setcombo_box() {
        PreparedStatement pst;
        jComboBox1.removeAllItems();
        try {
            pst = conn.prepareStatement("SELECT class_name FROM class");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                jComboBox1.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_managementView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Class = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_class_students = new javax.swing.JTable();
        jButton_home = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_ClassName = new javax.swing.JTextField();
        jButton_edit_class = new javax.swing.JButton();
        jButton_delete_class = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton_edit_student = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel_name_student = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jTable_Class.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Class", "Number Of Student"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Class.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ClassMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Class);

        jTable_class_students.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name student", "Class"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_class_students.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_class_studentsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_class_students);

        jButton_home.setBackground(new java.awt.Color(0, 255, 51));
        jButton_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon-home.png"))); // NOI18N
        jButton_home.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_homeActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Class");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Class Name:");

        jButton_edit_class.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_edit_class.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png"))); // NOI18N
        jButton_edit_class.setText("Edit");
        jButton_edit_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_edit_classActionPerformed(evt);
            }
        });

        jButton_delete_class.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_delete_class.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btn_delete.png"))); // NOI18N
        jButton_delete_class.setText("Delete");
        jButton_delete_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_delete_classActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btn_add.png"))); // NOI18N
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_edit_class, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_delete_class))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField_ClassName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_ClassName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_edit_class, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_delete_class, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Student");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Name Student:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Class:");

        jButton_edit_student.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_edit_student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png"))); // NOI18N
        jButton_edit_student.setText("Edit");
        jButton_edit_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_edit_studentActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_name_student, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_edit_student, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_name_student, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton_edit_student, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_home, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_home)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );

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
    Connection conn = DatabaseConnection.getDatabaseAcc();

    private void jButton_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_homeActionPerformed
        MainView mainView = new MainView();
        mainView.setVisible(true);
        mainView.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_homeActionPerformed

    public void showTableStudent(String class_name) {
        try {
            PreparedStatement pst = conn.prepareStatement("Select * from student JOIN class "
                    + "ON student.class_id = class.class_id WHERE class_name = ?");
            pst.setString(1, class_name);
            ResultSet rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) jTable_class_students.getModel();
            model.setRowCount(0);
            Object[] row = new Object[2];
            while (rs.next()) {
                row[0] = rs.getString("full_name");
                row[1] = rs.getString("class_name");

                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Class_view.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jTable_ClassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ClassMouseClicked
        int index = jTable_Class.getSelectedRow();
        String class_name = jTable_Class.getModel().getValueAt(index, 0).toString();
        showTableStudent(class_name);
        jTextField_ClassName.setText(class_name);
        this.classId = getClassId(class_name);
    }//GEN-LAST:event_jTable_ClassMouseClicked
    public int getClassId(String class_name) {
        int id = 0;
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT class_id FROM class WHERE class_name = ?");
            pst.setString(1, class_name);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt("class_id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Class_view.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable_class_studentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_class_studentsMouseClicked
        int index = jTable_class_students.getSelectedRow();
        String student_name = jTable_class_students.getModel().getValueAt(index, 0).toString();
        String class_name = jTable_class_students.getModel().getValueAt(index, 1).toString();
        jLabel_name_student.setText(student_name);
        jComboBox1.setSelectedItem(class_name);
    }//GEN-LAST:event_jTable_class_studentsMouseClicked

    private void jButton_edit_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_edit_classActionPerformed
        if (checkInput()) {
            try {
                PreparedStatement pst = conn.prepareStatement("UPDATE class SET class_name = ? WHERE class_id = ?");
                pst.setString(1, jTextField_ClassName.getText().toUpperCase());
                pst.setInt(2, classId);
                pst.executeLargeUpdate();
                setcombo_box();
                showTableClass();
                showTableStudent(jTextField_ClassName.getText());
            } catch (SQLException ex) {
                Logger.getLogger(Class_view.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton_edit_classActionPerformed


    private void jButton_edit_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_edit_studentActionPerformed
        try {
            PreparedStatement pst = conn.prepareStatement("UPDATE student SET class_id = ? WHERE full_name = ?");
            int id = getClassId(jComboBox1.getSelectedItem().toString());
            pst.setInt(1, id);
            String full_name = jLabel_name_student.getText().trim();
            pst.setString(2, full_name);
            pst.executeUpdate();
            showTableClass();
            showTableStudent(jComboBox1.getSelectedItem().toString());
        } catch (SQLException ex) {
            Logger.getLogger(Class_view.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_edit_studentActionPerformed

    private void jButton_delete_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_delete_classActionPerformed
        int count = countStudent(classId);
        if (count > 0) {
            JOptionPane.showMessageDialog(this, "Need to change classes for all students");
        } else {
            try {
                PreparedStatement pst = conn.prepareStatement("DELETE FROM class WHERE class_id = ?");
                pst.setInt(1, classId);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Delete successfully");
                showTableClass();
                setcombo_box();
            } catch (SQLException ex) {
                Logger.getLogger(Class_view.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton_delete_classActionPerformed

    public boolean checkInput() {
        if (jTextField_ClassName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter full information", "error", JOptionPane.ERROR_MESSAGE);

            return false;
        }
        String class_name = jTextField_ClassName.getText().toUpperCase();
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT class_name FROM class");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                if (class_name.equals(rs.getString("class_name"))) {
                    JOptionPane.showMessageDialog(this, "Class already exists");
                    return false;
                }
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Class_view.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (checkInput()) {
            try {
                PreparedStatement pst = conn.prepareStatement("INSERT INTO class(class_name)VALUES(?)");
                pst.setString(1, jTextField_ClassName.getText().toUpperCase());
                pst.executeUpdate();
                showTableClass();
                setcombo_box();
            } catch (SQLException ex) {
                Logger.getLogger(Class_view.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public int countStudent(int class_id) {
        int count = 0;
        try {
            PreparedStatement pst = conn.prepareStatement("Select * from student WHERE class_id = ?");
            pst.setInt(1, class_id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                count++;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Class_view.class.getName()).log(Level.SEVERE, null, ex);
        }

        return count;
    }

    public void showTableClass() {
        try {
            PreparedStatement pst = conn.prepareStatement("Select * from class");
            ResultSet rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) jTable_Class.getModel();
            model.setRowCount(0);
            Object[] row = new Object[2];
            int count = 0;
            while (rs.next()) {
                row[0] = rs.getString("class_name");
                count = countStudent(rs.getInt("class_id"));
                row[1] = count;
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Class_view.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Class_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_delete_class;
    private javax.swing.JButton jButton_edit_class;
    private javax.swing.JButton jButton_edit_student;
    private javax.swing.JButton jButton_home;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_name_student;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Class;
    private javax.swing.JTable jTable_class_students;
    private javax.swing.JTextField jTextField_ClassName;
    // End of variables declaration//GEN-END:variables
}
