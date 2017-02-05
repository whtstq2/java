/**
 * for를 이용한 5층 % 피라미드
 * @author 채은
 *
 */
public class HW_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 행(가로) ,열(세로) 변수 설정 
		// 2. 5줄의 행을 만든다 
		for (int row=1; row<6; row++) {
			
			
			for (int col =1; col<=row; col++) {
			
				System.out.print("%");
				
			}
			System.out.println();
		}
		
	}

}

