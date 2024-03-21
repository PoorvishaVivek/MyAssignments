package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//label[text()='Chennai']/parent::div//span
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']")).click();
	Thread.sleep(2000);
	
	//Radio button is clicked
	driver.findElement(By.xpath("//label[text()='Chennai']/parent::div//span")).click();
	//Verify Radio button is selected or not
	System.out.println("Radio Button is selected:" +driver.findElement(By.xpath("//input[@id=\"j_idt87:city2:0\"]")).isSelected());
	// Selected radio button is clicked and verifying 
	driver.findElement(By.xpath("//label[text()='Chennai']/parent::div//span")).click();
	System.out.println("Radio Button is selected:" +driver.findElement(By.xpath("//input[@id=\"j_idt87:city2:0\"]")).isSelected());
	
	System.out.println("Age group 21-40 years is selected:" +driver.findElement(By.xpath("//input[@value='21-40 Years']")).isSelected());
	driver.quit();
	}
}
