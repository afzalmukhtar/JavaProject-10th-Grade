import java.io.*;
class Hangman
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	char words[][]={{'H','A','N','G','M','A','N'},{'M','E','S','S','A','G','E'},{'F','O','R','E','V','E','R'},{'R','A','C','E','C','A','R'},{'L','E','T','T','E','R','S'}};;
	char UserWord[]=new char[7];
	char letter;
	int rad;
	void control()throws IOException
	{
		firstScreen();
		System.out.println("\n\n\nBegin game?(y/n)");
		String ans, sure;
		ans=br.readLine();
		if(ans.equalsIgnoreCase("y"))
		{
			for(int x=0;x<=6;x++)
				UserWord[x]='_';
			rad=(int)(Math.random()*10)/2;
			game();
		}
			
		else if(ans.equalsIgnoreCase("n"))
		{   
			System.out.println("\n\nAre you sure you want to quit?(y/n)");
			sure=br.readLine();
			if(sure.equalsIgnoreCase("y"))
			System.exit(0);
			else
			{
				clearscreen();
				control();
			}
		}
		else
		{
			System.out.println("Invalid entry");
			control();
		}
	}
	void firstScreen()
	{
		
		System.out.print("-----");
		delay(500000);
		System.out.print("W");
		delay(500000);
		System.out.print("e");
		delay(500000);
		System.out.print("l");
		delay(500000);
		System.out.print("c");
		delay(500000);
		System.out.print("o");
		delay(500000);
		System.out.print("m");
		delay(500000);
		System.out.print("e");
		delay(500000);
		System.out.print(" ");
		delay(500000);
		System.out.print("T");
		delay(500000);
		System.out.print("o");
		delay(500000);
		System.out.print(" ");
		delay(500000);
		System.out.print("H");
		delay(500000);
		System.out.print("A");
		delay(500000);
		System.out.print("N");
		delay(500000);
		System.out.print("G");
		delay(500000);
		System.out.print("M");
		delay(500000);
		System.out.print("A");
		delay(500000);
		System.out.print("N");
		delay(500000);
		System.out.print("-----");
		System.out.println("");
		One();
		Two();
		Three();
		Four();
		Five();
		System.out.println("\n\n\n");
		delay(500000);
		System.out.print("\nCreated by-");
		delay(500000);
		System.out.print("\n           ");
		delay(500000);
		System.out.print("K");
		delay(500000);
		System.out.print("a");
		delay(500000);
		System.out.print("r");
		delay(500000);
		System.out.print("t");
		delay(500000);
		System.out.print("h");
		delay(500000);
		System.out.print("i");
		delay(500000);
		System.out.print("k");
		delay(500000);
		System.out.print(" B");
		delay(500000);
	}
	void delay(long j)
	{
		for(long i=1;i<=j;i++)
		System.out.print("");
	}
	void clearscreen()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	void One()//Rod
	{
		for(int i=1;i<=15;i++)
		{
			System.out.print("_");
			delay(250000);
		}
		System.out.println("");
	}
	void Two()//Rod
	{
		for(int o=1;o<=3;o++)
		{	
			for(int i=1;i<=14;i++)
				System.out.print(" ");
			System.out.println("|");
			delay(250000);
		}
	}
		
	void Three()//Head
	{
		int n=2;
		for(int o=n;o>=1;o--)
		{
			for(int i=1;i<=11;i++)
				System.out.print(" ");
			for(int i1=1;i1<=o;i1++)//TOP LEFT QUAD
				System.out.print(" ");
				System.out.print(".");
			for(int s1=o;s1<=n;s1++)//SPACE TOP LEFT
				System.out.print(" ");				
			for(int s2=o;s2<=n-1;s2++)//SPACE TOP RIGHT
				System.out.print(" ");
				System.out.print(".");
			for(int i2=o;i2>=1;i2--)//TOP RIGHT QUAD
				System.out.print(" ");
			delay(250000);
			System.out.println("");
		}
		for(int o=2;o<=n;o++)
		{
			for(int i=1;i<=11;i++)
				System.out.print(" ");
			for(int i1=1;i1<=o;i1++)//BOTTOM LEFT QUAD
				System.out.print(" ");
				System.out.print(".");
			for(int s1=o;s1<=n;s1++)//SPACE BOTTOM LEFT
				System.out.print(" ");
				
			for(int s2=o;s2<=n-1;s2++)//SPACE BOTTOM RIGHT
				System.out.print(" ");
				System.out.print(".");
			for(int i2=o;i2>=1;i2--)//BOTTOM RIGHT QUAD
				if(i2<n)
					System.out.print(" ");
			delay(250000);
			System.out.println("");
		}
	}
	void Four()//Upper Body
	{
		int n=3;
		for(int o=n;o>=1;o--)
		{
			for(int i=1;i<=9;i++)
				System.out.print(" ");
			for(int i1=1;i1<=o;i1++)//TOP LEFT QUAD
				System.out.print(" ");
				System.out.print(".");
			for(int s1=o;s1<=n;s1++)//SPACE TOP LEFT
				System.out.print(" ");	
				System.out.print(".");			
			for(int s2=o;s2<=n;s2++)//SPACE TOP RIGHT
				System.out.print(" ");
				System.out.print(".");
			for(int i2=o;i2>=1;i2--)//TOP RIGHT QUAD
				System.out.print(" ");
			System.out.println("");
			delay(250000);
		}
	}
	
	void Five()//Lower Body
	{
		int n=3;
		for(int o=n;o>=1;o--)
		{
			for(int i=1;i<=9;i++)
				System.out.print(" ");
			for(int i1=1;i1<=o;i1++)//TOP LEFT QUAD
				System.out.print(" ");
				System.out.print(".");
			for(int s1=o;s1<=n;s1++)//SPACE TOP LEFT
				System.out.print(" ");
			if(o==n)
			System.out.print(".");
			else
			System.out.print(" ");
			for(int s2=o;s2<=n;s2++)//SPACE TOP RIGHT
				System.out.print(" ");
				System.out.print(".");
			for(int i2=o;i2>=1;i2--)//TOP RIGHT QUAD
				System.out.print(" ");
			System.out.println("");
			delay(250000);
		}
	}
	boolean checkWord()
	{
		boolean f=false;
		int y=0;
		for(int x=0;x<=6;x++)
		{
			if(UserWord[x]==words[rad][x])
				y++;
		}
		if(y==7)
		{
			f=true;			
			for(int x=0;x<=6;x++)
					System.out.print(UserWord[x]+" ");
			System.out.println("\nYou've Won!");
		}
		return f;
	}
	
	void game()throws IOException
	{	
		int turns=0;
		boolean noletter=true;
		while(turns<=5&&checkWord()==false)
			{
				
				System.out.println("\n\n\n");
				for(int x=0;x<=6;x++)
				{
					System.out.print(UserWord[x]+" ");
					delay(500000);
				}
				System.out.println("\nEnter Letter:");
				letter=br.readLine().toUpperCase().charAt(0);
				for(int x=0;x<=6;x++)
				{
					if(letter==words[rad][x])
					{
						System.out.println("Letter found!");
						UserWord[x]=words[rad][x];
						noletter=false;
					}
					
				}
				System.out.println("\n\n");
				for(int i=1;i<=50;i++)
					System.out.print("-");
				System.out.println("");
				if(noletter)
				{
					delay(1000000);
					System.out.println("Letter not found!");
					turns++;
				}
				if(turns==1)
				{
					One();
					delay(1000000);
					System.out.println("\n\nLives left:"+(5-turns));
				}
				else if(turns==2)
				{
					One();
					Two();
					delay(1000000);
					System.out.println("\n\nLives left:"+(5-turns));
				}
				else if(turns==3)
				{
					One();
					Two();
					Three();
					delay(1000000);
					System.out.println("\n\nLives left:"+(5-turns));
				}
				else if(turns==4)
				{	
					One();
					Two();
					Three();
					Four();
					delay(1000000);
					System.out.println("\n\nLives left:"+(5-turns));
				}
				else if(turns==5)
				{
					One();
					Two();
					Three();
					Four();
					Five();
					delay(1000000);
					System.out.println("\n\nLives left:"+(5-turns));
				}
				if(turns==6)
				{
					One();
					Two();
					Three();
					System.out.println("\n\n\n\n");
					Four();
					Five();
					delay(1000000);
					for(int i=1;i<=50;i++)
						System.out.print("-");
					System.out.println("");
					delay(1000000);
					System.out.println("\n\nOuch! Thats gotta hurt!\n\nGAME OVER\n\nPlay again?(y/n)");
					String ans2=br.readLine();
					if(ans2.equalsIgnoreCase("y"))
						control();
					else
						System.exit(0);
				}
				for(int i=1;i<=50;i++)
					System.out.print("-");
					System.out.println("");
				noletter=true;
			}
			
	}
	public static void main(String args[])throws IOException
	{
		Hangman H=new Hangman();
		H.control();
	}
}