/*Write a program in java to input a string.Count and display
 * (i)Total number of two letter words.
 * (ii)Total number of three letter words.
 * (iii)Total number of four letter words.
 */
import java.util.*;
class total_2_3_4_letterword
{
void me()
{
System.out.println("INPUT THE STRING");
Scanner input=new Scanner(System.in);
String str=input.nextLine();
int l=str.length();
char ch;
int ctr=0;
int TWO=0, THREE=0, FOUR=0, OTHER=0;
for(int i=0; i<=l-1; i++)
{ch=str.charAt(i);
if(ch==' ')
{
if (ctr==2)
TWO++;
else if(ctr==3)
THREE++;
else if(ctr==4)
FOUR++;
else
{OTHER++;}
ctr=0;
}
else
ctr++;
}
System.out.println("");
if (ctr==2)               // The following part has been used again as after typing the last word,          
TWO++;                    // a space is NOT expected from the user, i.e. the user will not hit spacebar
else if(ctr==3)           // after his last word of string text, hence if we want the last word to be  
THREE++;                  // accounted for, this part is necessary.
else if(ctr==4)
FOUR++;
else
{OTHER++;}
ctr=0;

System.out.println("Total number of two letter words = " + TWO);
System.out.println("Total number of three letter words = " + THREE);
System.out.println("Total number of four letter words = " + FOUR);
}
}