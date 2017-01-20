import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1200원 이상이면 커피를 살 수 있음을 알려주는 프로그램
		*/
		int num;
		
		//주머니의 돈을 설정
		Scanner money = new Scanner (System.in);
		
		num = money.nextInt();
		
		if (num>1200) {
			System.out.println("살 수 있다 "); 
			}
		else
		System.out.println("아니야");
		
		money.close();
		//주머니에 돈이 1200 이상인지  확인
		
		//1200원 이상이면 살수있음을 출력
		
		
	}

}
