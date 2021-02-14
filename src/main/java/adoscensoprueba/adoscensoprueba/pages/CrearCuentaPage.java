package adoscensoprueba.adoscensoprueba.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CrearCuentaPage extends PageObject {
	
	//FindBy ubica el elemento de la pagina /WebElementFacade crear un objeto realizar interacion
	@FindBy(xpath = "//h1[contains(text(),'invertir')]")
	WebElementFacade btnQuieroInvertir;
	
   public void quieroInvertir () {
	   
	   btnQuieroInvertir.click();
   }

}
