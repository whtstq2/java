import java.util.Scanner;

public class Ifclub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		
		Scanner num = new Scanner (System.in);
				
		age = num.nextInt();		
		
		if (age<20 && age>=10){
		System.out.println("����Ұ���");
		}
		
		else if (age >=30 && age <40)
		System.out.println("���尡��");
		
		else
			System.out.println("����");
		num.close();
	}

}

/*
 * boolean isTeenager = age <20;
 * if (isTeenager) {
 * System.out.println();}
 */
