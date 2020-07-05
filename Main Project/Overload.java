import java.io.*;
public class Overload
{
     int add(int a[])
       {
           int n = a.length;
           int sum = 0;
           
           for(int i=0;i<n;i++)
           {
               sum = sum + a[i];
            }
            return sum;
        }
        int add(int a[],char c)
        {
            int sum = 0;
            int n = a.length;
            
            if(c=='O')
            {
            for(int i=0;i<n;i++)
              {
                  if(a[i]%2!=0)
                  sum=sum+a[i];
                }
            }else if(c=='E')
               for(int i=0;i<n;i++)
              {
                  if(a[i]%2==0)
                  sum=sum+a[i];
                }
                return sum;
            }
            
        }
