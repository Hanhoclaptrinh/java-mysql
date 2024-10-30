package PresentationLayer;

import ConnectData.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        showData(DAL.findAll());
    }
    
    private int index = -1;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtMajor = new javax.swing.JTextField();
        txtScore = new javax.swing.JTextField();
        cboGender = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        tableScrollPane = new javax.swing.JScrollPane();
        StudentTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Management");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Age");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Major");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Score");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtAge.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });

        txtMajor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMajor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMajorKeyTyped(evt);
            }
        });

        txtScore.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtScore.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtScoreKeyTyped(evt);
            }
        });

        cboGender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        cboGender.setPreferredSize(new java.awt.Dimension(72, 26));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnFind.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        tableScrollPane.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        StudentTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        StudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Gender", "Major", "Score"
            }
        ));
        StudentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentTableMouseClicked(evt);
            }
        });
        tableScrollPane.setViewportView(StudentTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboGender, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(cboGender, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(txtMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtScore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // btnRefresh
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        showData(DAL.findAll());
        ClearField();
    }//GEN-LAST:event_btnRefreshActionPerformed

    // btnSave
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (isEmpty()) 
            return;
        
        Student student = new Student();
        student.setName(txtName.getText());
        student.setAge(Integer.parseInt(txtAge.getText()));
        student.setGender(cboGender.getSelectedIndex());
        student.setMajor(txtMajor.getText());
        student.setScore(Float.parseFloat(txtScore.getText()));
        DAL.insertStudent(student);
        JOptionPane.showMessageDialog(null, "Add Successful");
        showData(DAL.findAll());
        ClearField();
    }//GEN-LAST:event_btnSaveActionPerformed

    // btnDelete
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (isEmpty())
            return;
        
        Student student = new Student();
        student.setName(txtName.getText());
        DAL.deleteStudent(student);
        JOptionPane.showMessageDialog(null, "Delete Successful");
        showData(DAL.findAll());
        ClearField();
    }//GEN-LAST:event_btnDeleteActionPerformed

    // btnUpdate
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (isEmpty())
            return;
        
        Student student = new Student();
        student.setName(txtName.getText());
        student.setAge(Integer.parseInt(txtAge.getText()));
        student.setGender(cboGender.getSelectedIndex());
        student.setMajor(txtMajor.getText());
        student.setScore(Float.parseFloat(txtScore.getText()));
        DAL.updateStudent(student);
        JOptionPane.showMessageDialog(null, "Update Successful");
        showData(DAL.findAll());
        ClearField();
    }//GEN-LAST:event_btnUpdateActionPerformed

    // btnFind
    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        if (txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name must not be empty");
            requestFocus();
            return;
        }
        
        Student student = new Student();
        student.setName(txtName.getText());
        showData(DAL.findByName(student));
    }//GEN-LAST:event_btnFindActionPerformed

    // btnExit
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Confirm Exit ?");
        if (result == 0)
            System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    // prevent invalid charracter
    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c == '\b' || c == KeyEvent.VK_SPACE))
            evt.consume();
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '\b'))
            evt.consume();
    }//GEN-LAST:event_txtAgeKeyTyped

    private void txtMajorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMajorKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c == '\b' || c == KeyEvent.VK_SPACE))
            evt.consume();
    }//GEN-LAST:event_txtMajorKeyTyped

    private void txtScoreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtScoreKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.' || c == '\b'))
            evt.consume();
    }//GEN-LAST:event_txtScoreKeyTyped

    // display infor onto control
    private void StudentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentTableMouseClicked
        index = StudentTable.getSelectedRow();
        txtName.setText(StudentTable.getValueAt(index, 1).toString());
        txtAge.setText(StudentTable.getValueAt(index, 2).toString());
        String gender = StudentTable.getValueAt(index, 3).toString();
        cboGender.setSelectedItem(gender);
        txtMajor.setText(StudentTable.getValueAt(index, 4).toString());
        txtScore.setText(StudentTable.getValueAt(index, 5).toString());
    }//GEN-LAST:event_StudentTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable StudentTable;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtMajor;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtScore;
    // End of variables declaration//GEN-END:variables
    
    // show all
    public void showData(List<Student> students) {
        List<Student> lst_Student = new ArrayList<>();
        lst_Student = students;
        DefaultTableModel tableModel;
        StudentTable.getModel();
        tableModel = (DefaultTableModel) StudentTable.getModel();
        tableModel.setRowCount(0);
        lst_Student.forEach(o -> {
                String gender;
                if (o.getGender() == 0)
                    gender = "Male";
                else 
                    gender = "Female";
                tableModel.addRow(new Object[] {
            o.getId(), o.getName(), o.getAge(), gender, o.getMajor(), o.getScore()
        });
        });
    }
    
    // clear field
    public void ClearField() {
        txtName.setText("");
        txtAge.setText("");
        cboGender.setSelectedIndex(0);
        txtMajor.setText("");
        txtScore.setText("");
    }
    
    // check empty field
    public boolean isEmpty() {
        if (txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name must not be empty");
            requestFocus();
            return true;
        }
        if (txtAge.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Age must not be empty");
            return true;
        }
        if (txtMajor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Major must not be empty");
            return true;
        }
        if (txtScore.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Score must not be empty");
            return true;
        }
        return false;
    }
}
