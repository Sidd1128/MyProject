package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import Resouces.BaseClass;
import Resouces.cons;

public class LoginTestCases extends BaseClass  {
   @Test
	public void Login () throws IOException {
	  
	   
	   
    	LoginPageObjects obj1 = new LoginPageObjects(driver);
    	
    	driver.manage().window().maximize();
    	
    	obj1.NevigateAccount().click();
    	obj1.NevigateToLogin().click();
    	obj1.EmailId().sendKeys(cons.ID);
    	obj1.Password().sendKeys(cons.Pass);
    	obj1.Submit().click();
	}
}
