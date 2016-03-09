package ArraysAndSort;

public class RemoveDuplicates {
	
	int[] remove(int[] arr){
		int m = arr.length;
		int i = 0;
		int j = 1;
		while(i<j){
			if(arr[i] == arr[j]){
				j++;
			}
			else{
				i++;
				arr[i] = arr[j];
				j++;
			}
		}
		return arr;
		
	}

}
