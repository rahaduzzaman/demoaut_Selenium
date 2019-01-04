package pageFlows;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import infrastructure.Operations;
//import pageObjects.Registration;
import pageObjects.Signin;

public class SignOn {

	public void signin(WebDriver driver){
		Operations op = new Operations();
		
		op.clickLink(driver, Signin.link_Signin);
//		driver.findElement(By.xpath(Signin.link_Signin)).click();
		
		op.waitImplicitely(driver, 5);
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		op.setText(driver, Signin.textBox_UserName, "Rahad");
//		driver.findElement(By.xpath(Signin.textBox_UserName)).sendKeys("Rahad");
		
		op.setText(driver, Signin.textBox_Password, "Password123");
//		driver.findElement(By.xpath(Signin.textBox_Password)).sendKeys("Password123");
		
		op.clickLink(driver, Signin.button_Signin);
//		driver.findElement(By.xpath(Signin.button_Signin)).click();


	}

}