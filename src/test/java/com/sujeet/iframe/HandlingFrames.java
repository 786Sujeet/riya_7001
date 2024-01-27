package com.sujeet.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	

	public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	Thread.sleep(2000);
	WebElement frame1=driver.findElement(By.xpath("//iframe[@name='packageListFrame']"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//ul[@title='Packages']/child::li[1]/child::a[1]")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame("packageFrame");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ul[@title='Interfaces']/child::li[1]/child::a")).click();
	System.out.println("sujeet");
	
	}

}
