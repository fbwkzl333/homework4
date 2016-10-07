package homework4;

import java.util.Scanner;
public class ExamForWhile {


	public static void main(String[] args) {
				System.out.print("1. 1부터 입력한 수까지 더하기\n"
				+ "2. 최대값/최소값구하기\n"
				+ "3. 입력받은숫자의 합계와 평균구하기\n"
				+ "4. 원하는 구구단 출력하기 \n"
				+ "5. 짝수단/홀수단 출력하기\n"
				+ "6. 종료하기\n"
				+ "원하는 메뉴는>>");
		Scanner s = new Scanner(System.in);
		int main = s.nextInt();
		switch(main){
		case 1:
			SumOfNumbers num1 = new SumOfNumbers();
			num1.SumOf();
			break;
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
		}
	}

}
