/* A number is said to be neon, if sum of all the digits of square of a number is equal
 to the number itself.
 Example: Input : 9   It’s square  = 81    = 8 +1 = 9   ( so 9 is a neon number)
 25    It’s square is 625     =   6 + 2 + 5 =13   ( so 25  is not a neon number)*/

public class neon_number
    {
        void accept(int num)
        {
            int n = num ; 
            int sum = 0;
            int sq = num * num ;
            int d = 0;
            do
            {
                d = num%10;
                num = num/10;
                sum = sum + d;
            }while(num>0);
            if(sum == n)
            {
                System.out.println(n + " " + "is a neon number");
            }
            else
            {
                System.out.println(n + " " + "is not a neon number");
            }
        }
    }
