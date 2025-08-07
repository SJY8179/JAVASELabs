package mylab.student.control;

import mylab.student.entity.Student;
import mylab.student.exception.InvalidGradeException;

public class StudentTestJava {

    public static void main(String[] args) {
        printTitle("Student Ŭ���� �׽�Ʈ");
        
        // 1. Student ��ü���� - �⺻������ ȣ��
        Student student = new Student();
        
        try {
            // 1-1. setter �޼��� ȣ��� ���� ����
            student.setName("��ö��");
            student.setMajor("����Ʈ������");
            student.setGrade(3);
            
            // 1-2. getter �޼��� ȣ��� ���� Ȯ��
            System.out.println("�̸� = " + student.getName());
            System.out.println("���� = " + student.getMajor());
            System.out.println("�г� = " + student.getGrade());
            
        } catch (InvalidGradeException e) {
            System.out.println("���� �߻�: " + e.getMessage());
        }
        
        System.out.println();
        
        try {
            // 2. Student ��ü���� - �����ε��� ������ ȣ��
            Student student2 = new Student("�̿���", "��ǻ�Ͱ���", 2);
            System.out.println("������ �л�: " + student2);
            
            // 3. �������� �г� ����
            System.out.println("�г��� 4�г����� ����");
            student2.setGrade(4);
            System.out.println("���� ��: " + student2);
            
            // 4. �߸��� �г����� ���� �õ� - ���� �߻�
            System.out.println("�г��� 5�г����� ���� �õ�");
            student2.setGrade(5); // InvalidGradeException(int grade) �����ڷ� ���� �߻�!
            
        } catch (InvalidGradeException e) {
            System.out.println("���� ó��: " + e.getMessage());
        }
        
        System.out.println();
        
        // 5. �����ڿ��� �߸��� �г� �Է� �׽�Ʈ (0�г�)
        try {
            Student student3 = new Student("�ڹμ�", "���ڰ���", 0);
        } catch (InvalidGradeException e) {
            System.out.println("������ ���� ó��: " + e.getMessage());
        }
        
        System.out.println();
        
        // 6. �پ��� �߸��� �г� �׽�Ʈ (����)
        try {
            Student student4 = new Student();
            student4.setName("������");
            student4.setMajor("���а�");
            student4.setGrade(-1);
        } catch (InvalidGradeException e) {
            System.out.println("���� �г� ���� ó��: " + e.getMessage());
        }
        
        // 7. �پ��� �߸��� �г� �׽�Ʈ (ū ��)
        try {
            Student student5 = new Student();
            student5.setName("����ȣ");
            student5.setMajor("�����а�");
            student5.setGrade(10);
        } catch (InvalidGradeException e) {
            System.out.println("ū �� �г� ���� ó��: " + e.getMessage());
        }
    }
    
    
    public static void printTitle(String title) {
        System.out.println("@@@@ " + title + " @@@@");
    }
}
