/*Write a program to create three single dimensional arrays empcode[] integer, sal[] double,
 spl[] double to store employee code, monthly salary and special allowances of 10 employees.
 Calculate the total monthly salary ( sal + spl) and annual salary of each employee.  Print
 the salary details in tabular form including all the data. At the end print total of monthly salary and total of allowances.*/

import java.util.*;
public class Salary
    {
        void accept()
        {
            Scanner input = new Scanner(System.in);
            int empcode[] = new int[10];
            double sal[] = new double[10];
            double spl[] = new double[10];
            double monthSal, annualSal, totalSal = 0 , totalSpl = 0;
            for(int i = 0;i<10;i++)
            {
                System.out.print("Enter employee code");
                empcode[i] = input.nextInt();
                System.out.print("Enter salary");
                sal[i] = input.nextInt();
                System.out.print("Enter speccial allowance");
                spl[i] = input.nextInt();
            }
            System.out.println("Employee code\tSalary\tAllowance\tMonthly Salary\tAnnual Salary");
            for(int i = 0; i<10; i++)
            {
                monthSal = sal[i] + spl[i];
                annualSal = monthSal*12;
                totalSal = totalSal + sal[i];
                totalSpl = totalSpl + spl[i];
                System.out.println(empcode[i] + "\t\t "+ sal[i] + "\t" + spl[i] + "\t\t "+ monthSal + "\t\t" +annualSal);
            }
            System.out.println("Total Monthly salary = "+ totalSal);
            System.out.println("Total of special allowance = "+ totalSpl);
        }
    }
