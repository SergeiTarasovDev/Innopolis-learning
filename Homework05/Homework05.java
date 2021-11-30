import java.util.Scanner;

class Homework05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int remainder;
		int min = 10;		
		
		while (a != -1) {
			
			if (a < 0) {
				a *= -1;
			}
			
			while (a > 0) {
				remainder = a % 10;
				if (remainder < min) {
					min = remainder;
				}
				a = a / 10;
			}
			a = scanner.nextInt();		
		}
		
		if (min == 10) {
			System.out.println("�� �� ����� �� ������ �����!");
		} else {
			System.out.println("�����: " + min);
		}
	}
}
