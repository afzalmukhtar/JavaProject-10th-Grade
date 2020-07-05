   /*Write a program to evaluate the function : f(x) = ( z square + 2z)/(z+1) for all values of 
z ranging -4 to 4 by step 1 i.e. x=-4, -3, -2,-1 ……. 1,2,3,4*/

public class ranges
    {
        void accept()
        {
            double sum = 0 ;
            int x = -4;
            do
            {
                sum = (Math.pow(x,2)+ (2*x))/(x+1);
                x++;
                System.out.println("The result of the given function when x = "+x+ " "+ "is "+ sum);
            }while(x<4);
        }
    }
