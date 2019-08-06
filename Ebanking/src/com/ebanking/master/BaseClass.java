package com.ebanking.master;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseClass 
{
  Library Lb=new Library();
  
  @BeforeTest
  public void beforeTest() 
  {
  Lb.AdminLogin("Admin","Admin");
  }

  @AfterTest
  public void afterTest() 
  {
  Lb.admlgt();
  }

  @BeforeSuite
  public void beforeSuite() 
  {
  Lb.OpenApp("http://192.168.1.4/ranford2");
  }

  @AfterSuite
  public void afterSuite() 
  {
  Lb.Appc();
  }

}
