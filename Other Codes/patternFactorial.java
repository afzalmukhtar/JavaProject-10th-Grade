import java.util.*;
class patternFactorial
{   public static void main()
  { Scanner s=new Scanner(System.in);
    System.out.println("Enter 2 no: to print ans in this pattern n!/(m!(n-m)!)");
    System.out.print("Enter n :"); 
    int n=s.nextInt();
    System.out.print("Enter m :"); 
    int m=s.nextInt();
    float answer=factorial(n)/(factorial(m)*factorial(m-n));
    System.out.println("Answer to the pattern n!/(m!(n-m)!) = "+answer);
    
   }
   public static float factorial(int n)
   {    int i, f=1;
       for(i=1;i<=n;i++)
       f=f*i;
       return f;    }   }