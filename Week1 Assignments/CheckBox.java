package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	private String triState="//div[@id='j_idt87:ajaxTriState']";
	private String basic="//span[text()='Basic']/preceding::div[1]";
	
	//ChromeDriver driver = new ChromeDriver(); // declaration and creation
	ChromeDriver driver; // declaration
	 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		CheckBox obj = new CheckBox();
		obj.clickCheckBox();
		obj.toggleswitch();
		obj.disabledCheckbox();
		obj.multipleoptions();
	}
	public void clickCheckBox()
	{
		driver=new ChromeDriver(); // creation
		
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		clickAction(basic);
		driver.findElement(By.xpath("//span[text()='Ajax']/preceding::div[1]")).click();
		driver.findElement(By.xpath("//label[text()='Others']")).click();
		driver.findElement(By.xpath(triState));	
		clickAction(triState);	
	}
	
	private void clickAction(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
		
	}
	
	private void toggleswitch() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		Thread.sleep(2000);
	}
	
	private void disabledCheckbox() {
		boolean disable = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).isEnabled();
		System.out.println("Checkbox is disabled:" +disable);
		
	}
	private void multipleoptions() throws InterruptedException {
	 driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[6]")).click();
	 driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[7]")).click();
	 driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[9]")).click();
	 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
	 String options = driver.findElement(By.xpath("//ul[@data-label='Cities']")).getText();
	 System.out.println("From Multiple Options " + options + " are Selected.");
	 driver.quit();
	 
	}
	
}
