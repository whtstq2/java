import java.util.Scanner;

public class IfTestSub1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner a = new Scanner (System.in);
		
for (int i =0;  i<3; i++) {
		
		int rainy;
		
		System.out.println("지금 날씨는 어떤가요?");
	
		System.out.println("1. 비가 온다   2. 맑다 3. 종료");
		
		
		
		
		rainy = a.nextInt();
		
		
		if (rainy==1) {
			System.out.println("우산을 챙겨가세요");
		}
		else if (rainy ==2){
			System.out.println("우산은 필요없어요");
		}
		else 
			break;
		
			
		}

		a.close();
		
	}
}
