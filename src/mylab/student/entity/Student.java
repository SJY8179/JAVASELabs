package mylab.student.entity;

import mylab.student.exception.InvalidGradeException;

public class Student {
    private String name;
    private String major; 
    private int grade;
    
    // �⺻ ������
    public Student() {
        System.out.println("Student �⺻������ ȣ���");
    }
    
    // ������ �����ε�
    public Student(String name, String major, int grade) throws InvalidGradeException {
        this.name = name;
        this.major = major;
        setGrade(grade); // setter�� ���� ����
    }
    
    // getter �޼ҵ��
    public String getName() {
        return name;
    }
    
    public String getMajor() {
        return major;
    }
    
    public int getGrade() {
        return grade;
    }
    
    // setter �޼ҵ��
    public void setName(String name) {
        this.name = name;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    // setGrade - ������ ���� Ŭ������ �����ڵ��� Ȱ��
    public void setGrade(int grade) throws InvalidGradeException {
        // �г��� 1~4 ������ �����
        if(grade < 1 || grade > 4) {
            // InvalidGradeException(int grade) ������ ���
            throw new InvalidGradeException(grade);
        }
        this.grade = grade;
    }
    
    @Override
    public String toString() {
        return "Student{name='" + name + "', major='" + major + "', grade=" + grade + "}";
    }
}
