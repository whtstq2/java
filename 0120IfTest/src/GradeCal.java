import java.util.Scanner;

public class GradeCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pro, mana, math, algo, sum;
		double aver;
		System.out.println("���α׷���, �濵, ����, �˰��� ������ ������ �Է��ϼ���");
		
		Scanner grade1 = new Scanner(System.in);
		Scanner grade2= new Scanner(System.in);
		Scanner grade3 = new Scanner(System.in);
		Scanner grade4 = new Scanner(System.in);
		
		pro = grade1.nextInt();
		mana = grade2.nextInt();
		math = grade3.nextInt();
		algo = grade4.nextInt();
		
		sum = pro+mana+math+algo;
		aver = (pro+mana+math+algo)/4.0;
		
		System.out.println("����: " + sum);
		System.out.println("���: " + aver);
		
		String message = String.format("����� %.2f�Դϴ�", aver);
		System.out.println(message);
		
		
		if ( aver>90) {
			System.out.println("�� ���߾��!");
		}
		else
			System.out.println("�� ���߾��!");
		grade1.close();
		grade2.close();
		grade3.close();
		grade4.close();

	}

}
