/*Write a program in Java to accept two Strings.Display the new String by taking each character of the first String from left to right
 and of the second string from right to left.The letters should be taken alternatively from each string.Assume that the length of
 both the string is same.*/


import java.util.*;
class alternate_string
{
void me()
{
char ch1;
char ch2;
int i=0;
System.out.println("NOTE: Both Strings must be of the SAME LENGTH");
System.out.println("");
System.out.println("Enter first String");
Scanner input=new Scanner(System.in);
String a=input.nextLine();
System.out.println("");
System.out.println("Enter second String");
String b=input.nextLine();
int l1=a.length();
int l2=b.length();
int j=l2-1;
System.out.println("");

System.out.println("RESULT:");

for(; i<l1; i++,j--)
{
ch1=a.charAt(i);
ch2=b.charAt(j);
System.out.print(ch1 + " ");
System.out.print(ch2 + " ");
}
}
}

