package com.venkadesh.vkfast_food;

import java.util.Scanner;

import com.venkadesh.Mysql.MysqlData;

public class App 
{
    public static void main( String[] args )
    {
        MysqlData md= new MysqlData();
        md.init();
    	
    	vk_fastfood food=new Food();
        vk_fastfood drinks=new Beverages();
        vk_fastfood cafe=new Cafe();
        
        showMenu<vk_fastfood> menu=new showMenu<vk_fastfood>();
        System.out.println("1.Food");
        System.out.println("2.Beverages");
        System.out.println("3.Cafes");
        System.out.println("________________________");
        
       int a = 0;
       int c= 0;
       
      
    
       
       
       while (c==0) {
    	   
    	   System.out.print("Choose what do you want-->");
           Scanner sc=new Scanner(System.in);
           a=sc.nextInt();
         
           
           if (a==1)
           {
        	   menu.getMenu(food).show();
           }
            
           if(a==2)
           {
        	   menu.getMenu(drinks).show();
           }
           
           
           if (a==3) 
           {
        	   menu.getMenu(cafe).show();
           }
           
           System.out.print("Enter 0 for continue-->");
           Scanner s=new Scanner(System.in);
           c=s.nextInt();
           if(c==1)
           {
        	   System.out.println("Thanks for ordering(- | -)!!!");
        	  
           }

	}
       
       
       
    }
}

