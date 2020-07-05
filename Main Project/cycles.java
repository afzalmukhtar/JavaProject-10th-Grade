/* Write a program to store average cycling speed of 10 cyclist in a single subscripted variable and print number of cyclist falling in the following
 categories in two columns.*/

public class cycles
    {
        int a[] = new int [10];
        void accept(int x[])
        {
            for(int i = 0; i<10 ; i++)
            {
                a[i] = x[i];
                System.out.print(a[i] + " ");
            }
            int ctr1 = 0;
            int ctr2 = 0;
            int ctr3 = 0;
            int ctr4 = 0;
            int  ctr5 = 0;
            for(int i = 0; i<10;i++)
            {
                if(a[i]>=5 && a[i]<=20)
                {
                    ctr1++;
                }
                else if(a[i]>=21 && a[i]<=50)
                {
                    ctr2++;
                }
                else if(a[i]>=51 && a[i]<=75)
                {
                    ctr3++;
                }
                else if(a[i]>=76 && a[i]<=89)
                {
                    ctr4++;
                }
                else if(a[i]>=90 && a[i]<=100)
                {
                    ctr5++;
                }
            }
            System.out.println();
            System.out.println("Speed(Km/Hr)\tNumber of cyclists");
            System.out.println("5 - 20 \t\t\t" + ctr1);
            System.out.println("21 - 50 \t\t" + ctr2);
            System.out.println("51 - 75 \t\t" + ctr3);
            System.out.println("76 - 89 \t\t" + ctr4);
            System.out.println("90 - 100\t\t" + ctr5);
        }
    }
