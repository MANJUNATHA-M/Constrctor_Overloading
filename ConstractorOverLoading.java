package com.contractor.overloading;

public class ConstractorOverLoading {
	
	public String name;
	public int a;
	public int b;
	public int x;
	public int y;
	public String aa;
	public String bb;
	public String ab;
	public String ba;
	public String ac;
	public String bc;
	public String ad;
	public String bd;
	
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

	public ConstractorOverLoading(int x, String y)
	{
		System.out.println("Different type double parameter");
	}

	public ConstractorOverLoading(String aa,String bb)
	{
		System.out.println("same String type Double parameter");
	}

	public ConstractorOverLoading(float ab, float ba)
	{
		System.out.println("same float type double parameter");
	}

	public ConstractorOverLoading(String ac, float bc)
	{
		System.out.println("String and Float Type Double Parameter");
	}

	public ConstractorOverLoading(double ad,double bd)
	{
		System.out.println("Same Double type double parameter");
	}


	
	@Override
	public String toString() {
		return "ConstractorOverLoading [name=" + name + ", a=" + a + ", b=" + b + ", x=" + x + ", y=" + y + ", aa=" + aa
				+ ", bb=" + bb + ", ab=" + ab + ", ba=" + ba + ", ac=" + ac + ", bc=" + bc + ", ad=" + ad + ", bd=" + bd
				+ "]";
	}

	public static void main(String []args)
	{
		ConstractorOverLoading a=	new ConstractorOverLoading();
		System.out.println(a);
		System.out.println("");
		ConstractorOverLoading b=	new ConstractorOverLoading("Hari");
		System.out.println(b);
		System.out.println("");
		ConstractorOverLoading c=	new ConstractorOverLoading(12.00, 23.00);
		System.out.println(c);
		System.out.println("");
		ConstractorOverLoading d=	new ConstractorOverLoading(14.0f, 15.00f);
		System.out.println(d);
		System.out.println("");
		ConstractorOverLoading e=	new ConstractorOverLoading(93, 27);
		System.out.println(e);
		System.out.println("");
		ConstractorOverLoading f=   new ConstractorOverLoading(139, "MANU");
		System.out.println(f);
		System.out.println("");
		ConstractorOverLoading g= 	new ConstractorOverLoading("Overloading", 78);
		System.out.println(g);
		System.out.println("");
		ConstractorOverLoading h=	new ConstractorOverLoading("KARIYA", 67);
		System.out.println(h);
		System.out.println("");
		ConstractorOverLoading i=	new ConstractorOverLoading("NullValues", "NullValues");
		System.out.println(i);

	
}
	
}



