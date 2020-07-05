import java.util.*;
class Factorial
{   public static double fact(int a)
    {   int i; double sum=1;
        for(i=1;i<=a;i++)
        {   sum*=i; }
            return sum; 
     } 
    public static void main()
    {   Scanner s=new Scanner(System.in);
        int j,n;
        double a=0;
        System.out.print("Enter a number to find the value as 1+1/2!......1/n! = " );
        n=s.nextInt();
        for(j=1;j<=n;j++)
        {double b=fact(j);
            a=a+(1.0/b);
        }
        System.out.println("Answer of the series  = " + a);
    }   }