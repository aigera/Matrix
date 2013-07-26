public class MatrixExample {

	public static void main(String[] args) {
		int n = 2, m = 3, l = 4;
		Matrix p = MatrixFactory.createRandomized(n, m);
		Matrix q = MatrixFactory.createRandomized(m, l);
		System.out.println("Matrix 1: " + p);
		System.out.println("Matrix 2: " + q);
		try {
			Matrix result = Multiplicator.multiply(p, q);
			System.out.println("Matrix result: " + result);
		} catch (MultipleException e) {
			System.err.println("Matrices could" + " not be multiplied: ");
		}
	}
}
