package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sulu\\Desktop\\Maven\\Ragul\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get(" http://toolsqa.com/automation-practice-form/\r\n");
		d.manage().window().maximize();
		WebElement w = d.findElement(By.id("continentsmultiple"));
		Select s = new Select(w);
		List<WebElement> o = s.getOptions();
		for (int i = 0; i<o.size();i++) {
			WebElement we = o.get(i);
			String text = we.getText();
			s.selectByVisibleText(text);
			System.out.println(text);
			
		}
		s.deselectAll();
				
		}
			
	
	
			
			
		}
	
		
	

		
	
