/*The annual examination results of 50 students in a class is tabulated as follows:
Roll no Subject A Subject B Subject C
Write a program to read the data into different arrays, calculate and display the 
following:
a. Average mark obtained by each student
b. Print the roll no. and average marks of the students whose average marks is above 85.
c. Print the roll no. and average marks of the students whose average marks is below 45.*/

public class annual
    {
        void accept(int a[],int b[],int c[])
        {
            System.out.println("Roll No.\t\tSubject A\t\tSubject B\t\t Subject C\t\t Average");
            int average[] = new int[50];
            int total[]  = new int[50];
            for(int i = 0 ;i<50;i++)
            {
                total[i] = a[i]+b[i]+c[i];
                average[i] = total[i]/3;
                int x = i+1;
                System.out.println((x)+ " \t\t\t" +a[i]+"\t\t\t" + b[i]+"\t\t\t "+ c[i]+"\t\t\t"+average[i]);
            }
            System.out.println("Students whose average marks is greater than 85");
            System.out.println("Roll No.\t\tAverage Marks");
            for(int i = 0; i<50;i++)
            {
                if(average[i]>85)
                {
                    int x = i + 1;
                    System.out.println(x+ "\t\t\t"+ average[i]);
                }
            }
            System.out.println("Students whose average marks is less than 45");
            System.out.println("Roll No.\t\tAverage Marks");
            for(int i = 0; i<50;i++)
            {
                if(average[i]<45)
                {
                    int x = i + 1;
                    System.out.println(x+ "\t\t\t"+ average[i]);
                }
            }
        }
    }
