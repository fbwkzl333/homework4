// (4��) ������ ����ϱ�

package homework4;

import java.util.Scanner;

public class GuGuDan {
	public void Gugudan1(){
		Scanner s = new Scanner(System.in);
		while(true){ 		// while �� ����
		System.out.print("����ϰ� ���� ��(Q:����) >> ");
		if(s.hasNextInt()){		// if�� ����( nxetInt�� �ƴ� �༮ ������ false => 22�� Line�� else if ������ �̵� )
			int su = s.nextInt();  // int�� �Է��ؼ� su�� ����
			if(su <= 1 || su >= 10){	// �Է� ���� su �� 1���� �۰ų� 10 �̻� �� ���
				System.out.println("�߸��Է�");	// "�߸��Է�" �� ��� 
			}else{  // ���������� su = 1~9 �� �Է��� ���
			for(int i=1; i<10; i++){	
				int result = su *i;		// �Է¹����� * i(1~9) �� result�� �ִ´�
				System.out.println(su+"*"+i+"="+result); // "su * i = result" �� ������ ���·� ���
			}
			}
		}else if(s.next().equals("Q")){	// �Է� ���� s�� nextInt���� �ƴҋ�, �������� "Q" �Դϱ�?
			break;  // while ���� ����.
		}
		}
	}
}
