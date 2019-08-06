package com.ebanking.master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class Library 
{
	public static WebDriver driver;
	public static String Expval,Actval;
	
	public String OpenApp(String Url)
	{
        Expval="Ranford Bank";
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(Url);

		String Actval=driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		
		if (Expval.equalsIgnoreCase(Actval)) 
		{
		System.out.println("Ranford home page is Displayed");
		
		}
          else {
      		System.out.println("Ranford home page is not Displayed");	
		}		
		
return "Home Page is Opened";


	}
	
	public void AdminLogin(String Un,String Pswd)
	{
		driver.findElement(By.id("txtuId")).sendKeys(Un);
		driver.findElement(By.id("txtPword")).sendKeys(Pswd);
		driver.findElement(By.id("login")).click();

	}
	
	public void Bcre()
	{
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys("mqsystest");
		driver.findElement(By.id("txtAdd1")).sendKeys("karimnagar");
		driver.findElement(By.id("txtArea")).sendKeys("abcdef");
		driver.findElement(By.id("txtZip")).sendKeys("12345");
		Select ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
		ctry.selectByVisibleText("INDIA");
		Sleeper.sleepTightInSeconds(5);
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByVisibleText("GOA");
		Sleeper.sleepTightInSeconds(5);
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByVisibleText("GOA");
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("btn_insert")).click();
         driver.switchTo().alert().accept();
         Sleeper.sleepTightInSeconds(5);
         driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
	}

	public String RoleCre(String Rn,String Rd,String Rt)
	{
		Sleeper.sleepTightInSeconds(5);
		Expval="Sucessfully";
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
		Sleeper.sleepTightInSeconds(4);
		driver.findElement(By.id("btnRoles")).click();
		driver.findElement(By.id("txtRname")).sendKeys(Rn);
		driver.findElement(By.id("txtRDesc")).sendKeys(Rd);
		Select rt=new Select(driver.findElement(By.id("lstRtypeN")));
		rt.selectByVisibleText(Rt);
		driver.findElement(By.id("btninsert")).click();
		Actval=driver.switchTo().alert().getText();
	Sleeper.sleepTightInSeconds(5);
		driver.switchTo().alert().accept();
	    driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		if (Actval.contains(Expval)) 
		{
			System.out.println("Role Craeted");
			}
		else
		{
			System.out.println("Role Already Exist");
		}
		return Actval;
	}

	public void admlgt()

	{
		Sleeper.sleepTightInSeconds(5);
		 driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		 
		 }

	public void Appc()
	{
		 driver.close();
	}


}
//Role cre
//emp cre
//log out
//close app