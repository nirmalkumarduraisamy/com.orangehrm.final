package comoragnehrmstep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.orghrm.commonproperties.cmmonproperties;
import com.orghrm.commonproperties.constance_value;

import io.cucumber.java.Before;

public class common_step {


	public static WebDriver driver; 

	@Before
	public void beforelaunchbrwoser() {


		try {

			cmmonproperties cmmonproperties = new cmmonproperties();
			cmmonproperties.propertiesload();
			if(driver==null) {
				launchbrwoser();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void launchbrwoser() {

		try {

			switch ("Chromebrwser") {
			case "chrome":
				System.setProperty(constance_value.chrome_driver, 
						constance_value.chromebrowser);
				driver= new ChromeDriver();
				break;
			case "firefox":
				System.setProperty(constance_value.firefox_driver,constance_value.firefoxbrowser);
				driver= new FirefoxDriver();
				break;
			default:
				System.setProperty(constance_value.chrome_driver,constance_value.chromebrowser);
				driver= new ChromeDriver();
				break;
			}

		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
