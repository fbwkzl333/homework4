// (4��) ������ ����ϱ�

package homework4;

import java.util.Scanner;

public class GuGuDan {
	public void Gugudan1(){
		Scanner s = new Scanner(System.in);
		while(true){
		System.out.print("����ϰ� ���� ��(Q:����) >> ");
		if(s.hasNextInt()){
			
			int su = s.nextInt();
			if(su <= 1 || su >= 10){
				System.out.println("�߸��Է�");
			}else{
			for(int i=1; i<10; i++){
				int result = su *i;
				System.out.println(su+"*"+i+"="+result);
			}
			}
		}else if(s.next().equals("Q")){
			break;
		}
		}
	}
}
