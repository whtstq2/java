
public class Arrays {

	public static 
	void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"tom", "jane", "alisia" };
		//���
		//������ ���� i�� 0���� ������ names�� �������� �ϳ� ���� �� ��ŭ �ݺ��Ѵ� 
		for (int i =0; i < names.length; i++) // �������� int i
		{
			System.out.println(i);
			System.out.println(names[i]);
		}
		
		int[] nums=  {10, 20,30, 100, 40, 50, 340, 90, 30,900};
		//�հ� ��� �� ���
		// ������ ���� i�� 0���� ������ scores�� �������� �ϳ� ���� ����ŭ �ݺ��Ѵ� 
		int sum=0;
		for (int i=0; i<nums.length; i++)
		{
			
			System.out.println("���� i�� ��: "+ i );
			System.out.println("i��° �����ǰ�: "+ nums[i]);
			sum = sum + nums[i];
			System.out.println("������: "+ sum);
		}
		
		
		for (int score : nums) {
			System.out.println(score);
		}
		
	}

}
