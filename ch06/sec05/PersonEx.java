package ch06.sec05;

public class PersonEx {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567","ȫ�浿");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "USA";//final �ʵ� ���� �Ұ�
		//p1.ssn="6543f21-7654321";//final �ʵ� ���� �Ұ�
		p1.name="�̸���";
		

	}

}
