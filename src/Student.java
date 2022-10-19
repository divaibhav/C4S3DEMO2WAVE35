import java.util.Objects;

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String email;
    private String mobile;

    public Student() {
    }

    public Student(int rollNo, String name, int age, String email, String mobile) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.email = email;
        this.mobile = mobile;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && age == student.age && Objects.equals(name, student.name) && Objects.equals(email, student.email) && Objects.equals(mobile, student.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name, age, email, mobile);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
