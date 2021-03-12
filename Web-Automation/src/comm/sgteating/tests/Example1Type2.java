package comm.sgteating.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1Type2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();
		loginUseer1();
		createUser1();
		logout();
		loginUseer1();
		createUser2();
		modifyusertoPassword();
		logout();
		loginUseer2();
		createUser3();
		logout();
		login();
		changeUser1password();
		logout();
		loginUser1updated();
		logout();
		loginasuser2();
		deleteuser3();
		logout();
		loginUser1updated();
		deleteuser2();
		logout();
		login();
		deleteuser1();
		logout();
		closebrowser();
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
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser1() {
		try {
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User1");
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			oBrowser.findElement(By.name("email")).sendKeys("u1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("password")).sendKeys("user1234");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user1234");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public static void loginUseer1() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("user1234");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void logout() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("U2");
			oBrowser.findElement(By.name("lastName")).sendKeys("User2");
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("password")).sendKeys("user1234");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user1234");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyusertoPassword() {
		try {
			oBrowser.findElement(By.xpath(
					"//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]"))
					.click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("testuser2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("testuser2");
			Thread.sleep(2000);
			oBrowser.findElement(By.className("buttonTitle")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void loginUseer2() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("testuser2");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void createUser3() {
		try {
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User3");
			oBrowser.findElement(By.name("lastName")).sendKeys("User3");
			oBrowser.findElement(By.name("email")).sendKeys("u3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser3");
			oBrowser.findElement(By.name("password")).sendKeys("user1234");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user1234");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void changeUser1password() {// *[@id="userListTableContainer"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]
		try {
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath(
					"//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]"))
					.click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("updateuser1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("updateuser1");
			Thread.sleep(2000);
			oBrowser.findElement(By.className("buttonTitle")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void loginUser1updated() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("updateuser1");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void loginasuser2() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("testuser2");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void deleteuser3() {

		try 
		{
			oBrowser.findElement(By.xpath("//span[contains(text(),'passcode3, user3')]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath(("//button[@id='userDataLightBox_deleteBtn']"))).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[@href='/logout.do']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void deleteuser2() {
		
		try {
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			oBrowser.findElement(By.xpath(
					"//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]"))
					.click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert = oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
public static void deleteuser1() {
		
		try {//*[@id="userListTableContainer"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			oBrowser.findElement(By.xpath(
					"//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]"))
					.click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert = oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
static void closebrowser()
{
	try
	{
		oBrowser.close();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
	
}
