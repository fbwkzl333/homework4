// (5��) ¦����/Ȧ���� ����ϱ�
package homework4;

import java.util.Scanner;

public class GuGuDan2 {
	public void Gugudan2(){
		Scanner s = new Scanner(System.in);
		while(true){	// while�� ����
			System.out.print("E¦����, OȦ����(Q����) >> ");
			String a = s.nextLine();
			switch(a){	//switch �� ����
			case "E":	// �Է¹��� a �� "E", ¦���� ������ ���
				for(int j=2; j<10; j=j+2){ // j�� 2�� ���� +2�� �����ְ� 10�̸� (2��, 4��, 6��, 8�� )
					System.out.println("");
				for(int i=1; i<10; i++){	// i��  1���� 9���� ���ؼ� result�� ����
					int result = j *i; // result =  j(2~8) * i(1~9)
					System.out.print(j+"*"+i+"="+result+"  ");	// �������������� ���
				}
				}
				break;  // a�� "E"����� switch�� ����
			case "O":	// �Է¹��� a�� "O"�� ���, Ȧ���� ������ ���
				for(int j=3; j<10; j=j+2){
					System.out.println("");
					for(int i=1; i<10; i++){
						int result = j *i;
						System.out.print(j+"*"+i+"="+result+"  ");
					}
					}
					break; 	// switch �� ����
			}if(s.next().equals("Q")){  // s�� "Q" ���� �� �� ������ 
				break;	// while�� ����
			}
		}
	}
}
