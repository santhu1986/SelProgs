package com.ebanking.master;

public class Exelib {

	public static void main(String[] args) 
	{
	
		//Instance Class
		
		Library Lb=new Library();
		
		String RetVal=Lb.OpenApp("http://192.168.1.4/ranford2");
	    System.out.println(RetVal);
		Lb.AdminLogin("Admin","Admin");
		Lb.Bcre();
		
	}

}
