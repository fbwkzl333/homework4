// (3��) �Է¹��������� �հ�� ��ձ��ϱ�
package homework4;

import java.util.Scanner;

public class SumAndAvg {
	public void SumAvg(){
		Scanner s = new Scanner(System.in);
		int count =0;
		int su =0;
		int sum =0;
		
		while(true){
		System.out.print("���ڸ� �Է�(Q����) >> ");
		if(s.hasNextInt()){
		su =+ s.nextInt();
		sum = sum + su;
		count += 1;
		
		}else if(s.next().equals("Q")){
			break;
		}
		}
			double avg = (double)sum/(double)count;
			System.out.print("�հ�� "+sum+"�̰�, "+"����� "+avg+"�Դϴ�.");
		
		}
		
	}


