package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\Meena Project\\Workspace1\\SeleniumFire\\Resourse\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		System.out.println("meenakiran");
		/*String title = driver.getTitle();
	    System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.close();*/
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
