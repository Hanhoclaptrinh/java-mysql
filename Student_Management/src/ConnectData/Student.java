package ConnectData;

public class Student {
    private int id;
    private String name;
    private int age;
    private int gender;
    private String major;
    private float score;
    
    public Student() {
        
    }

    public Student(int id, String name, int age, int gender, String major, float score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.major = major;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
