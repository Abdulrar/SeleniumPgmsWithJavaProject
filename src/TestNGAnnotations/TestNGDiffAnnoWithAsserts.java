package TestNGAnnotations;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDiffAnnoWithAsserts {

	
	@BeforeSuite
	public void beforeSuite() {	
		System.out.println("----------->BeforeSuite");
	}
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("----------->BeforeTest");
	}
	
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("----------->BeforeClass");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("----------->BeforeMethod");
	}
	
	@Test
	public void test1() {
		System.out.println("----------->Test1");
	}
	
	
	@Test
	public void test2() {
		System.out.println("----------->Test2");
	}
	
	
	@Test
	public void test3() {
		System.out.println("----------->Test3");
	}
	
	
	@Test
	public void test4() {
		System.out.println("----------->Test4");
		int i = 2;
		int j =3;
		int k = i+j;
		
		Assert.assertEquals(5, k);
		
		String a = "ab";
		String b ="cd";
		String c = a+b;
		
		Assert.assertEquals("abcd",c);
		
		
		
		boolean d = true;
		
		Assert.assertTrue(d);
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("----------->AfterMethod");
	}
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("----------->AfterClass");
	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("----------->AfterTest");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("----------->AfterSuite");
	}
	
}