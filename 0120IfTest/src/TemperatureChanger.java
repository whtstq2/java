import java.util.Scanner;

/**
 * ������ ȭ���� ȭ���� ������ �ٲ��ִ� ���α׷�
 * @author ä��
 *
 */
public class TemperatureChanger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int num;
		double temp;
		
		System.out.println("�µ� �Է�");
		Scanner a = new Scanner(System.in);
		temp = a.nextInt();
		
		System.out.println("1 : ���� -> ȭ��");
		System.out.println("2 : ȭ�� -> ����");
		
		Scanner b = new Scanner(System.in);
		num= b.nextInt();
		
		if (num==1) {
			System.out.println("ȭ���� " +((temp*1.8) +32));
		}
		else {
			System.out.println("������ " + ((temp-32)/1.8));
		}
			String message = String.format("ȭ���� %.2f�̴�.",(temp*1.8) +32 );
		System.out.println(message);
		
		
		
		a.close();
		b.close();
	
	}

}
