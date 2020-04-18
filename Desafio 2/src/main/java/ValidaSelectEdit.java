import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidaSelectEdit {
	WebDriver driver;
	//Local do driver do chrome, versão utilizada 81
	String PathChromeDriver = "D:\\Projeto\\Downloads\\chromedriver_win32\\chromedriver.exe";

	@Before
	public void preCondicao() {
		System.setProperty("webdriver.chrome.driver", PathChromeDriver);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/challenging_dom");
	}

	@Test
	public void Valida3BoToes() {
		driver.get("https://the-internet.herokuapp.com/challenging_dom");
	    driver.findElement(By.cssSelector("a[class='button']")).click();
	    driver.findElement(By.cssSelector("a[class='button alert']")).click();
	    driver.findElement(By.cssSelector("a[class='button success']")).click();
	}
	
	@Test
	public void ValidaSelecteEdit() {
		
		int tr;
		int as;
		
		for (tr = 1; tr < 10; tr++) {
			for (as = 1; as < 2; as++) {
				driver.findElement(By.cssSelector("tr:nth-child("+ tr +") a:nth-child("+ as +")")).click();
			}
		}
		    
		boolean FinishOk = tr == 10;
		Assert.assertTrue(FinishOk);
	}

	@After
	public void posCondicao() {
		driver.quit();
	}

}