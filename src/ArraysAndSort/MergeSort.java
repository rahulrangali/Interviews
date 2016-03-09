package ArraysAndSort;

public class MergeSort {

	// ******************first solution****************************

	private void mergesort(int low, int high) {

		if (low < high) {
			int middle = low + (high - low) / 2;
			mergesort(low, middle);
			mergesort(middle + 1, high);
			merge(low, middle, high);
		}
	}

	private void merge(int low, int middle, int high) {

		for (int i = low; i <= high; i++) {
			helper[i] = numbers[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;

		while (i <= middle && j <= high) {
			if (helper[i] <= helper[j]) {
				numbers[k] = helper[i];
				i++;
			} else {
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}

		while (i <= middle) {
			numbers[k] = helper[i];
			k++;
			i++;
		}
	}

	// ******************first solution ends****************************

	// ******************second solution****************************
	public static void sort(int[] A, int p, int r) {
		if (p < r) {
			int q = (r + p) / 2;
			sort(A, p, q);
			sort(A, q + 1, r);
			merge(A, p, q, r);
		}
	}

	private static void merge(int[] a, int p, int q, int r) {
		int[] L = new int[q - p + 1];
		int[] R = new int[r - q];
		for (int i = 0; i < R.length; i++) {
			R[i] = a[p + i];
		}
		for (int i = 0; i < L.length; i++) {
			L[i] = a[q + i + 1];
		}
		for (int k = p, i = 0, j = 0; k < r;) {
			if (L[i] <= R[j]) {
				a[k++] = L[i++];
			} else {
				a[k++] = R[j++];
			}

			if (i == L.length) {
				for (int m = j; m < R.length; m++) {
					a[k++] = R[m];
				}
			}
			if (j == R.length) {
				for (int n = i; n < L.length; n++) {
					a[k++] = L[n];
				}
			}
			Utils.printArray(a);
		}
	}

}
