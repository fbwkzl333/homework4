//(1���޴�) 1���� �Է��� ������ ���ϱ� 
package homework4;

import java.util.Scanner;
public class SumOfNumbers {
	Scanner s = new Scanner(System.in);
	public void SumOf(){
		System.out.print("\n1���� �Է��� ������ ���ϱ� ������ ���� �Է�(Q:����) : ");
		String a = s.nextLine();
		
		if(a == "Q"){
			System.out.println("Goodbye Thank you !");
		}
		
		int result =0;
		for(int i = 1; i <= Integer.parseInt(a); i++){
			result = result + i;
		}
		System.out.print("�� ���� "+result+"�Դϴ�.");
		SumOf();
	}
}
