import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase {
	
	public WebDriver chrm;
	
	
	
	@Before
		public void setupDriver()
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ygmus\\eclipse\\browserdrivers\\chromedriver.exe");
		chrm=new ChromeDriver();
		String url="https://www.gittigidiyor.com/";
		chrm.get(url);
		chrm.manage().window().maximize();
		chrm.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		}
	
	/*@Test
		public void SignInTest()
		{
			WebElement sign=chrm.findElement(By.className("qjixn8-0 sc-1bydi5r-0 kNKwwK"));
			//gekhq4-4 egoSnI
			sign.click();
			chrm.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
			WebElement email=chrm.findElement(By.id("L-UserNameField"));
			email.click();
			email.sendKeys("E-Mail");
			
			
			WebElement pass=chrm.findElement(By.id("L-PasswordField"));
			pass.click();
			pass.sendKeys("Password");
			
			chrm.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			chrm.findElement(By.id("gg-login-enter"));
		}*/
	
	/*@Test
	 public void Search()
	 {
		WebElement search=chrm.findElement(By.className("sc-4995aq-0 sc-14oyvky-0 itMXHg"));
		search.click();
		search.sendKeys("Bilgisayar");
		chrm.findElement(By.className("qjixn8-0 sc-1bydi5r-0 hKfdXF")).click();

	 }*/
	
	
	@Test
	 public void MixTest()
	 {
		//2.sayfa
		chrm.findElement(By.xpath(".//*[@id=\"best-match-right\"]/div[5]/ul/li[2]/a")).click();
     //*[@id="best-match-right"]/div[5]/ul/li[2]/a
		
		
		//ürün sepete eklenir.
		chrm.findElement(By.id("add-to-basket")).click();
		//*[@id="add-to-basket"]
		
		//sepete girme
		chrm.findElement(By.className("[@id=\"header_wrapper\"]/div[4]/div[3]/a/div[1]/div")).click();
	    //*[@id="header_wrapper"]/div[4]/div[3]/a/div[1]/div
		
		
		
		//sepetteki ürünü silme
		chrm.findElement(By.className("btn-delete btn-update-item")).click();
		// class="btn-delete btn-update-item" data-id="630946783">
	  

	 }
	
	
	
	
	
	@After
	public void quit()
	{
		//chrm.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		chrm.quit();
		
	}

}
