package DynamicProgramming;
import java.util.*;
public class WordDistance {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String s1=in.nextLine();
        String s2=in.nextLine();
        int index1=-1;
        int index2=-1;
        boolean flag1=false;
        boolean flag2=false;
        int distance=Integer.MAX_VALUE;
        int answer=Integer.MAX_VALUE;
        String[] sarray=s.split(" ");
        for(int i=0;i<sarray.length;i++)
        {
            if(!s1.equals(s2))
            {
                flag1=false; flag2=false;
            }
            if(s1.equals(sarray[i]) && flag1==false)
            {
                index1=i;
                flag1=true;
            }
            else
            if(s2.equals(sarray[i]) && flag2==false)
            {
                    index2=i;
                    flag2=true;
            }
            if(index1!=-1 && index2!=-1)
            {
                distance=Math.abs(index1-index2);
                flag1=false; flag2=false;
            }
            if(distance<answer)
            {
                answer=distance;
            }
        }
        if(answer==Integer.MAX_VALUE)
        {
            System.out.print("Words not found");
        }
        else
        {
            System.out.print(answer);
        }
    }
} 