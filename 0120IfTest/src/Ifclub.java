import java.util.Scanner;

public class Ifclub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		
		Scanner num = new Scanner (System.in);
				
		age = num.nextInt();		
		
		if (age<20 && age>=10){
		System.out.println("입장불가능");
		}
		
		else if (age >=30 && age <40)
		System.out.println("입장가능");
		
		else
			System.out.println("몰라");
		num.close();
	}

}

/*
 * boolean isTeenager = age <20;
 * if (isTeenager) {
 * System.out.println();}
 */
