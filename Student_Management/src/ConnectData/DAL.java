package ConnectData;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAL {

    // server infor
    static String url = "jdbc:mysql://localhost:3306/studentmng";
    static String username = "root";
    static String password = "";

    // connection function
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        return connection;
    }

    // display all infor
    public static List<Student> findAll() {
        List<Student> students = new ArrayList<>();

        String query = "select * from student";
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();

            // use `executeQuery` to execute queries without altering data
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Student std;
                std = new Student(rs.getInt("id"),
                        rs.getString("name"), rs.getInt("age"),
                        rs.getInt("gender"), rs.getString("major"),
                        rs.getFloat("score"));
                students.add(std);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        return students;
    }
    
    // add new student
    public static void insertStudent(Student std) {
        String query = "insert into student (name, age, gender, major, score) values (?, ?, ?, ?, ?)";
        try {
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, std.getName());
            pstmt.setInt(2,std.getAge());
            pstmt.setInt(3, std.getGender());
            pstmt.setString(4, std.getMajor());
            pstmt.setFloat(5, std.getScore());
            
            // use 'executeUpdate' to execute queries that change the data
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }
    
    // delete a student by name
    public static void deleteStudent(Student std) {
        String query = "delete from student where name = ?";
        try {
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, std.getName());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }
    
    // update student infor by name
    public static void updateStudent(Student std) {
        String query = "update student set name = ?, age = ?, gender = ?, major = ?, score = ? where name = '" + std.getName() + "'";
        try {
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, std.getName());
            pstmt.setInt(2,std.getAge());
            pstmt.setInt(3, std.getGender());
            pstmt.setString(4, std.getMajor());
            pstmt.setFloat(5, std.getScore());
            
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }
    
    // find student by name
    public static List<Student> findByName(Student student) {
        List<Student> students = new ArrayList<>();

        String query = "select * from student where student.name = '" + student.getName() + "'";
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();

            // use `executeQuery` to execute queries without altering data
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Student std;
                std = new Student(rs.getInt("id"),
                        rs.getString("name"), rs.getInt("age"),
                        rs.getInt("gender"), rs.getString("major"),
                        rs.getFloat("score"));
                students.add(std);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        return students;
    }
}
