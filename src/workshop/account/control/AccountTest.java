package workshop.account.control;
import workshop.account.entity.Account;
public class AccountTest {
	public static void main(String[] args) {
		//Account ��ü����
		Account account =new Account();
		//1-1. setter �޼��� ȣ��� ���� ����
		//����ȣ : "A1100", ���¹�ȣ : "221-22-3477", �ܾ� :100
		account.setCustId("A1100");
		account.setAcctId("221-22-3477");
		account.deposit(1000);
		//2.Account ��ü���� -�����ε��� ������ ȣ��
		Account account2 = new Account("B1200", "331-22-3477", 2000);	
		}
}
