import java.util.*;
import java.lang.*;
import java.io.*;

class Paircheck
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    String s=sc.nextLine();
		    int size=s.length();
		    char arr[]=new char[size];
		    for(int i=0;i<size;i++){
		        arr[i]=s.charAt(i);
		    }
		    int x=0;
		    int y=x+1;
		    int count=0;
		    while(y<size){
		        if(arr[x]=='x'&& arr[y]=='y'|| arr[x]=='y'&& arr[y]=='x'){
		            c++;
		            x++;
		        }
		        else{
		            x++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
