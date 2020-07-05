class Auto
{
public static void main()
{
int spaces=3, help=1,ref=1;
for(int i=1;i<=4;i++)
{
for(int j=1;j<=spaces;j++)
{
System.out.print(" ");
}
for(int k=help;k>=ref;k--)
{
System.out.print(k);
}
System.out.println();
spaces--;
help++;
}
}
}
