package co.ktds.cepark;

public class Stand {
	
	private String button = "����ġ";
	private String lamp = "����";
	private String elec = "����";
//	String light ="�Һ�";
	private int light = 0;
	
	public void on() {
		System.out.printf("%s�� ���ɴϴ�.\n", elec);
		
		System.out.println("���ĵ带 �մϴ�");
		light = 5;
		
		String message = String.format("%s�� ������ %s�� �մϴ�", button, lamp);
		System.out.println(message);
		
		message = String.format("���� %d�Դϴ�", light);
		System.out.println(message);
	}
	
	public void off() {
		light = 0;
	}
	
	public void brightnessControlUp() {
		if (light>0) {
			light++;
			System.out.printf("��⸦ �����մϴ�. ���� %d�Դϴ�.\n",light);
		}
		else {
			System.out.println("������ �����ֽ��ϴ�");
		}
	}
	
	public void brightnessControlDown() {
		if (light>0) {
			light--;
			System.out.printf("��⸦ �����մϴ�. ���� %d�Դϴ�.\n",light);
		}
		else {
			System.out.println("������ �����ֽ��ϴ�");
		}
	}
}
