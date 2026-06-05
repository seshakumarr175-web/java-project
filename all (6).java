import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef

{
    static boolean isSubstr(int n,int a[],int t){
        if(t==0){
            return true;
        }
        if(n==0){
            return false;
        }
        if(a[n-1]>t){
            return isSubstr(n-1,a,t);
        }
        return (isSubstr(n-1,a,t)||isSubstr(n-1,a,t-a[n-1]));
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
        int tar=sc.nextInt();
        boolean res=isSubstr(n,arr,tar);
        if(!res){
            System.out.println("no");
        }
        else{
            System.out.println("yes");
        }
	}
}
