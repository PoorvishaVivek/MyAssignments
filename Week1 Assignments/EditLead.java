package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(" http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Poorvisha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("AR");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Web Application Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("poorvish@infosys.com");
	
		WebElement stateWE = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDD = new Select(stateWE);
		stateDD.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Testing web app");
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String editLead = driver.getTitle();
		System.out.println("Page Title is -- " + editLead);
		
		driver.close();
		driver.quit();
		
	}
}
