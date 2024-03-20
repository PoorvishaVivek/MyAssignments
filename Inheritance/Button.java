package week2.day4.Inheritance;

public class Button extends WebElement {

	public static void main(String[] args) {
		Button clk = new Button();
		CheckBoxButton cb = new CheckBoxButton();
		Elements em = new Elements();
		
		clk.click();
		clk.setText();
		clk.submit();
		cb.clickCheckBoxButton();
		em.validate();
		
	}
	public void submit() {
		System.out.println("Submit from button class");
		
	}
}
