/*Create a class interchange and a function change(interchange s) which receives two strings by reference. Interchange the strings
 stored in the object ‘s’.*/

class interchange_string
{
void s(String str, String STR)
{
interchange_string obj=new interchange_string();
obj.interchange(str, STR);
}
void interchange(String a, String b)
{String t=null;

t=a;
a=b;
b=t;
System.out.print("OUTPUT: " + a + " " + b);
}
}
