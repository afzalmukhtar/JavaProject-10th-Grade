import java.io.*;
import java.util.*;
class operator
{   
    public static void check(char ch,double x,double y)
    {   
        switch(ch)
        {
            case'+':   System.out.println(x+y);
                       break;
            case'-':   System.out.println(x-y);
                       break;
            case'*':   System.out.println(x*y);
                       break;
            case'/':   System.out.println(x/y);
                       break;
         }
     }
    public static void main()throws  IOException
     {
        Scanner s=new Scanner(System.in);
        double a, b;
        char ch;
        System.out.print("Enter Greater no. : ");
        a=s.nextDouble();
        System.out.print("Enter Lesser no. : ");
        b=s.nextDouble();
        System.out.print("Enter Operator : ");
        ch=(char)System.in.read();
        check(ch,a,b);
       }
}