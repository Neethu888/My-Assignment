package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
	 ChromeDriver driver=new  ChromeDriver();
	 driver.get("https://www.facebook.com/login/");
	 driver.manage().window().maximize();
	 driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
	 driver.findElement(By.id("pass")).sendKeys("Tuna@");
	 driver.findElement(By.name("login")).click();
	
	}

}
