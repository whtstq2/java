import java.util.Scanner;

/**
 * �� ������ �ȿ����� üũ�Ͽ� ����� �ʿ伺 ���� üũ
 * @author ä��
 *
 */
public class WeatherCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner a = new Scanner (System.in);
		
for (int i =0;  i<3; i++) {
		
		int rainy;
		
		System.out.println("���� ������ �����?");
	
		System.out.println("1. �� �´�   2. ����");
		
		
		
		
		rainy = a.nextInt();
		
		
		if (rainy==1) {
			System.out.println("����� ì�ܰ�����");
		}
		else
			System.out.println("����� �ʿ�����");
		
		
		}
		a.close();
		
	}

}
