
/**
 * ���� ���ĵ��� ���¿� ���� ���� on/off�� �������ִ� ���α׷�
 * @author ä�� 
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
