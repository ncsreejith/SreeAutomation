package TestSuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.progressive.com/");
		 String url_store = driver.getCurrentUrl();
		String actual_title = driver.getTitle();
		System.out.println("This is the second PGM to check GIT Check In");
		System.out.println("The Title is:");
		System.out.println(actual_title);
		System.out.println(url_store);
		System.out.println("Tests are Passed");
		driver.manage().window().maximize();
		//driver.close();
		

	}

}
