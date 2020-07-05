import java.util.*;
class armstrong
{
    Scanner A = new Scanner(System.in);
    int n,n1,n2,sum,ctr,d;
    
    armstrong()
    {
        n=0;
        n1=0;
        n2=0;
        sum=0;
        ctr=0;
        d=0;
    }
    
    void accept()
    {
        System.out.println("Please enter a number:");
        n=A.nextInt();
        n1=n;
        n2=n;
    }
    
    void compute()
    {
        while(n>0)
        {
            n=n/10;
            ctr++;
        }
        
        while(n1>0)
        {
            d=n1%10;
            sum=sum+ (int) Math.pow(d,ctr);
            n1=n1/10;
        }
        if(n2==sum)
        System.out.println(n2+ "is an armstrong number.");
        else
        System.out.println(n2+ "is not an armstrong number.");
    }//end of void compute()
    public static void main()
    {
        armstrong obj= new armstrong();
        obj.accept();
        obj.compute();
    }//end of PSVM
}//end of class



/* Please enter a number:
153
153is an armstrong number.
Please enter a number:
200
200is not an armstrong number.
Please enter a number:
5
5is an armstrong number.
Please enter a number:
167
167is not an armstrong number.
Please enter a number:
69
69is not an armstrong number.
*/
       