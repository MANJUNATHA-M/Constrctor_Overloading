package com.contractor.overloading;

public class ConstractorOverLoading {

	public ConstractorOverLoading() 
	{
		System.out.println("Zero parameter");
	}

	public ConstractorOverLoading(String Name)
	{
		System.out.println("Single parameter");
	}

	public ConstractorOverLoading(int a, int b)
	{
		System.out.println("same int type double parameter");
	}

	public ConstractorOverLoading(int a, String b)
	{
		System.out.println("Different type double parameter");
	}

	public ConstractorOverLoading(String a,String b)
	{
		System.out.println("same String type Double parameter");
	}

	public ConstractorOverLoading(float a, float b)
	{
		System.out.println("same float type double parameter");
	}

	public ConstractorOverLoading(String a, float b)
	{
		System.out.println("String and Float Type Double Parameter");
	}

	public ConstractorOverLoading(double a,double b)
	{

	}
}
class MainClass
{
	public static void main(String []args)
	{
		ConstractorOverLoading a=	new ConstractorOverLoading();
		System.out.println(a);
		ConstractorOverLoading b=	new ConstractorOverLoading("Hari");
		System.out.println(b);
		ConstractorOverLoading c=	new ConstractorOverLoading(12.00, 23.00);
		System.out.println(c);
		ConstractorOverLoading d=	new ConstractorOverLoading(14.0f, 15.00f);
		System.out.println(d);
		ConstractorOverLoading e=	new ConstractorOverLoading(93, 27);
		System.out.println(e);
		ConstractorOverLoading f=   new ConstractorOverLoading(139, "MANU");
		System.out.println(f);
		ConstractorOverLoading g= 	new ConstractorOverLoading("Overloading", 78);
		System.out.println(g);
		ConstractorOverLoading h=	new ConstractorOverLoading("KARIYA", 67);
		System.out.println(h);
		ConstractorOverLoading i=	new ConstractorOverLoading("NullValues", "NullValues");
		System.out.println(i);

	}
}

