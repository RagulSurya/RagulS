package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base extends ExcelPractice {
	public static void main(String[] args) {
		for (int i =0; i< 5; i++) {
		for (int j =0;j<i;j++) {
			System.out.print("*");
			System.out.print(" ");
		}
		    System.out.println(" ");
		}
	
	}
		
}
