// (3��) �Է¹��������� �հ�� ��ձ��ϱ�
package homework4;

import java.util.Scanner;

public class SumAndAvg {
	public void SumAvg(){
		Scanner s = new Scanner(System.in); 
		   int count =0; 		// ���������� ī��Ʈ ���� �˾Ƴ��� �༮
		   int sum =0; 			// �Է¹����� ��� ������ �հ� �༮
		   while(true){ 
		      System.out.print("���ڸ� �Է�(Q����) >> "); // �Է��϶� 
		      try{
		    	  String su = s.nextLine(); // ���ڿ��� �Է¹ް� su �� �ִ´�
		    	  count += 1; 				// ī��Ʈ ��
		    	  sum += Integer.parseInt(su);  // ���ڿ� su�� int�� �ٲٰ� sum�� ���Ѵ�
		      	  } catch (NumberFormatException e){	// ���ڰ� �ƴѵ� ���ڷ� �Ľ��� �� ���� ����
		    	  double avg = (double)sum/(count-1); // count �ϳ� ������� ����ó���ϴ°ͱ��� count+1 �� �⶧����
		         System.out.println("�հ�� "+sum+"�̰�, "+"����� "+avg+"�Դϴ�."); 
		         break;
		      }
		      
		   }
		}
		
	}


