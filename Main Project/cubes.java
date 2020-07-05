/*Write a program to find the sum of series: 
33 + 4 3 + 5 3 +… N 3*/

public class cubes
    {
        void accept(int n)
        {
            int sum = 0;
            for(int i = 3;i<=n;i++)
            {
                sum = sum + (int)Math.pow(i,3);
            }
            System.out.println("The sum of the series is "+ sum);
        }
    }
