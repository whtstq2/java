import java.util.Scanner;

public class HW_Var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner a = new Scanner (System.in);

		while(true) {
		
		int menu ;
		
		menu = a.nextInt();
		
		
		if (menu==1) {
			int sum;
			double aver;
			System.out.println("���� �ټ����� �Է��Ͻÿ�");
			Scanner b = new Scanner (System.in);
			Scanner c = new Scanner (System.in);
			Scanner d = new Scanner (System.in);
			Scanner e = new Scanner (System.in);
			Scanner f = new Scanner (System.in);
			
			int num1 = b.nextInt();
			int num2 = c.nextInt();
			int num3 = d.nextInt();
			int num4 = e.nextInt();
			int num5 = f.nextInt();
			
			sum = num1+num2+num3+num4+num5;
			aver = sum/5;
			
			String message = String.format("������ %d �̰� ����� %.2f �Դϴ�", sum, aver);
			System.out.println(message);
			
			b.close();
			c.close();
			d.close();
			e.close();
			f.close();
		}
			
		else if (menu==2) {
			
			double temp;
			
			System.out.println("�µ��� �Է��Ͻÿ� : ");
			Scanner g = new Scanner(System.in);
			temp = g.nextInt();
			
				String message = String.format("ȭ���� %.2f�̴�.",(temp*1.8) +32 );
			System.out.println(message);
			
			g.close();
			
		}
		
		else if( menu==3) {
			double weight, height, bmi;
			
			Scanner h = new Scanner(System.in);
			Scanner j = new Scanner(System.in);
			
			weight = h.nextInt();
			height = j.nextInt();
			
			bmi = weight/ (height*height);
			
			String message = String.format("BMI�� %.2f�̴�.",bmi );
			System.out.println(message);
			
			h.close();
			j.close();
		}
		
		else
			System.out.println("���α׷� ����");
			
			break;
		}
		
		a.close();
		
	}

}
