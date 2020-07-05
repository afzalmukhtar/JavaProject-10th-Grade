/*Write a program to input a string. Covert the string in lowercase form and print in the following pattern.     Example:                                 Input :COBOL
output:
cobol
cobo
cob
co
c*/


import java.util.*;
class cobol_cobo_cob_co_c
{
void accept()
{
Scanner input=new Scanner(System.in);
System.out.println("ENTER THE WORD");
String str=input.next();
String STR=str.toLowerCase();


int l=str.length();
for(int i=l; i>0; i--)
{
System.out.println("");
for(int a=0;a<i; a++)
{
System.out.print(STR.charAt(a));
}
}
}
}
