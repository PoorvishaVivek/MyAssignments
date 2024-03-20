package week2.day4.Inheritance;

public class TextField extends WebElement {
	public static void main(String[] args) {
		
		TextField tf = new TextField();
		tf.click();
		tf.setText();
		tf.getText();

	}
	
	public void getText() {
		
		System.out.println("Get Text from Textfield class");
		
	}

}
