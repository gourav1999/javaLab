public class program {
	public int test(int n, int m) {
		/*
		 * Exercise 10: Least common multiple- Given two integers n and m, the objective
		 * is to compute the LCM (least common multiple) of n and m. LCM is the smallest
		 * number that is divisble by both n amd m. For e.g. is n is 12 and m is 14, the
		 * LCM is 84. If n is 32 and m is 16, the LCM is 32.
		 */
		int a = m, b = n;
		if (m < n) {
			m = n + m;
			n = m - n;
			m = m - n;

		}
		if (m > n) {
			while (m % n != 0) {
				n = m % n;
				m = n;
			}
		}
		return (a * b) / n;
	}

	public static void main(String args[]) {
		program o1 = new program();
		System.out.println(o1.test(16, 32));
	}
}
