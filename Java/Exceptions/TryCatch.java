package Exceptions;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Start");

		try {
			int i = 10 / 0;
			System.out.println(i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}

		System.out.println("Stop");

	}

}
