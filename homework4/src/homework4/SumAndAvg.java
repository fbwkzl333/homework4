// (3��) �Է¹��������� �հ�� ��ձ��ϱ�
package homework4;

import java.util.Scanner;

public class SumAndAvg {
	public void SumAvg(){
		Scanner s = new Scanner(System.in);  // �ý������κ��� �Է¹޾� s�� ���� 
		   int count =0; 		// ���������� ī��Ʈ ���� �˾Ƴ��� �༮
		   int sum =0; 			// �Է¹����� ��� ������ �հ� �༮
		   while(true){   // while�� ����
		      System.out.print("���ڸ� �Է�(Q����) >> "); // �Է��϶�(String)
		      try{  // try 
		    	  String su = s.nextLine(); // ���ڿ��� �Է¹ް� su �� �ִ´�
		    	  count += 1; 				// ī��Ʈ �� +1
		    	  sum += Integer.parseInt(su);  // ���ڿ� su�� int�� �ٲٰ� sum�� ���Ѵ� (�հ� ����)
		      	  } catch (NumberFormatException e){	//try-catch ���ڰ� �ƴѵ� ���ڷ� �Ľ��� �� ���� ����
		    	  double avg = (double)sum/(count-1); // count �ϳ� ������� ����ó���ϴ°ͱ��� count+1 �� �⶧���� (��� ����)
		         System.out.println("�հ�� "+sum+"�̰�, "+"����� "+avg+"�Դϴ�.");	// �հ�, ��� ���
		         break;  // ���ܻ�Ȳ ������ while�� ���� 
		      }
		      
		   }
		}
		
	}


