package comm.sgtesting.pageobjectmodels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	WebDriver oBrowser=null;
	public ActiTimePage(WebDriver oBrowser)
	{
		this.oBrowser=oBrowser;
		PageFactory.initElements(oBrowser, this);
	}
	//UserName text field WebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	
	//Password text field WebElement
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login button WebElement
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//FlyoutWindow WebElement
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//Logout Link WebElement
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}

//	for assignments
//	Create User1
	//click on users icon
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement clickOnUsers;
	public WebElement usersClick()
	{
		return clickOnUsers;
	}
	
	//click on add user
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[1]")
	private WebElement clickOnAddUsers;
	public WebElement AddUsersClick()
	{
		return clickOnAddUsers;
	}
	
	//click on firstname in createuser1
	@FindBy(xpath="//*[@id=\'userDataLightBox_firstNameField\']")
	private WebElement FirstnameUser1;
	public WebElement getfirstNameUser1()
	{
		return FirstnameUser1;
	}
	
	//click on lastname in createuser1
	@FindBy(xpath="//*[@id=\'userDataLightBox_lastNameField\']")
	private WebElement LastnameUser1;
	public WebElement getLastNameUser1()
	{
		return LastnameUser1;
	}
	
	//click on email in createuser1
	@FindBy(xpath="//*[@id=\'userDataLightBox_emailField\']")
	private WebElement EmailUser1;
	public WebElement getEmailUser1()
	{
		return EmailUser1;
	}
	
	//click on Username in createUser1
	@FindBy(xpath="//*[@id=\'userDataLightBox_usernameField\']")
	private WebElement UsernameUser1;
	public WebElement getUsernameUser1()
	{
		return UsernameUser1;
	}
	
	//click on password in createUser1
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
	private WebElement passwordUser1;
	public WebElement getPasswordUser1()
	{
		return passwordUser1;
	}
	
	//click on retype password in createUser1
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
	private WebElement RetypePasswordUser1;
	public WebElement getRetypePasswordUser1()
	{
		return RetypePasswordUser1;
	}
	
	//click on CreateUser in createuser1
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']")
	private WebElement clickOnCreateUserUser1;
	public WebElement clickOnCreateUserUser1Click()
	{
		return clickOnCreateUserUser1;
	}
	
//	Delete user1
	//click on User1 after createUser1
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement User1Click;
	public WebElement getUser1ClickAfterCreateUser1()
	{
		return User1Click;
	}
	
	//click on DeleteUser after createUser1
	@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
	private WebElement DeleteUser1Click;
	public WebElement getDeleteUser1ClickAfterCreateUser1()
	{
		return DeleteUser1Click;
	}
	
//		Modify User1
	//Click on NewPassword after createUser1
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
	private WebElement ModifyUser1Pwd;
	public WebElement getModifyPwdCreateUser1()
	{
		return ModifyUser1Pwd;
	}
		
	//Click on Retype Password after createUser1
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
	private WebElement ModifyUser1RePwd;
	public WebElement getModifyRePwdCreateUser1()
	{
		return ModifyUser1RePwd;
	}
		
	//Click on save changes 
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement SaveChangesClick;
	public WebElement getModifySaveChanges()
	{
		return SaveChangesClick;
	}
	
//	Create Customer
	//Click on Tasks icon
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[2]")
	private WebElement TaskIconClick;
	public WebElement getTaskIconClick()
	{
		return TaskIconClick;
	}
	
	//Click on Add New icon
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement AddNewIconClick;
	public WebElement getAddNewIconClick()
	{
		return AddNewIconClick;
	}
	
	//Click on New Customer icon
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement NewCustomerClick;
	public WebElement getNewCustomerClick()
	{
		return NewCustomerClick;
	}
	
	//Click on Enter Customer Name 
	@FindBy(xpath="//*[@id=\'customerLightBox_nameField\']")
	private WebElement CustomerNameClick;
	public WebElement getCustomerNameClick()
	{
		return CustomerNameClick;
	}
	
	//Click on Create Customer Button
	@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
	private WebElement CreateCustomerClick;
	public WebElement getCreateCustomerClick()
	{
		return CreateCustomerClick;
	}
	
//	Delete customer
	//Click on edit button after creating customer
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement EditButtonClick;
	public WebElement getEditButtonClick()
	{
		return EditButtonClick;
	}
	
	//Click On Action button after clicking on edit button
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement ActionButtonClick;
	public WebElement getActionButtonClick()
	{
		return ActionButtonClick;
	}
	
	//Click on Delete Button after clicking on Action Button
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement DeleteButtonClick;
	public WebElement getDeleteButtonClick()
	{
		return DeleteButtonClick;
	}
	
	//Click on Delete permanently Button after clicking on delete button
	@FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")
	private WebElement DeletePermanentClick;
	public WebElement getDeletePermanentClick()
	{
		return DeletePermanentClick;
	}
	
//	Modify Customer
	//click on edit button using getEditButtonClick() method
	
	//Type text on Description block
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement DescriptionClick;
	public WebElement getDescriptionClick()
	{
		return DescriptionClick;
	}
	
	//click on close button
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")
	private WebElement CloseButtonOnCustClick;
	public WebElement getCloseButtonOnCustClick()
	{
		return CloseButtonOnCustClick;
	}
	
//	Create Project
	//click on Add New using getAddNewIconClick() method
	
	//Click on New Project Button
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement NewProjectClick;
	public WebElement getNewProjectClick()
	{
		return NewProjectClick;
	}
	
	//click on Enter Project Name
	@FindBy(xpath="//*[@id=\'projectPopup_projectNameField\']")
	private WebElement ProjectNameClick;
	public WebElement getProjectNameClick()
	{
		return ProjectNameClick;
	}
	
	//click on Create Project button
	@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div/span")
	private WebElement CreateProjectClick;
	public WebElement getCreateProjectClick()
	{
		return CreateProjectClick;
	}
	
	
//	Delete Project
	//Click on edit button on project 
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement EditProjectClick;
	public WebElement getEditProjectClick()
	{
		return EditProjectClick;
	}
	
	//Click on Action button on project window
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement PrjtActionButtonClick;
	public WebElement getPrjtActionButtonClick()
	{
		return PrjtActionButtonClick;
	}
	
	//click on delete button after clicking on action button in project window
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement PrjtDeleteButtonClick;
	public WebElement getPrjtDeleteButtonClick()
	{
		return PrjtDeleteButtonClick;
	}
	
	//click on delete permanently button after clicking the delete button in project window
	@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")
	private WebElement PrjtDeletePrmntButtonClick;
	public WebElement getPrjtDeletePrmntButtonClick()
	{
		return PrjtDeletePrmntButtonClick;
	}
	
	
//	Modify project 
	//Click on Project edit button using getEditProjectClick() method
	
	//Click on Description block in project window
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement PrjtDescriptionClick;
	public WebElement getPrjtDescriptionClick()
	{
		return PrjtDescriptionClick;
	}
	
	//Click on close button on project window
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")
	private WebElement PrjtCloseClick;
	public WebElement getPrjtCloseClick()
	{
		return PrjtCloseClick;
	}
	
	
//	Create Task
	//Click on Add New Task Button
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement AddNewTaskClick;
	public WebElement getAddNewTaskClick()
	{
		return AddNewTaskClick;
	}
	
	//click on create new task button
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement CreateNewTaskClick;
	public WebElement getCreateNewTaskClick()
	{
		return CreateNewTaskClick;
	}
	
	//click on Enter task name 
	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement EnterTaskNameClick;
	public WebElement getEnterTaskNameClick()
	{
		return EnterTaskNameClick;
	}
	
	//click on create tasks button
	@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']/div/span")
	private WebElement CreateTasksButtonClick;
	public WebElement getCreateTaskButtonClick()
	{
		return CreateTasksButtonClick;
	}
	
	
//	Delete task
	//Click on created task
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div")
	private WebElement Task1Click;
	public WebElement getTask1Click()
	{
		return Task1Click;
	}
	
	//Click on Action button after clicking on the created task
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement Task1ActionBtnClick;
	public WebElement getTask1ActionBtnClick()
	{
		return Task1ActionBtnClick;
	}
	
	//Click on Delete button after clicking on the Action button in the task window
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
	private WebElement Task1DeleteBtnClick;
	public WebElement getTask1DeleteBtnClick()
	{
		return Task1DeleteBtnClick;
	}
	
	//click on Delete permanently button after clicking on the delete button in the task window
	@FindBy(xpath="//*[@id=\'taskPanel_deleteConfirm_submitTitle\']")
	private WebElement Task1DeletePrmntBtnClick;
	public WebElement getTask1DeletePrmntBtnClick()
	{
		return Task1DeletePrmntBtnClick;
	}
	
	
//	Modify Task
	//Click on Created Task using getTask1Click() method
	
	//Click on Description block on task window
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement TaskDescriptionClick;
	public WebElement getTaskDescriptionClick()
	{
		return TaskDescriptionClick;
	}
	
	//Click on close button on task window
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[1]")
	private WebElement CloseTaskClick;
	public WebElement getCloseTaskClick()
	{
		return CloseTaskClick;
	}
	
//	Create User2
	//click on the Add user button AddUsersClick() method
	
	//click on First Name of User2
	@FindBy(xpath="//*[@id=\'userDataLightBox_firstNameField\']")
	private WebElement FirstnameUser2;
	public WebElement getFN2()
	{
		return FirstnameUser2;
	}
	
	//click on last name of user2
	@FindBy(xpath="//*[@id=\'userDataLightBox_lastNameField\']")
	private WebElement LastnameUser2;
	public WebElement getLN2()
	{
		return LastnameUser2;
	}
	
	//click on email of user2
	@FindBy(xpath="//*[@id=\'userDataLightBox_emailField\']")
	private WebElement EmailUser2;
	public WebElement getEmailUser2()
	{
		return EmailUser2;
	}
	
	//click on Username in createUser2
	@FindBy(xpath="//*[@id=\'userDataLightBox_usernameField\']")
	private WebElement UsernameUser2;
	public WebElement getUsernameUser2()
	{
		return UsernameUser2;
	}
		
	//click on password in createUser2
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
	private WebElement passwordUser2;
	public WebElement getPasswordUser2()
	{
		return passwordUser2;
	}
		
	//click on retype password in createUser2
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
	private WebElement RetypePasswordUser2;
	public WebElement getRetypePasswordUser2()
	{
		return RetypePasswordUser2;
	}
	
	//click on create user in createUser2
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement clickOnCreateUserUser2;
	public WebElement getclickOnCreateUserUser2()
	{
		return clickOnCreateUserUser2;
	}
	
	
//	Create User3
	//click on the Add user button AddUsersClick() method to create user3
	
	//create First Name for user3
	@FindBy(xpath="//*[@id=\'userDataLightBox_firstNameField\']")
	private WebElement FirstnameUser3;
	public WebElement getFN3()
	{
		return FirstnameUser3;
	}
	
	//create last name for user3
	@FindBy(xpath="//*[@id=\'userDataLightBox_lastNameField\']")
	private WebElement LastnameUser3;
	public WebElement getLN3()
	{
		return LastnameUser3;
	}
	
	//create email for user3
	@FindBy(xpath="//*[@id=\'userDataLightBox_emailField\']")
	private WebElement EmailUser3;
	public WebElement getEmailUser3()
	{
		return EmailUser3;
	}
	
	//create UserName for User3
	@FindBy(xpath="//*[@id=\'userDataLightBox_usernameField\']")
	private WebElement UsernameUser3;
	public WebElement getUsernameUser3()
	{
		return UsernameUser3;
	}
	
	//create password for User3
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
	private WebElement passwordUser3;
	public WebElement getPasswordUser3()
	{
		return passwordUser3;
	}
	
	//click on retype password for User3
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
	private WebElement RetypePasswordUser3;
	public WebElement getRetypePasswordUser3()
	{
		return RetypePasswordUser3;
	}
	
	//click on create user button 
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']")
	private WebElement clickOnCreateUserUser3;
	public WebElement getclickOnCreateUserUser3()
	{
		return clickOnCreateUserUser3;
	}
	
//	To handle welcome to actiTime pop up while login as user1
	@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
	private WebElement clickOnStartExplore;
	public WebElement getclickOnStartExplore()
	{
		return clickOnStartExplore;
	}
	
	
//	Modify Password for 3 users
	//modify password for user1 using Modify User
	//click on user1 block
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
		private WebElement User1toModClick;
		public WebElement getUser1toModClick()
		{
			return User1toModClick;
		}
	
	
	//modify password for user2 
	
	//click on user2 block
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement User2Click;
	public WebElement getUser2Click()
	{
		return User2Click;
	}
	
	//Click on NewPassword to modify password for user2
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
	private WebElement ModifyUser2Pwd;
	public WebElement getModifyUser2Pwd()
	{
		return ModifyUser2Pwd;
	}
			
	//Click on Retype Password to modify password for user2
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
	private WebElement ModifyUser2RePwd;
	public WebElement getModifyUser2RePwd()
	{
		return ModifyUser2RePwd;
	}
			
	//Click on save changes 
	
	
	
	//modify password for user3
	
		//click on user3 block
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement User3Click;
		public WebElement getUser3Click()
		{
			return User3Click;
		}
		
		//Click on NewPassword to modify password for user2
		@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
		private WebElement ModifyUser3Pwd;
		public WebElement getModifyUser3Pwd()
		{
			return ModifyUser3Pwd;
		}
				
		//Click on Retype Password to modify password for user2
		@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
		private WebElement ModifyUser3RePwd;
		public WebElement getModifyUser3RePwd()
		{
			return ModifyUser3RePwd;
		}
				
		//Click on save changes 
		
		
		
//		Delete 3 Users
		//Delete user1 
		
		// click on user1 using getUser1toModClick() method
		//click on delete button 
		//click on ok
		
		//Delete user2
		//click on user2 after deleting user1
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement User2ClickDltU1;
		public WebElement getUser2ClickAfterDeleteUser1()
		{
			return User2ClickDltU1;
		}
		
		
//		Advanced Scenario Example1
		//modify user password
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement User2btnClick;
		public WebElement getUser2btnClick()
		{
			return User2btnClick;
		}
		
		//to change user1 Pwd click on user1
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement User1btnClick;
		public WebElement getUser1btnClick()
		{
			return User1btnClick;
		}
		
		//to delete user3 click on user 3
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement User3DltClick;
		public WebElement getUser3DltClick()
		{
			return User3DltClick;
		}
		
		//to delete user2 click on user2
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement User2DltClick;
		public WebElement getUser2DltClick()
		{
			return User2DltClick;
		}
		
		//to delete user1 click on user1
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement User1DltClick;
		public WebElement getUser1DltClick()
		{
			return User1DltClick;
		}
}

