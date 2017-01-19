import java.util.Scanner;

public class test {
	
	public static void main(String[] args){
		Scanner input= new Scanner(System. in);
		
		int num;
	
		
		System.out.println("======구구단 프로그램======");
		System.out.println("원하시는 구구단을 입력하세요 (입력범위 : 2~9)");
		System.out.print("원하는 구구단 :");
		
		num = input.nextInt();
		
		System.out.println("====================");
		System.out.println("구구단"+ num + "단을 출력합니다.");
		
		int l=0;
		while (l<9) {
			l++;
			System.out.println(num + "*" + l + "=" + (num*l));
		}
				
				input.close();
				}
		
		
		
	}

