package ch04.sec02;

//switch 문
//주의!
//수식으로는 값이 결과가 정수, 문자역, 문자 값이어야 함
//case 뒤의 value로는 반드시 하나의 값만 사용 (범위 1~10는 올 수 없음)
//case 다음에는 콜론(:) 사용 (세미콜론(;)아님)
//break 문이 없는 경우 해당 case에서 실행이 멈추지 않고 다음 case 까지 수행됨

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.print("학년입력 : ");
		year=sc.nextInt();
		
		switch(year) {
			case 1: System.out.println("1학년");break;
			case 2: System.out.println("2학년");break;
			case 3: System.out.println("3학년");break;
			case 4: System.out.println("4학년");break;
			default: System.out.println("잘못 입력하였습니다.");
			}
		
		sc.close();

	}

}
