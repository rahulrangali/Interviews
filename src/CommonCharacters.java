import java.util.HashSet;

public class CommonCharacters {
	
	public static void main(String[] args){
		CommonCharacters cc = new CommonCharacters();
		char[] c1 = "rahulr".toCharArray();
		char[] c2 = "ruchar".toCharArray();
				
		String result = cc.unique(c1,c2);
		System.out.println(result);
		
		
	}
	
	
	public String unique(char[] c1,char[] c2){
		HashSet<Character> hs1 = new HashSet<Character>();
		HashSet<Character> hs2 = new HashSet<Character>();
		
		for(int i = 0; i<c1.length;i++){
			hs1.add(c1[i]);
		}
		for(int i = 0; i<c1.length;i++){
			hs2.add(c2[i]);
		}
		
		hs1.retainAll(hs2);
		
		return hs1.toString();
		
	}

}
