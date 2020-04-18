import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClicaEEsperaHelloWorld {
	WebDriver driver;

	String PathChromeDriver = "D:\\Projeto\\Downloads\\chromedriver_win32\\chromedriver.exe";

	@Before
	public void preCondicao() {
		System.setProperty("webdriver.chrome.driver", PathChromeDriver);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
	}

	@Test
	public void EsperarHelloWorld() {
		String Hello = "Hello World!";
	    driver.findElement(By.cssSelector("button")).click();	    
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
	    String Finish = driver.findElement(By.id("finish")).getText();	    
		boolean FinishOk = Hello.equals(Finish);
		Assert.assertTrue("Hello World esta visivel em tela",FinishOk);
	}

	@After
	public void posCondicao() {
		driver.quit();
	}

}