import java.io.*;
class mall
{
 static double cart=0;
 public static void mainprog()throws IOException
   {
   	while(true)
   	 {
       System.out.println("WELCOME TO THE PHOENIX MALL");
       System.out.println("---------------------------");
       System.out.println("");
       System.out.println("THE LIST OF ALL THE SHOPS IN THE MALL ARE :-");
       System.out.println("-----------------------------------------");
       System.out.println("");
       System.out.println("\t1. ZOE FLORISTS");
       System.out.println("\t2. VAN HUESON SHOWROOM");
       System.out.println("\t3. ALAN PAINE JEANS SHOWROOM");
       System.out.println("\t4. WEEKENDER KIDS");
       System.out.println("\t5. OLYMPUS SPORTS WORLD");
       System.out.println("\t6. EXIT");
       System.out.println("");
       System.out.println("Type the number of the store you want to visit");
       InputStreamReader a=new InputStreamReader(System.in);
       BufferedReader b=new BufferedReader(a);
       String ch=b.readLine();
       int select=Integer.parseInt(ch);    // To accept which shop to visit
       switch(select)
         {
             case 1:florist();
                    break;
             case 2:vanhueson();
                    break;
             case 3:alanpaine();
                    break;
             case 4:weekenderkids();
                    break;
             case 5:sports();
                    break;
             case 6:System.out.println("----------------------------------------------------------------");
                    System.out.println("THANK YOU FOR VISITING THE PHOENIX MALL.WE HOPE TO SEE YOU AGAIN");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("-----------------------------");
                    System.out.println("YOUR TOTAL BILL IS Rs. "+cart);
                    System.out.println("-----------------------------");
  				    System.exit(0);
             default:System.out.println("Please choose the correct option"); 
             
         }
   }
}
public static void florist()throws IOException
{
String choice;
do
{
InputStreamReader a=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(a);
System.out.println("WELCOME TO ZOE FLORISTS");
System.out.println("\t1. Red Roses");
System.out.println("\t2. Pink Orchids");
System.out.println("\t3. Yellow Roses");
System.out.println("\t4. Blue Orchids");
System.out.println("\t5. Sun Flowers");
System.out.println("\t6. Dalia");
System.out.println("\t7. Rajnigandha Sticks");
System.out.println("What type of flowers do you want ?");
String flower=b.readLine();
int flowers=Integer.parseInt(flower);   // To accept which flower to buy
System.out.println("Type the number of flowers you intend to buy of the above choice");
String fno=b.readLine();
int fno1=Integer.parseInt(fno);         // To accept how many flowers to buy 
if(flowers==1 || flowers==3)
{
System.out.println("Each rose costs Rs. 10.00");
System.out.println("You pay Rs. "+(fno1*10)+" for the roses");
cart=cart+(fno1*10);
}
else if(flowers==2 || flowers==4)
{
System.out.println("Each pink orchid stick costs Rs. 25.00");
System.out.println("You pay Rs. "+(fno1*25)+" for the orchid sticks");
cart=cart+(fno1*25);
}
else if(flowers==5)
{
System.out.println("Each sunflower costs Rs.15.00");
System.out.println("You pay Rs. "+(fno1*15)+" for the sunflowers");
cart=cart+(fno1*15);
}
else if(flowers==6)
{
System.out.println("Each dalia costs Rs. 20.00");
System.out.println("You pay Rs. "+(fno1*20)+" for the dalias");
cart=cart+(fno1*20);
}
else if(flowers==7)
{
System.out.println("Each rajnigandha stick costs Rs. 10.00");
System.out.println("You pay Rs. "+(fno1*10)+" for the rajnigandha sticks");
cart=cart+(fno1*10);
}
else
System.out.println("SORRY!!!!!     The flowers ordered by you are not available");
System.out.println("Would you like to continue buying the flowers in ZOE FLORISTS(YES/NO)");
choice=b.readLine();
}
while(choice.equalsIgnoreCase("YES"));
}
public static void vanhueson()throws IOException
{
String choice;
do
{
int i,n;
InputStreamReader a=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(a);
System.out.println("WELCOME TO VAN HUESON SHOWROOM");
System.out.println("\t1. White Pure Cotton Shirts");
System.out.println("\t2. Trousers");
System.out.println("\t3. Jeans");
System.out.println("\t4. Light Coloured Printed Shirts");
System.out.println("\t5. Ties");
System.out.println("15% DISCOUNT ON SHIRTS AND 30% DISCOUNT ON TROUSERS");
System.out.println("What do you want to buy ?");
String van=b.readLine();
int hueson=Integer.parseInt(van);
switch(hueson)
{
case 1:System.out.println("The White Pure Cotton Shirt will cost you Rs. 200 each after the discount");
       System.out.println("Enter the number of shirts you want");
       String num=b.readLine();
       n=Integer.parseInt(num);
       for(i=1;i<=n;i++)
       {
           System.out.println("Which size do you want\tSmall/Medium/Large/Extra Large");
           String size=b.readLine();
           System.out.println("The shirt of size "+size+" has been added to your Shopping Cart");
           cart=cart+200;
       }
       break;
case 2:System.out.println("Each pair of trousers will cost you Rs. 500 after discount");
       System.out.println("Enter the number of trousers you want");
       num=b.readLine();
       n=Integer.parseInt(num);
       for(i=1;i<=n;i++)
       {
           System.out.println("Which colour do you want");
           String colour=b.readLine();
           System.out.println("Enter the waist length");
           String waist=b.readLine();
           System.out.println("The "+colour+" trouser of waist length "+waist+" has been added to the Shopping Cart");
           cart=cart+500;
       }
       break;
case 3:System.out.println("The jeans will cost you Rs. 500.00");       
       System.out.println("Enter the number of jeans you want");
       num=b.readLine();
       n=Integer.parseInt(num);
       for(i=1;i<=n;i++)
       {
           System.out.println("Which colour do you want");
           String colour=b.readLine();
           System.out.println("Enter the waist length");
           String waist=b.readLine();
           System.out.println("The "+colour+" colour jeans of waist length "+waist+" has been added to the Shopping Cart");
           cart=cart+500;
       }
       break;
case 4:System.out.println("The Light Coloured Printed Shirt will cost you Rs. 350.00 after discount");
       System.out.println("Enter the number of shirts you want");       
       num=b.readLine();
       n=Integer.parseInt(num);
       for(i=1;i<=n;i++)
       {
           System.out.println("Which colour do you want");
           String colour=b.readLine();
           System.out.println("Enter the size\tSmall/Medium/Large/Extra Large");
           String size=b.readLine();
           System.out.println("The "+colour+" shirt "+size+" size has been added to the Shopping Cart");
           cart=cart+350;
       }
       break;
case 5:System.out.println("Each tie will cost you Rs. 150.00");
       System.out.println("Enter the number of ties you want");       
       num=b.readLine();
       n=Integer.parseInt(num);
       for(i=1;i<=n;i++)
       {
           System.out.println("Enter the colour of the tie");
           String colour=b.readLine();
           System.out.println("The "+colour+" colour tie has been added to the Shopping Cart");
           cart=cart+150;
       }
       break;
default:System.out.println("SORRY!!!!!     The item entered by you is not available");
}
System.out.println("Would like to continue shopping in Van Hueson(YES/NO)");
choice=b.readLine();
}
while(choice.equalsIgnoreCase("YES"));
}
public static void alanpaine()throws IOException
{
String choice;
do
{
InputStreamReader a=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(a);
System.out.println("WELCOME TO ALAN PAINE JEANS SHOWROOM");
System.out.println("\t1. Dark Blue Jeans");
System.out.println("\t2. Light Blue Jeans");
System.out.println("\t3. Black Jeans");
System.out.println("\t4. Brown Jeans");
System.out.println("Each item will cost you Rs. 1699.00");
System.out.println("What do you want to buy ?");
String alan=b.readLine();
int paine=Integer.parseInt(alan);
switch(paine)
{
case 1:System.out.println("The item you have chosen is Dark Blue Jeans");
       System.out.println("How many jeans do you need");
       String num=b.readLine();
       int n=Integer.parseInt(num);
       System.out.println("Enter the waist length");
       String waist=b.readLine();
       System.out.println(n+" Dark Blue Jeans of waist length "+waist+" has been added to your Shopping Cart");
       cart=cart+(n*1699);
       break;
case 2:System.out.println("The item you have chosen is Light Blue Jeans");
       System.out.println("How many jeans do you need");
       num=b.readLine();
       n=Integer.parseInt(num);
       System.out.println("Enter the waist length");
       waist=b.readLine();
       System.out.println("The "+n+" Light Blue Jeans of waist length "+waist+" has been added to your Shopping Cart");
       cart=cart+(n*1699);
       break;
case 3:System.out.println("The item you have chosen is Black Jeans");
       System.out.println("How many jeans do you need");
       num=b.readLine();
       n=Integer.parseInt(num);
       System.out.println("Enter the waist length");
       waist=b.readLine();
       System.out.println("The "+n+" Black Jeans of waist length "+waist+" has been added to your Shopping Cart");
       cart=cart+(n*1699);
       break; 
case 4:System.out.println("The item you have chosen is Brown Jeans");
       System.out.println("How many jeans do you need");
       num=b.readLine();
       n=Integer.parseInt(num);
       System.out.println("Enter the waist length");
       waist=b.readLine();
       System.out.println("The "+n+" Brown Jeans of waist length "+waist+" has been added to your Shopping Cart");
       cart=cart+(n*1699);
       break;
default:System.out.println("SORRY!!!!!     The item entered by you is not available");       
}
System.out.println("Would you like to continue shopping in ALAN PAINE JEANS SHOWROOM(YES/NO)");
choice=b.readLine();
}
while(choice.equalsIgnoreCase("YES"));
}
public static void weekenderkids()throws IOException
{
String choice="";
do
{
InputStreamReader a=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(a);
System.out.println("WELCOME TO WEEKENDER KIDS");
System.out.println("We have the following sections in our store");
System.out.println("\t1. Infants(0 to 1 year");
System.out.println("\t2. Kids(1 to 12 years");
System.out.println("\t3. Teenagers(13 to 19 years");
System.out.println("Enter the section in which you want to shop");
String weekender=b.readLine();
int kids=Integer.parseInt(weekender);
switch(kids)
{
case 1:do
       {
       System.out.println("WELCOME TO THE INFANTS SECTION OF WEEKENDER KIDS");
       System.out.println("\t1. Battery Operated Toys");
       System.out.println("\t2. Manually Operated Toys");
       System.out.println("\t3. Stroller");
       System.out.println("\t4. Prem");
       System.out.println("\t5. Caps");
       System.out.println("What would you like to buy");
       String weekender1=b.readLine();
       int kids1=Integer.parseInt(weekender1);
       switch(kids1)
        {
          case 1:System.out.println("The item you have chosen is Battery Operated Toys");
                 System.out.println("Each Battery Operated Toy will cost Rs. 350.00");
                 System.out.println("How many Battery Operated Toys would you like to buy");
                 String num=b.readLine();
                 int n=Integer.parseInt(num);
                 cart=cart+(n*350);
                 break;
          case 2:System.out.println("The item you have chosen is Manually Operated Toys");
                 System.out.println("Each Manually Operated Toy will cost Rs. 250.00");
                 System.out.println("How many Manually Operated Toys would you like to buy");
                 num=b.readLine();
                 n=Integer.parseInt(num);
                 cart=cart+(n*250);
                 break;
          case 3:System.out.println("The item you have chosen is Stroller");
                 System.out.println("Each Stroller will cost Rs. 250.00");
                 System.out.println("How many Strollers would you like to buy");
                 num=b.readLine();
                 n=Integer.parseInt(num);
                 cart=cart+(n*250);
                 break;
          case 4:System.out.println("The item you have chosen is Prem");
                 System.out.println("Each Prem will cost Rs. 250.00");
                 System.out.println("How many Prems would you like to buy");
                 num=b.readLine();
                 n=Integer.parseInt(num);
                 cart=cart+(n*250);
                 break;
          case 5:System.out.println("The item you have chosen is Caps");
                 System.out.println("Each Cap will cost Rs. 250.00");
                 System.out.println("How many Caps would you like to buy");
                 num=b.readLine();
                 n=Integer.parseInt(num);
                 cart=cart+(n*250);
                 break;
          default:System.out.println("SORRY!!!!!     The item entered by you is not available");       
          System.out.println("Would you like to continue shopping in the infants' section of WEEKENDER KIDS(YES/NO)");
          choice=b.readLine();
          }
       }while(choice.equalsIgnoreCase("YES"));
       break;                 
case 2:do
       {
       System.out.println("WELCOME TO THE KIDS SECTION OF WEEKENDER KIDS");
       System.out.println("\t1. Battery Operated Toys");
       System.out.println("\t2. Remote Controlled Toys");
       System.out.println("\t3. Lunch Boxes");
       System.out.println("\t4. Water Bottles");
       System.out.println("\t5. School Bags");
       System.out.println("\t6. Story Books");
       System.out.println("What would you like to buy");  
       String weekender1=b.readLine();
       int kids1=Integer.parseInt(weekender1);
       switch(kids1)
         {
          case 1:System.out.println("The item you have chosen is Battery Operated Toys");
                 System.out.println("Each Battery Operated Toy will cost Rs. 350.00");
                 System.out.println("How many Battery Operated Toys would you like to buy");
                 String num=b.readLine();
                 int n=Integer.parseInt(num);
                 cart=cart+(n*350);
                 break;
          case 2:System.out.println("The item you have chosen is Remote Controlled Toys");
                 System.out.println("Each Remote Controlled Toy will cost Rs. 555.00");
                 System.out.println("How many Remote Controlled Toys would you like to buy");
                 num=b.readLine();
                 n=Integer.parseInt(num);
                 cart=cart+(n*555);
                 break;       
          case 3:System.out.println("The item you have chosen is Luch Box");
                 System.out.println("Each Lunch Box will cost Rs. 35.00");
                 System.out.println("How many Lunch Boxes would you like to buy");
                 num=b.readLine();
                 n=Integer.parseInt(num);
                 cart=cart+(n*35);
                 break;       
          case 4:System.out.println("The item you have chosen is Water Bottles");
                 System.out.println("Each Water Bottle will cost Rs. 75.00");
                 System.out.println("How many Water Bottles would you like to buy");
                 num=b.readLine();
                 n=Integer.parseInt(num);
                 cart=cart+(n*75);
                 break;       
          case 5:System.out.println("The item you have chosen is School Bags");
                 System.out.println("Each School Bag will cost Rs. 200.00");
                 System.out.println("How many School Bags would you like to buy");
                 num=b.readLine();
                 n=Integer.parseInt(num);
                 cart=cart+(n*200);
                 break;       
          case 6:System.out.println("The item you have chosen is Story Books");
                 System.out.println("Which Story book would you like to buy");
                 String story=b.readLine();
                 System.out.println("Each Story Book will cost Rs. 155.00");
                 System.out.println("How many Story Books would you like to buy");
                 num=b.readLine();
                 n=Integer.parseInt(num);
                 cart=cart+(n*155);
                 break;       
          default:System.out.println("SORRY!!!!!     The item entered by you is not available");       
          System.out.println("Would you like to continue shopping in the kid's section of WEEKENDER KIDS(YES/NO)");
          choice=b.readLine();
          }
       }while(choice.equalsIgnoreCase("YES"));
        break;                 
case 3:do
       {
       System.out.println("WELCOME TO THE TEENAGERS SECTION OF WEEKENDER KIDS");
       System.out.println("\t1. Digital Diary");
       System.out.println("\t2. Wallet");
       System.out.println("\t3. Mobile Purse");
       System.out.println("\t4. Trouser Belt");
       System.out.println("What would you like to buy");  
       String weekender1=b.readLine();
       int kids1=Integer.parseInt(weekender1);
       switch(kids1)         
         {
          case 1:System.out.println("The item you have chosen is Digital Diary");
                 System.out.println("Each Digital Diary will cost Rs. 850.00");
                 System.out.println("How many Digital Diaries would you like to buy");
                 String num=b.readLine();
                 int n=Integer.parseInt(num);
                 cart=cart+(n*850);
                 break;
          case 2:System.out.println("The item you have chosen is Wallet");
                 System.out.println("Each Wallet will cost Rs. 58.00");
                 System.out.println("How many Wallets would you like to buy");
                 num=b.readLine();
                 n=Integer.parseInt(num);
                 cart=cart+(n*58);
                 break;       
          case 3:System.out.println("The item you have chosen is Mobile Purse");
                 System.out.println("Each Mobile Purse will cost Rs. 23.00");
                 System.out.println("How many Mobile Purses would you like to buy");
                 num=b.readLine();
                 n=Integer.parseInt(num);
                 cart=cart+(n*23);
                 break;
          case 4:System.out.println("The item you have chosen is Trouser Belt");
                 System.out.println("Each Trouser Belt will cost Rs. 175.00");
                 System.out.println("How many Trouser Belts would you like to buy");
                 num=b.readLine();
                 n=Integer.parseInt(num);
                 cart=cart+(n*175);
                 break;
          default:System.out.println("SORRY!!!!!     The item entered by you is not available");
         }
          System.out.println("Would you like to continue shopping in teenagers section of WEEKENDER KIDS(YES/NO)");
          choice=b.readLine();
                 
       }while(choice.equalsIgnoreCase("YES"));        
default:System.out.println("The section which you have chosen is incorrect.Please choose the correct section");
}
System.out.println("Would you like to continue shopping in WEEKENDER KIDS(YES/NO)");
choice=b.readLine();         
}
while(choice.equalsIgnoreCase("YES"));
}
public static void sports()throws IOException
{
String choice="";
do
{
InputStreamReader a=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(a);
System.out.println("WELCOME TO OLYMPUS SPORTS WORLD");
System.out.println("\t1. Indoor Section");
System.out.println("\t2. Outdoor Section");
String section=b.readLine();
int sec=Integer.parseInt(section);
if(sec==1)
{
System.out.println("WELCOME TO THE INDOOR SECTION OF OLYMPUS SPORTS WORLD");
System.out.println("\t1. Table Tennis");
System.out.println("\t2. Carrom");
System.out.println("\t3. Chess");
System.out.println("\t4. Billiards");
System.out.println("Which game do you want to choose");
String ingame=b.readLine();
int ingames=Integer.parseInt(ingame);
switch(ingames)
{
case 1:do
       {
       System.out.println("The game you have chosen is Table Tennis");
       System.out.println("\t1. Table Tennis bat");
       System.out.println("\t2. Table Tennis ball");
       System.out.println("\t3. Table Tennis net");
       System.out.println("\t4. Table Tennis table");
       System.out.println("Which item do you want");
       String tt=b.readLine();
       int tt1=Integer.parseInt(tt);
       switch(tt1)
       {
           case 1:System.out.println("The item you have chosen is Table Tennis Bat");
                  System.out.println("Each table tennis bat will cost you Rs. 200.00");
                  System.out.println("How many do you want");
                  String ttitem=b.readLine();
                  int ttitem1=Integer.parseInt(ttitem);
                  System.out.println("You pay Rs. "+(ttitem1*200)+" for "+ttitem1+" table tennis bats");
                  cart=cart+(ttitem1*200);
                  break;
           case 2:System.out.println("The item you have chosen is Table Tennis Ball");
                  System.out.println("Each table tennis ball will cost you Rs. 100.00");
                  System.out.println("How many do you want");
                  ttitem=b.readLine();
                  ttitem1=Integer.parseInt(ttitem);
                  System.out.println("You pay Rs. "+(ttitem1*100)+" for "+ttitem1+" table tennis balls");
                  cart=cart+(ttitem1*100);
                  break;
           case 3:System.out.println("The item you have chosen is Table Tennis Net");
                  System.out.println("Each table tennis net will cost you Rs. 5000.00");
                  System.out.println("How many do you want");
                  ttitem=b.readLine();
                  ttitem1=Integer.parseInt(ttitem);
                  System.out.println("You pay Rs. "+(ttitem1*200)+" for "+ttitem1+" table tennis nets");
                  cart=cart+(ttitem1*5000);       
                  break;
           case 4:System.out.println("The item you have chosen is Table Tennis Table");
                  System.out.println("Each table tennis table will cost you Rs. 20000.00");
                  System.out.println("How many do you want");
                  ttitem=b.readLine();
                  ttitem1=Integer.parseInt(ttitem);
                  System.out.println("You pay Rs. "+(ttitem1*20000)+" for "+ttitem1+" table tennis tables");
                  cart=cart+(ttitem1*20000);
                  break;
           default:System.out.println("The item you have chosen is not available.Please choose the correct option");
       }
       System.out.println("Do you want to continue shopping for Table Tennis items(YES/NO)");
       choice=b.readLine();      
       }while(choice.equalsIgnoreCase("Yes"));
       break;
case 2:do
       {
       System.out.println("The game you have chosen is Carrom");
       System.out.println("\t1. Carrom Striker");
       System.out.println("\t2. Carrom Pawns");
       System.out.println("\t3. Carrom Board");
       System.out.println("\t4. Carrom Board Powder");
       System.out.println("Which item do you want");
       String carrom=b.readLine();
       int carrom1=Integer.parseInt(carrom);
       switch(carrom1)
       {
           case 1:System.out.println("The item you have chosen is Carrom Striker");
                  System.out.println("Each carrom striker costs Rs. 50.00");
                  System.out.println("How many carrom strikers do you want");
                  String caritem=b.readLine();
                  int caritem1=Integer.parseInt(caritem);
                  System.out.println("You will pay Rs. "+(caritem1*50)+" for "+caritem1+" carrom strikers");
                  cart=cart+(caritem1*50);
                  break;
           case 2:System.out.println("The item you have chosen is Carrom Pawns");
                  System.out.println("Each set of carrom pawns will cost you Rs. 150.00");
                  System.out.println("How many sets of carrom strikers do you want");
                  caritem=b.readLine();
                  caritem1=Integer.parseInt(caritem);
                  System.out.println("You will pay Rs. "+(caritem1*150)+" for "+caritem1+" sets of carrom strikers");
                  cart=cart+(caritem1*150);
                  break;       
           case 3:System.out.println("The item you have chosen is Carrom Board");
                  System.out.println("Each carrom board will cost you Rs. 1000.00");
                  System.out.println("How many carrom boards do you want");
                  caritem=b.readLine();
                  caritem1=Integer.parseInt(caritem);
                  System.out.println("You will pay Rs. "+(caritem1*1000)+" for "+caritem1+" carrom boards");
                  cart=cart+(caritem1*1000);
                  break;
           case 4:System.out.println("The item you have chosen is Carrom Board Powder");
                  System.out.println("Each carrom board powder box will cost you Rs. 100.00");
                  System.out.println("How many cans of carrom board powder do you want");
                  caritem=b.readLine();
                  caritem1=Integer.parseInt(caritem);
                  System.out.println("You will pay Rs. "+(caritem1*100)+" for "+caritem1+" cans of carrom board powder");
                  cart=cart+(caritem1*100);
                  break;
           default:System.out.println("The item you have chosen is not available.Please choose the correct option");
       }
       System.out.println("Do you want to continue shopping for Carrom Items(YES/NO)");
       choice=b.readLine();
       }while(choice.equalsIgnoreCase("Yes"));
       break;
case 3:do
       {
       System.out.println("The game you have chosen is Chess");
       System.out.println("\t1. Chess Pawns");
       System.out.println("\t2. Chess Board");
       System.out.println("Which item do you want");
       String chess=b.readLine();
       int chess1=Integer.parseInt(chess);
       if(chess1==1)
       {
           System.out.println("The item you have chosen is Chess Pawns");
           System.out.println("Each pawn costs Rs. 30.00");
           System.out.println("Which pawn do you want");
           String pawn=b.readLine();
           System.out.println("How many pawns do you want");
           String cheitem=b.readLine();
           int cheitem1=Integer.parseInt(cheitem);
           System.out.println("You will have to pay Rs. "+(cheitem1*30)+" for "+cheitem1+" "+pawn+" pawns");
           cart=cart+(cheitem1*30);
       }
       else if(chess1==2)
       {
           System.out.println("The item you have chosen is Chess Board");
           System.out.println("Each pawn costs Rs. 100.00");
           System.out.println("How many boards do you want");
           String cheitem=b.readLine();
           int cheitem1=Integer.parseInt(cheitem);
           System.out.println("You will have to pay Rs. "+(cheitem1*100)+" for "+cheitem1+" boards");
           cart=cart+(cheitem1*100);
       }
       else
       {
           System.out.println("The item you have chosen is not available.Please choose the correct option");           
       }
       System.out.println("Do you want to continue shopping for Chess Items(YES/NO)");
       choice=b.readLine();
       }while(choice.equalsIgnoreCase("YES"));
case 4:do
       {
       System.out.println("The game you have chosen is Billiards");
       System.out.println("\t1. Billiards Ball");
       System.out.println("\t2. Billiards Stick");
       System.out.println("\t3. Billiards Stick Sharpener");
       System.out.println("\t4. Billiards Table");
       System.out.println("Which item would you like to have");
       String billiards=b.readLine();
       int billiards1=Integer.parseInt(billiards);
       if(billiards1==1)
       {
           System.out.println("The item you have chosen is Billiards Ball");
           System.out.println("Each billiards ball costs Rs. 700.00");
           System.out.println("How many billiards balls do you want to buy");
           String billitem=b.readLine();
           int billitem1=Integer.parseInt(billitem);
           System.out.println("Which colour billiard ball do you want");
           String colour=b.readLine();
           System.out.println("You will have to pay Rs. "+(billitem1*700)+" for "+billitem1+" "+colour+" colour balls");
           cart=cart+(billitem1*700);
       }
       else if(billiards1==2)
       {
           System.out.println("The item you have chosen is Billiards Strick");
           System.out.println("Each billiards stick costs Rs. 3000.00");
           System.out.println("How many billiards sticks do you want to buy");
           String billitem=b.readLine();
           int billitem1=Integer.parseInt(billitem);
           System.out.println("You will have to pay Rs. "+(billitem1*3000)+" for "+billitem1+" billiard sticks");
           cart=cart+(billitem1*3000);
       }
       else if(billiards1==3)
       {
           System.out.println("The item you have chosen is Billiards Strick Sharpener");
           System.out.println("Each billiards stick sharpener costs Rs. 1000.00");
           System.out.println("How many billiards stick sharpener do you want to buy");
           String billitem=b.readLine();
           int billitem1=Integer.parseInt(billitem);
           System.out.println("You will have to pay Rs. "+(billitem1*3000)+" for "+billitem1+" billiard stick sharpener");
           cart=cart+(billitem1*1000);
       }
       else if(billiards1==4)
       {
           System.out.println("The item you have chosen is Billiards Table");
           System.out.println("Each billiards stick costs Rs. 15000.00");
           System.out.println("How many billiards tables do you want to buy");
           String billitem=b.readLine();
           int billitem1=Integer.parseInt(billitem);
           System.out.println("You will have to pay Rs. "+(billitem1*15000)+" for "+billitem1+" billiard tables");
           cart=cart+(billitem1*15000);
       }
       else
       {
           System.out.println("The item you have chosen is not available.Please choose the correct option");
       }
       System.out.println("Do you want to continue shopping for Billiards Items(YES/NO)");
       choice=b.readLine();
       }while(choice.equalsIgnoreCase("Yes"));
       break;
default:System.out.println("The items for the game you have chosen is not available.Please choose the correct option");        
}
}
else if(sec==2)
{
System.out.println("WELCOME TO THE OUTDOOR SECTION OF OLYMPUS SPORTS WORLD");
System.out.println("\t1. Cricket");
System.out.println("\t2. Football");
System.out.println("\t3. Basketball");
System.out.println("\t4. Tennis");
System.out.println("\t5. Hockey");
System.out.println("Which game do you want to choose");
String outgame=b.readLine();
int outgames=Integer.parseInt(outgame);
switch(outgames)
{
case 1:do
       {
           System.out.println("The game you have chosen is Cricket");
           System.out.println("\t1. Cricket Bat");
           System.out.println("\t2. Cricket Ball");
           System.out.println("\t3. Cricket Stumps");
           System.out.println("\t4. Cricket Batsmen gloves");
           System.out.println("\t5. Cricket Wicketkeeper gloves");
           System.out.println("Which item would you like to have");
           String cric=b.readLine();
           int cric1=Integer.parseInt(cric);
           switch(cric1)
           {
               case 1:System.out.println("The item you have chosen is Cricket Bat");
                      System.out.println("Each cricket bat costs Rs. 3000.00");
                      System.out.println("How many cricket bats do you want");
                      String cricitem=b.readLine();
                      int cricitem1=Integer.parseInt(cricitem);
                      System.out.println("You have to pay Rs. "+(cricitem1*3000)+" for "+cricitem1+" bats");
                      cart=cart+(cricitem1*3000);
                      break;
               case 2:System.out.println("The item you have chosen is Cricket Ball");
                      System.out.println("Each cricket ball costs Rs. 1000.00");
                      System.out.println("Which type of cricket ball do you want");
                      String ball=b.readLine();
                      System.out.println("How many cricket balls do you want");
                      cricitem=b.readLine();
                      cricitem1=Integer.parseInt(cricitem);
                      System.out.println("You have to pay Rs. "+(cricitem1*1000)+" for "+cricitem1+" "+ball+" balls");
                      cart=cart+(cricitem1*1000);
                      break;
               case 3:System.out.println("The item you have chosen is Cricket Stumps");
                      System.out.println("Each set of cricket stumps costs Rs. 700.00");
                      System.out.println("How many set of cricket stumps do you want");
                      cricitem=b.readLine();
                      cricitem1=Integer.parseInt(cricitem);
                      System.out.println("You have to pay Rs. "+(cricitem1*700)+" for "+cricitem1+" sets of cricket stumps");
                      cart=cart+(cricitem1*700);
                      break;
               case 4:System.out.println("The item you have chosen is Cricket Batsmen gloves");
                      System.out.println("Each pair of cricket batsmen gloves costs Rs. 500.00");
                      System.out.println("How many pairs of cricket batsmen gloves do you want");
                      cricitem=b.readLine();
                      cricitem1=Integer.parseInt(cricitem);
                      System.out.println("You have to pay Rs. "+(cricitem1*500)+" for "+cricitem1+" pairs of cricket batsmen gloves");
                      cart=cart+(cricitem1*500);
                      break;
               case 5:System.out.println("The item you have chosen is Cricket Wicketkeeper gloves");
                      System.out.println("Each pair of cricket wicketkeeper gloves costs Rs. 500.00");
                      System.out.println("How many pairs of cricket wicketkeeper gloves do you want");
                      cricitem=b.readLine();
                      cricitem1=Integer.parseInt(cricitem);
                      System.out.println("You have to pay Rs. "+(cricitem1*500)+" for "+cricitem1+" pairs of cricket wicketkeeper gloves");
                      cart=cart+(cricitem1*500);
                      break;
               default:System.out.println("The item you have chosen is not available.Please choose the correct option");       
           }
       System.out.println("Do you want to continue shopping for cricket items(YES/NO)");
       choice=b.readLine();
       }while(choice.equalsIgnoreCase("Yes"));
       break;
case 2:do
       {
           System.out.println("The game you have chosen is Football");
           System.out.println("\t1. Football ball");
           System.out.println("\t2. Football studds");
           System.out.println("\t3. Football pads");
           System.out.println("Which item would you like to have");
           String football=b.readLine();
           int footballs=Integer.parseInt(football);
           switch(footballs)
           {
               case 1:System.out.println("The item you have chosen is Football ball");
                      System.out.println("Each football ball costs Rs. 3000.00");
                      System.out.println("Which colour football ball do you want");
                      String colour=b.readLine();
                      System.out.println("How many football balls do you want");
                      String footitem=b.readLine();
                      int footitem1=Integer.parseInt(footitem);
                      System.out.println("You have to pay Rs. "+(footitem1*3000)+" for "+footitem1+" "+colour+" colour footballs");
                      cart=cart+(footitem1*3000);
                      break;
               case 2:System.out.println("The item you have chosen is Football Studds");
                      System.out.println("Each pair of football studds costs Rs. 7000.00");
                      System.out.println("How many pairs of football studds do you want");
                      footitem=b.readLine();
                      footitem1=Integer.parseInt(footitem);
                      System.out.println("You have to pay Rs. "+(footitem1*7000)+" for "+footitem1+" pairs of football studds");
                      cart=cart+(footitem1*7000);
                      break;
               case 3:System.out.println("The item you have chosen is Football Pads");
                      System.out.println("Each pair of football pads costs Rs. 1500.00");
                      System.out.println("How many pairs of football pads do you want");
                      footitem=b.readLine();
                      footitem1=Integer.parseInt(footitem);
                      System.out.println("You have to pay Rs. "+(footitem1*1500)+" for "+footitem1+" pairs of football pads");
                      cart=cart+(footitem1*1500);
                      break;
               default:System.out.println("The item you have chosen is not available.Please choose the correct option");
           }
       System.out.println("Would you like to continue shopping for football items(YES/NO)");
       choice=b.readLine();
       }while(choice.equalsIgnoreCase("Yes"));
       break;
case 3:do
       {
           System.out.println("The game you have chosen is Basketball");
           System.out.println("\t1. Baketball Ball");
           System.out.println("\t2. Basketball Shoes");
           System.out.println("\t3. Basketball Ankleweights");
           System.out.println("Which item would you like to have");
           String basketball=b.readLine();
           int basketballs=Integer.parseInt(basketball);
           switch(basketballs)
           {
            case 1:System.out.println("The item you have chosen is Basketball Ball");
                   System.out.println("Each basketball costs Rs. 3500");
                   System.out.println("Which colour basketball ball do you want");
                   String colour=b.readLine();
                   System.out.println("How many basketball balls do you want");
                   String basketitem=b.readLine();
                   int basketitem1=Integer.parseInt(basketitem);
                   System.out.println("You have to pay Rs. "+(basketitem1*3500)+" for "+basketitem1+" "+colour+" colour basketball balls");
                   cart=cart+(basketitem1*3500);
                   break;
            case 2:System.out.println("The item you have chosen is Basketball Shoes");
                   System.out.println("Each pair of basketball shoes costs Rs. 5500");
                   System.out.println("How many pairs of basketball shoes do you want");
                   basketitem=b.readLine();
                   basketitem1=Integer.parseInt(basketitem);
                   System.out.println("You have to pay Rs. "+(basketitem1*5500)+" for "+basketitem1+" pairs of basketball shoes");
                   cart=cart+(basketitem1*5500);
                   break;
            case 3:System.out.println("The item you have chosen is Basketball Ankleweights");
                   System.out.println("Each pair of basketball ankleweights costs Rs. 1500");
                   System.out.println("How many pairs of basketball ankleweights do you want");
                   basketitem=b.readLine();
                   basketitem1=Integer.parseInt(basketitem);
                   System.out.println("You have to pay Rs. "+(basketitem1*1500)+" for "+basketitem1+" pairs of basketball ankleweights");
                   cart=cart+(basketitem1*1500);
                   break;
            default:System.out.println("The item you have chosen is not available.Please choose the correct option");  
           }
       System.out.println("Would you like to continue shopping for basketball items(YES/NO)");
       choice=b.readLine();
       }while(choice.equalsIgnoreCase("Yes"));
       break;
}
}
}while(choice.equalsIgnoreCase("Yes"));
}
public static void main(String args[])throws IOException
{
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("This program is developed by KIRAN.S.BAGAWALE");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("Class X 'A' - 10125 , 25");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("");
mainprog();
}
}