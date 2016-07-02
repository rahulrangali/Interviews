package DynamicProgramming;

public class Knapsack01 {
	/*Given n items with weights and values find items with max value with the given max weight; 
	eg: wt=[1,3,4,5] and val=[1,4,5,7] maxwt=7 ans should be maxval=9(items with wt 3,4)*/
	public int findMaxValue(int[] wt, int[] val, int maxwt){
		
		int T[][] = new int[val.length+1][maxwt+1];
		for(int i = 0; i<T.length; i++){
			for(int j=0;j<T[0].length; j++){
				if(i==0||j==0){
					T[i][j] = 0;
				}else{
					if(j-wt[i-1] > 0){
						T[i][j] = Math.max(T[i-1][j], val[i-1] + T[i-1][j-wt[i-1]]);
					}else{
						T[i][j] = T[i][j-1];
					}
				}
			}
		}
		return T[val.length][maxwt];
		
	}
	
	public int bottomUpDP(int val[], int wt[], int W){
        int K[][] = new int[val.length+1][W+1];
        for(int i=0; i <= val.length; i++){
            for(int j=0; j <= W; j++){
                if(i == 0 || j == 0){
                    K[i][j] = 0;
                    continue;
                }
                if(j - wt[i-1] >= 0){
                    K[i][j] = Math.max(K[i-1][j], K[i-1][j-wt[i-1]] + val[i-1]);
                }else{
                    K[i][j] = K[i-1][j];
                }
            }
        }
        return K[val.length][W];
    }

	
	
	public static void main(String args[]){
        Knapsack01 k = new Knapsack01();
        int val[] = {22, 20, 15, 30, 24, 54, 21, 32, 18, 25};
        int wt[] = {4, 2, 3, 5, 5, 6, 9, 7, 8, 10};
        int r = k.findMaxValue(wt, val, 30);
        int r1 = k.bottomUpDP(val, wt, 30);
        
        System.out.println(r);
        System.out.println(r1);
        
    }

}
