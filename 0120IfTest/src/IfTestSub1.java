import java.util.Scanner;

public class IfTestSub1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner a = new Scanner (System.in);
		
for (int i =0;  i<3; i++) {
		
		int rainy;
		
		System.out.println("���� ������ �����?");
	
		System.out.println("1. �� �´�   2. ���� 3. ����");
		
		
		
		
		rainy = a.nextInt();
		
		
		if (rainy==1) {
			System.out.println("����� ì�ܰ�����");
		}
		else if (rainy ==2){
			System.out.println("����� �ʿ�����");
		}
		else 
			break;
		
			
		}

		a.close();
		
	}
}
