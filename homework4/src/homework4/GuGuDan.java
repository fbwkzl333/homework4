// (4번) 구구단 출력하기

package homework4;

import java.util.Scanner;

public class GuGuDan {
	public void Gugudan1(){
		Scanner s = new Scanner(System.in);
		while(true){
		System.out.print("출력하고 싶은 단(Q:종료) >> ");
		if(s.hasNextInt()){
			
			int su = s.nextInt();
			if(su <= 1 || su >= 10){
				System.out.println("잘못입력");
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
