import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1200�� �̻��̸� Ŀ�Ǹ� �� �� ������ �˷��ִ� ���α׷�
		*/
		int num;
		
		//�ָӴ��� ���� ����
		Scanner money = new Scanner (System.in);
		
		num = money.nextInt();
		
		if (num>1200) {
			System.out.println("�� �� �ִ� "); 
			}
		else
		System.out.println("�ƴϾ�");
		
		money.close();
		//�ָӴϿ� ���� 1200 �̻�����  Ȯ��
		
		//1200�� �̻��̸� ��������� ���
		
		
	}

}
