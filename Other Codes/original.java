import java.io.*;
class original
 {
   public static void main (String[]args)throws IOException
   {
     BufferedReader userin = new BufferedReader(new InputStreamReader(System.in));
     int i,j;
     int ppl,ch,it_nu;
     String item,cost,ans;
     double cost1;
     int k=0;int l=0;
     ans= "Yes";
     item="";
     cost1=0.0;
     String item1[]=new String[200];
     double bill[]=new double[200];
     double tot=0.0;
     i=0;
     System.out.println("Welcome to  CAFE MASALA");
     System.out.println("Please enter the number of people who would be dining");//Accepting the number of people who would be dining
     ppl=Integer.parseInt(userin.readLine());
    while(true)
     { 
      //Printing the main menu
     System.out.println("================");
     System.out.println("    MENU        ");
     System.out.println("================"); 
     System.out.println("1-STARTERS");
     System.out.println("2-SOUPS");
     System.out.println("3-VEGETABLES");
     System.out.println("4-DALS");
     System.out.println("5-INDIAN BREAD");
     System.out.println("6-RICE");
     System.out.println("7-DRINKS");
     System.out.println("8-DESSERTS");
     System.out.println("9-GENERATE BILL");
     System.out.println(" Enter your choice and 0 to Exit");
     ch=Integer.parseInt(userin.readLine());
       if(ch==0)
         System.exit(0);
       if(ch==1)
          {
            System.out.println("\t\t\t\t STARTERS");
            String starters[][]={{"1. Gobi Manchurian ","110.00"},{"2. Paneer Manchurian ","110.00"},{"3. Babycorn Manchurian","90.00"},{"4. Mushroom Manchurian","100.00"},{"5. Paneer Chilly","100.00"},{"6. Babycorn Chiily","90.00"},{"7. Paneer Tikka","90.00"},{"8. Momos ","75.00"},{"9. Veg.Spring Roll","100.00"}};
             //Printing the starters menu
            for(i=0;i<9;i++)
              {
               for(j=0;j<2;j++)
                {
                  System.out.print( starters[i][j]+"\t\t" );
                }
             System.out.println( );
             }      
  
         System.out.println("Please enter the item number of your dish from the starters menu");
         it_nu=Integer.parseInt(userin.readLine());
         if(it_nu>=1 && it_nu<=9)
          {
           item=starters[it_nu-1][0];
           cost=starters[it_nu-1][1];
           cost1=Double.parseDouble(cost);
           item1[k]=item;
           bill[k]=cost1;
           k++; 
           tot =tot +cost1;
         }
        else     
         {
          System.out.println("Invalid choice");
         } 
       
        } //end of if      
      
   if(ch==2)
    {
      System.out.println("\t\t\t\t SOUPS");
      String soups[][]={{"1. Sweetcorn Soup","65.00"},{"2. Hot And Sour","75.00"},{"3. Manchow Soup","70.00"},{"4. Tomato Soup","55.00"},{"5. Chowmein Soup","70.00"},{"6. Tomyum Soup","80.00"},{"7. Mixed Vegetable Soup","80.00"}};
      //Printing the soups  menu
      for(i=0;i<7;i++)
       {
         for(j=0;j<2;j++)
          {
            System.out.print( soups[i][j]+"\t\t" );
         }
        System.out.println( );
       }      
 
      System.out.println("Please enter the item number of your dish from the soups menu");
      it_nu=Integer.parseInt(userin.readLine());
      if(it_nu>=1 && it_nu<=7)
        {
         item=soups[it_nu-1][0];
         cost=soups[it_nu-1][1];
         cost1=Double.parseDouble(cost);
         item1[k]=item;
         bill[k]=cost1;
         k++;
         tot =tot + cost1;
       }
      else     
       {
        System.out.println("Invalid choice");
       } 
    }//end of if
  if(ch==3)
    {
      System.out.println("\t\t\t\t VEGETABLES");
      String vegetables[][]={{"1. Paneer Butter Masala","150.00"},{"2. Palak Paneer","135.00"},{"3. Paneer Tikka Masala","140.00"},{"4. Veg.Kolhapuri","120.00"},{"5. Chana Masala","100.00"},{"6. Methi Malai Mutter","125.00"},{"7. Veg.Jalfraze","120.00"},{"8. Paneer Do Pyaza","135.00"},{"9. Malai Kofta","120.00"},{"10. Mixed Vegetable","135.00"},{"11. Babycorn Masala","130.00"},{"12. Shahi Paneer","130.00"},{"13. Subz Shahjahani","160.00"},{"14. Baingan Masala","140.00"},{"15. Dum Aloo","100.00"},{"6. Aloo Laajawaab","125.00"},{"17. Aloo Methi","130.00"},{"18. Tava Vegetable","160.00"},{"19. Tava Mushroom","120.00"},{"20. Bhindi Fry","130.00"}};
      for(i=0;i<20;i++)
       { 
        for(j=0;j<2;j++)
         {
            System.out.print(vegetables[i][j]+"\t\t" );
         }
        System.out.println( );
       }
      System.out.println("Please enter the item number of your dish from the vegetables menu");
      it_nu=Integer.parseInt(userin.readLine());
      if(it_nu>=1 && it_nu<=20)
        {
          item=vegetables[it_nu-1][0];
          cost=vegetables[it_nu-1][1];
          cost1=Double.parseDouble(cost);
          item1[k]=item;
          bill[k]=cost1;
          k++;
          tot =tot +cost1;
        }  
      else     
       {
         System.out.println("Invalid choice");
       } 
     }//end of if
   if(ch==4)
     {
      System.out.println("\t\t\t\t DALS");
      String dals[][]={{"1. Dal Makhani","95.00"},{"2. Dal Fry","80.00"},{"3. Black Dal","70.00"},{"4. Dal Tadka","85.00"},{"5. Shahjahani Dal","100.00"}};
      for(i=0;i<5;i++)
       {
        for(j=0;j<2;j++)
         {
            System.out.print( dals[i][j]+"\t\t" );
         }
        System.out.println( );
     }
    System.out.println("Please enter the item number of your dish from the dals menu");
    it_nu=Integer.parseInt(userin.readLine());
     
    if(it_nu>=1 && it_nu<=5)
     {
       item=dals[it_nu-1][0];
       cost=dals[it_nu-1][1];
       cost1=Double.parseDouble(cost);
       item1[k]=item;
       bill[k]=cost1;
       k++;
         tot =tot +cost1;
     } 
    else     
     {
        System.out.println("Invalid choice");
      
      } 
   }//end of if
   
if(ch==5)
  {
   System.out.println("\t\t\t\t INDIAN BREAD");
   String Indian_bread[][]={{"1. Tandoori Roti","12.00"},{"2. Naan","18.00"},{"3. Butter Naan","22.00"},{"4. Kulcha","20.00"},{"5. Lacha Paratha","25.00"}};
   for(i=0;i<5;i++)
    {
     for(j=0;j<2;j++)
        {
            System.out.print(Indian_bread[i][j] );
         }
         System.out.println( );
   } 
   System.out.println("Please enter the item number of your dish from the Indian bread menu");
   it_nu=Integer.parseInt(userin.readLine());
   if(it_nu>=1 && it_nu<=5)
    {
     item=Indian_bread[it_nu-1][0];
     cost=Indian_bread [it_nu-1][1];
     cost1=Double.parseDouble(cost);
     item1[k]=item;
     bill[k]=cost1;
     k++; 
     tot =tot +cost1;
    } 
   else     
    {
      System.out.println("Invalid choice");
      
    } 
   }//end of if
   
 if(ch==6)
   {
     System.out.println("\t\t\t\t RICE");
     String rice[][]={{"1. Steamed Rice","85.00"},{"2. Veg Biryani","110.00"},{"3. Jeera Rice","90.00"},{"4. Veg Pulao","105.00"},{"5. Korma Pulao","120.00"},{"6. Shajahani Khicidi","100.00"}}; 
     for(i=0;i<6;i++)
      {
       for(j=0;j<2;j++)
        {
            System.out.print( rice[i][j]+"\t\t" );
         }
       System.out.println( );
    } 
    System.out.println("Please enter the item number of your dish from the rice menu");
    it_nu=Integer.parseInt(userin.readLine());
    if(it_nu>=1 && it_nu<=6)
     {
       item=rice[it_nu-1][0];
       cost=rice[it_nu-1][1];
       cost1=Double.parseDouble(cost);
       item1[k]=item;
       bill[k]=cost1;
       k++; 
         tot =tot +cost1;
     }  
    else     
     {
        System.out.println("Invalid choice");
      
      } 
  }//end of if
  
if(ch==7)
  {
    System.out.println("\t\t\t\t DRINKS");
    String drinks[][]={{"1.Mango Juice","27.00"},{"2. Orange Juice","22.00"},{"3. Watermelon Juice","25.00"},{"4. Muskmelon Juice","32.00"},{"5. Pomegranate Juice","32.00"},{"6. Pineapple Juice","29.00"},{"7. Apple Juice","30.00"},{"8. Litchi Juice","31.00"},{"9. Sugarcane Juice","15.00"},{"10. Guava Juice","25.00"},{"11. Strawberry Milkshake","45.00"},{"12. Chocolate Milkshake","45.00"},{"13. Vanilla Milkshake","40.00"},{"14. Pista Milkshake","55.00"},{"15. Softdrinks"," 15.00"},{"16. Mineral Water","16.00"}};
    for(i=0;i<16;i++)
     {
      for(j=0;j<2;j++)
        {
           System.out.print( drinks[i][j]+"\t\t" );
        }
      System.out.println( );
    }
    System.out.println("Please enter the item number of your dish from the drinks menu");
    it_nu=Integer.parseInt(userin.readLine());
    if(it_nu>=1 && it_nu<=16)
      {
       item=drinks[it_nu-1][0];
       cost=drinks[it_nu-1][1];
       cost1=Double.parseDouble(cost);
       item1[k]=item;
       bill[k]=cost1;
       k++; 
         tot =tot + cost1;
     }
     else     
       {
        System.out.println("Invalid choice");
       } 
  }//end of if
  if(ch==8)
   {
     System.out.println("\t\t\t\t DESSERTS");
     String desserts[][]={{"1. Sizzling Brownie","100.00"},{"2. Chocolate Mousse","65.00"},{"3. Death By Chocolate","140.00"},{"4. Special Falooda","60.00"},{"5. Vanilla Ice-cream","15.00"},{"6. Chocolate Ice-cream","20.00"},{"7. Pista Ice-cream","17.00"},{"8. Chocolate Chip Ice-cream","23.00"},{"9. Mango Ice-cream","17.00"},{"10. Strawberry Ice-cream","19.00"},{"11. Litchi Ice-cream","16.00"},{"12. Gajar Ka Halwa","45.00"},{"13. Badam Ka Halwa","40.00"},{"14. Gulab Jamun","16.00"},{"15. Rasgulla","17.00"}};
     for(i=0;i<15;i++)
      {
         for(j=0;j<2;j++)
         {
            System.out.print( desserts[i][j]+"\t\t" );
         }
         System.out.println( );
      } 
      System.out.println("Please enter the item number of your dish from the desserts menu");
      it_nu=Integer.parseInt(userin.readLine()); 
      if(it_nu>=1 && it_nu<=15)
        {
          item=desserts[it_nu-1][0];
          cost=desserts[it_nu-1][1];
          cost1=Double.parseDouble(cost);
          item1[k]=item;
          bill[k]=cost1;
          k++;
          tot =tot + cost1;
        }
      else     
       {
        System.out.println("Invalid choice");
       } 
   }//end of if
  if(ch==9)
   {
   	System.out.println("==================================");
   	System.out.println("            CAFE MASALA           ");
   	System.out.println("==================================");
   	for(int c=0;c<100;c++)
     {
      if(item1[c]!=null)
       {
        System.out.print(item1[c]+"\t\t\t");
        System.out.println(bill[c]);
       }//end of if
    }//end of for
   System.out.println();
   System.out.println("The total excluding the VAT" + " " +  tot);
   double VAT = 0.0 ;
   VAT = 12.5/100 * tot;
   System.out.println("The rate of VAT is 12.5%");
   System.out.println("The tax on your bill is" + " " + VAT);
   double tot1 = tot + VAT;
   System.out.println("The Grand Total is " + " " + tot1);
   System.out.println("=======================================\n");
 }
	
 }  	

}
}


  
    
      



 



   



    

  
  
