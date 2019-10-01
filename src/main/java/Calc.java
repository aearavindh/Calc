import java.util.Scanner;

public class Calc {

	public static int add(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static int div(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();
		System.out.println("a + b = "+add(a,b));
		System.out.println("a - b = "+sub(a,b));
		System.out.println("a * b = "+mul(a,b));
		System.out.println("a / b = "+div(a,b));
        sc.close();
	}

}
