/* Write a program to initialize a single dimensional array number[] with 8 phone numbers 
of long integer type. Arrange the array number[] in ascending order using any standard sort
ing method.  Input a phone number ‘phone’ . Search ‘phone’ from the sorted list number[]
 using binary search method. Print the sorted array number[] in a single line with
 suitable space and also print index/subscript of phone, if found in the sorted array 
 otherwise print phone number with a  message “Phone number not found in the list, 
 search unsuccessful”.*/

public class Phone
    {
        
        void accept(int phone)
        {
            int number[] = {25286420,25627998,25552878,23578958,22885899,21115676,28116543,28925454};
            {
                int pos= 0;
                int small = 0;
                int temp = 0;
                for(int i = 0; i<7; i++)
                {
                    small = number[i];
                    pos = i;
                    for(int j = i+1;j<8;j++)
                    {
                        if(number[j]<small)
                        {
                         small = number[j];
                         pos = j;
                        }
                        temp = number[i];
                        number[i] = number[pos];
                        number[pos] = temp;
                    }
                }
                System.out.println("The sorted array is " );
                for(int i = 0 ; i<8;i++)
                {
                    System.out.print(number[i] + " " );
                }
            }
            int u = 0;
            int l = 0;
            int m = 0;
            int flag = 0;
            u = 7;
            l = 0;
            while(l<=u)
            {
                m = (u+l)/2;
                {
                    if(phone == number[m])
                    {
                        flag = 1;
                        break;
                    }
                    else if (phone>number[m])
                    {
                        l = m+1;
                    }
                    else if(phone<number[m])
                    {
                        u = m-1;
                    }
                }
            }
            System.out.println();
            if(flag==1)
            System.out.println("The phone number was found. The index number = "+m);
            else
            System.out.println("Search was unsuccessful" );
                
        }
    }
