import java.util.Scanner;

public class HW_Var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner (System.in);
		
		
		int menu ;
		while(true) { 
		
		System.out.println(" �޴��� �Է��Ͻÿ� ");
		System.out.println("1. �ټ� ���� �Է��ϸ� ����, ����� ������ִ� ���α׷�");
		System.out.println("2. �µ��� �������� ȭ���� ������ִ� ���α׷�");
		System.out.println("3. BMI ������ִ� ���α׷�");
		System.out.println("4.����");
		
		
		
		
		
		
		menu = a.nextInt();
		
		
		
		if (menu==1) {
			int sum;
			double aver;
			System.out.println("���� �ټ����� �Է��Ͻÿ�");
			
			
			int num1 = b.nextInt();
			int num2 = c.nextInt();
			int num3 = d.nextInt();
			int num4 = e.nextInt();
			int num5 = f.nextInt();
			
			sum = num1+num2+num3+num4+num5;
			aver = sum/5;
			
			String message = String.format("������ %d �̰� ����� %.2f �Դϴ�", sum, aver);
			System.out.println(message);
			
		
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
			double weight, height;
			
			System.out.println("ü���� �Է��Ͻÿ�");
			
			Scanner h = new Scanner(System.in);
			System.out.println("Ű�� �Է��Ͻÿ�");
			Scanner j = new Scanner(System.in);
			
			weight = h.nextInt();
			height = j.nextInt();
			
			
			
			String message = String.format("BMI�� %.5f�̴�.",	weight / (height*height));
			System.out.println(message);
			
			h.close();
			j.close();
		}
		
		else if(menu ==4){
		break;	
		System.out.println("�����մϴ�"); 
		}
		}
		a.close();
		
		
	}

}
