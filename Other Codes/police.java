import java.util.*;
class police
{
public static void main()
{
Scanner x=new Scanner(System.in);
System.out.println("Enter a Sentence");
String s=x.nextLine();
int i,l=s.length();
for(i=0;i<l;i++)
{
char ch=s.charAt(i);
if((int)ch==32)
System.out.println(ch+".");
}
}
}
