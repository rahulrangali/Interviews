package DynamicProgramming;

public class SubsetSum {
	public boolean subset(int[] val, int total) {
		boolean T[][] = new boolean[val.length+1][total + 1];
		for(int i = 0; i<T.length; i++){
			T[i][0] = true;
		}
		for (int i = 1; i <= val.length; i++) {
			for (int j = 1; j <= total; j++) {
				if(j<val[i-1]){
					T[i][j] = T[i-1][j];
				}else{
					T[i][j] = T[i-1][j] || T[i-1][j-val[i-1]];
				}
				
			}
		}
		return T[val.length][total];
	}
	
	public static void main(String[] args){
		SubsetSum ss = new SubsetSum();
		int[] arr1 = {2,3,7,8};
		boolean res1 = ss.subset(arr1, 19);
		boolean res2 = ss.subset(arr1, 11);
		System.out.println(res1);
		System.out.println(res2);
		
	}

}
