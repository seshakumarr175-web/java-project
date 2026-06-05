import java.util.*;
import java.lang.*;
import java.io.*;
class Calculator
{
    
    int add(int a,int b)
    {
        return a+b;
    }
    int sub(int a,int b)
    {
        return a-b;
    }
    int mul(int a,int b)
    {
        return a*b;
    }
    float div(int a,int b)
    {
        if(b==0)
        {
            System.out.println("Not Divisible by 0");
        }
        
        return a/b;
        
    }
    
}

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Give Character like +,-,*,/");
		char c=sc.next().charAt(0);
		Calculator obj=new Calculator();
		if(c=='+'){
		    System.out.println(obj.add(a,b));
		}
		else if(c=='-'){
		    System.out.println(obj.sub(a,b));
		}
		else if(c=='*'){
		    System.out.println(obj.mul(a,b));
		}
		else if(c=='/'){
		    System.out.println(obj.div(a,b));
		}

	}
}
