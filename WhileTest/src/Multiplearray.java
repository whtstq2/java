
public class Multiplearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] numbers = {
				{2,4,6,8,10,12,14,16,18},
				{3,6,9,12,15,18,21,24,27},
				{4,8,12,16,20,24,28,32,36}
		};
		/*
		System.out.println(numbers[0][0]);
		System.out.println(numbers[0][1]);
		System.out.println(numbers[0][2]);
		
		System.out.println(numbers[1][0]);
		System.out.println(numbers[1][1]);
		System.out.println(numbers[1][2]);

		System.out.println(numbers[2][0]);
		System.out.println(numbers[2][1]);
		System.out.println(numbers[2][2]); */
		// 행,열의 개수를 가져온다 
		int rowCount = numbers.length; //열
		
		//행의 개수 만큼 증가 
		
		int i=0;
		int j =0;
		
		
		while(i<rowCount) {
			int colCount = numbers[i].length;
			
			while (j <colCount) {
				
				System.out.println(numbers[i][j]);
				j ++;
			}
			//j를 초기화 한다 
			j =0;
			i++;	
		}
		
		for (i=0;i<rowCount;i++)
		{
			int colCount = numbers[i].length;
			for(j=0; j<colCount;j++)
				System.out.println(numbers[i][j]);
		}
		
		
		
		
	}

}
