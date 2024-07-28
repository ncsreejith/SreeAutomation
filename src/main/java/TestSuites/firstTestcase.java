package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

public class firstTestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		//WebDriverManager.chromedriver().setup();
		
		// Initialize WebDriver 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.progressive.com/");
		 String url_store = driver.getCurrentUrl();
		String actual_title = driver.getTitle();
		System.out.println("The Title is:");
		System.out.println(actual_title);
		System.out.println(url_store);
		System.out.println("Tests are Passed");
		System.out.println("sreejith added new line");
	
		driver.manage().window().maximize();
		//driver.close();
		
				

	}

}
