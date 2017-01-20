import java.util.Scanner;

public class GradeCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pro, mana, math, algo, sum;
		double aver;
		System.out.println("프로그래밍, 경영, 수학, 알고리즘 과목의 점수를 입력하세요");
		
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
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + aver);
		
		String message = String.format("평균은 %.2f입니다", aver);
		System.out.println(message);
		
		
		if ( aver>90) {
			System.out.println("참 잘했어요!");
		}
		else
			System.out.println("참 못했어요!");
		grade1.close();
		grade2.close();
		grade3.close();
		grade4.close();

	}

}
