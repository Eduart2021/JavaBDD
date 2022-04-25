
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/feature"},

        glue = {"stepDefinition", "WebDriver"},

        // Specify tags to be executed
        tags = "@unit",

        // readable console logs
        monochrome = true,

        // This create cucumber reports
       plugin = {"pretty", "html:Reports/Default/"},

        // This create auto method nam in camelCase
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class TestRunner {
}
