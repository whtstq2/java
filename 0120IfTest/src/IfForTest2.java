
public class IfForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i=1; i<101; i++) {
			// 2.  i 값이 홀수인지 확인한다 
			if (i%2 == 1) {
				
				// i값이 홀수라면 반복을 건너 뛴다 
				continue; // for, while에만 사용할 수 있다.
			}
		
		System.out.println(i);
		
	}

}
}