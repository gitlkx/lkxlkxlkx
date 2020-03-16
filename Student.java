import java.util.ArrayList;
import java.util.List;

/**
 * 创建Student类
 * @author xin
 */
public class Student {
    /**
     * 学生名字
     */
    private String name;
    /**
     * 学生年龄
     */
    private int age;
    /**
     * 学生成绩
     */
    private double achievement;
    /**
     * 学生班级
     */
    private int studentClass;

    /**
     * 构造方法
     *
     * @param name
     * @param age
     * @param achievement
     * @param studentClass
     */
    public Student(String name, int age, double achievement, int studentClass) {
        this.name = name;
        this.age = age;
        this.achievement = achievement;
        this.studentClass = studentClass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAchievement() {
        return achievement;
    }

    public void setAchievement(double achievement) {
        this.achievement = achievement;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}