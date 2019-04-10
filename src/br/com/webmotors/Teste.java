package br.com.webmotors;

//package teste;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Teste {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\nat\\chromedriver.exe");
	    WebDriver link = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\nat\\geckodriver.exe");
		//WebDriver link = new FirefoxDriver();
	    link.get("https://www.webmotors.com.br");
	    
	    Thread.sleep(3000);  // /html/body/div[12]/div/ul/li[6]/a/span
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
	    
	    WebElement selVersao = link.findElement(By.xpath("/html/body/div[14]/div/ul/li[4]/a/span"));
	    selVersao.click();
	    
	    Thread.sleep(2000);
	    
	    WebElement enviar = link.findElement(By.id("btnBuscar"));
	    enviar.click();
	    
	}
}