package testcases;

import org.testng.annotations.Test;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoanTest extends BaseClass{
	
	/*
	@BeforeTest
	public void method3() {
		
		System.out.println("Inside before test");
	}
	
	@BeforeMethod
	public void method1() {
		
		System.out.println("Inside before method");
	}
	*/
	
	@Test(dependsOnMethods="test2", groups= {"sanity"})//(priority=1)//(enabled=false)
	public void test1() {
		
		System.out.println("Inside home loan test 1");
	}
	
	
	@Test(priority=0)
	public void test2() {
		
		System.out.println("Inside home loan test 2");
	}
	
	/*
	@AfterMethod
	public void method2() {
		
		System.out.println("Inside after method");
	}
	
	@AfterTest
	public void method4() {
		
		System.out.println("Inside after test");
	}
	*/

}

