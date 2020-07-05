import java.util.*;
class fact
{
public static void main()
{
Scanner x=new Scanner(System.in);
System.out.println("Enter 2 no.s");
int n=x.nextInt();
int n1=x.nextInt();
float answer=factorial(n)/(factorial(n1)*factorial(n1-n));
System.out.println(answer);
}
public static float factorial(int n)
{
int i,f=1;
for(i=1;i<=n;i++)
{
f=f*i;
}
return f;
}
}