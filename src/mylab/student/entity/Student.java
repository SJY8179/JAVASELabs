package mylab.student.entity;

import mylab.student.exception.InvalidGradeException;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;

/**
 * 학생 정보를 관리하는 엔티티 클래스
 */
public class Student {
    
    @NotBlank(message = "학생 이름은 필수입니다.")
    private String name;
    
    @NotBlank(message = "전공은 필수입니다.")
    private String major;
    
    @NotNull(message = "학년은 필수입니다.")
    @Min(value = 1, message = "학년은 1 이상이어야 합니다.")
    @Max(value = 4, message = "학년은 4 이하여야 합니다.")
    private Integer grade;
    
    // 기본 생성자
    public Student() {
    }
    
    // 전체 필드 생성자
    public Student(String name, String major, Integer grade) throws InvalidGradeException {
        this.name = name;
        this.major = major;
        setGrade(grade);
    }
    
    // Getter 메소드들
    public String getName() {
        return name;
    }
    
    public String getMajor() {
        return major;
    }
    
    public Integer getGrade() {
        return grade;
    }
    
    // Setter 메소드들
    public void setName(String name) {
        this.name = name;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    /**
     * 학년을 설정하는 메소드 - 예외 처리 포함
     * @param grade 설정할 학년 (1~4)
     * @throws InvalidGradeException 학년이 1~4 범위를 벗어날 때
     */
    public void setGrade(Integer grade) throws InvalidGradeException {
        if (grade == null) {
            throw new InvalidGradeException("학년은 null일 수 없습니다.");
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
