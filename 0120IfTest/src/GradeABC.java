
import java.util.Scanner;

/**
 * ���� ����ϴ� ���α׷� <br/>
 * ������ �Է��ϸ� ABCDF ������ ������ش� 
 * @author Park Chae eun 
 *<pre>
�ۼ��ϰ���������� ����ȴ� 
�Ȱ��� ���δ� 
</pre>
 */


public class GradeABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade;
		
		Scanner num = new Scanner (System.in);
		
		grade = num.nextInt();
		
		if (grade ==100){
			System.out.println("���� A+");
		}
			else if ( grade>=90  ) {
				System.out.println("������ �ƴ϶�� �� F" );
			}
			else if ( grade>=80  ) {
				System.out.println("�׷��� F" );
			}
			else if ( grade>=70  ) {
				System.out.println("������ F" );
			}
			else if ( grade>=60  ) {
				System.out.println("�� F" );
			}
			else if ( grade>=50  ) {
				System.out.println("�翬�� F" );
			}
			
			
			else {
				System.out.println("F");
			}
		num.close();
	}

}
