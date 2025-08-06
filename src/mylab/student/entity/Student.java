package mylab.student.entity;

import mylab.student.exception.InvalidGradeException;

public class Student {
    private String name;
    private String major; 
    private int grade;
    
    // 기본 생성자
    public Student() {
        System.out.println("Student 기본생성자 호출됨");
    }
    
    // 생성자 오버로딩
    public Student(String name, String major, int grade) throws InvalidGradeException {
        this.name = name;
        this.major = major;
        setGrade(grade); // setter를 통해 검증
    }
    
    // getter 메소드들
    public String getName() {
        return name;
    }
    
    public String getMajor() {
        return major;
    }
    
    public int getGrade() {
        return grade;
    }
    
    // setter 메소드들
    public void setName(String name) {
        this.name = name;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    // setGrade - 제공된 예외 클래스의 생성자들을 활용
    public void setGrade(int grade) throws InvalidGradeException {
        // 학년이 1~4 범위를 벗어나면
        if(grade < 1 || grade > 4) {
            // InvalidGradeException(int grade) 생성자 사용
            throw new InvalidGradeException(grade);
        }
        this.grade = grade;
    }
    
    @Override
    public String toString() {
        return "Student{name='" + name + "', major='" + major + "', grade=" + grade + "}";
    }
}
