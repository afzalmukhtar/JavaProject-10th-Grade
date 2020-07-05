/* Specify the class finder with following overloaded functions:
(i)
intfindmax(int n1, int n2) to decide and return largest from n1, n2 . If both the numbers are same then return 0.
(ii)
intfindmax(int n1, int n2, int n3) :to decide and return largest from n1, n2 ,n3. If all the numbers are same then return 0.
(iii)
Write a main function to input three numbers x,y,z(using scanner class object) and by invoking above functions print the largest from x,y and largest
 from x,y,z. Use function overloading concept.*/

import java.util.*;
public class finder
    {
        int findMax(int n1,int n2)
        {
            int flag = 0;
            if(n1>n2)
            {
                return n1;
            }
            else if(n2>n1)
            {
                return n2;
            }
            else if(n1==n2)
            {
                return flag;
            }
            return flag;
        }
        int findMax(int n1,int n2, int n3)
        {
            int flag = 0;
            if(n1>n2 && n1>n3)
            {
                return n1;
            }
            else if(n2>n1 && n2>n3)
            {
                return n2;
            }
            else if(n3>n1 && n3>n2)
            {
                return n3;
            }
            if(n1==n2 && n1==n3)
            {
                return flag ;
            }
            return flag;
        }
                
        public static void main()
        {
            Scanner input = new Scanner(System.in);
            int x = 0 ;
            int y = 0;
            int z = 0;
            System.out.println("Enter value of x");
            x = input.nextInt();
            System.out.println("Enter value of y");
            y = input.nextInt();
            System.out.println("Enter value of z");
            z = input.nextInt();
            finder obj = new finder();
            int a = obj.findMax(x,y);
            int b = obj.findMax(x,y,z);
            System.out.println("The greater number out of x and y = "+a);
            System.out.println("The greater number out of x,y and z = "+ b);
        }
    }
