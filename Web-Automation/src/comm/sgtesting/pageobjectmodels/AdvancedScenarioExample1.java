package comm.sgtesting.pageobjectmodels;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedScenarioExample1 {
	
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();
		logout();
		loginAsUser1();
		createUser2();
		modifyPwdUSer2();
		logout();
		loginAsUser2NewPwd();
		createUser3();
		logout();
		login();
		ModifyUser1Pwd();
		logout();
		loginAsUser1NewPwd();
		logout();
		loginAsUser2NewPwd();
		DeleteUser3();
		logout();
		loginAsUser1NewPwd();
		DeleteUser2();
		logout();
		login();
		DeleteUser1();
		logout();
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
	
	static void createUser1()
	{
		try
		{
			//create user1
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
	
	static void loginAsUser1()
	{
		try
		{
			oPage.getUserName().sendKeys("User1");
			oPage.getPassword().sendKeys("1234");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getclickOnStartExplore().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser2()
	{
		try
		{
			//create user2
			oPage.usersClick().click();
			Thread.sleep(2000);
			oPage.AddUsersClick().click();
			Thread.sleep(2000);
			oPage.getFN2().sendKeys("demo2");
			Thread.sleep(500);
			oPage.getLN2().sendKeys("User2");
			Thread.sleep(500);
			oPage.getEmailUser2().sendKeys("u2@gmail.com");
			Thread.sleep(500);
			oPage.getUsernameUser2().sendKeys("User2");
			Thread.sleep(500);
			oPage.getPasswordUser2().sendKeys("2345");
			Thread.sleep(500);
			oPage.getRetypePasswordUser2().sendKeys("2345");
			Thread.sleep(500);
			oPage.getclickOnCreateUserUser2().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	static void modifyPwdUSer2()
	{
		try
		{
			//modify pwd for user2
			oPage.getUser2btnClick().click();
			Thread.sleep(2000);
			oPage.getModifyPwdCreateUser1().sendKeys("2222");
			Thread.sleep(2000);
			oPage.getModifyRePwdCreateUser1().sendKeys("2222");
			Thread.sleep(2000);
			oPage.getModifySaveChanges().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginAsUser2NewPwd()
	{
		try
		{
			oPage.getUserName().sendKeys("User2");
			oPage.getPassword().sendKeys("2222");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getclickOnStartExplore().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser3()
	{
		try
		{
			//create user2
			oPage.usersClick().click();
			Thread.sleep(2000);
			oPage.AddUsersClick().click();
			Thread.sleep(2000);
			oPage.getFN3().sendKeys("demo3");
			Thread.sleep(500);
			oPage.getLN3().sendKeys("User3");
			Thread.sleep(500);
			oPage.getEmailUser3().sendKeys("u3@gmail.com");
			Thread.sleep(500);
			oPage.getUsernameUser3().sendKeys("User3");
			Thread.sleep(500);
			oPage.getPasswordUser3().sendKeys("3456");
			Thread.sleep(500);
			oPage.getRetypePasswordUser3().sendKeys("3456");
			Thread.sleep(500);
			oPage.getclickOnCreateUserUser3().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	static void ModifyUser1Pwd()
	{
		try
		{
			oPage.usersClick().click();
			Thread.sleep(2000);
			oPage.getUser1btnClick().click();
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
	
	static void loginAsUser1NewPwd()
	{
		try
		{
			oPage.getUserName().sendKeys("User1");
			oPage.getPassword().sendKeys("1111");
			oPage.getLogin().click();
			Thread.sleep(4000);
//			oPage.getclickOnStartExplore().click();
//			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void DeleteUser3()
	{
		try
		{
			oPage.usersClick().click();
			Thread.sleep(2000);
			oPage.getUser3DltClick().click();
			Thread.sleep(2000);
			oPage.getDeleteUser1ClickAfterCreateUser1().click();
			Thread.sleep(2000);
			Alert oAlert2=oBrowser.switchTo().alert();
			oAlert2.accept();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void DeleteUser2()
	{
		try
		{
			oPage.usersClick().click();
			Thread.sleep(2000);
			oPage.getUser2DltClick().click();
			Thread.sleep(2000);
			oPage.getDeleteUser1ClickAfterCreateUser1().click();
			Thread.sleep(2000);
			Alert oAlert2=oBrowser.switchTo().alert();
			oAlert2.accept();
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
			oPage.usersClick().click();
			Thread.sleep(2000);
			oPage.getUser1DltClick().click();
			Thread.sleep(2000);
			oPage.getDeleteUser1ClickAfterCreateUser1().click();
			Thread.sleep(2000);
			Alert oAlert2=oBrowser.switchTo().alert();
			oAlert2.accept();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
