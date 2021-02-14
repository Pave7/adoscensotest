package adoscensoprueba.adoscensoprueba.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("page:webdriver.base.url")
public class HomeAdoscensoPage extends PageObject {

	//FindBy ubica el elemento de la pagina /WebElementFacade crear un objeto realizar interaci�n
	@FindBy(xpath = "//div[contains(text(),'Crear')]")
	WebElementFacade btnCrearCuenta;
	
   public void irACrearCuenta () {
	   
	   btnCrearCuenta.click();
   }
}
