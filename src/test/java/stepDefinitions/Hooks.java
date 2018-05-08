package stepDefinitions;

import java.net.MalformedURLException;

import com.utilities.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestBase{
	@Before
	public void openBrowser() throws MalformedURLException{
		TestBase.initiallization();
	}

	@After
	public void closeBrowser() {
		TestBase.tearDown();
	}
}
