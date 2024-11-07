package DAL;

import NhanVien.NhanVien;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ConnectData {

    // database
    static String DB_URL = "jdbc:mysql://localhost:3306/employee";
    static String USERNAME = "root";
    static String PASSWORD = "";

    // ham ket noi
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
        }
        return connection;
    }

    // hien thi thong tin
    public static List<NhanVien> hienThi() {
        List<NhanVien> lst_Nhanvien = new ArrayList<>();
        String query = "select * from nhanvien";
        try {
            Connection connection = getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                NhanVien o = new NhanVien(
                        rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("gender"),
                        rs.getString("position"),
                        rs.getDate("dob"),
                        rs.getString("address"),
                        rs.getString("phone"),
                        rs.getString("email"),
                        rs.getDate("hiredate"),
                        rs.getFloat("workhour"),
                        rs.getDouble("salary"),
                        rs.getDouble("bonus"),
                        rs.getDouble("allowance"),
                        rs.getString("overtime"),
                        rs.getDouble("pay")
                );
                lst_Nhanvien.add(o);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
        }
        return lst_Nhanvien;
    }

    // them nhan vien
    public static void themNhanVien(NhanVien o) {
        String query = "insert into nhanvien "
                + "("
                + "id, name, gender, position,"
                + " dob, address, phone, email, hiredate, workhour,"
                + " salary, bonus, allowance, overtime, pay"
                + ") values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection connection = getConnection();
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, o.getId());
            pstmt.setString(2, o.getName());
            pstmt.setString(3, o.getGender());
            pstmt.setString(4, o.getPosition());
            pstmt.setDate(5, (Date) o.getDob());
            pstmt.setString(6, o.getAddress());
            pstmt.setString(7, o.getPhone());
            pstmt.setString(8, o.getEmail());
            pstmt.setDate(9, (Date) o.getHireDate());
            pstmt.setFloat(10, o.getWorkHour());
            pstmt.setDouble(11, o.getBaseSalary());
            pstmt.setDouble(12, o.getBonus());
            pstmt.setDouble(13, o.getAllowance());
            pstmt.setString(14, o.getOverTime());
            pstmt.setDouble(15, o.getTotalSalary());

            pstmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
        }
    }
    
    // xoa nhan vien
    public static void xoaNhanVien(NhanVien o) {
        String query = "delete from nhanvien where id = ?";
        try {
            Connection connection = getConnection();
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, o.getId());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
        }
    }
    
    // cap nhat thong tin nhan vien
    public static void capNhatNhanVien(NhanVien o) {
        String query = "update nhanvien set name = ?, gender = ?, position = ?, "
                + "dob = ?, address = ?, phone = ?, email = ?, hiredate = ?, workhour = ?, "
                + "salary = ?, bonus = ?, allowance = ?, overtime = ?, pay = ? where id = ?";
        
        try {
            Connection conncection = getConnection();
            PreparedStatement pstmt = conncection.prepareStatement(query);
            pstmt.setString(1, o.getName());
            pstmt.setString(2, o.getGender());
            pstmt.setString(3, o.getPosition());
            pstmt.setDate(4, (Date) o.getDob());
            pstmt.setString(5, o.getAddress());
            pstmt.setString(6, o.getPhone());
            pstmt.setString(7, o.getEmail());
            pstmt.setDate(8, (Date) o.getHireDate());
            pstmt.setFloat(9, o.getWorkHour());
            pstmt.setDouble(10, o.getBaseSalary());
            pstmt.setDouble(11, o.getBonus());
            pstmt.setDouble(12, o.getAllowance());
            pstmt.setString(13, o.getOverTime());
            pstmt.setDouble(14, o.getTotalSalary());
            pstmt.setString(15, o.getId());
            
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
        }
    }
    
    // tim kiem nhan vien theo ten
    public static List<NhanVien> timKiem(NhanVien o) {
        List<NhanVien> lst_Nhanvien = new ArrayList<>();
        String query = "select * from nhanvien where nhanvien.name like ?";
        
        try {
            Connection connection = getConnection();
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, "%" + o.getName() + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(
                        rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("gender"),
                        rs.getString("position"),
                        rs.getDate("dob"),
                        rs.getString("address"),
                        rs.getString("phone"),
                        rs.getString("email"),
                        rs.getDate("hiredate"),
                        rs.getFloat("workhour"),
                        rs.getDouble("salary"),
                        rs.getDouble("bonus"),
                        rs.getDouble("allowance"),
                        rs.getString("overtime"),
                        rs.getDouble("pay")
                );
                lst_Nhanvien.add(nv);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
        }
        return lst_Nhanvien;
    }
}
