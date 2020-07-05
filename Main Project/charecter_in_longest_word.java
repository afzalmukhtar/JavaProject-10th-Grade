/*Write a program to input a sentence and find the number of characters in the longest word of the given sentence.
Eg:India is a Democratic country
Output:10*/

import java.util.*;
class charecter_in_longest_word
{
void me()
{
System.out.println("This program gives the no. of characters in the longest word in the ");
System.out.println("sentence entered by you(including special characters, unless separated by a space)");
System.out.println("");
System.out.println("Enter the Sentence");
Scanner input=new Scanner(System.in);
String str=input.nextLine();
int l=str.length();
char ch;
int Pctr=0;
int ctr=0;
for(int i=0; i<l; i++)
{
ch=str.charAt(i);
if (ch==' ')
{
if (ctr>Pctr)
{Pctr=ctr;}
ctr=0;
}
else
ctr++;
}
if (ctr>Pctr) //This part is used again as the user will not put a space after the last word...
Pctr=ctr;
System.out.print("Longest word is of " + Pctr + " characters.");
}
}

