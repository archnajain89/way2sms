package pages;
import java.util.ResourceBundle;
import org.openqa.selenium.chrome.ChromeDriver;



public class Loginpage 
{
	ResourceBundle rb;
	ChromeDriver driver;
	
	public Loginpage(ChromeDriver driver)
	{
		this.driver=driver;
		rb=ResourceBundle.getBundle("Element");
	}
	
	/*public void loginWay2Sms() throws InterruptedException
	{
		
		driver.findElementByXPath(rb.getString("login_id")).sendKeys("testbhavna.t2system@gmail.com");
		driver.findElementByXPath(rb.getString("next_button")).click();
		Thread.sleep(10000);
		driver.findElementByXPath(rb.getString("login_password")).sendKeys("bhavna2017");
		Thread.sleep(10000);
		driver.findElementByXPath(rb.getString("next_button")).click();
			
	}*/
	
}
