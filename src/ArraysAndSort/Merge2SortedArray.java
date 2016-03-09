package ArraysAndSort;

public class Merge2SortedArray {

	int[] merge(int a[], int b[]) {
		len1 = a.length;
		len2 = b.length;
		int c[] = new int[len1 + len2];

		while (i != len1 || j != len2) {

			if (a[i] <= b[j]) {
				c[k] = a[i];
				i++;

			} else if (a[i] > b[j]) {
				c[k] = b[j];
				j++;
			}
			k++;
		}

		while (i != len1) {
			c[k] = a[i];
			k++;
			i++;
		}
		while (j != len2) {
			c[k] = b[j];
			k++;
			j++;
		}

		return c;
	}

}
