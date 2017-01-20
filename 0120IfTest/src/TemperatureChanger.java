import java.util.Scanner;

/**
 * ¼·¾¾¸¦ È­¾¾·Î È­¾¾¸¦ ¼·¾¾·Î ¹Ù²ãÁÖ´Â ÇÁ·Î±×·¥
 * @author Ã¤Àº
 *
 */
public class TemperatureChanger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int num;
		double temp;
		
		System.out.println("¿Âµµ ÀÔ·Â");
		Scanner a = new Scanner(System.in);
		temp = a.nextInt();
		
		System.out.println("1 : ¼·¾¾ -> È­¾¾");
		System.out.println("2 : È­¾¾ -> ¼·¾¾");
		
		Scanner b = new Scanner(System.in);
		num= b.nextInt();
		
		if (num==1) {
			System.out.println("È­¾¾·Î " +((temp*1.8) +32));
		}
		else {
			System.out.println("¼·¾¾·Î " + ((temp-32)/1.8));
		}
			String message = String.format("È­¾¾·Î %.2fÀÌ´Ù.",(temp*1.8) +32 );
		System.out.println(message);
		
		
		
		a.close();
		b.close();
	
	}

}
