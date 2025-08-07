package mylab.student.control;

import mylab.student.entity.Student;
import mylab.student.exception.InvalidGradeException;

public class StudentTestJava {

    public static void main(String[] args) {
        printTitle("Student 클래스 테스트");
        
        // 1. Student 객체생성 - 기본생성자 호출
        Student student = new Student();
        
        try {
            // 1-1. setter 메서드 호출로 값을 대입
            student.setName("김철수");
            student.setMajor("소프트웨어학");
            student.setGrade(3);
            
            // 1-2. getter 메서드 호출로 값을 확인
            System.out.println("이름 = " + student.getName());
            System.out.println("전공 = " + student.getMajor());
            System.out.println("학년 = " + student.getGrade());
            
        } catch (InvalidGradeException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
        
        System.out.println();
        
        try {
            // 2. Student 객체생성 - 오버로딩된 생성자 호출
            Student student2 = new Student("이영희", "컴퓨터공학", 2);
            System.out.println("생성된 학생: " + student2);
            
            // 3. 정상적인 학년 변경
            System.out.println("학년을 4학년으로 변경");
            student2.setGrade(4);
            System.out.println("변경 후: " + student2);
            
            // 4. 잘못된 학년으로 변경 시도 - 예외 발생
            System.out.println("학년을 5학년으로 변경 시도");
            student2.setGrade(5); // InvalidGradeException(int grade) 생성자로 예외 발생!
            
        } catch (InvalidGradeException e) {
            System.out.println("예외 처리: " + e.getMessage());
        }
        
        System.out.println();
        
        // 5. 생성자에서 잘못된 학년 입력 테스트 (0학년)
        try {
            Student student3 = new Student("박민수", "전자공학", 0);
        } catch (InvalidGradeException e) {
            System.out.println("생성자 예외 처리: " + e.getMessage());
        }
        
        System.out.println();
        
        // 6. 다양한 잘못된 학년 테스트 (음수)
        try {
            Student student4 = new Student();
            student4.setName("최지영");
            student4.setMajor("수학과");
            student4.setGrade(-1);
        } catch (InvalidGradeException e) {
            System.out.println("음수 학년 예외 처리: " + e.getMessage());
        }
        
        // 7. 다양한 잘못된 학년 테스트 (큰 수)
        try {
            Student student5 = new Student();
            student5.setName("정민호");
            student5.setMajor("물리학과");
            student5.setGrade(10);
        } catch (InvalidGradeException e) {
            System.out.println("큰 수 학년 예외 처리: " + e.getMessage());
        }
    }
    
    
    public static void printTitle(String title) {
        System.out.println("@@@@ " + title + " @@@@");
    }
}
