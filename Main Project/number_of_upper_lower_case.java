/*Write a program to input a string and display the number of upper case characters  , number of lowercase characters and number
 of digits present in the string. Make a suitable use of character functions.*/

import java.util.*;
class number_of_upper_lower_case
{
void me()
{
char ch;
int ctr1=0,ctr2=0,ctr3=0,ctr4=0,ctr5=0;
System.out.println("This Program Lets You Enter A String And Tells You THe Number Of Upper Case, Lower Case And Digits");
System.out.println("");
System.out.println("");
System.out.println("Please enter the string");
Scanner input=new Scanner(System.in);
String a = input.nextLine();
int l=a.length();
for(int i=0; i<l; i++)
{
ch=a.charAt(i);
if(ch>='a' && ch<='z')
ctr1++; 
else if(ch>='A' && ch<='Z')
ctr2++;
else if(ch>='0' && ch<='9')
ctr3++;
else if(ch==' ')
ctr4++;
else 
ctr5++;
}
System.out.println("");
System.out.println("RESULTS:");
System.out.println("LOWER CASE = " + ctr1); 
System.out.println("UPPER CASE = " + ctr2);
System.out.println("DIGITS     = " + ctr3);
System.out.println("SPACES     = " + ctr4);
System.out.println("SPECIAL    = " + ctr5);

}
}
