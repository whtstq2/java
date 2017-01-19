
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 안의 모든 원소를 출력한다
		
		//1. 배열을 정의하고 값을 할당
		String[] names = {"tom", "jane", "alisia" };
		System.out.println(names[0]);
		
		int[] nums=  {10, 20,30, 100, 40, 50, 340, 90, 30,900};
		
		
		//2. 배열의 원소개수를 변수에 담아 보관
		int numCount = nums.length;
		
		//3. 배열의 원소개수 만큼 반복하고 각 원소를 출력한다
		//3.1 반복값을 정의 하고 0으로 초기화
		int i =0;
		int sum =0;
		
		//3.2.1 while 반복문을 사용 
		//3.2.2 조건은 반복값이 nameCount보다 작을 때까지만으로 한다
		while (i<numCount) {
			
			sum += nums[i];
		i++;
			
		//3.3 반복 구문 : names 배열의 원소를 꺼내 출력한다.
		
		//3.4 반복값 증가
		
		}
		System.out.println(sum);
	}

}
