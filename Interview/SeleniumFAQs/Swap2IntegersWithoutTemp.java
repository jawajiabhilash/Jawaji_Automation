package SeleniumFAQs;

public class Swap2IntegersWithoutTemp {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("Before swap a=" + a + " b=" + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swap a=" + a + " b=" + b);

	}

}
