package steps;

import java.util.Random;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	private static ChromeDriver driver;
	private static String tittleHomePage ="STORE";
	static Random rand = new Random();
	static String random = String.valueOf(rand.nextInt(10000000));
	private static String userName = random;
	private static  String passWord = "prueba123";
	
	
	@Before
	
	public void setUp() {
	    @SuppressWarnings("unused")
		DesiredCapabilities caps= new DesiredCapabilities();
        System.setProperty("webdriver.chrome.driver","./resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/index.html");
	    driver.manage().window().maximize();

}
	@After
	
	public void tearDown() {
		driver.quit();
	}
	
	public static ChromeDriver getDriver() {
		return driver;	
	}
	
	public static String getTittleHomePage() {
		return tittleHomePage;
	}
	
	public static String getUserName() {
		return userName;
	}
	
	public static String getPassWord() {
		return passWord;
	}
}
