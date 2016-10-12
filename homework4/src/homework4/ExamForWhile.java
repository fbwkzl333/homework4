package homework4;

import java.util.Scanner;
public class ExamForWhile {


	public static void main(String[] args) {
				Start();		// 메소드 호출 ( 프로그램 시작 )
	}
	public static void Start(){		// 메뉴 1~6 기능 ( 각 클래스에서 호출함 )
		System.out.print("1. 1부터 입력한 수까지 더하기\n"
				+ "2. 최대값/최소값구하기\n"
				+ "3. 입력받은숫자의 합계와 평균구하기\n"
				+ "4. 원하는 구구단 출력하기 \n"
				+ "5. 짝수단/홀수단 출력하기\n"
				+ "6. 종료하기\n"
				+ "원하는 메뉴는>>");
		Scanner s = new Scanner(System.in);
		int main = s.nextInt();		// Int형 을 입력받아 main에 집어넣음
		switch(main){	// main 을 비교
		case 1:	// 입력받은 int main이 1일때
			SumOfNumbers num1 = new SumOfNumbers();		// 1기능 클래스 인스턴스 생성
			num1.SumOf();	// 호출
			break;	// 스위치문 나감
		case 2:
			MaxAndMin num2 = new MaxAndMin();
			num2.MaxMin();
			break;
		case 3:
			SumAndAvg num3 = new SumAndAvg();
			num3.SumAvg();
			break;
		case 4:
			GuGuDan num4 = new GuGuDan();
			num4.Gugudan1();
			break;
		case 5:
			GuGuDan2 num5 = new GuGuDan2();
			num5.Gugudan2();
			break;
		case 6:
			System.out.println("Goodbye Thank you !");
			break;
		case 7:		// 테스트용 과제와는 관련없음
			Exception num6 = new Exception();
			num6.Excep();
			break;
		}
	}
	
}
