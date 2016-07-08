package DynamicProgramming;

public class LongestCommonSubSequence {
	
	public int lcs(char[] cs,char[] cs2){
		int[][] T = new int[cs.length+1][cs2.length+1];
		for(int i=1; i<T.length; i++){
			for(int j=1; j<T[0].length; j++){
				if(cs[i-1]==cs2[j-1]){
					T[i][j] = T[i-1][j-1]+1;
				}else{
					T[i][j] = Math.max(T[i-1][j], T[i][j-1]);
				}
			}
		}
		return T[cs.length][cs2.length];
		
	}
	
	public int lcsDynamic(char str1[],char str2[]){
	    
        int temp[][] = new int[str1.length + 1][str2.length + 1];
        int max = 0;
        for(int i=1; i < temp.length; i++){
            for(int j=1; j < temp[i].length; j++){
                if(str1[i-1] == str2[j-1]) {
                    temp[i][j] = temp[i - 1][j - 1] + 1;
                }
                else
                {
                    temp[i][j] = Math.max(temp[i][j-1],temp[i-1][j]);
                }
                if(temp[i][j] > max){
                    max = temp[i][j];
                }
            }
        }
        return max;
    
    }
	
	public static void main(String args[]){
        LongestCommonSubSequence lcs = new LongestCommonSubSequence();
        String str1 = "ABCDGHLQR";
        String str2 = "AEDPHR";
        
        int result = lcs.lcs(str1.toCharArray(), str2.toCharArray());
        int r2 = lcs.lcsDynamic(str1.toCharArray(), str2.toCharArray());
        System.out.println(r2); 
        System.out.print(result);
    }


}
