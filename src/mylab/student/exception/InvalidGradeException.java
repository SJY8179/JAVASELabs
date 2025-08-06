package mylab.student.exception;

/**
 * 학점이 유효하지 않을 때 발생하는 예외
 */
public class InvalidGradeException extends Exception {
    
    public InvalidGradeException() {
        super("학년은 1~4 사이여야 합니다.");
    }
    
    public InvalidGradeException(String message) {
        super(message);
    }
    
    public InvalidGradeException(int grade) {
        super("학년은 1~4 사이여야 합니다. 입력된 학년: " + grade);
    }
}
