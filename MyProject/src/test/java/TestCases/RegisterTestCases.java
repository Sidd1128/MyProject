package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.RegisterPageObject;
import Resouces.BaseClass;

public class RegisterTestCases extends BaseClass {

	@Test
	public void verifyRegister() throws IOException {
		
		initializeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		
		RegisterPageObject obj=new RegisterPageObject(driver);
		
		driver.manage().window().maximize();
		
		obj.NavigatetoMyAccount().click();
		obj.NevigatetoRegister().click();
		obj.FirstName().sendKeys("animesh");
		obj.LastName().sendKeys("tiwari");
		obj.Email().sendKeys("animeshtiwari00@gmail.com");
		obj.telephone().sendKeys("1234567896");
		obj.password().sendKeys("Test@321");
		obj.Confirmpassword().sendKeys("Test@321");
		obj.RadioBtn().click();
		obj.checkbox().click();
		obj.submit().click();
		
		
	}
	}