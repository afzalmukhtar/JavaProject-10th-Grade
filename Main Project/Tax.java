/*  Design a function void showtax(double tax[]). The function takes single subscripted variable tax[] as 
function argument with income tax amount of 8 salaried persons. print average tax of all the persons 
along with maximum and minimum tax amount paid by the persons.*/

public class Tax
    {
        void showtax(double tax[])
        {
            int n = 8;
            double sum = 0;
            double average = 0;
            {
                for(int i = 0 ; i<n ; i++)
                {
                    sum = sum + tax[i];
                    average = sum/8;
                }
                System.out.println("The aaverage tax of 8 perssons is Rs."+ average);
                double max = tax[0] ;
                double min = tax[0] ;
                for(int i = 0; i<n ; i++)
                {
                    if(tax[i]> max)
                    {
                        max = tax[i];
                    }
                    else if(tax[i]<min)
                    {
                        min = tax[i];
                    }
                }
                System.out.println("The minimum tax paid is Rs."+ min);
                System.out.println("The maximum tax paid is Rs."+ max);
            }
        }
    }
