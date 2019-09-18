package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.interactions.Actions;

public class ProjectRagulSurya7 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sulu\\Desktop\\Maven\\Ragul\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		Robot rob = new Robot();
		d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		d.findElement(By.xpath("(//input[@type='text'])")).sendKeys("Realme 5 pro phone");
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		List<WebElement> items = d.findElements(By.xpath("//div[@class='_3wU53n']"));
		int size = items.size();
		System.out.println(size);
		WebElement web = items.get(3);
		String text2 = web.getText();
		System.out.println(text2);

		for (WebElement x:items) {
			String text = x.getText();
			System.out.println(text);
			
	}
		

}}
