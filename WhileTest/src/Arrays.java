
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �迭 ���� ��� ���Ҹ� ����Ѵ�
		
		//1. �迭�� �����ϰ� ���� �Ҵ�
		String[] names = {"tom", "jane", "alisia" };
		System.out.println(names[0]);
		
		int[] nums=  {10, 20,30, 100, 40, 50, 340, 90, 30,900};
		
		
		//2. �迭�� ���Ұ����� ������ ��� ����
		int numCount = nums.length;
		
		//3. �迭�� ���Ұ��� ��ŭ �ݺ��ϰ� �� ���Ҹ� ����Ѵ�
		//3.1 �ݺ����� ���� �ϰ� 0���� �ʱ�ȭ
		int i =0;
		int sum =0;
		
		//3.2.1 while �ݺ����� ��� 
		//3.2.2 ������ �ݺ����� nameCount���� ���� ������������ �Ѵ�
		while (i<numCount) {
			
			sum += nums[i];
		i++;
			
		//3.3 �ݺ� ���� : names �迭�� ���Ҹ� ���� ����Ѵ�.
		
		//3.4 �ݺ��� ����
		
		}
		System.out.println(sum);
	}

}
