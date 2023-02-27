
package view;

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
import java.util.Arrays;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.StudentModel;
import java.util.Collections;

/**
 *
 * @author T460s
 */
public final class Student_managementView extends javax.swing.JFrame {

    Connection conn = DatabaseConnection.getDatabaseAcc();
    int id;

    public Student_managementView() {
        initComponents();
        setLocationRelativeTo(null);
        showTable();
        setcombo_box();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jButtonHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_code_student = new javax.swing.JTextField();
        jTextField_fullname = new javax.swing.JTextField();
        jTextField_email = new javax.swing.JTextField();
        jTextField_adress = new javax.swing.JTextField();
        jComboBox_gender = new javax.swing.JComboBox<>();
        jDateChooser_date = new com.toedter.calendar.JDateChooser();
        jButton_new = new javax.swing.JButton();
        jButton_edit = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_value_student = new javax.swing.JTable();
        jComboBox_class = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton_search = new javax.swing.JButton();
        jTextField_search = new javax.swing.JTextField();
        jButton_dis_class = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student management");
        setBackground(new java.awt.Color(102, 255, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonHome.setBackground(new java.awt.Color(0, 204, 51));
        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon-home.png"))); // NOI18N
        jButtonHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 16, 60, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Code Student:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 93, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Full Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 138, 82, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Date Of Birth:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 181, 82, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Gender:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 225, 58, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Email:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 268, 58, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Adress:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 319, 58, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Class:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 367, 58, -1));

        jTextField_code_student.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextField_code_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 85, 184, -1));
        getContentPane().add(jTextField_fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 133, 184, -1));
        getContentPane().add(jTextField_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 263, 184, -1));
        getContentPane().add(jTextField_adress, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 314, 184, -1));

        jComboBox_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jComboBox_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_genderActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 220, -1, -1));
        getContentPane().add(jDateChooser_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 173, 184, -1));

        jButton_new.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btn_save.png"))); // NOI18N
        jButton_new.setText("Insert");
        jButton_new.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_new.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_newActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 418, 100, 40));

        jButton_edit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png"))); // NOI18N
        jButton_edit.setText("Update");
        jButton_edit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 486, 104, 40));

        jButton_delete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btn_delete.png"))); // NOI18N
        jButton_delete.setText("Delete");
        jButton_delete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 486, 102, 40));

        jTable_value_student.setBackground(new java.awt.Color(204, 255, 255));
        jTable_value_student.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable_value_student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Full Name", "Date Of Birth", "Gender", "Email", "Adress", "Class"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_value_student.setGridColor(new java.awt.Color(204, 255, 255));
        jTable_value_student.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable_value_student.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable_value_student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_value_studentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_value_student);
        if (jTable_value_student.getColumnModel().getColumnCount() > 0) {
            jTable_value_student.getColumnModel().getColumn(0).setMinWidth(25);
            jTable_value_student.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTable_value_student.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable_value_student.getColumnModel().getColumn(3).setPreferredWidth(40);
            jTable_value_student.getColumnModel().getColumn(6).setPreferredWidth(30);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 6, 630, 378));

        jComboBox_class.setToolTipText("");
        getContentPane().add(jComboBox_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 362, 86, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh+24px-131987943331991857.png"))); // NOI18N
        jButton1.setText("Refresh");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 418, 100, 40));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setForeground(new java.awt.Color(153, 255, 153));

        jButton_search.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btn_search.png"))); // NOI18N
        jButton_search.setText("Search");
        jButton_search.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        jTextField_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_searchActionPerformed(evt);
            }
        });

        jButton_dis_class.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_dis_class.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/folders.png"))); // NOI18N
        jButton_dis_class.setText("Display By Class:");
        jButton_dis_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_dis_classActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_dis_class, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(423, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_dis_class, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1))
                .addGap(41, 41, 41))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setcombo_box() {
        PreparedStatement pst;
        jComboBox_class.removeAllItems();
        jComboBox1.removeAllItems();
        try {
            pst = conn.prepareStatement("SELECT class_name FROM class");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                jComboBox_class.addItem(rs.getString(1));
                jComboBox1.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_managementView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jComboBox_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_genderActionPerformed

    public int getId(String code_student) {
        int id = 0;
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT id_student FROM student WHERE code_student = ?");
            pst.setString(1, code_student);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id_student");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_managementView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    public int getId_class(String class_name){
        int id = 0;
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT class_id FROM class WHERE class_name = ?");
            pst.setString(1, class_name);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt("class_id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_managementView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    private void jButton_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editActionPerformed
        if (CheckInput()) {
            try {
                //update bang student
                PreparedStatement pst = conn.prepareStatement("UPDATE student SET code_student = ?,"
                        + "full_name = ?, date_of_birth = ?,"
                        + "gender = ?, email = ?, address = ?,class_id  = ?"
                        + "WHERE id_student = ?");
                pst.setString(1, jTextField_code_student.getText());
                pst.setString(2, jTextField_fullname.getText().toUpperCase());
//               pst.setDate(3, new java.sql.Date(jDateChooser_date.getDate().getTime()););
                java.util.Date selectedDate = jDateChooser_date.getDate();
                java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());
                pst.setDate(3, sqlDate);
                pst.setString(4, jComboBox_gender.getSelectedItem().toString());
                pst.setString(5, jTextField_email.getText());
                pst.setString(6, jTextField_adress.getText());
                int id = getId_class(jComboBox_class.getSelectedItem().toString());
                pst.setInt(7,id );
                pst.setInt(8, this.id);
                pst.executeUpdate();
                clean();
                showTable();
            } catch (SQLException ex) {
                Logger.getLogger(Student_managementView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton_editActionPerformed

    private void jTextField_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_searchActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        MainView mainView = new MainView();
        mainView.setVisible(true);
        mainView.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButton_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_newActionPerformed
        if (CheckInput()) {
            try {
                //thêm dữ liệu bảng student
                PreparedStatement pst = conn.prepareStatement(
                        "INSERT INTO student(code_student,full_name,date_of_birth,gender,email,address,class_id)"
                        + "values(?,?,?,?,?,?,?)");
                pst.setString(1, jTextField_code_student.getText());
                pst.setString(2, jTextField_fullname.getText().toUpperCase());
//               pst.setDate(3, new java.sql.Date(jDateChooser_date.getDate().getTime()););
                java.util.Date selectedDate = jDateChooser_date.getDate();
                java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());
                pst.setDate(3, sqlDate);
                pst.setString(4, jComboBox_gender.getSelectedItem().toString());
                pst.setString(5, jTextField_email.getText());
                pst.setString(6, jTextField_adress.getText());
                int id_class = getId_class(jComboBox_class.getSelectedItem().toString());
                pst.setInt(7,id_class );
                pst.executeUpdate();
                
                //lấy id từ bảng student
                PreparedStatement pst1 = conn.prepareStatement("SELECT id_student FROM student WHERE code_student = ?");
                pst1.setString(1, jTextField_code_student.getText());
                ResultSet rs1 = pst1.executeQuery();
                int id = 0 ;
                if(rs1.next()){
                    id = rs1.getInt("id_student");
                
                }
                
                //them dữ liệu vô bảng grade
                PreparedStatement pst2 = conn.prepareStatement(
                        "INSERT INTO grade(id_student,math,physics,chemistry,literature,english,history)"
                        + "values(?,?,?,?,?,?,?)");
                pst2.setInt(1, id);
                pst2.setFloat(2, 0);
                pst2.setFloat(3, 0);
                pst2.setFloat(4, 0);
                pst2.setFloat(5, 0);
                pst2.setFloat(6, 0);
                pst2.setFloat(7, 0);
                
                pst2.executeUpdate();
                JOptionPane.showMessageDialog(this, "add data successfully");
                clean();
                showTable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

    }//GEN-LAST:event_jButton_newActionPerformed

    public void clean() {
        jTextField_code_student.setText("");
        jTextField_fullname.setText("");
        jDateChooser_date.setDate(new java.sql.Date(System.currentTimeMillis()));
        jComboBox_gender.setSelectedIndex(0);
        jTextField_email.setText("");
        jTextField_adress.setText("");
        jComboBox_class.setSelectedIndex(0);
        
    }

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed

        try {
            PreparedStatement pst = conn.prepareStatement("DELETE FROM student WHERE id_student = ?");
            PreparedStatement pst2 = conn.prepareStatement("DELETE FROM grade WHERE id_student = ?");
            pst.setInt(1,id );
            pst2.setInt(1, id);
            pst.executeUpdate();
            pst2.executeUpdate();
            JOptionPane.showMessageDialog(this, "Delete successfully");
            clean();
            showTable();

        } catch (SQLException ex) {
            Logger.getLogger(Student_managementView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void showItem(int index) {
        // Lấy dũ liệu từ bảng
        String code_student = jTable_value_student.getModel().getValueAt(index, 0).toString();
        String full_name = jTable_value_student.getModel().getValueAt(index, 1).toString();
        String date_of_birth = jTable_value_student.getModel().getValueAt(index, 2).toString();
        String gender = jTable_value_student.getModel().getValueAt(index, 3).toString();
        String email = jTable_value_student.getModel().getValueAt(index, 4).toString();
        String adress = jTable_value_student.getModel().getValueAt(index, 5).toString();
        String class_student = jTable_value_student.getModel().getValueAt(index, 6).toString();

        // Chèn dữ liệu vào form
        jTextField_code_student.setText(code_student);
        jTextField_fullname.setText(full_name);
        try {
            jDateChooser_date.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(date_of_birth));
        } catch (ParseException ex) {
            Logger.getLogger(Student_managementView.class.getName()).log(Level.SEVERE, null, ex);
        }
        jComboBox_gender.setSelectedItem(gender);
        jTextField_email.setText(email);
        jTextField_adress.setText(adress);
        jComboBox_class.setSelectedItem(class_student);
        this.id = getId(code_student);
    }

    private void jTable_value_studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_value_studentMouseClicked
        int index = jTable_value_student.getSelectedRow();

        showItem(index);
    }//GEN-LAST:event_jTable_value_studentMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clean();
        JOptionPane.showMessageDialog(this, "Refresh successful");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
        String search_name = jTextField_search.getText();
        try {
            String sql = "SELECT * FROM student JOIN class ON student.class_id = class.class_id WHERE full_name LIKE '%" + search_name + "%'";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jTable_value_student.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                Object[] row = new Object[7];
                row[0] = rs.getString("code_student");
                row[1] = rs.getString("full_name");
                row[2] = rs.getDate("date_of_birth");
                row[3] = rs.getString("gender");
                row[4] = rs.getString("email");
                row[5] = rs.getString("address");
                row[6] = rs.getString("class_name");
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_managementView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jButton_dis_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_dis_classActionPerformed
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM student JOIN class ON student.class_id = class.class_id WHERE student.class_id = ?");
            int id = getId_class(jComboBox1.getSelectedItem().toString());
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jTable_value_student.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                Object[] row = new Object[7];
                row[0] = rs.getString("code_student");
                row[1] = rs.getString("full_name");
                row[2] = rs.getDate("date_of_birth");
                row[3] = rs.getString("gender");
                row[4] = rs.getString("email");
                row[5] = rs.getString("address");
                row[6] = rs.getString("class_name");
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_managementView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_dis_classActionPerformed

    public boolean CheckInput() {
        if (jTextField_code_student.getText().isEmpty()
                || jTextField_fullname.getText().isEmpty()
                || jTextField_adress.getText().isEmpty()
                || jTextField_email.getText().isEmpty()
                || jDateChooser_date == null) {
            JOptionPane.showMessageDialog(this, "Please enter full information","error",JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            String email = jTextField_email.getText();

                // Tạo một biểu thức chính quy để kiểm tra định dạng email
            String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

            // Kiểm tra xem địa chỉ email có đúng định dạng hay không
            if (!email.matches(emailRegex)) {
                // Nếu không đúng định dạng, hiển thị thông báo lỗi
                JOptionPane.showMessageDialog(null, "Email invalidate","error",JOptionPane.ERROR_MESSAGE);
                return false;
            }
            //kiểm tra xem code student đã tồn tại hay chưa
            try {
                PreparedStatement pst = conn.prepareStatement("SELECT code_student FROM student WHERE code_student = ?");
                pst.setString(1, jTextField_code_student.getText());
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "code student already exists");
                    return false;
                }
            } catch (Exception e) {
            }

            return true;
        }
    }

    public ArrayList<StudentModel> getSinhVienList() {
        ArrayList<StudentModel> students = new ArrayList<StudentModel>();

        try {
            conn = DatabaseConnection.getDatabaseAcc();
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM student JOIN class ON student.class_id = class.class_id");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                StudentModel studentModel = new StudentModel();
                studentModel.setId_student(rs.getInt("id_student"));
                studentModel.setCode_student(rs.getString("code_student"));
                studentModel.setFul_name(rs.getString("full_name"));
                studentModel.setDate_of_birth(rs.getDate("date_of_birth"));
                studentModel.setGender(rs.getString("gender"));
                studentModel.setEmail(rs.getString("email"));
                studentModel.setAddress(rs.getString("address"));
                studentModel.setClass_name(rs.getString("class_name"));

                students.add(studentModel);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_managementView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    public void showTable() {
        ArrayList<StudentModel> students = getSinhVienList();
        //sắp xếp lại student theo tên
        Collections.sort(students, new Comparator<StudentModel>() {
            public int compare(StudentModel s1, StudentModel s2) {
                String[] name1 = s1.getFul_name().split(" ");
                String[] name2 = s2.getFul_name().split(" ");
                return name1[name1.length - 1].compareTo(name2[name2.length - 1]);
            }
        });
        
        DefaultTableModel model = (DefaultTableModel) jTable_value_student.getModel();
        model.setRowCount(0);
        Object[] row = new Object[7];
        for (int i = 0; i < students.size(); i++) {
            row[0] = students.get(i).getCode_student();
            row[1] = students.get(i).getFul_name();
            row[2] = students.get(i).getDate_of_birth();
            row[3] = students.get(i).getGender();
            row[4] = students.get(i).getEmail();
            row[5] = students.get(i).getAddress();
            row[6] = students.get(i).getClass_name();
            model.addRow(row);
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Student_managementView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_managementView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_managementView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_managementView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_managementView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_dis_class;
    private javax.swing.JButton jButton_edit;
    private javax.swing.JButton jButton_new;
    private javax.swing.JButton jButton_search;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox_class;
    private javax.swing.JComboBox<String> jComboBox_gender;
    private com.toedter.calendar.JDateChooser jDateChooser_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_value_student;
    private javax.swing.JTextField jTextField_adress;
    private javax.swing.JTextField jTextField_code_student;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_fullname;
    private javax.swing.JTextField jTextField_search;
    // End of variables declaration//GEN-END:variables

}
