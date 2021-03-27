package comm.sgtesting.pageobjectmodels;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2PgObjModel {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		CreatUser1();
		ModifyUser1();
		DeleteUser1();
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

	
	static void CreatUser1()
	{
		try
		{
			oPage.usersClick().click();
			Thread.sleep(2000);
			oPage.AddUsersClick().click();
			Thread.sleep(2000);
			oPage.getfirstNameUser1().sendKeys("demo");
			Thread.sleep(500);
			oPage.getLastNameUser1().sendKeys("User1");
			Thread.sleep(500);
			oPage.getEmailUser1().sendKeys("u1@gmail.com");
			Thread.sleep(500);
			oPage.getUsernameUser1().sendKeys("User1");
			Thread.sleep(500);
			oPage.getPasswordUser1().sendKeys("1234");
			Thread.sleep(500);
			oPage.getRetypePasswordUser1().sendKeys("1234");
			Thread.sleep(500);
			oPage.clickOnCreateUserUser1Click().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void DeleteUser1()
	{
		try
		{
			oPage.getUser1ClickAfterCreateUser1().click();
			Thread.sleep(2000);
			oPage.getDeleteUser1ClickAfterCreateUser1().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void ModifyUser1()
	{
		try
		{
			oPage.getUser1ClickAfterCreateUser1().click();
			Thread.sleep(2000);
			oPage.getModifyPwdCreateUser1().sendKeys("1111");
			Thread.sleep(2000);
			oPage.getModifyRePwdCreateUser1().sendKeys("1111");
			Thread.sleep(2000);
			oPage.getModifySaveChanges().click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

