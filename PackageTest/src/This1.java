
public class This1 {

	int i;
	double d;
	/**
	 * 먼저 10을 받아온다 이 10은 처음 this1(int i)에 들어간다 10 정수형
	 * this(3.14) 이 this는 밑의 this1(double d)를 불러온다 3.14가 this1(double d)에 들어가는 것이다 
	 * 그래서 this (3.14)는 3.14를 출력 
	 * 그리고 system.out.println(i) i는 100이므로 그대로 100 출력 
	 * 
	 * @param i
	 */
	
	
	 public This1(int i){ 
		      this(3.14); // 10라인의 생성자를 호출
		       System.out.println(i); 
		     } 
	 public This1(double d){ 
		      System.out.println(d); 
		     } 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This1 t=new This1(10); 
	}

}
