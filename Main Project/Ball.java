/*Write a program to input strings one by one till the user wants to continue. Find and print total number of strings which end with a string “ball”.
Enter a word: football
Do you wish to continue ? press 1 to continue and 0 to exit
Enter a word:snowball
Total strings that ends with ball are/is: 1*/

import java.io.*;
public class Ball
{
    public static void main()throws IOException
     {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int c=0,ans=1;
       String S;
       int i=1;
       while(ans==1)
       {
           System.out.println("Enter string no:" + i);
           S = br.readLine();
           if(S.endsWith("ball"))
           {
               System.out.println(S);
               c=c+1;
            }
            System.out.println("Do you wish to continue? Press 1 for YES and 0 for NO");
            ans = Integer.parseInt(br.readLine());
            i++;
        }
        System.out.println("Number of words which end with 'ball'= " + c);
    }
}

