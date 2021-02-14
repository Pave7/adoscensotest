package adoscensoprueba.adoscensoprueba.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TipoDePersonaPage extends PageObject {

	// FindBy ubica el elemento de la pagina /WebElementFacade crear un objeto
	// realizar interación
	@FindBy(xpath = "//div[@id='person-type-card-natural']/div/div")
	WebElementFacade btnPersonaNatural;

	public void personaNatural() {

		btnPersonaNatural.click();
	}
}