// (5��) ¦����/Ȧ���� ����ϱ�
package homework4;

import java.util.Scanner;

public class GuGuDan2 {
	public void Gugudan2(){
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.print("E¦����, OȦ����(Q����) >> ");
			String a = s.nextLine();
			switch(a){
			case "E":
				for(int j=2; j<10; j=j+2){
					System.out.println("");
				for(int i=1; i<10; i++){
					int result = j *i;
					System.out.print(j+"*"+i+"="+result+"  ");
				}
				}
				break;
			case "O":
				for(int j=3; j<10; j=j+2){
					System.out.println("");
					for(int i=1; i<10; i++){
						int result = j *i;
						System.out.print(j+"*"+i+"="+result+"  ");
					}
					}
					break;
			}if(s.next().equals("Q")){
				break;
			}
		}
	}
}
