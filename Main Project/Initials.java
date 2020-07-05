/*Write a program to input a name and print the initials except the last word(sirname). Each initial must be followed by symbol dot(.). At the end print total number of characters in the original name and in the initials except the blank spaces and other characters.
Input : Mahinder Singh Dhoni

output: M. S. Dhoni
 Number of characters in the original name = xx*/
               

import java.io.*;
public class Initials
{
   
   public static void main()throws IOException
     {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String name, initials;
       int space1,space2;
       
       System.out.println("Enter the name: ");
       name = br.readLine();
       name = name.trim();
       
       space1 = name.indexOf(' ');
       space2 = name.lastIndexOf(' ');
       
       initials = name.charAt(0)+". "+name.charAt(space1+1)+"."+name.substring(space2);
       System.out.println(initials);
       System.out.println("Number of letters in the original String: "+(name.length()-2));
       System.out.println("Number of letters in the String with initials: "+(initials.length()-4));
    }
}

