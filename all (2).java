import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		
		    int n=sc.nextInt();
		    sc.nextLine();
		    String s1=sc.nextLine();
		    String s2=sc.nextLine();
		    if(s1.length()!=n|| s2.length()!=n){
		        System.out.printf("Invalid String input");
		        return;
		    }
		    int c11=0;
		    int c01=0;
		    int c12=0;
		    int c02=0;
		    for(int i=0;i<n;i++){
	        if(s1.charAt(i)=='1'){
	            c11++;
	        }
	        if(s2.charAt(i)=='1'){
	            c12++;
	        }
	        if(s1.charAt(i)=='0'){
	            c01++;
	        }
	        if(s2.charAt(i)=='0'){
	            c02++;
	        }
	        
		    }
		    if(c01==c02 && c11==c12){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
	
	}
}
