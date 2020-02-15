package com.EpamTask_4.TaskFour;
import java.util.*;

public class Construction 
{
	
	int Construct(String str,int a)
	{
	int p=0;
	if(str.equalsIgnoreCase("Standard material"))
	p=1200*a;
	else if(str.equalsIgnoreCase("Above Standard Material"))
	p=1500*a;
	else if(str.equalsIgnoreCase("High Standard Material"))
	p=1800*a;
	else if(str.equalsIgnoreCase("High Standard Material and Fully automated home"))
	p=2500*a;
	return p;
	}
	public static void main(String arg[])
	{
	Scanner s=new Scanner(System.in);
	Construction obj=new Construction();
	System.out.println("Enter The Quality of Material:");
	String str=s.nextLine();
	System.out.println("Enter the Area Available:");
	int a=s.nextInt();
	System.out.println("The Total Amount for the Construction is:"+obj.Construct(str,a));
	s.close();
	}

}
