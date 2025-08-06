package mylab.student.entity;

import mylab.student.exception.InvalidGradeException;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;

/**
 * �л� ������ �����ϴ� ��ƼƼ Ŭ����
 */
public class Student {
    
    @NotBlank(message = "�л� �̸��� �ʼ��Դϴ�.")
    private String name;
    
    @NotBlank(message = "������ �ʼ��Դϴ�.")
    private String major;
    
    @NotNull(message = "�г��� �ʼ��Դϴ�.")
    @Min(value = 1, message = "�г��� 1 �̻��̾�� �մϴ�.")
    @Max(value = 4, message = "�г��� 4 ���Ͽ��� �մϴ�.")
    private Integer grade;
    
    // �⺻ ������
    public Student() {
    }
    
    // ��ü �ʵ� ������
    public Student(String name, String major, Integer grade) throws InvalidGradeException {
        this.name = name;
        this.major = major;
        setGrade(grade);
    }
    
    // Getter �޼ҵ��
    public String getName() {
        return name;
    }
    
    public String getMajor() {
        return major;
    }
    
    public Integer getGrade() {
        return grade;
    }
    
    // Setter �޼ҵ��
    public void setName(String name) {
        this.name = name;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    /**
     * �г��� �����ϴ� �޼ҵ� - ���� ó�� ����
     * @param grade ������ �г� (1~4)
     * @throws InvalidGradeException �г��� 1~4 ������ ��� ��
     */
    public void setGrade(Integer grade) throws InvalidGradeException {
        if (grade == null) {
            throw new InvalidGradeException("�г��� null�� �� �����ϴ�.");
        }
        
        if (grade < 1 || grade > 4) {
            throw new InvalidGradeException(grade);
        }
        
        this.grade = grade;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", grade=" + grade +
                '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Student student = (Student) obj;
        return name.equals(student.name) && 
               major.equals(student.major) && 
               grade.equals(student.grade);
    }
    
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (major != null ? major.hashCode() : 0);
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        return result;
    }
}
