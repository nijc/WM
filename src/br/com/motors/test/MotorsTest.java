package br.com.motors.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class MotorsTest {
	WebDriver link;
	
	@After
	public void openPage() {
		System.setProperty("webdriver.chrome.driver", "C:\\nat\\chromedriver.exe");
	    link = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\nat\\geckodriver.exe");
		//WebDriver link = new FirefoxDriver();
	    link.get("https://www.webmotors.com.br");
	}
	
	@Test
	public void marca() throws InterruptedException {
		Thread.sleep(6000);
	    WebElement marca = link.findElement(By.xpath("//*[@id=\"MultiPurpose_Marca\"]/div[1]"));
	    marca.click();
	    
	    WebElement selMarca = link.findElement(By.xpath("/html/body/div[12]/div/ul/li[6]/a/span"));
	    selMarca.click();
	    
	    Thread.sleep(3000);		  
		
	    WebElement modelo = link.findElement(By.xpath("//*[@id=\"MultiPurpose_Modelo\"]/div[1]"));
		modelo.click();		   
		WebElement selModelo = link.findElement(By.xpath("/html/body/div[13]/div/ul/li[3]/a/span"));
		selModelo.click();
		
		Thread.sleep(3000);
		
		WebElement versao = link.findElement(By.xpath("//*[@id=\"MultiPurpose_Versao\"]/div[1]"));
		versao.click();
		WebElement selVersao = link.findElement(By.xpath("/html/body/div[14]/div/ul/li[8]/a/span"));
		selVersao.click();
		assertTrue(versao.isDisplayed()); 
	}	
}
