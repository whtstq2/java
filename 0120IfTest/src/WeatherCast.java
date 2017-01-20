import java.util.Scanner;

/**
 * 비가 오는지 안오는지 체크하여 우산의 필요성 유무 체크
 * @author 채은
 *
 */
public class WeatherCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner a = new Scanner (System.in);
		
for (int i =0;  i<3; i++) {
		
		int rainy;
		
		System.out.println("지금 날씨는 어떤가요?");
	
		System.out.println("1. 비가 온다   2. 맑다");
		
		
		
		
		rainy = a.nextInt();
		
		
		if (rainy==1) {
			System.out.println("우산을 챙겨가세요");
		}
		else
			System.out.println("우산은 필요없어요");
		
		
		}
		a.close();
		
	}

}
