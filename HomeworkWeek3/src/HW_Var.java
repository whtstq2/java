import java.util.Scanner;

public class HW_Var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner (System.in);
		
		
		int menu ;
		while(true) { 
		
		System.out.println(" 메뉴를 입력하시오 ");
		System.out.println("1. 다섯 수를 입력하면 총합, 평균을 계산해주는 프로그램");
		System.out.println("2. 온도를 섭씨에서 화씨로 계산해주는 프로그램");
		System.out.println("3. BMI 계산해주는 프로그램");
		System.out.println("4.종료");
		
		
		
		
		
		
		menu = a.nextInt();
		
		
		
		if (menu==1) {
			int sum;
			double aver;
			System.out.println("점수 다섯개를 입력하시오");
			
			
			int num1 = b.nextInt();
			int num2 = c.nextInt();
			int num3 = d.nextInt();
			int num4 = e.nextInt();
			int num5 = f.nextInt();
			
			sum = num1+num2+num3+num4+num5;
			aver = sum/5;
			
			String message = String.format("총점은 %d 이고 평균은 %.2f 입니다", sum, aver);
			System.out.println(message);
			
		
		}
			
		else if (menu==2) {
			
			double temp;
			
			System.out.println("온도를 입력하시오 : ");
			Scanner g = new Scanner(System.in);
			temp = g.nextInt();
			
				String message = String.format("화씨로 %.2f이다.",(temp*1.8) +32 );
			System.out.println(message);
			
			g.close();
			
		}
		
		else if( menu==3) {
			double weight, height;
			
			System.out.println("체중을 입력하시오");
			
			Scanner h = new Scanner(System.in);
			System.out.println("키를 입력하시오");
			Scanner j = new Scanner(System.in);
			
			weight = h.nextInt();
			height = j.nextInt();
			
			
			
			String message = String.format("BMI는 %.5f이다.",	weight / (height*height));
			System.out.println(message);
			
			h.close();
			j.close();
		}
		
		else if(menu ==4){
		break;	
		System.out.println("종료합니다"); 
		}
		}
		a.close();
		
		
	}

}
