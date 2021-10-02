import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/features/"},
        tags = "@login",
        plugin = { "pretty", "html:target/cucumber-reports.html" }
)

public class TestRunner {

}
