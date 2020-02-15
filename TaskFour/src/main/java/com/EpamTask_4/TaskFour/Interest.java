package com.EpamTask_4.TaskFour;

import java.util.*;
public class Interest 
{
	float simple(int p,int t,int r)
	{
		float ans=(p*t*r)/100;
		return ans;
	}
	double compond(int p,int t,int r,int n) 
	{
		float ans1=1+(r/n);
		float x=n*t;
		double ans2=Math.pow(ans1,x);
		double comp=p*ans2;
		return comp;
	}
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		Interest obj=new Interest();
		System.out.println("Enter Principle Amount:");
		int p=s.nextInt();
		System.out.println("Enter Time Period:");
		int t=s.nextInt();
		System.out.println("Enter Ratio of Interest:");
		int r=s.nextInt();
		System.out.println("Enter Duration:");
		int n=s.nextInt();
		System.out.println("The Principle Interest is:"+obj.simple(p,t,r));
		System.out.println("The Compond Interest is:"+obj.compond(p,t,r,n));
		s.close();
		
	}
}
