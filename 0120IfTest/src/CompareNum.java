import java.util.Scanner;

public class CompareNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 입력받을 세개의 수를 저장 할 변수를 만든다  
		int num1,num2, num3;
		
		Scanner a = new Scanner (System.in);
		Scanner b = new Scanner (System.in);
		Scanner c = new Scanner (System.in);
		
		num1 = a.nextInt();
		num2 = b.nextInt();
		num3 = c.nextInt();
		
		if (num1>num2 && num1>num3) {
			System.out.println(num1);
		}
		else if (num2>num1 && num2>num3) {
			System.out.println(num2);
		}
		else
			System.out.println(num3);
		
		a.close();
		b.close();
		c.close();
		
	}

}
