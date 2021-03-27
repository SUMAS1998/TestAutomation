package comm.sgtesting.pageobjectmodels;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3PgObjModel {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		CreateCustomer();
		DeleteCustomer();
		logout();
		closeApplication();
	}
	
	public static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	static void CreateCustomer()
	{
		try
		{
			oPage.getTaskIconClick().click();
			Thread.sleep(2000);
			oPage.getTaskIconClick().click();
			Thread.sleep(2000);
			oPage.getAddNewIconClick().click();
			Thread.sleep(2000);
			oPage.getNewCustomerClick().click();
			Thread.sleep(2000);
			oPage.getCustomerNameClick().sendKeys("Customer1");
			Thread.sleep(2000);
			oPage.getCreateCustomerClick().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void DeleteCustomer()
	{
		try
		{
			oPage.getEditButtonClick().click();
			Thread.sleep(2000);
			oPage.getActionButtonClick().click();
			Thread.sleep(2000);
			oPage.getDeleteButtonClick().click();
			Thread.sleep(2000);
			oPage.getDeletePermanentClick().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

