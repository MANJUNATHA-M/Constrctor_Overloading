package com.contractor.overloading;

class Example
{
	public String Email;
	public Long PhoneNo;
	public String Password;
	
	public Example(String Email, String Password)
	{
		this.Email=Email;
		this.Password=Password;
		// System.out.println("Login Successfull with Email"+Email+"and Passwrod is"+Password+".");
	}

	public Example(Long phoneNo, String password) 
	{
		this.PhoneNo = phoneNo;
		this.Password = password;
		// System.out.println("Login Successfull with PhoneNo"+phoneNo+"and Passwrod is"+Password+".");
	}
	
	@Override
	public String toString()
	{
		return "[Email]---> :"+Email+"[Password]---> :"+Password+"[PhoneNo]---> :"+PhoneNo+"[Password]---> :"+Password;
	}
		
}
public class OverLoadingExample {
	
	public static void main(String[] args)
	{
		System.out.println("1st Method");
		Example example=new Example("manu@gmail.com", "manu8197");
		System.out.println(example);
		System.out.println("");
		System.out.println("2nd Method");
		Example example2=new Example(8197345324l, "manu93494");
		System.out.println(example2);
		
	}
	
}
