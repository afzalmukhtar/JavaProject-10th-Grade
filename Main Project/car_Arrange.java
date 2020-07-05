/*Write a class Arrange to input 5 car names in array of string. Arrange car names in reverse alphabetical order(descending order)
 using any sorting method. Print unsorted and sorted car names along with suitable headings.*/

import java.util.*;
public class car_Arrange
{
void main()
{
Scanner input=new Scanner(System.in);
System.out.println("Input the car names one by one:");
String car[]=new String[5];
for(int i=0;i<5;i++)
{
car[i]=input.nextLine();
}
System.out.println("The unsorted array is");
for(int i=0; i<5; i++)
{
System.out.print(car[i] + " ");
}
System.out.println("");
for(int j=0;j<car.length;j++)
{
for(int i=j+1; i<car.length; i++)
{
if((car[i].compareTo(car[j])>0))
{
String temp=car[j];
car[j]=car[i];
car[i]=temp;
}
}
}
System.out.println("The sorted array is(DESCENDING):");
for(int i=0; i<5; i++)
{
System.out.print(car[i] + " ");
}
}
}
