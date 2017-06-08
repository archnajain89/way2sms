package pages;
import java.util.ResourceBundle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class HomePage 
{
	ResourceBundle rb;
	ChromeDriver driver;
	
	public HomePage(ChromeDriver driver)
	{
		this.driver=driver;
		rb=ResourceBundle.getBundle("Element");
	}
	
	public void clickOnRegister() throws InterruptedException
	{
		
		Thread.sleep(1000);
		driver.findElementByXPath(rb.getString("register_buttn")).click();
	}
	
	public void register_01(String userGender, String username)
	{
		
		//to select radio button for GENDER
		
		if(userGender.equalsIgnoreCase("Male"))
		{
			WebElement radiobtn=driver.findElementByXPath(rb.getString("radiobtn_male"));
			radiobtn.click();
		}
		else
		{
			WebElement radiobtn=driver.findElementByXPath(rb.getString("radiobtn_female"));
			radiobtn.click();
		}
		
		
		//to enter first name
		driver.findElementByXPath(rb.getString("name")).sendKeys(username);
	}
	
	public void register_02(String userdob) throws InterruptedException
	{
		//to enter DOB
		driver.findElementByXPath(rb.getString("dob")).sendKeys(userdob);
		Thread.sleep(1000);
	}
	
	public void register_03(String emailid) throws InterruptedException
	{
		//to enter email id
		driver.findElementByXPath(rb.getString("email")).sendKeys(emailid);
		Thread.sleep(1000);
	}
	
	

	public void register_04( String cnfrmemailid,String no) throws InterruptedException
	{
		//to enter confirm email id
		driver.findElementByXPath(rb.getString("cnfrm_email")).sendKeys(cnfrmemailid);
		Thread.sleep(1000);
		
		//to select city from drop down
		WebElement element=driver.findElementByXPath(rb.getString("cityname"));
		Select dropdown=new Select(element);
		//dropdown.selectByVisibleText("city");
		dropdown.selectByValue("1");
		
		//to enter mobile number
		driver.findElementByXPath(rb.getString("mob_no")).sendKeys(no);
		
		//enter captcha
		Thread.sleep(20000);
		
		//to select radio button for terms and condition
		WebElement radiobtn=driver.findElementByXPath(rb.getString("radio_terms&cond"));
		radiobtn.click();
		
		//to click on register button
		driver.findElementByXPath(rb.getString("verify&register_btn")).click();
		
	} 
}
