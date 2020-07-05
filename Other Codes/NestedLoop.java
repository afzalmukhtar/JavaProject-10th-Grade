//To print a cross using * for 2n-1 rows
import java.io.*;
class NestedLoop
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		void Print()throws IOException
			{
				int i,k,l,m,n,x;
				x=0;
				System.out.println("Please enter a number");
				n=Integer.parseInt(br.readLine());
				m=(n*2)-3;//number of spaces between 2 *s
				l=40-n;//no of spaces before the first *
				for(i=1;i<=n;i++)
					{
						for(k=1;k<=l;k++)
							{
								System.out.print(" ");
							}
						l++;
						System.out.print("*");
						for(k=m;k>=1;k--)
							{
								System.out.print(" ");
							}
						m=m-2;
						if(i!=n)
							System.out.println("*");
						if(i==n)
							System.out.println("");
						if(i==n-1)
							x=l-1;
					}
				l=x;
				m=1;
				for(i=1;i<=n-1;i++)
					{
						for(k=1;k<=l;k++)
							{
								System.out.print(" ");
							}
						l--;
						System.out.print("*");
						for(k=m;k>=1;k--)
							{
								System.out.print(" ");
							}
						m=m+2;
						System.out.println("*");
					}	
			}
		public static void main (String args[]) throws IOException
			{
				NestedLoop N = new NestedLoop();
				N.Print();
			}
	}
