/*Using if else statement write a program in Java to calculate the grade as per the given criteria:
Percentage marks Grade
From 75 to 100 Passed with star
From 60 to 74 1st Division
From 40 to 59 2nd Division
Less than 40 Failed*/

public class grade
    {
        void accept(int marks)
        {
            if(marks>=75&&marks<=100)
            {
                System.out.println("Passed with star");
            }
            else if(marks>=60&&marks<=74)
            {
                System.out.println("1st division");
            }
            if(marks>=40&&marks<=59)
            {
                System.out.println("2nd division");
            }
            if(marks<=40)
            {
                System.out.println("Failed");
            }
        }
    }
