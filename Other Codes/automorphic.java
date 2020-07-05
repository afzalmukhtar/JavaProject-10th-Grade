/* Shounak Das
 * XI-B
*/
import java.util.*;
class automorphic
{
    Scanner A=new Scanner(System.in);
    int n,n1,ctr,x,y,sq;
    
    automorphic()
    {
        n=0;
        n1=0;
        ctr=0;
        x=0;
        y=0;
        sq=0;
    }
    
    void accept()
    {
        System.out.println("Please enter a number:");
        n=A.nextInt();
        n1=n;
    }
    
    void compute()
    {
        while(n>0)
        {
            n=n/10;
            ctr++;
        }
        
        x=(int) Math.pow(10,ctr);
        sq=n1*n1;
        y=sq%x;
        
        if(y==n1)
        System.out.println(n1+ "is an automorphic number.");
        else
        System.out.println(n1+ "is not an automorphic number.");
    }//end of compute()
    
    public static void main()
    {
        automorphic obj=new automorphic();
        obj.accept();
        obj.compute();
    }//end of PSVM
}//end of class

/* Please enter a number:
6
6is an automorphic number.
Please enter a number:
25
25is an automorphic number.
Please enter a number:
23
23is not an automorphic number.
Please enter a number:
54
54is not an automorphic number.
*/