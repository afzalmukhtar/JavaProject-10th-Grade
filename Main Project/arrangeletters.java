/*Write a program to create class arrangeletters and a method formalletters() with a string as parameter to input a word. Convert the word into uppercase form. Arrange each letter of the word in alphabetical order. Print the word before and after arranging letters in A-Z order.
Input :LanGuAge
Output:
Original word = LanGuAge
words in capitals: LANGUAGE
word after sorting = AAEGGLNU*/


import java.io.*;
public class arrangeletters
{

    void formalletters(String S)
    {
        char ch;
        int av,i,l;
       
        System.out.println("Original word= " + S);
        S = S.toUpperCase();
        System.out.println("Word in capitals= " + S);
        
        l = S.length();
        
        System.out.print("Word after sorting= ");
        for(av=65;av<=90;av++)
        {
           for(i=0;i<l;i++)
           {
               ch = S.charAt(i);
               if(ch == (char)av)
               System.out.print(ch);
            }
        }
    }
    public static void main()throws IOException
     {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String S1;
       
       System.out.println("Enter the String: ");
       S1 = br.readLine();
       
       arrangeletters obj = new arrangeletters();
       obj.formalletters(S1); 
    }
}

