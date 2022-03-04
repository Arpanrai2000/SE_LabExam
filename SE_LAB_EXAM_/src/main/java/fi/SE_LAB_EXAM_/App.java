package fi.SE_LAB_EXAM_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
	WebDriver driver;
	public void open_Browser() 
	{
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\raiar\\Desktop\\chromedriver.exe");
		 driver = new ChromeDriver();
	  driver.get("https://www.google.com/");

	}
	public void navigate_to_flipkart()
	{
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println("This is the title of the website"+driver.getTitle());	
	}
	
	public void login_Check() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='text']")).sendKeys("labexam0403@gmail.com");
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='password']")).sendKeys("Password012345");
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//button[@type='submit']")).click();
	}
	
    public static void main( String[] args ) throws InterruptedException 
    {
    	App obj = new App();
    	obj.open_Browser();
    	obj.navigate_to_flipkart();
    	obj.login_Check();
    }
}
