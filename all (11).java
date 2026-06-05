import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int k=0;k<n;k++){
      arr[k]=sc.nextInt();

    }
    for (int i=0;i<n ;i++){
      for(int j=0;j<n-1-i;j++){
        if(arr[j]>arr[j+1]){
          int t=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=t;
        }

      }
    }
    for(int x=0;x<n;x++){
     System.out.print(arr[x]);
    } 

	}
}
