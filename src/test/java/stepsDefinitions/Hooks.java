package stepsDefinitions;

import static utils.Utils.acessarToDo;
import static utils.Utils.capturarScreenshot;
import static utils.Utils.driver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
		
		@Before ()
		public void setUp() throws Exception {
			acessarToDo();
			
		}
		
		@After()
		public void  fecharKeep(Scenario scenario) throws Exception {
			capturarScreenshot(scenario);
			driver.quit();
		}
		

}
