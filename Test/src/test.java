import java.util.Scanner;

public class test {
	
	public static void main(String[] args){
		Scanner input= new Scanner(System. in);
		
		int num;
	
		
		System.out.println("======������ ���α׷�======");
		System.out.println("���Ͻô� �������� �Է��ϼ��� (�Է¹��� : 2~9)");
		System.out.print("���ϴ� ������ :");
		
		num = input.nextInt();
		
		System.out.println("====================");
		System.out.println("������"+ num + "���� ����մϴ�.");
		
		int l=0;
		while (l<9) {
			l++;
			System.out.println(num + "*" + l + "=" + (num*l));
		}
				
				input.close();
				}
		
		
		
	}

