import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.rmi.ConnectException;
import java.sql.*;

public class GUI {
    private int index = -1;

    JTextField txtMa = new JTextField();
    JTextField txtTen = new JTextField();
    JTextField txtNoiSinh = new JTextField();
    JTextField txtTuoi = new JTextField();
    JTextField txtDiem = new JTextField();
    JButton btnThem = new JButton("Thêm");
    JButton btnXoa = new JButton("Xóa");
    JButton btnSua = new JButton("Sửa");
    JButton btnThoat = new JButton("Thoát");

    public String[] col = {"Mã", "Họ tên", "Tuổi", "Nơi sinh", "GPA"};
    public String[][] row = {};
    public DefaultTableModel model = new DefaultTableModel(row, col);
    public JTable table = new JTable(model);

    String DB_URL = "jdbc:mysql://localhost:3306/demodb";
    String USER_NAME = "root";
    String PASSWORD = "";

    public void init() {
        JFrame form = new JFrame("Form đăng kí");
        form.setSize(850, 450);
        form.setLayout(null);
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel lbMa = new JLabel("Mã");
        lbMa.setBounds(20, 20, 80, 25);
        txtMa.setBounds(100, 20, 80, 25);
        form.add(lbMa);
        form.add(txtMa);

        JLabel lbTen = new JLabel("Họ tên");
        lbTen.setBounds(20, 60, 80, 25);
        txtTen.setBounds(100, 60, 130, 25);
        form.add(lbTen);
        form.add(txtTen);

        JLabel lbTuoi = new JLabel("Tuổi");
        lbTuoi.setBounds(20, 100, 80, 25);
        txtTuoi.setBounds(100, 100, 80, 25);
        form.add(lbTuoi);
        form.add(txtTuoi);

        JLabel lbNoiSinh = new JLabel("Nơi sinh");
        lbNoiSinh.setBounds(20, 140, 80, 25);
        txtNoiSinh.setBounds(100, 140, 150, 50);
        form.add(lbNoiSinh);
        form.add(txtNoiSinh);

        JLabel lbDiem = new JLabel("GPA");
        lbDiem.setBounds(20, 205, 80, 25);
        txtDiem.setBounds(100, 205, 80, 25);
        form.add(lbDiem);
        form.add(txtDiem);

        JScrollPane pane = new JScrollPane(table);
        JPanel panel = new JPanel();
        panel.add(pane);
        panel.setBounds(350, 20, 500, 300);
        form.add(panel);
        form.setVisible(true);
        form.setLayout(null);

        btnThem.setBounds(20, 280, 90, 25);
        form.add(btnThem);
        btnXoa.setBounds(20, 315, 90, 25);
        form.add(btnXoa);
        btnSua.setBounds(200, 315, 90, 25);
        form.add(btnSua);
        btnThoat.setBounds(200, 280, 90, 25);
        form.add(btnThoat);
        form.setVisible(true);
        btnXoa.setEnabled(false);
        btnSua.setEnabled(false);
    }

    public void loadDuLieu() {
        try {
            Connection conn = null;
            DAL dal = new DAL();
            conn = dal.getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("select * from `sinhvien`");
            while (result.next()) {
                int id = result.getInt(1);
                String name = result.getString(2);
                int age = result.getInt(3);
                String address = result.getString(4);
                int gpa = result.getInt(5);
                Object[] row = {id, name, age, address, gpa};
                model = (DefaultTableModel) table.getModel();
                model.addRow(row);
            }
            conn.close();
        } catch (ConnectException | SQLException e) {
            throw new RuntimeException(e);
        }

        // hiển thị thông tin sinh viên được chọn lên control
        table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                index = table.getSelectedRow();
                txtMa.setText(table.getValueAt(index, 0).toString());
                txtTen.setText(table.getValueAt(index, 1).toString());
                txtTuoi.setText(table.getValueAt(index, 2).toString());
                txtNoiSinh.setText(table.getValueAt(index, 3).toString());
                txtDiem.setText(table.getValueAt(index, 4).toString());
                btnXoa.setEnabled(true);
                btnSua.setEnabled(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        // thêm
        btnThem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!kiemTraRong())
                        return;

                    Connection conn = null;
                    DAL dal = new DAL();
                    int ma = Integer.parseInt(txtMa.getText().trim());
                    String ten = txtTen.getText().trim();
                    int tuoi = Integer.parseInt(txtTuoi.getText().trim());
                    String noisinh = txtNoiSinh.getText().trim();
                    int diem = Integer.parseInt(txtDiem.getText().trim());
                    String query = "insert into `sinhvien` (id, name, age, address, gpa) values (?, ?, ?, ?, ?)";
                    conn = dal.getConnection(DB_URL, USER_NAME, PASSWORD);
                    PreparedStatement pstm = conn.prepareStatement(query);
                    pstm.setInt(1, ma);
                    pstm.setString(2, ten);
                    pstm.setInt(3, tuoi);
                    pstm.setString(4, noisinh);
                    pstm.setInt(5, diem);
                    int stm = pstm.executeUpdate();
                    if (stm == 1) {
                        Object[] row = {ma, ten, tuoi, noisinh, diem};
                        model = (DefaultTableModel) table.getModel();
                        model.addRow(row);
                    }
                    clearForm();
                    JOptionPane.showMessageDialog(null, "Thêm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } catch (ConnectException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
                }
            }
        });

        // sửa
        btnSua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!kiemTraRong())
                        return;

                    Connection conn = null;
                    DAL dal = new DAL();
                    int ma = Integer.parseInt(txtMa.getText().trim());
                    String ten = txtTen.getText().trim();
                    int tuoi = Integer.parseInt(txtTuoi.getText().trim());
                    String noisinh = txtNoiSinh.getText().trim();
                    int diem = Integer.parseInt(txtDiem.getText().trim());
                    String query = "update `sinhvien` set name = ?, age = ?, address = ?, gpa = ? where id = ?";
                    conn = dal.getConnection(DB_URL, USER_NAME, PASSWORD);
                    PreparedStatement pstm = conn.prepareStatement(query);
                    pstm.setString(1, ten);
                    pstm.setInt(2, tuoi);
                    pstm.setString(3, noisinh);
                    pstm.setInt(4, diem);
                    pstm.setInt(5, ma);
                    int stm = pstm.executeUpdate();
                    if (stm == 1) {
                        JOptionPane.showMessageDialog(null, "Cập nhật thông tin hoàn tất", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        model.setValueAt(ma, index, 0);
                        model.setValueAt(ten, index, 1);
                        model.setValueAt(tuoi, index, 2);
                        model.setValueAt(noisinh, index, 3);
                        model.setValueAt(diem, index, 4);
                        btnThem.setEnabled(true);
                        txtMa.setEnabled(true);
                    }
                    clearForm();
                } catch (ConnectException | SQLException ex) {
                    JOptionPane.showInputDialog("Lỗi: " + ex.getMessage());
                }
            }
        });

        // xóa
        btnXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                int row = table.getSelectedRow();
                int modelRow = table.convertRowIndexToModel(row);
                try {
                    if (index != -1) {
                        Connection conn = null;
                        DAL dal = new DAL();
                        int ma = Integer.parseInt(txtMa.getText().trim());
                        conn = dal.getConnection(DB_URL, USER_NAME, PASSWORD);
                        String query = "delete from `sinhvien` where id = ?";
                        PreparedStatement pstm = conn.prepareStatement(query);
                        pstm.setInt(1, ma);
                        pstm.executeUpdate();
                        pstm.close();
                        model.removeRow(index);
                        clearForm();
                        JOptionPane.showMessageDialog(null, "Đã xóa 1 sinh viên trong bảng", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Vui lòng chọn sinh viên để xóa", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (SQLException | ConnectException ex) {
                    JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
                }
            }
        });

        // thoát
        btnThoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rs = JOptionPane.showConfirmDialog(null, "Thoát chương trình ?");
                if (rs == 0) {
                    System.exit(0);
                }
            }
        });

        // key event - giới hạn kí tự được nhập vào TF
        txtMa.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // chặn các kí tự không phải là số hoặc back_space ('\b')
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
//                txtMa.setEditable(e.getKeyChar() >= '0' && e.getKeyChar() <= '9' || e.getKeyChar() == '\b');
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        txtTuoi.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c == '\b')) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        txtDiem.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c == '\b')) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        txtTen.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isLetter(c) || c == '\b' || c == KeyEvent.VK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    // reset
    public void clearForm() {
        txtMa.setText(null);
        txtTen.setText(null);
        txtTuoi.setText(null);
        txtNoiSinh.setText(null);
        txtDiem.setText(null);
        index = -1;
        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
    }

    // kiểm tra rỗng
    private boolean kiemTraRong() {
        if (txtMa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mã sinh viên không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtTen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tên sinh viên không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtTuoi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tuổi không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtNoiSinh.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nơi sinh không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtDiem.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Điểm không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
