package GUI;

import DAL.ConnectData;
import NhanVien.NhanVien;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Quanlynhanvien extends javax.swing.JFrame {
    private int index = -1;
    
    public Quanlynhanvien() {
        initComponents();
        setTitle("Quản lý nhân viên");
        setVisible(true);
        setLocationRelativeTo(null);
        show(ConnectData.hienThi());
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGender = new javax.swing.ButtonGroup();
        btnGroupOvertime = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        radMale = new javax.swing.JRadioButton();
        radOther = new javax.swing.JRadioButton();
        radFemale = new javax.swing.JRadioButton();
        cboPos = new javax.swing.JComboBox<>();
        spinDOB = new javax.swing.JSpinner();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        spinHireDate = new javax.swing.JSpinner();
        txtWorkHour = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        txtBonus = new javax.swing.JTextField();
        txtAllowance = new javax.swing.JTextField();
        radYes = new javax.swing.JRadioButton();
        radNo = new javax.swing.JRadioButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        setName("form"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mã nhân viên");
        jLabel1.setRequestFocusEnabled(false);
        jLabel1.setVerifyInputWhenFocusTarget(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Họ và tên");
        jLabel2.setRequestFocusEnabled(false);
        jLabel2.setVerifyInputWhenFocusTarget(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ngày sinh");
        jLabel3.setRequestFocusEnabled(false);
        jLabel3.setVerifyInputWhenFocusTarget(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Giới tính");
        jLabel4.setRequestFocusEnabled(false);
        jLabel4.setVerifyInputWhenFocusTarget(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Chức vụ");
        jLabel5.setRequestFocusEnabled(false);
        jLabel5.setVerifyInputWhenFocusTarget(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Địa chỉ");
        jLabel6.setRequestFocusEnabled(false);
        jLabel6.setVerifyInputWhenFocusTarget(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Điện thoại");
        jLabel7.setRequestFocusEnabled(false);
        jLabel7.setVerifyInputWhenFocusTarget(false);

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        radMale.setText("Nam");

        radOther.setText("Khác");

        radFemale.setText("Nữ");

        cboPos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboPos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giám đốc điều hành", "Trưởng phòng nhân sự ", "Kỹ sư phần mềm", "Chuyên viên marketing ", "Nhân viên bán hàng ", "Trưởng phòng tài chính ", "Chuyên viên kế toán", "Nhân viên hỗ trợ khách hàng ", "Trưởng phòng sản xuất", "Kỹ sư cơ khí", "Chuyên viên phân tích dữ liệu ", "Nhân viên thiết kế đồ họa ", "Trưởng phòng công nghệ thông tin", "Giám sát chất lượng", "Trưởng phòng pháp lý ", "Thực tập sinh", "Culi quét rác" }));

        spinDOB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spinDOB.setModel(new javax.swing.SpinnerDateModel());

        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Email");
        jLabel8.setRequestFocusEnabled(false);
        jLabel8.setVerifyInputWhenFocusTarget(false);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ngày vào làm");
        jLabel9.setRequestFocusEnabled(false);
        jLabel9.setVerifyInputWhenFocusTarget(false);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Giờ làm");
        jLabel10.setRequestFocusEnabled(false);
        jLabel10.setVerifyInputWhenFocusTarget(false);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Lương");
        jLabel11.setRequestFocusEnabled(false);
        jLabel11.setVerifyInputWhenFocusTarget(false);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Thưởng");
        jLabel12.setRequestFocusEnabled(false);
        jLabel12.setVerifyInputWhenFocusTarget(false);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Trợ cấp");
        jLabel13.setRequestFocusEnabled(false);
        jLabel13.setVerifyInputWhenFocusTarget(false);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Làm ngoài giờ");
        jLabel14.setRequestFocusEnabled(false);
        jLabel14.setVerifyInputWhenFocusTarget(false);

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        spinHireDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spinHireDate.setModel(new javax.swing.SpinnerDateModel());

        txtWorkHour.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtWorkHour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWorkHourKeyTyped(evt);
            }
        });

        txtSalary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalaryKeyTyped(evt);
            }
        });

        txtBonus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBonus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBonusKeyTyped(evt);
            }
        });

        txtAllowance.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAllowance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAllowanceKeyTyped(evt);
            }
        });

        radYes.setText("Có");

        radNo.setText("Không");

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnFind.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFind.setText("Tìm");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExit.setText("Thoát");
        btnExit.setToolTipText("");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Họ tên", "Giới tính", "Chức vụ", "Ngày sinh", "Địa chỉ", "Điện thoại", "Email", "Ngày vào làm", "Giờ làm", "Lương", "Overtime", "Tổng lương"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
		
	btnGroupOvertime.add(radYes);
	btnGroupOvertime.add(radNo);
	btnGroupGender.add(radMale);
	btnGroupGender.add(radFemale);
	btnGroupGender.add(radOther);

        scrollPane.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radFemale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radOther))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboPos, 0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spinDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtName))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAddress))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(286, 286, 286)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBonus))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAllowance))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spinHireDate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSalary))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtWorkHour))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radYes)
                                .addGap(38, 38, 38)
                                .addComponent(radNo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)))
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(3, 3, 3)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(35, 35, 35)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(spinHireDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(34, 34, 34)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(radMale)
                                                                .addComponent(radFemale)
                                                                .addComponent(radOther))))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtWorkHour, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtSalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(cboPos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(spinDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAllowance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(radYes)
                                .addComponent(radNo))
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // hien thi thong tin nhan vien
    public void show(List<NhanVien> lst_Nhanvien) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        lst_Nhanvien.forEach(o -> {
            String gender = o.getGender() != null ? o.getGender() : "Khác";

            String OT = o.getOverTime() != null ? o.getOverTime() : "Không";
            var dobSql = o.getDob() != null ? o.getDob() : new java.sql.Date(System.currentTimeMillis()); 
            var hireDateSql = o.getHireDate()!= null ? o.getHireDate() : new java.sql.Date(System.currentTimeMillis());

            model.addRow(new Object[]{
                o.getId(), o.getName(), gender, o.getPosition(),
                dobSql, o.getAddress(), o.getPhone(), o.getEmail(),
                hireDateSql, o.getWorkHour(), o.getBaseSalary(), OT, o.getTotalSalary()
            });
        });
    }
    
    // them nhan vien
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (isEmpty())
            return;
        
        NhanVien o = new NhanVien();
        o.setId(txtID.getText().trim());
        o.setName(txtName.getText().trim());
        String gender = radMale.isSelected() ? "Nam" : (radFemale.isSelected() ? "Nữ" : "Khác");
        o.setGender(gender);
        o.setPosition(cboPos.getSelectedItem().toString());
        Date dobUtil = (Date) spinDOB.getValue();
        if (dobUtil != null) {
            java.sql.Date dobSql = new java.sql.Date(dobUtil.getTime());
            o.setDob(dobSql); 
        } else {
            JOptionPane.showMessageDialog(this, "Ngày sinh không hợp lệ.");
            return;
        }
        o.setAddress(txtAddress.getText().trim());
        o.setPhone(txtPhone.getText().trim());
        o.setEmail(txtEmail.getText().trim());
        Date hireDateUtil = (Date) spinHireDate.getValue();
        if (hireDateUtil != null) {
            java.sql.Date hireDateSql = new java.sql.Date(hireDateUtil.getTime());
            o.setHireDate(hireDateSql);
        } else {
            JOptionPane.showMessageDialog(this, "Ngày vào làm không hợp lệ.");
            return;
        }
        o.setWorkHour(Float.parseFloat(txtWorkHour.getText().trim()));
        o.setBaseSalary(Double.parseDouble(txtSalary.getText().trim()));
        o.setBonus(Double.parseDouble(txtBonus.getText().trim()));
        o.setAllowance(Double.parseDouble(txtAllowance.getText().trim()));
        String OT = radYes.isSelected() ? "Có" : "Không";
        double OTM = 0;
        if (OT.equals("Có")) {
            OTM = 150000 * o.getWorkHour();
        } else if (OT.equals("Không")) {
           OTM = 0;
        }
        o.setOverTime(OT);
        double totalSalary = o.getAllowance() + o.getBaseSalary() + o.getBonus() + OTM;
        o.setTotalSalary(totalSalary);
        ConnectData.themNhanVien(o); 
        show(ConnectData.hienThi());
        JOptionPane.showMessageDialog(this, "Thêm thành công");
        clear();
    }//GEN-LAST:event_btnAddActionPerformed

    // refresh
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        show(ConnectData.hienThi());
        clear();
    }//GEN-LAST:event_btnRefreshActionPerformed

    // xoa nhan vien
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nhập mã nhân viên để xóa");
            requestFocus();
            return;
        }
        
        NhanVien o = new NhanVien();
        o.setId(txtID.getText());
        ConnectData.xoaNhanVien(o);
        JOptionPane.showMessageDialog(this, "Xóa nhân viên thành công");
        show(ConnectData.hienThi());
        clear();
    }//GEN-LAST:event_btnDeleteActionPerformed

    // cap nhat thong tin nhan vien
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (isEmpty())
            return;
        
        NhanVien o = new NhanVien();
        o.setName(txtName.getText().trim());
        String gender = radMale.isSelected() ? "Nam" : (radFemale.isSelected() ? "Nữ" : "Khác");
        o.setGender(gender);
        o.setPosition(cboPos.getSelectedItem().toString());
        Date dobUtil = (Date) spinDOB.getValue();
        if (dobUtil != null) {
            java.sql.Date dobSql = new java.sql.Date(dobUtil.getTime());
            o.setDob(dobSql); 
        } else {
            JOptionPane.showMessageDialog(this, "Ngày sinh không hợp lệ.");
            return;
        }
        o.setAddress(txtAddress.getText().trim());
        o.setPhone(txtPhone.getText().trim());
        o.setEmail(txtEmail.getText().trim());
        Date hireDateUtil = (Date) spinHireDate.getValue();
        if (hireDateUtil != null) {
            java.sql.Date hireDateSql = new java.sql.Date(hireDateUtil.getTime());
            o.setHireDate(hireDateSql);
        } else {
            JOptionPane.showMessageDialog(this, "Ngày vào làm không hợp lệ.");
            return;
        }
        o.setWorkHour(Float.parseFloat(txtWorkHour.getText().trim()));
        o.setBaseSalary(Double.parseDouble(txtSalary.getText().trim()));
        o.setBonus(Double.parseDouble(txtBonus.getText().trim()));
        o.setAllowance(Double.parseDouble(txtAllowance.getText().trim()));
        String OT = radYes.isSelected() ? "Có" : "Không";
        double OTM = 0;
        if (OT.equals("Có")) {
            OTM = 150000 * o.getWorkHour();
        } else if (OT.equals("Không")) {
           OTM = 0;
        }
        o.setOverTime(OT);
        double totalSalary = o.getAllowance() + o.getBaseSalary() + o.getBonus() + OTM;
        o.setOverTime(OT);
        o.setTotalSalary(totalSalary);
        o.setId(txtID.getText().trim());
        ConnectData.capNhatNhanVien(o);
        show(ConnectData.hienThi());
        JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công");
        clear();
    }//GEN-LAST:event_btnUpdateActionPerformed

    // tim kiem nhan vien theo ten
    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        if (txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nhập tên nhân viên để tìm kiếm thông tin");
            requestFocus();
            return;
        }
        
        NhanVien o = new NhanVien();
        o.setName(txtName.getText().trim());
        show(ConnectData.timKiem(o));
    }//GEN-LAST:event_btnFindActionPerformed

    // thoat chương trinh
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Bạn xác nhận thoát chương trình ?");
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed
    
    // dinh dang nhap lieu
    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || Character.isDigit(c) || c == '\b'))
            evt.consume();      
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c == '\b' || c == KeyEvent.VK_SPACE))
            evt.consume();    
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)))
            evt.consume();    
    }//GEN-LAST:event_txtPhoneKeyTyped

    private void txtWorkHourKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWorkHourKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '\b' || c == '.'))
            evt.consume();    
    }//GEN-LAST:event_txtWorkHourKeyTyped

    private void txtSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaryKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '\b' || c == '.'))
            evt.consume();   
    }//GEN-LAST:event_txtSalaryKeyTyped

    private void txtBonusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBonusKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '\b' || c == '.'))
            evt.consume();   
    }//GEN-LAST:event_txtBonusKeyTyped

    private void txtAllowanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAllowanceKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '\b' || c == '.'))
            evt.consume();   
    }//GEN-LAST:event_txtAllowanceKeyTyped

    public void truyXuat(String id) {
        String query = "select bonus, allowance from nhanvien where id = ?";
        try {
            Connection connection = ConnectData.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                txtBonus.setText(rs.getString("bonus"));
                txtAllowance.setText(rs.getString("allowance"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Không thể truy xuất data");
        }
    }
    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        index = table.getSelectedRow();
        txtID.setText(table.getValueAt(index, 0).toString());
        txtName.setText(table.getValueAt(index, 1).toString());
        String id = table.getValueAt(index, 0).toString();
        String gender = table.getValueAt(index, 2).toString();
        switch (gender) {
            case "Nam" -> radMale.setSelected(true);
            case "Nữ" -> radFemale.setSelected(true);
            default -> radOther.setSelected(true);
        }
        String pos = table.getValueAt(index, 3).toString();
        cboPos.setSelectedItem(pos);
//        spinDOB.setValue((Date) table.getValueAt(index, 4));
        Object dobValue = table.getValueAt(index, 4);
        if (dobValue instanceof Date) {
            spinDOB.setValue(dobValue);
        } else {
            spinDOB.setValue(new Date()); 
        }
        txtAddress.setText(table.getValueAt(index, 5).toString());
        txtPhone.setText(table.getValueAt(index, 6).toString());
        txtEmail.setText(table.getValueAt(index, 7).toString());
//        spinHireDate.setValue((Date) table.getValueAt(index, 8));
        Object hireDateValue = table.getValueAt(index, 8);
        if (hireDateValue instanceof Date) {
            spinHireDate.setValue(hireDateValue);
        } else {
            spinHireDate.setValue(new Date()); 
        }
        txtWorkHour.setText(table.getValueAt(index, 9).toString());
        txtSalary.setText(table.getValueAt(index, 10).toString());
        String ot = table.getValueAt(index, 11).toString();
        if (ot.equals("Có")) {
            radYes.setSelected(true);
        } else {
            radNo.setSelected(true);
        }
        //
        truyXuat(id);
    }//GEN-LAST:event_tableMouseClicked

    // check empty
    public boolean isEmpty() {
        if (txtID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mã nhân viên không được để trống");
            requestFocus();
            return true;
        }
        if (txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tên không được để trống");
            return true;
        }
        if (txtAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Địa chỉ không được để trống");
            return true;
        }
        if (txtPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Số điện thoại không được để trống");
            return true;
        }
        if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Email không được để trống");
            return true;
        }
        if (txtWorkHour.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền giờ làm của nhân viên");
            return true;
        }
        if (txtSalary.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nhập lương của nhân viên");
            return true;
        }
        if (txtBonus.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nhập tiền thưởng nhân viên");
            return true;
        }
        if (txtAllowance.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập trợ cấp của nhân viên");
            return true;
        }
        if (!(radMale.isSelected() || radFemale.isSelected() || radOther.isSelected())) {
            JOptionPane.showMessageDialog(null, "Vui lòng giới tính của nhân viên");
            return true;
        } 
        if (!(radYes.isSelected() || radNo.isSelected())) {
            JOptionPane.showMessageDialog(null, "Vui lòng xác định trạng thái OT của nhân viên");
            return true;
        } 
        return false;
    }
    
    // clear field
    public void clear() {
        index = -1;
        txtID.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtWorkHour.setText("");
        txtSalary.setText("");
        txtBonus.setText("");
        txtAllowance.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.ButtonGroup btnGroupOvertime;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboPos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton radFemale;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JRadioButton radNo;
    private javax.swing.JRadioButton radOther;
    private javax.swing.JRadioButton radYes;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JSpinner spinDOB;
    private javax.swing.JSpinner spinHireDate;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAllowance;
    private javax.swing.JTextField txtBonus;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtWorkHour;
    // End of variables declaration//GEN-END:variables
}
