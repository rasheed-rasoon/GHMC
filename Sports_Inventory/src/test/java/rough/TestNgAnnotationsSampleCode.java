package rough;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgAnnotationsSampleCode {
  @Test
  public void f1
  () {
	  System.out.println("Test method 1 is executed");
  }
  @Test
  public void f2() {
	  System.out.println("Test method 2 is executed");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method is executed");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method ecuted");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class is executed");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AFter class is executed");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test is executed");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test is executed");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suit is executed");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suit is executed");  
  }

}
