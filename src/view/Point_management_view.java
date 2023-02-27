/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

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
import java.text.DecimalFormat;
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

/**
 *
 * @author T460s
 */
public class Point_management_view extends javax.swing.JFrame {

    Connection conn = DatabaseConnection.getDatabaseAcc();

    public Point_management_view() {
        initComponents();
        setLocationRelativeTo(null);
        showTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_math = new javax.swing.JTextField();
        jTextField_chemistry = new javax.swing.JTextField();
        jTextField_english = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_physics = new javax.swing.JTextField();
        jTextField_literature = new javax.swing.JTextField();
        jTextField_history = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton_edit = new javax.swing.JButton();
        jButton_search = new javax.swing.JButton();
        jTextField_search = new javax.swing.JTextField();
        jTextField_code_student = new javax.swing.JLabel();
        jLabel_fullname = new javax.swing.JLabel();
        jLabel_value_fullname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setForeground(new java.awt.Color(102, 255, 102));

        jButtonHome.setBackground(new java.awt.Color(0, 204, 51));
        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon-home.png"))); // NOI18N
        jButtonHome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Code Student:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Math:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Chemistry:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("English:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Literature:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Physics:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("History:");

        jTable1.setBackground(new java.awt.Color(204, 255, 255));
        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Name", "Math", "Physics", "Chemistry", "Literature", "English", "History", "Medium"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setGridColor(new java.awt.Color(204, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(140);
        }

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh+24px-131987943331991857.png"))); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton_edit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png"))); // NOI18N
        jButton_edit.setText("Update");
        jButton_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editActionPerformed(evt);
            }
        });

        jButton_search.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btn_search.png"))); // NOI18N
        jButton_search.setText("Search");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        jTextField_code_student.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_code_student.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextField_code_student.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_fullname.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_fullname.setText("Full Name:");

        jLabel_value_fullname.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_value_fullname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_fullname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_english, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_chemistry, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_math, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                        .addComponent(jTextField_history, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField_literature, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField_physics, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jTextField_code_student, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_value_fullname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton_search)
                        .addGap(39, 39, 39)
                        .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_code_student, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_value_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_math, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_physics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_literature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_chemistry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_english, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_history, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_search, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        MainView mainView = new MainView();
        mainView.setVisible(true);
        mainView.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clean();
        JOptionPane.showMessageDialog(this, "Refresh successfully");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();
        showItem(index);
    }//GEN-LAST:event_jTable1MouseClicked

    public boolean checkInput() {
        if (jTextField_math.getText().isEmpty() || jTextField_physics.getText().isEmpty()
                || jTextField_chemistry.getText().isEmpty() || jTextField_literature.getText().isEmpty()
                || jTextField_english.getText().isEmpty() || jTextField_history.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter full information", "error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        try {
            float math = Float.parseFloat(jTextField_math.getText());
            float physics = Float.parseFloat(jTextField_physics.getText());
            float chemistry = Float.parseFloat(jTextField_chemistry.getText());
            float literature = Float.parseFloat(jTextField_literature.getText());
            float english = Float.parseFloat(jTextField_english.getText());
            float history = Float.parseFloat(jTextField_history.getText());
            if(math <0 || math >10 || physics <0 || physics >10 || chemistry <0 || chemistry >10
                || literature <0 || literature >10|| english <0 || english >10|| history <0 || history >10){
                JOptionPane.showMessageDialog(this, "Please enter a number from 0 to 10");
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Wrong input data", "error", JOptionPane.ERROR_MESSAGE);

            return false;
        }
    }

    public int getIdStudent(String code_student) {
        int id = 0;
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT id_student FROM student WHERE code_student = ?");
            pst.setString(1, code_student);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id_student");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Point_management_view.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    private void jButton_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editActionPerformed
        if (checkInput()) {
            String code_student = jTextField_code_student.getText();
            int id_student = getIdStudent(code_student);
            float math = Float.parseFloat(jTextField_math.getText());
            float physics = Float.parseFloat(jTextField_physics.getText());
            float chemistry = Float.parseFloat(jTextField_chemistry.getText());
            float literature = Float.parseFloat(jTextField_literature.getText());
            float english = Float.parseFloat(jTextField_english.getText());
            float history = Float.parseFloat(jTextField_history.getText());
            try {
                //update bang grade
                PreparedStatement pst = conn.prepareStatement("UPDATE grade SET math = ?,physics = ?,"
                        + "chemistry = ?, literature = ?, english = ?, history = ?"
                        + " WHERE id_student = ?");
                pst.setFloat(1, math);
                pst.setFloat(2, physics);
                pst.setFloat(3, chemistry);
                pst.setFloat(4, literature);
                pst.setFloat(5, english);
                pst.setFloat(6, history);
                pst.setInt(7, id_student);
                pst.executeUpdate();
                clean();
                showTable();
            } catch (SQLException ex) {
                Logger.getLogger(Student_managementView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton_editActionPerformed

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
        String search_name = jTextField_search.getText();
        try {
            String sql = "SELECT * FROM grade JOIN student ON grade.id_student = student.id_student WHERE full_name LIKE '%" + search_name + "%'";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                Object[] row = new Object[9];
                row[0] = rs.getString("code_student");
                row[1] = rs.getString("full_name");
                row[2] = rs.getFloat("math");
                row[3] = rs.getFloat("physics");
                row[4] = rs.getFloat("chemistry");
                row[5] = rs.getFloat("literature");
                row[6] = rs.getFloat("english");
                row[7] = rs.getFloat("history");
                float medium = (rs.getFloat("math") + rs.getFloat("physics") + rs.getFloat("chemistry") + rs.getFloat("literature")
                        + rs.getFloat("english") + rs.getFloat("history")) / 6;
                row[8] = medium;
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_managementView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_searchActionPerformed

    public void clean() {
        jTextField_code_student.setText("");
        jLabel_value_fullname.setText("");
        jTextField_math.setText("");
        jTextField_english.setText("");
        jTextField_chemistry.setText("");
        jTextField_history.setText("");
        jTextField_literature.setText("");
        jTextField_physics.setText("");

    }

    private void showItem(int index) {
        // Lấy dũ liệu từ bảng
        String code_student = jTable1.getModel().getValueAt(index, 0).toString();
        String full_name = jTable1.getModel().getValueAt(index, 1).toString();
        String math = jTable1.getModel().getValueAt(index, 2).toString();
        String physics = jTable1.getModel().getValueAt(index, 3).toString();
        String chemistry = jTable1.getModel().getValueAt(index, 4).toString();
        String literature = jTable1.getModel().getValueAt(index, 5).toString();
        String english = jTable1.getModel().getValueAt(index, 6).toString();
        String history = jTable1.getModel().getValueAt(index, 7).toString();
        String medium = jTable1.getModel().getValueAt(index, 8).toString();

        // Chèn dữ liệu vào form
        jTextField_code_student.setText(code_student);
        jLabel_value_fullname.setText(full_name);
        jTextField_math.setText(math);
        jTextField_physics.setText(physics);
        jTextField_chemistry.setText(chemistry);
        jTextField_literature.setText(literature);
        jTextField_english.setText(english);
        jTextField_history.setText(history);
    }

    public ArrayList<GradeModel> getGradeList() {
        ArrayList<GradeModel> grades = new ArrayList<GradeModel>();

        try {
            conn = DatabaseConnection.getDatabaseAcc();
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM grade JOIN student ON grade.id_student = student.id_student");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                GradeModel gradeModel = new GradeModel();
                gradeModel.setCode_student(rs.getString("code_student"));
                gradeModel.setFull_name(rs.getString("full_name"));
                gradeModel.setMath(rs.getFloat("math"));
                gradeModel.setPhysics(rs.getFloat("physics"));
                gradeModel.setChemistry(rs.getFloat("chemistry"));
                gradeModel.setLiterature(rs.getFloat("literature"));
                gradeModel.setEnglish(rs.getFloat("english"));
                gradeModel.setHistory(rs.getFloat("history"));

                grades.add(gradeModel);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_managementView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return grades;
    }

    public void showTable() {
        ArrayList<GradeModel> grades = getGradeList();
//        //sắp xếp lại mảng theo tên
        Collections.sort(grades, new Comparator<GradeModel>() {
            public int compare(GradeModel s1, GradeModel s2) {
                String[] name1 = s1.getFull_name().split(" ");
                String[] name2 = s2.getFull_name().split(" ");
                return name1[name1.length - 1].compareTo(name2[name2.length - 1]);
            }
        });
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object[] row = new Object[9];
        for (int i = 0; i < grades.size(); i++) {
            //gan gia tri tung cot cho hàng thứ i;
            row[0] = grades.get(i).getCode_student();
            row[1] = grades.get(i).getFull_name();
            row[2] = grades.get(i).getMath();
            row[3] = grades.get(i).getPhysics();
            row[4] = grades.get(i).getChemistry();
            row[5] = grades.get(i).getLiterature();
            row[6] = grades.get(i).getEnglish();
            row[7] = grades.get(i).getHistory();
            float medium = (grades.get(i).getMath() + grades.get(i).getPhysics() + grades.get(i).getChemistry()
                    + grades.get(i).getLiterature() + grades.get(i).getEnglish() + grades.get(i).getHistory()) / 6;

            DecimalFormat df = new DecimalFormat("#.##");
            Float roundedNum = Float.parseFloat(df.format(medium));
            row[8] = roundedNum;
            // thêm hàng lên bảng
            model.addRow(row);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Point_management_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButton_edit;
    private javax.swing.JButton jButton_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_fullname;
    private javax.swing.JLabel jLabel_value_fullname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_chemistry;
    private javax.swing.JLabel jTextField_code_student;
    private javax.swing.JTextField jTextField_english;
    private javax.swing.JTextField jTextField_history;
    private javax.swing.JTextField jTextField_literature;
    private javax.swing.JTextField jTextField_math;
    private javax.swing.JTextField jTextField_physics;
    private javax.swing.JTextField jTextField_search;
    // End of variables declaration//GEN-END:variables
}
