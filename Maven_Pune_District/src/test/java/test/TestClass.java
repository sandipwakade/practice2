package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@Test (priority=4 , enabled=true )
	public void test1()
	{
		System.out.println("Test 1");
	}
	
	@Test (priority=3)
	public void test2()
	{
		System.out.println("Test 2");
	}
	
	@Test (priority=2 , invocationCount=3 )
	public void test3()
	{
		System.out.println("Test 3");
		//Assert.fail();
	}
	
	@Test (priority=1 , dependsOnMethods="test2")
	public void test4()
	{
		System.out.println("Test 4");
		//Assert.fail();
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}

}
