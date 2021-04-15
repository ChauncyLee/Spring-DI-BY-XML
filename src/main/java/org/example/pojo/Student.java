package org.example.pojo;

/**
 * @author Chuncy
 * @version V1.0
 * @Date: 2021/4/15 15:29
 **/
public class Student {
    private String name;
    private int age;
    /**
     * 补充School属性
     */
    private School school;

    public Student(){

    }

    public Student(String name,int age,School school){
        System.out.println("student的有参构造函数");
        this.name=name;
        this.age=age;
        this.school=school;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public School getSchool() {
        return school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
