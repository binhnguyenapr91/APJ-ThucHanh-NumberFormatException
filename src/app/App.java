package app;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
       		System.out.println("Input x: ");
      		 int x = scanner.nextInt();
       		System.out.println("Input y: ");
       		int y = scanner.nextInt();
		App calc = new App();
		calc.calculate(x, y);

	}

	private void calculate(int x, int y) {
		try {
			int a = x + y;
			int b = x - y;
			int c = x * y;
			int d = x / y;
			System.out.println("x + y = " + a);
			System.out.println("x - y = " + b);
			System.out.println("x * y = " + c);
			System.out.println("x / y = " + d);
		} catch (Exception e) {
			System.err.println("Exception found: " + e.getMessage());
		}
	}
}
