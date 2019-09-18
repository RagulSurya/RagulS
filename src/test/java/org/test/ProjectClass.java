package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectClass {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sulu\\Desktop\\Maven\\Ragul\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("one plus 7");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		List<WebElement> list = d.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		int f = list.size();
		System.out.println(f);
		for (WebElement x:list) {
			String o = x.getText();
			System.out.println(o);
			
		}
		list.get(1).click();
		
		
	}

}
