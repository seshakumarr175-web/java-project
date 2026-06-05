import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0){
		    String p1=sc.nextLine();
		    String p2=sc.nextLine();
		    
		    int p=p1.length();
		    String s=sc.nextLine();
		    int n=s.length();
		    int flag=0;
		    for(int i=0;i<n-p+1;i++){
		        if(s.substring(i,i+p).equals(p1)||s.substring(i,i+p).equals(p2)){
		            flag=1;
		        }
		        
		    }
		    if(flag==1){
		        System.out.println("GOOD");
		    }
		    else{
		        System.out.println("BAD");
		    }
		    
		}

	}
}
