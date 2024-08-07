package runnerTESTNG;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		
		features = "C:\\Users\\User\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\TESTNGcucumber\\src\\test\\resources\\SparshTESTNG\\SecondOPINION.feature",
		glue = "Steps" //step defination package name
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
