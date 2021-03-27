package comm.sgtesting.pageobjectmodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		framesTesting();
	}
	
	public static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void navigate()
	{
		try
		{
			oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void framesTesting()
	{
		try
		{
			oBrowser.switchTo().frame(0);
			Thread.sleep(1000);
			oBrowser.findElement(By.linkText("org.openqa.selenium")).click();
			Thread.sleep(1000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(1000);
			oBrowser.switchTo().frame("packageFrame");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//a/span[text()='WebDriver']")).click();
			Thread.sleep(1000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(1000);
			WebElement oEle=oBrowser.findElement(By.xpath("/html/body/main/div/div[2]/iframe"));
			oBrowser.switchTo().frame(oEle);
			Thread.sleep(1000);
			String textContent=oBrowser.findElement(By.xpath("/html/body/main/div[2]/div[1]/ul/li/div")).getText();
			System.out.println(textContent);
			Thread.sleep(1000);
			oBrowser.switchTo().defaultContent();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
