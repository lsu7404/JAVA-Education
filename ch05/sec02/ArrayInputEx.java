package ch05.sec02;

import java.util.Scanner;

public class ArrayInputEx {

	public static void main(String[] args) {
		// ���� 5���� �Է� �޾Ƽ� �ִ밪�� ���ϴ� ���α׷�
		// ���� �Է�
		//num[0] : 87
		//...
		Scanner sc=new Scanner(System.in);
		int[]num=new int[5];
		int max =0;
		
		System.out.println("���� �Է�");
		for(int i=0; i<num.length;i++) {
			System.out.println("mum["+i+"]:");
			num[i]= sc.nextInt();
			
			if(num[i]>max)//�Էµ� ���� max ���� ũ��
				max=num[i];
		}
		
		//�Էµ� �� :.....
		//�ִ밪 :
		System.out.println("\n�Էµ� ��:");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}

		System.out.println("\n�ִ밪:"+max);
		
		sc.close();
	}

}