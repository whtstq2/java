
public class Arrays {

	public static 
	void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"tom", "jane", "alisia" };
		//출력
		//정수형 변수 i는 0부터 시작해 names의 개수보다 하나 작은 수 만큼 반복한다 
		for (int i =0; i < names.length; i++) // 지역변수 int i
		{
			System.out.println(i);
			System.out.println(names[i]);
		}
		
		int[] nums=  {10, 20,30, 100, 40, 50, 340, 90, 30,900};
		//합계 계산 후 출력
		// 정수형 변수 i는 0부터 시작해 scores의 개수보다 하나 작은 수만큼 반복한다 
		int sum=0;
		for (int i=0; i<nums.length; i++)
		{
			
			System.out.println("현재 i의 값: "+ i );
			System.out.println("i번째 원소의값: "+ nums[i]);
			sum = sum + nums[i];
			System.out.println("총합은: "+ sum);
		}
		
		
		for (int score : nums) {
			System.out.println(score);
		}
		
	}

}
