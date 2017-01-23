
/**
 * 현재 스탠드의 상태에 따라 밝기와 on/off를 조절해주는 프로그램
 * @author 채은 
 *
 */
package co.ktds.cepark;		
public class StandMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stand stand = new Stand();
		
		
		stand.brightnessControlUp();
		stand.brightnessControlDown();
		
		stand.on();
		
		
		stand.brightnessControlUp();
		stand.brightnessControlDown();
		
		stand.off();
		
		stand.brightnessControlUp();
		stand.brightnessControlDown();
	}

}
