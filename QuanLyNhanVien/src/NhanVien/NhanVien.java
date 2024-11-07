package NhanVien;

import java.util.Date;
public class NhanVien {
    private String id;
    private String name;
    private String gender;
    private String position;
    private Date dob;
    private String address;
    private String phone;
    private String email;
    private Date hireDate;
    private float workHour;
    private double baseSalary;
    private double bonus;
    private double allowance;
    private String overTime;
    private double totalSalary;
    
    public NhanVien() {}

    public NhanVien(String id, String name, String gender, String position, Date dob, String address, String phone, String email, Date hireDate, float workHour, double baseSalary, double bonus, double allowance, String overTime, double totalSalary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.position = position;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.hireDate = hireDate;
        this.workHour = workHour;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.allowance = allowance;
        this.overTime = overTime;
        this.totalSalary = totalSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public float getWorkHour() {
        return workHour;
    }

    public void setWorkHour(float workHour) {
        this.workHour = workHour;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public String getOverTime() {
        return overTime;
    }

    public void setOverTime(String overTime) {
        this.overTime = overTime;
    }
    
    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }
}
