package methodtest;

public class MyMathTest {

	public static void main(String[] args) {

		MyMath mm = new MyMath();
		long reult1 = mm.add(5L, 3L);
		long reult2 = mm.subtract(5L, 3L);
		long reult3 = mm.multiply(5L, 3L);
		double reult4 = mm.divide(5L, 3L);

		System.out.println("add(5L ,3L)= " + reult1);
		System.out.println("subtract(5L ,3L)= " + reult2);
		System.out.println("multiply(5L, 3L) = " + reult3);
		System.out.println("divide(5L, 3L) = " + reult4);

	}

}

class MyMath {

	long add(long a, long b) {

		long reult = a + b;
		return reult;
		// return a + b;//

	}

	long subtract(long a, long b) {
		return a - b;
	}

	long multiply(long a, long b) {
		return a * b;
	}

	double divide(double a, double b) {
		return a / b;
	}

}
