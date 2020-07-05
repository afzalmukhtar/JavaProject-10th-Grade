import java.util.*;
class project
{
int NoOfSeats;
int costOfOneTicket;
int ctr;
public static void main()
{
System.out.println("============================================================================================================================================================");
System.out.println("                                    FAISAL MUKHTAR      X - \"G\"      COMPUTER APP. PROJECT 2013-2014      TICKET BOOKING"); 
System.out.println("============================================================================================================================================================");
System.out.println(""); 
System.out.println("");
System.out.println("                                                               ================================");
System.out.println("                                                               Horizon Ticket Booking and Tours");
System.out.println("                                                               ================================");
System.out.println("");
System.out.println("............................................................................................................................................................");
System.out.println("                       You are welcome to Horizon Ticket Booking and Tours......Thanks for choosing Horizon Ticket Booking and Tours!");
System.out.println("............................................................................................................................................................");
System.out.println("");
System.out.println("");
System.out.println("We have our branches in all the major cities of India....:");
System.out.println("");
System.out.println("-----------------------------------");
System.out.println("| 1) Bengalooru -- Karnataka     |");
System.out.println("| 2) Kolkata -- West Bengal      |");
System.out.println("| 3) Mumbai -- Maharashtra       |");
System.out.println("| 4) New Delhi -- Delhi          |");
System.out.println("-----------------------------------");
System.out.println("");
System.out.println("Please choose the place where you wish to board your flight, train or bus...");
System.out.println("Type '1' for Bengalooru");
System.out.println("Type '2' for Kolkata");
System.out.println("Type '3' for Mumbai");
System.out.println("Type '4' for New Delhi");
Scanner input = new Scanner(System.in);
int location=input.nextInt();
switch(location)
{
case 1:
{
System.out.println("We have the following three branches in Bengalooru:");
System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("");
        System.out.println("47, N-F Tours and Travels,");
        System.out.println("Inner Ring Road,"); 
        System.out.println("B.T.M. Layout,");
        System.out.println("Bengalooru.");
        System.out.println("");
        System.out.println("---------------------------------");
System.out.println("");
        System.out.println("887, N-F Tours and Travels,");
        System.out.println("Ring Road,");
        System.out.println("Whitefield,");
        System.out.println("Bengalooru.");
        System.out.println("");
        System.out.println("---------------------------------");
System.out.println("");
        System.out.println("710, N-F Tours and Travels,");
        System.out.println("Old Madras Road,");
        System.out.println("Near Oracle Inc.,");
        System.out.println("Bengalooru.");
        System.out.println("");
        System.out.println("---------------------------------");
System.out.println("");
System.out.println("Horizon Ticket Booking and Tours brings to you 5 out of the innumerable places to visit in INDIA");

System.out.println("1.Mysore");
System.out.println("2.Jaipur");
System.out.println("3.Goa");
System.out.println("4.Agra");
System.out.println("5.Shimla");
System.out.println("");
System.out.println("Please choose the place to where you would like to BOOK YOUR TICKET to:");
System.out.println("TYPE: 1 for Mysore | 2 for Jaipur | 3 for Goa | 4 for Agra | 5 for Shimla");
int destination=input.nextInt();
project obj=new project();
if (destination==1)
{obj.bengalooru_to_mysore();}
else if(destination==2)
{obj.bengalooru_to_jaipur();}
else if(destination==3)
{obj.bengalooru_to_goa();}
else if(destination==4)
{obj.bengalooru_to_agra();}
else if(destination==5)
{obj.bengalooru_to_shimla();}

else
System.out.print("WRONG CHOICE");
break;
}
case 2:
{
System.out.println("We have the following two branches in Kolkata:");
System.out.println("");
        System.out.println("---------------------------------");
             System.out.println("");
        System.out.println("77, N-F Tours and Travels,");
        System.out.println("Mahatama Gandhi Road,");
        System.out.println("Kolkata.");
System.out.println("");
        System.out.println("---------------------------------");
             System.out.println("");
        System.out.println("400, N-F Tours and Travels,"); 
        System.out.println("Acharya Prafulla Chandra Road,");
        System.out.println("Near Raja Bazar Tram Depot,");
        System.out.println("Kolkata.");
             System.out.println("");
        System.out.println("---------------------------------");
System.out.println("");
System.out.println("Horizon Ticket Booking and Tours brings to you 5 out of the innumerable places to visit in INDIA");

System.out.println("1.Mysore");
System.out.println("2.Jaipur");
System.out.println("3.Goa");
System.out.println("4.Agra");
System.out.println("5.Shimla");
System.out.println("");
System.out.println("Please choose the place to where you would like to BOOK YOUR TICKET to:");
System.out.println("TYPE: 1 for Mysore | 2 for Jaipur | 3 for Goa | 4 for Agra | 5 for Shimla");
int destination=input.nextInt();
project obj=new project();
if (destination==1)
{obj.kolkata_to_mysore();}
else if(destination==2)
{obj.kolkata_to_jaipur();}
else if(destination==3)
{obj.kolkata_to_goa();}
else if(destination==4)
{obj.kolkata_to_agra();}
else if(destination==5)
{obj.kolkata_to_shimla();}
else
System.out.print("WRONG CHOICE");
break;
}
case 3:
{
System.out.println("We have the following six branches in Mumbai:");
System.out.println("");
  System.out.println("---------------------------------------------------------------------------------------------------");
  System.out.println("");
        System.out.println("77, N-F Tours and Travels,                    |     88, N-F Tours and Travels,");
        System.out.println("Mahatama Gandhi Road,                         |     Aarey Road,");
        System.out.println("Borivali,                                     |     Goregaon (EAST),");
        System.out.println("Mumbai.                                       |     Mumbai.");
        System.out.println("");
  System.out.println("---------------------------------------------------------------------------------------------------");
System.out.println("");
        System.out.println("022, N-F Tours and Travels [HEAD OFFICE],     |     44, N-F Tours and Travels,"); 
        System.out.println("J.P Road,                                     |     S.V Road (Bandra Terminus Side");
        System.out.println("Near Azad Nagar Metro Station,                |     Bandra (WEST),");
        System.out.println("Andheri (WEST),                               |     Mumbai.");
        System.out.println("Mumbai.");
        System.out.println("");
System.out.println("-----------------------------------------------------------------------------------------------------");
System.out.println("");
        System.out.println("04, N-F Tours and Travels,                    |    124, N-F Tours and Travels,"); 
        System.out.println("Malad - Marve Road,                           |    S.V Road, near L.I.C Colony,");
        System.out.println("Malad (WEST),                                 |    Juhu,");
        System.out.println("Mumbai.                                       |    Mumbai.");     
        System.out.println("");
System.out.println("-----------------------------------------------------------------------------------------------------");

System.out.println("");
System.out.println("Horizon Ticket Booking and Tours brings to you 5 out of the innumerable places to visit in INDIA:");

System.out.println("1.Mysore");
System.out.println("2.Jaipur");
System.out.println("3.Goa");
System.out.println("4.Agra");
System.out.println("5.Shimla");
System.out.println("");
System.out.println("Please choose the place to where you would like to BOOK YOUR TICKET to:");
System.out.println("TYPE: 1 for Mysore | 2 for Jaipur | 3 for Goa | 4 for Agra | 5 for Shimla");
int destination=input.nextInt();
project obj=new project();
if (destination==1)
{obj.mumbai_to_mysore();}
else if(destination==2)
{obj.mumbai_to_jaipur();}
else if(destination==3)
{obj.mumbai_to_goa();}
else if(destination==4)
{obj.mumbai_to_agra();}
else if(destination==5)
{obj.mumbai_to_shimla();}
else
System.out.print("WRONG CHOICE");
break;
}
case 4:
{
System.out.println("We have the following two branches in Delhi:");
System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("");
        System.out.println("77, N-F Tours and Travels,");
        System.out.println("Mahatama Gandhi Road,");
        System.out.println("New Delhi.");
System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("");
        System.out.println("411, N-F Tours and Travels,"); 
        System.out.println("Radial Road No.2,");
        System.out.println("Near Domino's Pizza,");
        System.out.println("New Delhi.");
        System.out.println("");
        System.out.println("---------------------------------");
System.out.println("");
System.out.println("Horizon Ticket Booking and Tours brings to you 5 out of the innumerable places to visit in INDIA:");

System.out.println("1.Mysore");
System.out.println("2.Jaipur");
System.out.println("3.Goa");
System.out.println("4.Agra");
System.out.println("5.Shimla");
System.out.println("");
System.out.println("Please choose the place to where you would like to BOOK YOUR TICKET to:");
System.out.println("TYPE: 1 for Mysore | 2 for Jaipur | 3 for Goa | 4 for Agra | 5 for Shimla");
int destination=input.nextInt();
project obj=new project();
if (destination==1)
{obj.delhi_to_mysore();}
else if(destination==2)
{obj.delhi_to_jaipur();}
else if(destination==3)
{obj.delhi_to_goa();}
else if(destination==4)
{obj.delhi_to_agra();}
else if(destination==5)
{obj.delhi_to_shimla();}
else
System.out.print("WRONG CHOICE");
break;
}
default:
{
System.out.print("Sorry, Wrong Choice!");
}
}
}






























void bengalooru_to_mysore()
{
Scanner input=new Scanner(System.in);
System.out.println("How would you like to travel?");
System.out.println("1.Plane, 2.Train or 3.Bus?");
System.out.println("Type 1 for Plane");
System.out.println("Type 2 for Train");
System.out.println("Type 3 for Bus");

int mode=input.nextInt();
System.out.println("Type date on which you wish to  board flight in the format ddmmyyyy without spaces");
int date=input.nextInt();
;


switch(mode)
{
case 1:
{costOfOneTicket=2100;
System.out.println("There is/are 2 flight(s) available to Mysore on the date: " + date);
System.out.println("");
System.out.println("1.IC 4112");
System.out.println("2.IN 121");
System.out.println("Choose the flight you wish to board");
System.out.println("Type 1 for IC 4112 or 2 for IN 121");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket);  
System.out.println("Choose number of seats. but not more than 12, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>12)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");

;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
}

else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 11, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>11)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}}

else{System.out.print("Sorry, WRONG CHOICE");}
break;
}







case 2:
{costOfOneTicket=700;
System.out.println("There is/are 2 two train(s) available to Mysore on the date: " + date);
System.out.println("");
System.out.println("1.Bangalore-Mysore Express");
System.out.println("2.ST Express");
System.out.println("Choose the train you wish to board");
System.out.println("Type 1 for Bangaloe-Mysore Express or 2 for ST Express");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 40, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>40)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
String names[]=new String[NoOfSeats];
   ;

for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 7, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>7)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}







case 3:
{costOfOneTicket=500;
System.out.println("There is/are 2 busses available to Mysore on the date: " + date);
System.out.println("");
System.out.println("1.Volvo Banglore to Mysore Bus");
System.out.println("2.Mysore Tours Bus");
System.out.println("Choose the bus you wish to board");
System.out.println("Type 1 for Volvo Banglore to Mysore Bus    OR    2 for Mysore Tours Bus");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 4, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>4)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 2, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>2)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
}
}


















































void bengalooru_to_jaipur()
{
System.out.println("How would you like to travel?");
System.out.println("1.Plane, 2.Train or 3.Bus?");
System.out.println("Type 1 for Plane");
System.out.println("Type 2 for Train");
System.out.println("Type 3 for Bus");
Scanner input=new Scanner(System.in);
int mode=input.nextInt();
System.out.println("Type date on which you wish to  board flight in the format ddmmyyyy without spaces");
int date=input.nextInt();
;


switch(mode)
{
case 1:
{costOfOneTicket=6100;
System.out.println("There is/are 2 flight(s) available to Jaipur on the date: " + date);
System.out.println("");
System.out.println("1.IC 4112 - Air India");
System.out.println("2.IN 121 - IndiGo");
System.out.println("Choose the flight you wish to board");
System.out.println("Type 1 for IC 4112 or 2 for IN 121");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 12, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>12)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 11, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>11)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}






case 2:
{costOfOneTicket=3200;
System.out.println("There is/are 2 two train(s) available to Jaipur on the date: " + date);
System.out.println("");
System.out.println("1.Bangalore-Jaipur Express");
System.out.println("2.Rajasthan Express");
System.out.println("Choose the train you wish to board");
System.out.println("Type 1 for Bangalore-Jaipur Express or 2 for Rajasthan Express");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 40, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>40)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 7, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>7)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}







case 3:
{costOfOneTicket=4000;
System.out.println("There is/are 2 busses available to Jaipur on the date: " + date + ". All these travel via Golden Quadrilateral Highway which connects all far off places in India.");
System.out.println("");
System.out.println("1.Volvo Banglore to Jaipur Bus");
System.out.println("2.Jaipur Tours Bus");
System.out.println("Choose the bus you wish to board");
System.out.println("Type 1 for Volvo Bangalore to Jaipur Bus    OR    2 for Jaipur Tours Bus");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 4, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>4)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 2, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>2)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
}
}






































void bengalooru_to_goa()
{
System.out.println("How would you like to travel?");
System.out.println("1.Plane, 2.Train or 3.Bus?");
System.out.println("Type 1 for Plane");
System.out.println("Type 2 for Train");
System.out.println("Type 3 for Bus");
Scanner input=new Scanner(System.in);
int mode=input.nextInt();
System.out.println("Type date on which you wish to  board flight in the format ddmmyyyy without spaces");
int date=input.nextInt();
;

switch(mode)
{
case 1:
{costOfOneTicket=4000;
System.out.println("There is/are 2 flight(s) available to Goa on the date: " + date);
System.out.println("");
System.out.println("1.IC 4112 - Air India");
System.out.println("2.IN 121 - IndiGo");
System.out.println("Choose the flight you wish to board");
System.out.println("Type 1 for IC 4112 or 2 for IN 121");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 12, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>12)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 11, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>11)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}






case 2:
{costOfOneTicket=2200;
System.out.println("There is/are 2 two train(s) available to Goa on the date: " + date);
System.out.println("");
System.out.println("1.Bangalore-Goa Express");
System.out.println("2.Goa Express");
System.out.println("Choose the train you wish to board");
System.out.println("Type 1 for Bangalore-Goa Express or 2 for Goa Express");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 40, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>40)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 7, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>7)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}







case 3:
{costOfOneTicket=500;
System.out.println("There is/are 2 busses available to Goa on the date: " + date);
System.out.println("");
System.out.println("1.Volvo Banglore to Goa Bus");
System.out.println("2.Goa Tours Bus");
System.out.println("Choose the bus you wish to board");
System.out.println("Type 1 for Volvo Banglore to Goa Bus    OR    2 for Goa Tours Bus");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 4, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>4)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person - all separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 2, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>2)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
}
}











































void bengalooru_to_agra()
{
System.out.println("How would you like to travel?");
System.out.println("1.Plane, 2.Train or 3.Bus?");
System.out.println("Type 1 for Plane");
System.out.println("Type 2 for Train");
System.out.println("Type 3 for Bus - all of them travel via the Golden Quadrilateral Highway which connects even far off places");
Scanner input=new Scanner(System.in);
int mode=input.nextInt();
System.out.println("Type date on which you wish to  board flight in the format ddmmyyyy without spaces");
int date=input.nextInt();
;


switch(mode)
{
case 1:
{costOfOneTicket=7000;
System.out.println("There is/are 2 flight(s) available to Agra on the date: " + date);
System.out.println("");
System.out.println("1.IC 4112 - Air India");
System.out.println("2.IN 121 - IndiGo");
System.out.println("Choose the flight you wish to board");
System.out.println("Type 1 for IC 4112 or 2 for IN 121");
int fltno=input.nextInt();
if (fltno==1)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 12, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>12)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 11, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>11)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}






case 2:
{costOfOneTicket=3752;
System.out.println("There is/are 2 two train(s) available to Agra on the date: " + date);
System.out.println("");
System.out.println("1.Karnataka Express");
System.out.println("2.Rapti Sagar Express");
System.out.println("Choose the train you wish to board");
System.out.println("Type 1 for Karnataka Express or 2 for Rapti Sagar Express");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 40, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>40)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 7, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>7)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}







case 3:
{costOfOneTicket=3200;
System.out.println("There is/are 2 busses available to Agra on the date: " + date);
System.out.println("");
System.out.println("1.Volvo Banglore to Agra Bus");
System.out.println("2.North Tours Bus");
System.out.println("Choose the bus you wish to board");
System.out.println("Type 1 for Volvo Banglore to Agra Bus    OR    2 for North Tours Bus");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 4, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>4)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person - all separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 2, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>2)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
}
}
void bengalooru_to_shimla()
{
System.out.println("How would you like to travel?");
System.out.println("1.Plane, 2.Train or 3.Bus?");
System.out.println("Type 1 for Plane");
System.out.println("Type 2 for Train");
System.out.println("Type 3 for Bus - all of them travel via the Golden Quadrilateral Highway which connects even far off places");
Scanner input=new Scanner(System.in);
int mode=input.nextInt();
System.out.println("Type date on which you wish to  board flight in the format ddmmyyyy without spaces");
int date=input.nextInt();
;


switch(mode)
{
case 1:
{costOfOneTicket=7200;
System.out.println("There is/are 2 flight(s) available to Shimla on the date: " + date);
System.out.println("");
System.out.println("1.IC 4112 - Air India");
System.out.println("2.IN 121 - IndiGo");
System.out.println("Choose the flight you wish to board");
System.out.println("Type 1 for IC 4112 or 2 for IN 121");
int fltno=input.nextInt();
if (fltno==1)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 12, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>12)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
;
}


else if(fltno==2)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 11, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>11)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}






case 2:
{costOfOneTicket=4650;
System.out.println("There is/are 2 two train(s) available to Shimla on the date: " + date);
System.out.println("");
System.out.println("1.Himachal Express");
System.out.println("2.Queen of Hills Express");
System.out.println("Choose the train you wish to board");
System.out.println("Type 1 for Himachal Express or 2 for Queen of Hills Express");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 40, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>40)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 7, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>7)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}

case 3:
{costOfOneTicket=4112;
System.out.println("There is/are 2 busses available to Shimla on the date: " + date);
System.out.println("");
System.out.println("1.Volvo Banglore to Shimla Bus");
System.out.println("2.Himachal Tours Bus");
System.out.println("Choose the bus you wish to board");
System.out.println("Type 1 for Volvo Banglore to Shimla Bus    OR    2 for Himachal Tours Bus");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 4, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>4)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person - all separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 2, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>2)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
}
}
  
void kolkata_to_mysore()
{
System.out.println("How would you like to travel?");
System.out.println("1.Plane, 2.Train or 3.Bus?");
System.out.println("Type 1 for Plane");
System.out.println("Type 2 for Train");
System.out.println("Type 3 for Bus - all of them travel via the Golden Quadrilateral Highway which connects even far off places");
Scanner input=new Scanner(System.in);
int mode=input.nextInt();
System.out.println("Type date on which you wish to  board flight in the format ddmmyyyy without spaces");
int date=input.nextInt();
;
switch(mode)
{
case 1:
{costOfOneTicket=5999;
System.out.println("There is/are 2 flight(s) available to Mysore on the date: " + date);
System.out.println("");
System.out.println("1.IC 4112 - Air India");
System.out.println("2.IN 121 - IndiGo");
System.out.println("Choose the flight you wish to board");
System.out.println("Type 1 for IC 4112 or 2 for IN 121");
int fltno=input.nextInt();
if (fltno==1)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 12, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>12)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 11, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>11)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
case 2:
{costOfOneTicket=2200;
System.out.println("There is/are 2 two train(s) available to Mysore on the date: " + date);
System.out.println("");
System.out.println("1.Bengal Express");
System.out.println("2.Karnataka Express");
System.out.println("Choose the train you wish to board");
System.out.println("Type 1 for Bengal Express or 2 for Karnataka Express");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 40, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>40)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 7, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>7)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
case 3:
{costOfOneTicket=1980;
System.out.println("There is/are 2 busses available to Mysore on the date: " + date);
System.out.println("");
System.out.println("1.Volvo Kolkata to Mysore Bus");
System.out.println("2.Mysore Tours Bus");
System.out.println("Choose the bus you wish to board");
System.out.println("Type 1 for Volvo Kolkata to Mysore Bus    OR    2 for Mysore Tours Bus");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 4, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>4)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person - all separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 2, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>2)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
}
}
 void kolkata_to_jaipur()
{
System.out.println("How would you like to travel?");
System.out.println("1.Plane, 2.Train or 3.Bus?");
System.out.println("Type 1 for Plane");
System.out.println("Type 2 for Train");
System.out.println("Type 3 for Bus - all of them travel via the Golden Quadrilateral Highway which connects even far off places");
Scanner input=new Scanner(System.in);
int mode=input.nextInt();
System.out.println("Type date on which you wish to  board flight in the format ddmmyyyy without spaces");
int date=input.nextInt();
;


switch(mode)
{
case 1:
{costOfOneTicket=3950;
System.out.println("There is/are 2 flight(s) available to Jaipur on the date: " + date);
System.out.println("");
System.out.println("1.IC 4112 - Air India");
System.out.println("2.IN 121 - IndiGo");
System.out.println("Choose the flight you wish to board");
System.out.println("Type 1 for IC 4112 or 2 for IN 121");
int fltno=input.nextInt();
if (fltno==1)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 12, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>12)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 11, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>11)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}case 2:
{costOfOneTicket=2350;
System.out.println("There is/are 2 two train(s) available to Jaipur on the date: " + date);
System.out.println("");
System.out.println("1.Kolkata-Jaipur Express");
System.out.println("2.Rajasthan Express");
System.out.println("Choose the train you wish to board");
System.out.println("Type 1 for Kolkata-Jaipur Express or 2 for Rajasthan Express");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 40, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>40)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 7, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>7)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
case 3:
{costOfOneTicket=1980;
System.out.println("There is/are 2 busses available to Jaipur on the date: " + date);
System.out.println("");
System.out.println("1.Volvo Kolkata to Jaipur Bus");
System.out.println("2.West Indian Tours Bus");
System.out.println("Choose the bus you wish to board");
System.out.println("Type 1 for Volvo Kolkata to Jaipur Bus    OR    2 for West Indian Tours Bus");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 4, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>4)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person - all separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 2, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>2)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
}
}void kolkata_to_goa()
{
System.out.println("How would you like to travel?");
System.out.println("1.Plane, 2.Train or 3.Bus?");
System.out.println("Type 1 for Plane");
System.out.println("Type 2 for Train");
System.out.println("Type 3 for Bus");
Scanner input=new Scanner(System.in);
int mode=input.nextInt();
System.out.println("Type date on which you wish to  board flight in the format ddmmyyyy without spaces");
int date=input.nextInt();
;


switch(mode)
{
case 1:
{costOfOneTicket=2700;
System.out.println("There is/are 2 flight(s) available to Goa on the date: " + date);
System.out.println("");
System.out.println("1.IC 4112 - Air India");
System.out.println("2.IN 121 - IndiGo");
System.out.println("Choose the flight you wish to board");
System.out.println("Type 1 for IC 4112 or 2 for IN 121");
int fltno=input.nextInt();
if (fltno==1)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 12, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>12)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 11, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>11)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
case 2:
{costOfOneTicket=1100;
System.out.println("There is/are 2 two train(s) available to Goa on the date: " + date);
System.out.println("");
System.out.println("1.Kolkata-Goa Express");
System.out.println("2.Bengal Express");
System.out.println("Choose the train you wish to board");
System.out.println("Type 1 for Kolkata-Goa Express or 2 for Bengal Express");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 40, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>40)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 7, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>7)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
case 3:
{costOfOneTicket=940;
System.out.println("There is/are 2 busses available to Goa on the date: " + date);
System.out.println("");
System.out.println("1.Volvo Kolkata to Goa Bus");
System.out.println("2.Goa Tours Bus");
System.out.println("Choose the bus you wish to board");
System.out.println("Type 1 for Volvo Kolkata to Goa Bus    OR    2 for Goa Tours Bus");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 4, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>4)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person - all separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 2, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>2)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
}
}
void kolkata_to_agra()
{
System.out.println("How would you like to travel?");
System.out.println("1.Plane, 2.Train or 3.Bus?");
System.out.println("Type 1 for Plane");
System.out.println("Type 2 for Train");
System.out.println("Type 3 for Bus");
Scanner input=new Scanner(System.in);
int mode=input.nextInt();
System.out.println("Type date on which you wish to  board flight in the format ddmmyyyy without spaces");
int date=input.nextInt();
;

switch(mode)
{
case 1:
{costOfOneTicket=2700;
System.out.println("There is/are 2 flight(s) available to Agra on the date: " + date);
System.out.println("");
System.out.println("1.IC 4112 - Air India");
System.out.println("2.IN 121 - IndiGo");
System.out.println("Choose the flight you wish to board");
System.out.println("Type 1 for IC 4112 or 2 for IN 121");
int fltno=input.nextInt();
if (fltno==1)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 12, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>12)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 11, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>11)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}






case 2:
{costOfOneTicket=1100;
System.out.println("There is/are 2 two train(s) available to Agra on the date: " + date);
System.out.println("");
System.out.println("1.Kolkata-Agra Express");
System.out.println("2.Bengal Express");
System.out.println("Choose the train you wish to board");
System.out.println("Type 1 for Kolkata-Agra Express or 2 for Bengal Express");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 40, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>40)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 7, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>7)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
case 3:
{costOfOneTicket=940;
System.out.println("There is/are 2 busses available to Agra on the date: " + date);
System.out.println("");
System.out.println("1.Volvo Kolkata to Agra Bus");
System.out.println("2.Agra Tours Bus - Special Deluxe A/C Bus");
System.out.println("Choose the bus you wish to board");
System.out.println("Type 1 for Volvo Kolkata to Agra Bus    OR    2 for Agra Tours Bus");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 4, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>4)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person - all separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 2, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>2)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
}
}
void kolkata_to_shimla()
{
System.out.println("How would you like to travel?");
System.out.println("1.Plane, 2.Train or 3.Bus?");
System.out.println("Type 1 for Plane");
System.out.println("Type 2 for Train");
System.out.println("Type 3 for Bus");
Scanner input=new Scanner(System.in);
int mode=input.nextInt();
System.out.println("Type date on which you wish to  board flight in the format ddmmyyyy without spaces");
int date=input.nextInt();
;

switch(mode)
{
case 1:
{costOfOneTicket=2700;
System.out.println("There is/are 2 flight(s) available to Shimla on the date: " + date);
System.out.println("");
System.out.println("1.IC 4112 - Air India");
System.out.println("2.IN 121 - IndiGo");
System.out.println("Choose the flight you wish to board");
System.out.println("Type 1 for IC 4112 or 2 for IN 121");
int fltno=input.nextInt();
if (fltno==1)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 12, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>12)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 11, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>11)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}

case 2:
{costOfOneTicket=1100;
System.out.println("There is/are 2 two train(s) available to Shimla on the date: " + date);
System.out.println("");
System.out.println("1.Kolkata-Shimla Express");
System.out.println("2.Rajdhani Express");
System.out.println("Choose the train you wish to board");
System.out.println("Type 1 for Kolkata-Shimla Express or 2 for Rajdhani Express");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 40, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>40)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 7, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>7)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
case 3:
{costOfOneTicket=940;
System.out.println("There is/are 2 busses available to Shimmla on the date: " + date);
System.out.println("");
System.out.println("1.Volvo Kolkata to Shimla Bus");
System.out.println("2.Arpit Tours Bus");
System.out.println("Choose the bus you wish to board");
System.out.println("Type 1 for Volvo Kolkata to Shimla Bus    OR    2 for Arpit Tours Bus");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 4, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>4)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person - all separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 2, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>2)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
}
}void mumbai_to_mysore()
{
System.out.println("How would you like to travel?");
System.out.println("1.Plane, 2.Train or 3.Bus?");
System.out.println("Type 1 for Plane");
System.out.println("Type 2 for Train");
System.out.println("Type 3 for Bus");
Scanner input=new Scanner(System.in);
int mode=input.nextInt();
System.out.println("Type date on which you wish to  board flight in the format ddmmyyyy without spaces");
int date=input.nextInt();
;


switch(mode)
{
case 1:
{costOfOneTicket=2700;
System.out.println("There is/are 2 flight(s) available to Mysore on the date: " + date);
System.out.println("");
System.out.println("1.IC 4112 - Air India");
System.out.println("2.IN 121 - IndiGo");
System.out.println("Choose the flight you wish to board");
System.out.println("Type 1 for IC 4112 or 2 for IN 121");
int fltno=input.nextInt();
if (fltno==1)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 12, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>12)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 11, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>11)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}






case 2:
{costOfOneTicket=1100;
System.out.println("There is/are 2 two train(s) available to Mysore on the date: " + date);
System.out.println("");
System.out.println("1.Mumbai-Mysore Express");
System.out.println("2.Karnataka Express");
System.out.println("Choose the train you wish to board");
System.out.println("Type 1 for Mumbai-Mysore Express or 2 for Karnataka Express");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 40, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>40)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 7, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>7)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}case 3:
{costOfOneTicket=940;
System.out.println("There is/are 2 busses available to Mysore on the date: " + date);
System.out.println("");
System.out.println("1.Volvo Mumbai to Mysore Bus");
System.out.println("2.'HERITAGE' Tours Bus");
System.out.println("Choose the bus you wish to board");
System.out.println("Type 1 for Volvo Mumbai to Mysore Bus    OR    2 for 'HERITAGE' Tours Bus");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 4, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>4)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person - all separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 2, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>2)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
}
}
void mumbai_to_jaipur()
{
System.out.println("How would you like to travel?");
System.out.println("1.Plane, 2.Train or 3.Bus?");
System.out.println("Type 1 for Plane");
System.out.println("Type 2 for Train");
System.out.println("Type 3 for Bus");
Scanner input=new Scanner(System.in);
int mode=input.nextInt();
System.out.println("Type date on which you wish to  board flight in the format ddmmyyyy without spaces");
int date=input.nextInt();
;


switch(mode)
{
case 1:
{costOfOneTicket=2700;
System.out.println("There is/are 2 flight(s) available to Jaipur on the date: " + date);
System.out.println("");
System.out.println("1.IC 4112 - Air India");
System.out.println("2.IN 121 - IndiGo");
System.out.println("Choose the flight you wish to board");
System.out.println("Type 1 for IC 4112 or 2 for IN 121");
int fltno=input.nextInt();
if (fltno==1)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 12, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>12)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 11, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>11)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}






case 2:
{costOfOneTicket=1100;
System.out.println("There is/are 2 two train(s) available to Jaipur on the date: " + date);
System.out.println("");
System.out.println("1.Rajisthani Express");
System.out.println("2.Jodhpur Express");
System.out.println("Choose the train you wish to board");
System.out.println("Type 1 for RAjasthani Express or 2 for Jodhpur Express");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 40, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>40)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 7, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>7)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
case 3:
{costOfOneTicket=940;
System.out.println("There is/are 2 busses available to Jaipur on the date: " + date);
System.out.println("");
System.out.println("1.Volvo Mumbai-Jaipur Bus");
System.out.println("2.'HERITAGE' Tours Bus");
System.out.println("Choose the bus you wish to board");
System.out.println("Type 1 for Volvo Mumbai to Jaipur Bus    OR    2 for 'HERITAGE' Tours Bus");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 4, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>4)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person - all separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 2, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>2)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
}
}
void mumbai_to_goa()
{
System.out.println("How would you like to travel?");
System.out.println("1.Plane, 2.Train or 3.Bus?");
System.out.println("Type 1 for Plane");
System.out.println("Type 2 for Train");
System.out.println("Type 3 for Bus");
Scanner input=new Scanner(System.in);
int mode=input.nextInt();
System.out.println("Type date on which you wish to  board flight in the format ddmmyyyy without spaces");
int date=input.nextInt();
;

switch(mode)
{
case 1:
{costOfOneTicket=2700;
System.out.println("There is/are 2 flight(s) available to Goa on the date: " + date);
System.out.println("");
System.out.println("1.IC 4112 - Air India");
System.out.println("2.IN 121 - IndiGo");
System.out.println("Choose the flight you wish to board");
System.out.println("Type 1 for IC 4112 or 2 for IN 121");
int fltno=input.nextInt();
if (fltno==1)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 12, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>12)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 11, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>11)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}






case 2:
{costOfOneTicket=1100;
System.out.println("There is/are 2 two train(s) available to Goa on the date: " + date);
System.out.println("");
System.out.println("1.Mumbai-Goa Express");
System.out.println("2.Inter Express");
System.out.println("Choose the train you wish to board");
System.out.println("Type 1 for Mumbai-Goa Express or 2 for Inter Express");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 40, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>40)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 7, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>7)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}







case 3:
{costOfOneTicket=940;
System.out.println("There is/are 2 busses available to Goa on the date: " + date);
System.out.println("");
System.out.println("1.Volvo Mumbai to Goa Bus");
System.out.println("2.Maharashtra Tours Bus");
System.out.println("Choose the bus you wish to board");
System.out.println("Type 1 for Volvo Mumbai to Goa Bus    OR    2 for Maharashtra Tours Bus");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 4, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>4)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person - all separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{   names[i]=input.nextLine();  }   }
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 2, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>2)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
}
}
void mumbai_to_agra()
{
System.out.println("How would you like to travel?");
System.out.println("1.Plane, 2.Train or 3.Bus?");
System.out.println("Type 1 for Plane");
System.out.println("Type 2 for Train");
System.out.println("Type 3 for Bus");
Scanner input=new Scanner(System.in);
int mode=input.nextInt();
System.out.println("Type date on which you wish to  board flight in the format ddmmyyyy without spaces");
int date=input.nextInt();
;


switch(mode)
{
case 1:
{costOfOneTicket=2700;
System.out.println("There is/are 2 flight(s) available to Agra on the date: " + date);
System.out.println("");
System.out.println("1.IC 4112 - Air India");
System.out.println("2.IN 121 - IndiGo");
System.out.println("Choose the flight you wish to board");
System.out.println("Type 1 for IC 4112 or 2 for IN 121");
int fltno=input.nextInt();
if (fltno==1)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 12, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>12)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 11, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>11)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}






case 2:
{costOfOneTicket=1100;
System.out.println("There is/are 2 two train(s) available to Agra on the date: " + date);
System.out.println("");
System.out.println("1.Mumbai-Agra Express");
System.out.println("2.Delhi Express");
System.out.println("Choose the train you wish to board");
System.out.println("Type 1 for Mumbai-Agra Express or 2 for Delhi Express");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 40, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>40)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 7, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>7)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}case 3:
{costOfOneTicket=940;
System.out.println("There is/are 2 busses available to Agra on the date: " + date);
System.out.println("");
System.out.println("1.Volvo Mumbai to Agra Bus");
System.out.println("2.Agra Tours Bus");
System.out.println("Choose the bus you wish to board");
System.out.println("Type 1 for Volvo Mumbai to Agra Bus    OR    2 for Agra Tours Bus");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 4, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>4)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person - all separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 2, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>2)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
}
}void mumbai_to_shimla()
{
System.out.println("How would you like to travel?");
System.out.println("1.Plane, 2.Train or 3.Bus?");
System.out.println("Type 1 for Plane");
System.out.println("Type 2 for Train");
System.out.println("Type 3 for Bus");
Scanner input=new Scanner(System.in);
int mode=input.nextInt();
System.out.println("Type date on which you wish to  board flight in the format ddmmyyyy without spaces");
int date=input.nextInt();
;


switch(mode)
{
case 1:
{costOfOneTicket=2700;
System.out.println("There is/are 2 flight(s) available to Shimla on the date: " + date);
System.out.println("");
System.out.println("1.IC 4112 - Air India");
System.out.println("2.IN 121 - IndiGo");
System.out.println("Choose the flight you wish to board");
System.out.println("Type 1 for IC 4112 or 2 for IN 121");
int fltno=input.nextInt();
if (fltno==1)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 12, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>12)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 11, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>11)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
case 2:
{costOfOneTicket=1100;
System.out.println("There is/are 2 two train(s) available to Shimla on the date: " + date);
System.out.println("");
System.out.println("1.Mumbai-Shimla Express");
System.out.println("2.Uttar Express");
System.out.println("Choose the train you wish to board");
System.out.println("Type 1 for Mumbai-Shimla Express or 2 for Uttar Express");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 40, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>40)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 7, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>7)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
case 3:
{costOfOneTicket=940;
System.out.println("There is/are 2 busses available to Shimla on the date: " + date);
System.out.println("");
System.out.println("1.Volvo Mumbai to Shimla Bus");
System.out.println("2.Shimla Tours Bus");
System.out.println("Choose the bus you wish to board");
System.out.println("Type 1 for Volvo Mumbai to Shimla Bus    OR    2 for Shimla Tours Bus");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 4, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>4)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person - all separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 2, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>2)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
}
}
void delhi_to_mysore()
{
System.out.println("How would you like to travel?");
System.out.println("1.Plane, 2.Train or 3.Bus?");
System.out.println("Type 1 for Plane");
System.out.println("Type 2 for Train");
System.out.println("Type 3 for Bus");
Scanner input=new Scanner(System.in);
int mode=input.nextInt();
System.out.println("Type date on which you wish to  board flight in the format ddmmyyyy without spaces");
int date=input.nextInt();
;


switch(mode)
{
case 1:
{costOfOneTicket=2700;
System.out.println("There is/are 2 flight(s) available to Mysore on the date: " + date);
System.out.println("");
System.out.println("1.IC 4112 - Air India");
System.out.println("2.IN 121 - IndiGo");
System.out.println("Choose the flight you wish to board");
System.out.println("Type 1 for IC 4112 or 2 for IN 121");
int fltno=input.nextInt();
if (fltno==1)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 12, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>12)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 11, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>11)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
case 2:
{costOfOneTicket=1100;
System.out.println("There is/are 2 two train(s) available to Mysore on the date: " + date);
System.out.println("");
System.out.println("1.Delhi-Mysore Express");
System.out.println("2.Karnataka Express");
System.out.println("Choose the train you wish to board");
System.out.println("Type 1 for Delhi-Mysore Express or 2 for Karnataka Express");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 40, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>40)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 7, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>7)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
case 3:
{costOfOneTicket=940;
System.out.println("There is/are 2 busses available to Mysore on the date: " + date);
System.out.println("");
System.out.println("1.Volvo Delhi-Karnataka Bus");
System.out.println("2.'HERITAGE' Tours Bus");
System.out.println("Choose the bus you wish to board");
System.out.println("Type 1 for Volvo Delhi-Karnataka Bus    OR    2 for 'HERITAGE' Tours Bus");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 4, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>4)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person - all separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 2, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>2)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
}
}
void delhi_to_jaipur()
{
System.out.println("How would you like to travel?");
System.out.println("1.Plane, 2.Train or 3.Bus?");
System.out.println("Type 1 for Plane");
System.out.println("Type 2 for Train");
System.out.println("Type 3 for Bus");
Scanner input=new Scanner(System.in);
int mode=input.nextInt();
System.out.println("Type date on which you wish to  board flight in the format ddmmyyyy without spaces");
int date=input.nextInt();
;


switch(mode)
{
case 1:
{costOfOneTicket=2700;
System.out.println("There is/are 2 flight(s) available to Jaipur on the date: " + date);
System.out.println("");
System.out.println("1.IC 4112 - Air India");
System.out.println("2.IN 121 - IndiGo");
System.out.println("Choose the flight you wish to board");
System.out.println("Type 1 for IC 4112 or 2 for IN 121");
int fltno=input.nextInt();
if (fltno==1)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 12, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>12)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 11, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>11)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}case 2:
{costOfOneTicket=1100;
System.out.println("There is/are 2 two train(s) available to Jaipur on the date: " + date);
System.out.println("");
System.out.println("1.Rajdhani Express");
System.out.println("2.Gokul Express");
System.out.println("Choose the train you wish to board");
System.out.println("Type 1 for Rajdhani Express or 2 for Gokul Express");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 40, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>40)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 7, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>7)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}

case 3:
{costOfOneTicket=940;
System.out.println("There is/are 2 busses available to Jaipur on the date: " + date);
System.out.println("");
System.out.println("1.Volvo Jaipur Bus");
System.out.println("2.Rajastan Tours Bus");
System.out.println("Choose the bus you wish to board");
System.out.println("Type 1 for Volvo Jaipur Bus    OR    2 for Rajasthan Tours Bus");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 4, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>4)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person - all separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 2, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>2)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
}
}
void delhi_to_goa()
{
System.out.println("How would you like to travel?");
System.out.println("1.Plane, 2.Train or 3.Bus?");
System.out.println("Type 1 for Plane");
System.out.println("Type 2 for Train");
System.out.println("Type 3 for Bus");
Scanner input=new Scanner(System.in);
int mode=input.nextInt();
System.out.println("Type date on which you wish to  board flight in the format ddmmyyyy without spaces");
int date=input.nextInt();
;


switch(mode)
{
case 1:
{costOfOneTicket=2700;
System.out.println("There is/are 2 flight(s) available to Goa on the date: " + date);
System.out.println("");
System.out.println("1.IC 4112 - Air India");
System.out.println("2.IN 121 - IndiGo");
System.out.println("Choose the flight you wish to board");
System.out.println("Type 1 for IC 4112 or 2 for IN 121");
int fltno=input.nextInt();
if (fltno==1)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 12, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>12)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 11, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>11)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}






case 2:
{costOfOneTicket=1100;
System.out.println("There is/are 2 two train(s) available to Goa on the date: " + date);
System.out.println("");
System.out.println("1.NewDehli-Mumbai-Goa Express");
System.out.println("2.Uttar-Paschim Express");
System.out.println("Choose the train you wish to board");
System.out.println("Type 1 for NewDelhi-Mumbai-Goa Express or 2 for Uttar-Paschim Express");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 40, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>40)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 7, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>7)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}case 3:
{costOfOneTicket=940;
System.out.println("There is/are 2 busses available to Goa on the date: " + date);
System.out.println("");
System.out.println("1.Volvo Goa Bus");
System.out.println("2.Goa Tours Bus");
System.out.println("Choose the bus you wish to board");
System.out.println("Type 1 for Volvo Kolkata to Goa Bus    OR    2 for Goa Tours Bus");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 4, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>4)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person - all separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 2, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>2)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
}
}
void delhi_to_agra()
{
System.out.println("How would you like to travel?");
System.out.println("1.Plane, 2.Train or 3.Bus?");
System.out.println("Type 1 for Plane");
System.out.println("Type 2 for Train");
System.out.println("Type 3 for Bus");
Scanner input=new Scanner(System.in);
int mode=input.nextInt();
System.out.println("Type date on which you wish to  board flight in the format ddmmyyyy without spaces");
int date=input.nextInt();
;


switch(mode)
{
case 1:
{costOfOneTicket=2700;
System.out.println("There is/are 2 flight(s) available to Agra on the date: " + date);
System.out.println("");
System.out.println("1.IC 4112 - Air India");
System.out.println("2.IN 121 - IndiGo");
System.out.println("Choose the flight you wish to board");
System.out.println("Type 1 for IC 4112 or 2 for IN 121");
int fltno=input.nextInt();
if (fltno==1)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 12, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>12)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 11, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>11)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
case 2:
{costOfOneTicket=1100;
System.out.println("There is/are 2 two train(s) available to Agra on the date: " + date);
System.out.println("");
System.out.println("1.U.P. Express");
System.out.println("2.Shataabdi Express");
System.out.println("Choose the train you wish to board");
System.out.println("Type 1 for U.P. Express or 2 for Shataabdi Express");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 40, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>40)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 7, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>7)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}case 3:
{costOfOneTicket=940;
System.out.println("There is/are 2 busses available to Agra on the date: " + date);
System.out.println("");
System.out.println("1.Volvo Delhi to Agra Bus");
System.out.println("2.Gem Tours Bus");
System.out.println("Choose the bus you wish to board");
System.out.println("Type 1 for Volvo Delhi to Agra Bus    OR    2 for Gem Tours Bus");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 4, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>4)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person - all separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 2, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>2)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
}
}

void delhi_to_shimla()
{
System.out.println("How would you like to travel?");
System.out.println("1.Plane, 2.Train or 3.Bus?");
System.out.println("Type 1 for Plane");
System.out.println("Type 2 for Train");
System.out.println("Type 3 for Bus");
Scanner input=new Scanner(System.in);
int mode=input.nextInt();
System.out.println("Type date on which you wish to  board flight in the format ddmmyyyy without spaces");
int date=input.nextInt();
;


switch(mode)
{
case 1:
{costOfOneTicket=2700;
System.out.println("There is/are 2 flight(s) available to Shimla on the date: " + date);
System.out.println("");
System.out.println("1.IC 4112 - Air India");
System.out.println("2.IN 121 - IndiGo");
System.out.println("Choose the flight you wish to board");
System.out.println("Type 1 for IC 4112 or 2 for IN 121");
int fltno=input.nextInt();
if (fltno==1)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 12, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>12)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{
System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 11, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>11)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
case 2:
{costOfOneTicket=1100;
System.out.println("There is/are 2 two train(s) available to Shimla on the date: " + date);
System.out.println("");
System.out.println("1.Delhi-Shimla Express");
System.out.println("2.Northern Railways Express");
System.out.println("Choose the train you wish to board");
System.out.println("Type 1 for Delhi-Shimla Express or 2 for Northern Railways Express");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 40, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>40)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 7, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>7)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
case 3:
{costOfOneTicket=940;
System.out.println("There is/are 2 busses available to Shimla on the date: " + date);
System.out.println("");
System.out.println("1.Volvo NewDelhi to Shimla Bus");
System.out.println("2.Gem Tours Bus");
System.out.println("Choose the bus you wish to board");
System.out.println("Type 1 for Volvo NewDelhi to Shimla Bus    OR    2 for Gem Tours Bus");
int fltno=input.nextInt();
if (fltno==1)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 4, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>4)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person - all separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}


else if(fltno==2)
{System.out.print("Cost of one Ticket =" + costOfOneTicket); 
System.out.println("Choose number of seats. but not more than 2, which is the current availability");
int NoOfSeats=input.nextInt();
if(NoOfSeats>2)
{System.out.print("No. of seats exceeds current avaiability");}
else
{System.out.println("Type name, age and gender of first person separated by a space and then press enter, type the same for second person, then for the third and carry on until details of all the");
    System.out.println("all the people travelling have been given. i.e the no. of people traveling");
;
String names[]=new String[NoOfSeats];
for(int i=0; i<NoOfSeats; i=i+1)
{
names[i]=input.nextLine();
}
}
System.out.println("");
project obj=new project();
obj.calculate(costOfOneTicket, NoOfSeats);
}
else{System.out.print("Sorry, WRONG CHOICE");}
break;
}
}
}

void calculate(int x, int y)
{
Scanner input=new Scanner(System.in);
System.out.println("");
System.out.println("");
System.out.println("");
double cost1=x*y; //normal cost
System.out.println("Please pre-order any food that you would like to have during your journey");
System.out.println("Would you like to do so now?...You get a GREAT 5% discout on your actual ticket price...");
System.out.println("1-YES, 2-NOT NOW");



int choice=input.nextInt();

if(choice==2)
{
String Discount1="----"; //discount in String to print a blank sign 
String costoffood="----"; // same here
double cost2=cost1;
double cost3=cost1;
System.out.println("Thank You For Choosing Horizon's Services");
System.out.println("Your Details are as follows");
System.out.println("No. of Passengers               |    : " + y);
System.out.println("Cost of tickets                 | Rs.: " + cost1);
System.out.println("Discount for using food services| Rs.: " + Discount1);
System.out.println("Cost of food                    | Rs.: " + costoffood);
System.out.println("Total cost                      | Rs.: " + cost3);
System.out.println("");
System.out.println("Please Choose Your Payment Method");
System.out.println("1.Credit Card, 2.Money Transfer (cash and cheque can only be accepted on counter and not here!)");
System.out.println("You get an additional Discount of 3.5% on Final Proce on Paying via Credit Card.");
System.out.println("Enter 1 or 2");
int payment=input.nextInt();
if(payment==1)
{
System.out.println("Thanks for using Credit Card Method");
double Discount2=(3.5/100)*cost3;
System.out.println("You get an additional discoint of Rs." + Discount2);
double finalcost=cost3-Discount2;
System.out.println("Your final Price will thus be Rs." + finalcost);
System.out.println("Please enter your credit card no.");
long ccno=input.nextLong();
System.out.println("Thanks, Rs." + finalcost + " will be charged from your credit card.(CC number: "+ ccno + ")") ;
}
else if(payment==2)
{
System.out.println("Please enter your acc. no.");
long accno=input.nextLong();

System.out.println("Our Bank A/C no. is 1754000123");
System.out.println("Thanks, you will have to transfer Rs." + cost3 + " from your acc. to ours. (" + accno + " ----> 1754000123");
}
else
{System.out.println("Sorry, wrong choice");}

}
else if(choice==1)
{

double Discount1=0.05*cost1;//discount for using food services too
double cost2=cost1-Discount1;// price after discount because of food services
System.out.println("Please have a look at our menu."); 
System.out.println("");
System.out.println("     ITEM                           COST                           REMARKS");
System.out.println("---------------------------------------------------------------------------------------------------");
System.out.println("1.STARTERS COMBO                 Rs. 550.00                   Includes 3 Starters");
System.out.println("2.Veg. Combo Meal                Rs. 1200.00            Includes 2 starters, Meal, Dessert");
System.out.println("3.Non. Veg Combo Meal            Rs. 1450.00          Includes 2 starters, N.Veg Meal, Dessert");
System.out.println("4.Chinese Meal of the day        Rs. 1000.00                 Varies from day to day");
System.out.println("5.Continental                    Rs. 850.00                      Wide variety");
System.out.println("6.Mexican Food                   Rs. 1000.00            Includes Nachos, Veg/Non Veg Takos");
System.out.println("7.Italian                        Rs. 1350.00     Includes 1 large pizza, Garlic-Cheese Pasta(Small)");
System.out.println("");

int f1=550;
int f2=1200;
int f3=1450;
int f4=1000;
int f5=850;
int f6=1000;
int f7=1350;
System.out.println("Okay, please let us know your choice");
int food=input.nextInt();
System.out.println("Now enter Quantity");
double foodqty=input.nextInt(); //in double to prevent run-time errors
double costoffood=0;
double cost3=0; //to save value of cost after including cost of food(i.e, cost2.costoffood). Actual value gets deciced in the following switch statement
switch(food)
{
case 1:
{
costoffood=550*foodqty;
cost3=cost2+costoffood;
break;
}
case 2:
{
costoffood=1200*foodqty;
cost3=cost2+costoffood;
break;
}
case 3:
{
costoffood=1450*foodqty;
cost3=cost2+costoffood;
break;
}
case 4:
{
costoffood=1000*foodqty;
cost3=cost2+costoffood;
break;
}
case 5:
{
costoffood=850*foodqty;
cost3=cost2+costoffood;
break;
}
case 6:
{
costoffood=1000*foodqty;
cost3=cost2+costoffood;
break;
}
case 7:
{
costoffood=1350*foodqty;
cost3=cost2+costoffood;
break;
}
default:{System.out.print("Wrong Choice");}
} // Switch ends
System.out.println("");
System.out.println("Thank You For Choosing Horizon's Services");
System.out.println("");
System.out.println("Your Details are as follows:");
System.out.println("---------------------------------------------------------------------------------------------------");
System.out.println("No. of Passengers               |    : " + y);
System.out.println("Cost of tickets                 | Rs.: " + cost1);
System.out.println("Discount for using food services| Rs.: " + Discount1);
System.out.println("New Price                       | Rs.: " + cost2);
System.out.println("Cost of food                    | Rs.: " + costoffood);
System.out.println("Total cost                      | Rs.: " + cost3);
System.out.println("---------------------------------------------------------------------------------------------------");
System.out.println("");
System.out.println("Please Choose Your Payment Method");
System.out.println("1.Credit Card OR");
System.out.println("2.Money Transfer (cash and cheque can only be accepted on counter and not here!)");
System.out.println("You get an additional Discount of 3.5% on Final Price on Paying via Credit Card.");
System.out.println("Enter 1 or 2");
int payment=input.nextInt();
if(payment==1)
{
System.out.println("Thanks for using Credit Card Method");
double Discount2=(3.5/100)*cost3;
System.out.println("You get an additional discoint of Rs." + Discount2);
double finalcost=cost3-Discount2;
System.out.println("Your final Price will thus be Rs." + finalcost);
System.out.println("Please enter your credit card no.");
long ccno=input.nextLong();
System.out.println("Thanks, Rs." + finalcost + " will be charged from your credit card.(CC number: "+ ccno + ")") ;
}
else if(payment==2)
{
System.out.println("Please enter your acc. no.");
long accno=input.nextLong();

System.out.println("Our Bank A/C no. is 1754000123");
System.out.println("Thanks, you will have to transfer Rs." + cost3 + " from your acc. to ours. (" + accno + " ----> 1754000123)");
}
else
{System.out.println("Sorry, wrong choice");}


}

else
System.out.print("Sorry, Wrong Choice");


System.out.println("");
System.out.println("**********************************************************************************************************************");
System.out.println("                                            ***********************************");
System.out.println("We once again would like to thank you for using our services. We hope that you have a safe journey to your destination");
System.out.println("                                            and we hope that you come back safe");
System.out.println("                                                     MADE BY: FAISAL MUKHTAR");
System.out.println("                                                             X G");
System.out.println("                                            ***********************************");
System.out.println("**********************************************************************************************************************");
}
}
























































  
        
        
        
