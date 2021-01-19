package com.venkadesh.vkfast_food;

import com.venkadesh.Mysql.MysqlData;

interface vk_fastfood
{
	void  show();
}

class Food implements vk_fastfood{
	@Override
	public void show() 
	{
		MysqlData md=new MysqlData();
		md.getName();
		
	}
}

 class Beverages implements vk_fastfood{

	@Override
	public void show() 
	{
		
		
		System.out.println("You can order several types of beverages here!!!");
		
	}
	 
 }
 
 class Cafe implements vk_fastfood{

	@Override
	public void show() 
	{
		System.out.println("You can order coffes and tea here!!!!");
		
	}
	 
 }
 
class showMenu<T>
{
	public T getMenu (T menu)
	{
		return menu;
	}
}