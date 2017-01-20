
import java.util.Scanner;

/**
 * 학점 계산하는 프로그램 <br/>
 * 점수를 입력하면 ABCDF 학점을 계산해준다 
 * @author Park Chae eun 
 *<pre>
작성하고싶은내용을 쓰면된다 
똑같이 보인다 
</pre>
 */


public class GradeABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade;
		
		Scanner num = new Scanner (System.in);
		
		grade = num.nextInt();
		
		if (grade ==100){
			System.out.println("축하 A+");
		}
			else if ( grade>=90  ) {
				System.out.println("만점이 아니라면 넌 F" );
			}
			else if ( grade>=80  ) {
				System.out.println("그래도 F" );
			}
			else if ( grade>=70  ) {
				System.out.println("여전히 F" );
			}
			else if ( grade>=60  ) {
				System.out.println("걍 F" );
			}
			else if ( grade>=50  ) {
				System.out.println("당연히 F" );
			}
			
			
			else {
				System.out.println("F");
			}
		num.close();
	}

}
