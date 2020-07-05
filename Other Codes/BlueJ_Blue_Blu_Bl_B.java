/*Write a program to input a string. Covert the string in lowercase form and print in the following pattern.     Example:                                 Input :COBOL
output:
BlueJ
Blue
Blu
Bl
B*/
import java.util.*;
class BlueJ_Blue_Blu_Bl_B
{   void accept()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER ONE WORD");
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
