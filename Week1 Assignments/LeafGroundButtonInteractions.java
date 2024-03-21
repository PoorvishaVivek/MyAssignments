package week2.Assignments;

import org.openqa.selenium.By;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class LeafGroundButtonInteractions {
	
	ChromeDriver driver; //
	public static void main(String[] args) throws InterruptedException {
		
		//created an object for current class
		LeafGroundButtonInteractions buttons = new LeafGroundButtonInteractions();
		
		buttons.driver = new ChromeDriver();
		
		buttons.driver.get("https://leafground.com/button.xhtml");
		buttons.driver.manage().window().maximize();
		buttons.titledashboard();
		buttons.buttonDisable();
		buttons.buttonPosition();
		buttons.buttonColor();
		buttons.buttonSize();
		buttons.driver.quit();
	}
	
	public void titledashboard() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Click')]/parent::button")).click();
		String dashboardtitle = driver.getTitle();
		System.out.println("Title of the page is: " +dashboardtitle);
		driver.navigate().back();
		Thread.sleep(3000);	
	}
	
	public void buttonDisable() {
		boolean buttond = driver.findElement(By.xpath("(//button[@type='button'])[2]")).isEnabled();
		System.out.println("Confirm if the button is disabled:" +buttond);
	}
	
	public void buttonPosition() {
		Point location = driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation();
		System.out.println("Position of the submit button is:" +location);
	}
	
	public void buttonColor() {
		//Identify the element
	WebElement color = driver.findElement(By.xpath("//span[text()='Save']"));
	// Obtain the color in rgba
	String bc = color.getCssValue("Color");
	//convert the rgba to Hex
	String bcc = Color.fromString(bc).asHex();
	System.out.println("Color of the button: " +bc);
	System.out.println("Hex code for color is: " +bcc);
		}
	
	public void buttonSize() {
		int buttonH = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize().getHeight();
		int buttonW = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize().getWidth();
		System.out.println("Height & Width of the button is: H-" +buttonH+ "  W-" +buttonW);
		
	}
	
	
	
}

