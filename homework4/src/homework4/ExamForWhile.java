package homework4;

import java.util.Scanner;
public class ExamForWhile {


	public static void main(String[] args) {
				System.out.print("1. 1���� �Է��� ������ ���ϱ�\n"
				+ "2. �ִ밪/�ּҰ����ϱ�\n"
				+ "3. �Է¹��������� �հ�� ��ձ��ϱ�\n"
				+ "4. ���ϴ� ������ ����ϱ� \n"
				+ "5. ¦����/Ȧ���� ����ϱ�\n"
				+ "6. �����ϱ�\n"
				+ "���ϴ� �޴���>>");
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
