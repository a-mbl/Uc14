package testsFront;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageHome {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getenv("Driver"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://online.sp.senai.br/");
	}
	
	
	@Test
	public void testNavegarPaginaHome() {
		driver.get("http://localhost:4200/");
		driver.findElement(By.id("idcadastro")).click();
		driver.findElement(By.id("email")).sendKeys("adriano@email.com");
		driver.findElement(By.id("senha")).sendKeys("senhadoadriano");
		driver.findElement(By.id("senha")).sendKeys(Keys.ENTER);
	}
	
}
