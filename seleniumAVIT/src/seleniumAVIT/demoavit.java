package seleniumAVIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoavit {
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("anjali");
		driver.findElement(By.name("password")).sendKeys("asha");
		driver.findElement(By.name("login")).click();
				}

}
