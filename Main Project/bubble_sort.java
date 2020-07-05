/*Write a program to initialize a single dimensional array num[] of 10 integer elements . Arrange the 
array in descending order using bubble sort method. Print the array before and after sorting. Each array
 should be printed in a single line with a suitable space between each element.*/

public class bubble_sort
{
    void accept()
    {
        int num[] = {16,98,36,87,46,95,34,22,56,78};
        for(int i = 0; i<10 ; i++)
        {
            System.out.print(num[i] + " ");
        }
        for(int i = 0 ; i<10;i++)
        {
            for(int j = 1 ; j<10; j++)
            {
                if(num[j]>num[j-1])
                {
                    int temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                }
            }
        }
        System.out.println();
        for(int i = 0; i<10 ; i++)
        {
            System.out.print(num[i] + " ");
        }
    }
}
