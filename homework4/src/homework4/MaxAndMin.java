// (2��) �ִ밪/�ּҰ����ϱ�
package homework4;

import java.util.ArrayList;
import java.util.Scanner;
public class MaxAndMin {		
	public void MaxMin(){
		 int a = 0;
		 int max =0; 	// ù max�� if���� ������ max�� ���� �ϱ����� ���� �������� ����
		 int min=100;	// ù min�� if���� ������ min�� ���� �ϱ����� ���� ū���� ����
		 Scanner s = new Scanner(System.in);
		  String b = "";	// ��ĵ�� s ���� ���� b ����,�ʱ�ȭ (Q���� ����� �ϱ����� string����)
		  while (true) {	// while �� ����
		   System.out.print("0~100������ ���ڸ� �Է�(Q:����) >> ");
		   b = s.next();	// �Է� �޾Ƽ� ���� (string)
		   if(b.equals("Q")) {	// b�� ���ڿ��� �� "Q" �Դϱ�? Yes => while �� ����,  No => �Ѿ
		    break;	
		   }
		   if(Integer.parseInt(b) > max){	// �Է¹��� �༮�� max���� ũ��
			   max = Integer.parseInt(b);	// ó���� ������ max�� ��
		   }
		   
		  
		   if(Integer.parseInt(b) < min){	// �Է¹��� �༮�� min ���� ������
			   min = Integer.parseInt(b);	// �׷��ٸ� �ʴ� min�� ����
		   }	
		  }
		  System.out.println("���� ū���� " +max+"�̰�,"+" ���� ���� "+min+"�Դϴ�.");	// �Է� �� ������ max, min ���� ���
	}
	
	public void Maxmin2(){ // �׽�Ʈ�� (������ ������� �����Դϴ�)
		      Scanner sc = new Scanner(System.in); 
		      String input = ""; 
		      ArrayList<String> arr = new ArrayList<>(); 
		      while (!input.equals("q")) { 
		         System.out.println("���ڿ� �Է�. (q�� �Է��ϸ� ����)"); 
		         input = sc.next(); 
		         if (!input.equals("q")) arr.add(input); 
		      } 
		      System.out.println(arr); 
		   } 
}
