// (2��) �ִ밪/�ּҰ����ϱ�
package homework4;

import java.util.ArrayList;
import java.util.Scanner;
public class MaxAndMin {		
	public void MaxMin(){
		 int a = 0;
		 int max =0; 
		 int min=100;
		 Scanner s = new Scanner(System.in);
		  String b = "";
		  // ��ĵ�� s ���� ���� (Q���� ����� �ϱ����� string����)
		  while (true) {
		   // b �� Q�� �ƴϸ� ���ǹ� ����
		   System.out.print("0~100������ ���ڸ� �Է�(Q:����) >> ");
		   b = s.next();
		   if(b.equals("Q")) {
		    break;
		   }
		   if(Integer.parseInt(b) > max){	// �Է¹��� �༮�� max���� ũ��
			   max = Integer.parseInt(b);	// ó���� ������ max�� ��
		   }
		   
		  
		   if(Integer.parseInt(b) < min){
			   min = Integer.parseInt(b);
		   }	
		  }
		  System.out.println("���� ū���� " +max+"�̰�,"+" ���� ���� "+min+"�Դϴ�.");
	}
	
	public void Maxmin2(){ // �׽�Ʈ��
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
