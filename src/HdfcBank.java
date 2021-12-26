import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HdfcBank { 
	public static void main(String[] args) { 
		System.setProperty("webdriver.edge.driver","C:\\Users\\rbaru\\eclipse-workspace\\Seliniyum@2\\src\\Library\\msedgedriver.exe");
		 WebDriver driver=new EdgeDriver(); 
		 //url 
		 driver.get(" https://www.swiggy.com/");
		 		
		 //using id 
		 WebElement txtuser = driver.findElement(By.id("location"));
		 txtuser.sendKeys("cuddalore"); 
		// driver.get(" http://demo.automationtesting.in/Register.html\r\n"
		// 		+ "");
		 		
		// WebElement textuser = driver.findElement(By.id("userName"));  
		 //textuser.sendKeys("ak@24");
		 
		 //redbus url 
		 driver.get("https://www.redbus.in/ "); 
		  
		 // from text box 
		 WebElement add = driver.findElement(By.xpath("//input[@class='db']")); 
		 add.sendKeys("chennai"); 
		 
		 // to text box 
		 WebElement added = driver.findElement(By.id("dest")); 
		 added.sendKeys("bangalore"); 
		 
		 
		 
	}

}
