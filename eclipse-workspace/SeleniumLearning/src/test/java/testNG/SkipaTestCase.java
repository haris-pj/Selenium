package testNG;

import org.testng.annotations.Test;

public class SkipaTestCase {
	
		@Test(priority = 0)
		public void firstTestCase() {
			System.out.println("This is first test case");
		}
		
		@Test(priority = 1)
		public void secondTestCase() {
			System.out.println("This is second test case");
		}
		
		@Test(priority = 2)
		public void thirdTestCase() {
			System.out.println("This is third test case");
		}
		
		@Test(priority = 4,enabled = false)
		public void takeRest() {
			System.out.println("I am taking rest");
		}
		
		@Test(priority = 3)
		public void fourthTestCase() {
			System.out.println("This is fourth test case");
		}

}
