/*Write a program to input the number of days for issuing the library book. Calculate the 
charges according to the following criteria.
Days Charges
< 5 1.00 Re.
5 and < 8 2.00 Rs.
8 and above 3.50 Rs.
The program should work for n people.*/

import java.util.*;
public class library
    {
        void accept()
        {
            Scanner input  = new Scanner(System.in);
            double amt = 0 ;
            System.out.println("Enter number of persons");
            int n = input.nextInt();
            for(int i = 1 ; i<=n ; i++)
            {
                System.out.println("Enter number of days");
                int days = input.nextInt();
                if(days<5)
                {
                    amt = days * 1;
                }
                else if(days>=5 && days<8)
                {
                    amt = 5 + (days - 5) * 2;
                }
                else if(days>=8)
                {
                    amt = 5 + 6 + (days - 8) * 3.5;
                }
                System.out.println("The amount is Rs."+ amt);
            }
        }
    }
