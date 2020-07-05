/*Write a program to input a number n, output the results of the following evaluation based on the number entered by the user. 
i) Absolute value of the number 
ii) Square root of the number 
iii) Power of the number */

public class number
    {
        void accept(double n)
        {
            double abs = Math.abs(n);
            double root = Math.sqrt(n);
            double power = Math.pow(n,2);
            System.out.println("The absolute value of the number entered is "+abs);
            System.out.println("The square root of the number entered is "+root);
            System.out.println("The square of the number entered is "+power);
        }
    }
