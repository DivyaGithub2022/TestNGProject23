package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
		@BeforeTest(alwaysRun=true)
		public void method3() {
			
			System.out.println("Inside before test");
		}
		
		@BeforeMethod(alwaysRun=true)
		public void method1() {
			
			System.out.println("Inside before method");
		}
		
		
		@AfterMethod(alwaysRun=true)
		public void method2() {
			
			System.out.println("Inside after method");
		}
		
		@AfterTest(alwaysRun=true)
		public void method4() {
			
			System.out.println("Inside after test");
		}

	}
