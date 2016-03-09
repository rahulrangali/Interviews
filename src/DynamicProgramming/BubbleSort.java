package DynamicProgramming;

public class BubbleSort {
	static int[] arr= new int[4];
	public static void main(String[] args){
		int j=4;
		for(int i=0; i<arr.length;i++){
			arr[i] = j;
			j--;
			System.out.print(arr[i]+" ");
		}
		bubble();
		System.out.println();
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	private static void bubble() {
		int temp = 0;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length-1; j++ ){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
		
	}
}
