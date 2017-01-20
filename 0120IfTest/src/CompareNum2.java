import java.util.Scanner;

public class CompareNum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int num1,num2, num3,result1,result2;
		
		Scanner a = new Scanner (System.in);
		Scanner b = new Scanner (System.in);
		Scanner c = new Scanner (System.in);
		
		num1 = a.nextInt();
		num2 = b.nextInt();
		num3 = c.nextInt();
		
		
		 result1 = (num1>num2)? num1 : num2;
		 result2 = (result1> num3)? result1: num3;
		 
		System.out.println(result2);
		a.close();
		b.close();
		c.close();
		
	}

}

