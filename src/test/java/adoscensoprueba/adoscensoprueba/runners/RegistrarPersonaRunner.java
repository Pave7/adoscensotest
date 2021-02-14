package adoscensoprueba.adoscensoprueba.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//Donde se ejecuta la prueba en eclipse y llama el feature donde esta el escenario (gherkin)
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/RegistrarPersona.feature",
		glue = "",
		snippets = SnippetType.CAMELCASE,
		tags = {"@registro"} // Si se deja tags = {""} se ejecutan todo los escenarios de feature
		)

public class RegistrarPersonaRunner {

}
