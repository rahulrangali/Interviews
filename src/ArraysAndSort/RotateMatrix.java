package ArraysAndSort;

public class RotateMatrix {
	
	/*public int[][] rotate(int[][] arr){
		
		int len = arr.length;
		for(int i = 0; i < len/2; i++){
			for (int j = 0; j < (len + 1)/2 ; j++ ){
				int temp = arr[i][j];
				arr[i][j] = arr[len-1-i][j];
				arr[len-1-i][j] = arr[len-1-i][len-1-j];
				arr[len-1-i][len-1-j] = arr[i][len-1-j];
				arr[i][len-1-j]=temp;
				
			}
		}		
		return arr;
		
	}*/
	
	public static int[][] rotate(int[][] matrix){
		int m,n;
		m = matrix.length;
		n = matrix[0].length;
		int[][] result = new int[n][m];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				result[j][m-1-i] = matrix[i][j];
			}
		}
		return result;
	}
	public static void main(String[] args){
		int[][] matrix ={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		int[][] result = new int[4][3];
		result = rotate(matrix);
		for(int i=0; i<result.length; i++){
			for(int j=0; j<result[0].length; j++){
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
