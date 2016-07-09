package DynamicProgramming;

public class CoinChange {
	public int coinchange(int[] coins, int total){
		int[] T = new int[total+1];
		int[] R = new int[total+1];
		T[0] = 0;
		for(int i = 1; i<=total; i++){
			T[i] = Integer.MAX_VALUE - 1;
			R[i] = -1;
		}
		
		for(int j = 0; j<coins.length; j++){
			for(int i = 1; i < T.length; i++){
				if(i >= coins[j]){
					if(T[i-coins[j]] + 1 < T[i] ){
						T[i] = 1 + T[i-coins[j]];
						R[i] = j;
					}
				}
			}
		}
		
		printcoins(R,coins);
		
		
		return T[total];
		
	}
	
	
	private void printcoins(int[] r, int[] coins) {
		// TODO Auto-generated method stub
		for(int i = r.length - 1; i > 0; ){
			int j = r[i];
			System.out.print(coins[j] + " ");
			i = i - coins[j];
		}
		System.out.println();
	}


	public static void main(String[] args){
		CoinChange cc = new CoinChange();
		int[] coins = {7,2,3,6};
		int res = cc.coinchange(coins, 13);
		System.out.println(res);
	}
}
