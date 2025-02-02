class BubbleSort {
	public static void main(String args[]) {
		int i, j, temp;
		int[] x = { 5, 7, 8, 4, 3, 2, 1 };
		int n = x.length;
		for (int k = 0; k < n; k++) {
			System.out.print(x[k] + "   ");
		}
		System.out.println();
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - 1 - i; j++) {
				if (x[j] > x[j + 1]) {
					temp = x[j];
					x[j] = x[j + 1];
					x[j + 1] = temp;
				}

				for (int k = 0; k < n; k++) {
					System.out.print(x[k] + "   ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		for (i = 0; i < n; i++) {
			System.out.println(x[i]);
		}
	}
}