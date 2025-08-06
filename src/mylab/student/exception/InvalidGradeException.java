package mylab.student.exception;

/**
 * ������ ��ȿ���� ���� �� �߻��ϴ� ����
 */
public class InvalidGradeException extends Exception {
    
    public InvalidGradeException() {
        super("�г��� 1~4 ���̿��� �մϴ�.");
    }
    
    public InvalidGradeException(String message) {
        super(message);
    }
    
    public InvalidGradeException(int grade) {
        super("�г��� 1~4 ���̿��� �մϴ�. �Էµ� �г�: " + grade);
    }
}
