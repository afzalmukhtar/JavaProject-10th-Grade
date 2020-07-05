/* Write a program to input two numbers s1 and s2. Produce another number s3 which is the merging of numbers stored in s1 followed by s2. print the values of s1, s2 and merged number s3.
Input: s1=256    s2 =43
Output: s1=256
s2=43
s3=25643*/


import java.util.*;
class merging_nos
{
void me()
{
Scanner input=new Scanner(System.in);
System.out.println("Enter first no.");
String s1=input.nextLine();
System.out.println("Enter second no.");
String s2=input.nextLine();
String s3=s1.concat(s2);

System.out.println("FIRST NO: "+ s1);
System.out.println("SECOND NO: "+ s2);
System.out.println("MERGED NO:" + s3);
}
}
