/*Write a program to input a name. Convert each letter to its opposite case. print the original and new name along with suitable messages.
Input: SkY LiNe
output:  Original name = SkY LiNe
New name = sKy lInE*/

import java.io.*;
public class OppCase
{
   public static void main()throws IOException
     {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String s1,s2="";
       int i,av,n;
       
       System.out.println("Enter the string: ");
       s1 = br.readLine();
       n = s1.length();
       for(i=0;i<n;i++)
       {
           av = (int)s1.charAt(i);
           if(av>=65&&av<=90)
           av = av + 32;
           else if(av>=97&&av<=122)
           av = av - 32;
           s2 = s2+(char)av;
        }
        System.out.println("Original name: " + s1);
        System.out.println("New name: " + s2);
    }
}

