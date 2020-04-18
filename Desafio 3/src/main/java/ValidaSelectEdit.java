import java.util.concurrent.TimeUnit;
import org.junit.After;
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
	    driver.findElement(By.cssSelector("tr:nth-child(1) a:nth-child(1)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) a:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(2) a:nth-child(1)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(2) a:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(3) a:nth-child(1)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(3) a:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(4) a:nth-child(1)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(4) a:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(5) a:nth-child(1)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(5) a:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(6) a:nth-child(1)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(6) a:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(7) a:nth-child(1)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(7) a:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(8) a:nth-child(1)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(8) a:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(9) a:nth-child(1)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(9) a:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(10) a:nth-child(1)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(10) a:nth-child(2)")).click();
	}

	@After
	public void posCondicao() {
		driver.quit();
	}

}