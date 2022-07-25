package TestNGProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotation {
	
  @Test
  public void f() {
	  System.out.println("First Method");
  }
  @Test
  public void s() {
	  System.out.println("Second Method");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(" BeforeMethod Execute Before each test Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AterMethod Execute After each test Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass Method Execute before first Method of current class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass Method Execute After all test Method of current class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest method execute Before test method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest method execute After all test method");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuit method execute Before all test method");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuit method execute After all test method");
  }

}
