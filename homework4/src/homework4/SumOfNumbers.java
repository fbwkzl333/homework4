//(1���޴�) 1���� �Է��� ������ ���ϱ� 
package homework4;

import java.util.Scanner;
public class SumOfNumbers {
	Scanner s = new Scanner(System.in);
	public void SumOf(){
		System.out.print("\n1���� �Է��� ������ ���ϱ� ������ ���� �Է�(Q:����) : ");
		String a = s.next();  // String���� �Է¹��� (Q���� ������)
		
		switch(a){		// (Q:���� �϶�) : ���θ޴��� ���ư�
		case "Q":		// �������� �ǵ��� ���α׷� �������� �޴��� ���ư����� ��Ȯ�� �𸣰ڽ��ϴ�
			ExamForWhile.Start();
			break;
		}
		
		
		int result =0;
		for(int i = 1; i <= Integer.parseInt(a); i++){	// �Է¹��� ���� Int������ �ٲ� and  �� ����ŭ for���� �ݺ���
			result = result + i;	// 0���� �Է¹��� (int)������ result�� ����
		}
		System.out.print("�� ���� "+result+"�Դϴ�."); // 0���� �Է¹��� (int)a ������  �� ���� ���Ǿ� ����
		SumOf();	
	}
}