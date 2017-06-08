package testcases;
import java.io.IOException;
import org.testng.annotations.Test;
import base.CreateDriver;
import pages.HomePage;

public class TC_001 extends CreateDriver
{
	
	@Test(priority=1)
	public void test1() throws InterruptedException
	{
		System.out.println("SUCESSSSSSSSSSSSS");
		HomePage hm=new HomePage(driver);
		hm.clickOnRegister();
	}
	

	@Test(priority=2)
	public void test2() throws InterruptedException, IOException 
	{
		System.out.println("SUCESSSSSSSSSSSSS");
		HomePage hm=new HomePage(driver);
		hm.register_01("Male","Arrchnna");	
	}
	
	@Test(priority=3)
	public void test3() throws InterruptedException, IOException
	{
		//boolean res=false;
		System.out.println("SUCESSSSSSSSSSSSS");
		HomePage hm1=new HomePage(driver);
		hm1.register_02("12121998");
		hm1.register_03("testarchna@gmail.com");
		
		//to check assertion
		//Checkalert.checkDobAlert(driver, "Your age must be 18.");
		//Assert.assertFalse(res);
		hm1.register_04("testarchna@gmail.com","8826845840");
		
	}
	
	@Test(priority=4)
	public void test4()
	{
		
	}
	
	
	
}
