package Organization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateOrgTest {

	@Test
	public void CreateOrgWithMobNOTest()
	{
		System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	}
	
}
