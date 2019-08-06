package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad {

	public static void main(String[] args) throws IOException 
	{
      
	//Instance Class
		
		Library Lb=new Library();
		
		String RetVal=Lb.OpenApp("http://192.168.1.4/ranford2");
	    System.out.println(RetVal);
		Lb.AdminLogin("Admin","Admin");
	
		//To get Test Data file Path
		
String Fpath="E:\\aftnaug\\Ebanking\\src\\com\\ebanking\\testdata\\Role.txt";
	
//Results path

String Rpath="E:\\aftnaug\\Ebanking\\src\\com\\ebanking\\results\\Res_Role.txt";

String SD;

       //To get the Test Data File

            FileReader FR=new FileReader(Fpath);
            BufferedReader BR=new BufferedReader(FR);
            String Sread=BR.readLine();
            System.out.println(Sread);
            
            //To write
            
            FileWriter FW=new FileWriter(Rpath);
            BufferedWriter BW=new BufferedWriter(FW);
            BW.write(Sread);
            BW.newLine();
            
            //Multiple Iterations ----------While loop
            
            while ((SD=BR.readLine())!=null) 
            {
				System.out.println(SD);
				
				//Split
				
				String SR[]=SD.split("###");

				String Rname=SR[0];
				String Rd=SR[1];
				String Rt=SR[2];
				
				String Res=Lb.RoleCre(Rname,Rd,Rt);
                System.out.println(Res);
                
                //Results
                
                BW.write(SD+"@@@"+Res);
                BW.newLine();
                
           }
         
            BW.close();
            BR.close();
            
         }

}
