package ArraysAndSort;

public class BubbleSort {
	public void bubbleSort() {

		for (int i = arraySize - 1; i > 1; i--) {

			for (int j = 0; j < i; j++) {

				if (theArray[j] > theArray[j + 1]) {
					swapValues(j, j + 1);
				}

			}

		}
	}

}
