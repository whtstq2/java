
public class IfTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 현금이 없고 신용카드가 있을 경우 "신용카드로 결제합니다"를 출력하는 프로그램*/
		// 현금이 있다 는 트루
		//현금이 없다 는 false
		
		boolean hasCash = false;
		boolean hasCredit = true;
		
		if (!hasCash && hasCredit) {
			System.out.println("신용카드로 결제 ");
		}
		
	}

}
