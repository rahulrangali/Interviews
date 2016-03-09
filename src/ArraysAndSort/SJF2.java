package ArraysAndSort;
import java.util.Scanner;

public class SJF2 {
	public static void main(String[] args){
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the no. of processes");
		int n = x.nextInt();
		int[] BT = new int[n+1];
		int[] WT = new int[n+1];
		int[] TAT = new int[n+1];
		
		for(int i=0; i<n ; i++){
			System.out.println("Enter burst time of process"+(i+1));
			BT[i] = x.nextInt();
		}
		
		int temp;
		for(int i=0; i<n; i++){
			for(int j=0; j<n-1; j++){
				temp = BT[j];
				BT[j] = BT[j+1];
				BT[j+1] = temp;
			}
		}
		
		for(int i=0; i<n; i++){
			WT[i] = 0;
			TAT[i]=0;
		}
		
		for(int i=0; i<n; i++){
			TAT[i] = BT[i] + WT[i];
			WT[i+1] = TAT[i];
		}
		TAT[n] = WT[n] + BT[n];
		float AWT =0;
		for(int i=0; i<n; i++){
			AWT+=WT[i];
		}
		AWT = AWT/n;
		System.out.println("Average Wait Time = "+ AWT);
	}

}
