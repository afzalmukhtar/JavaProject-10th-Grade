/*Kesar Travels Pvt Ltd gives the following discount to its customers:
Ticket amount in Rs Discount
Above 70000 18 %
55001 to 70000 16 %
35001 to 55000 12 %
25001 to 35000 10 %
less than 25001 2 %
Write a program to input the name and ticket amount for the customers and calculate the discount amount and net amount to be paid. Display
the output in the following format for each customer. The program should work as long as the user wishes to do so.
Slno. Name Ticket Chargers Discount Net amount*/

import java.util.*;
public class Kesar_travels
    {
        void accept()
        {
            Scanner input = new Scanner(System.in);  
            System.out.println("Enter the number of customers");
            int n = input.nextInt();
            double amt = 0;
            double discount = 0 ;
            double damt = 0;
            for(int i = 1;i<=n;i++)
                {                 
                    System.out.println("Enter your name");
                    String name = input.next();
                    System.out.println("Enter the price of the ticket");
                    double price = input.nextInt(); 
                    if(price>70000)
                    {
                        discount = 0.18;
                    }
                    else if(price>=55001&&price<=70000)
                    {
                        discount = 0.16;
                    }
                    else if(price>=35001&&price<=55000)
                    {
                        discount = 0.12;
                    }
                    else if(price>=25001&&price<=35000)
                    {
                        discount = 0.10;
                    }  
                    else if(price<=25001)
                    {
                        discount = 0.02;
                    }
                    damt = discount*price;
                    amt = price - damt;
                    System.out.println("Sl.No\tName\tTicket charge\tDiscount\tNet Amount");
                    System.out.println(i+ "\t" + name + "\t" + price + "\t\t" + (discount*100)+ "\t\t" + amt);
                }
            }
        }
