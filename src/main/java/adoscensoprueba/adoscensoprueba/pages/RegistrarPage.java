package adoscensoprueba.adoscensoprueba.pages;

import org.openqa.selenium.JavascriptExecutor;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegistrarPage extends PageObject{
	
	@FindBy(id ="name")
	WebElementFacade txtNombre;

	@FindBy(id ="lastname")
	WebElementFacade txtPrimerApellido;
	
	@FindBy(name ="secondLastname")
	WebElementFacade txtSegundoApellido;
	
	@FindBy(name ="documentType")
	WebElementFacade cmbTipoDeDocumento;
	
	@FindBy(name ="documentNumber")
	WebElementFacade txtNumeroDeDocumento;
	
	@FindBy(id ="confirmDocument")
	WebElementFacade txtConfirmarNumeroDeDocumento;
	
	@FindBy(id ="email")
	WebElementFacade txtCorreo;
	
	@FindBy(name="phoneNumber")
	WebElementFacade txtNumeroCelular;
	
	@FindBy(name="password")
	WebElementFacade txtContrasena;
	
	@FindBy(name="confirmPassword")
	WebElementFacade txtConfirmarContrasena;
	
	@FindBy(id="checkbox-politics")
	WebElementFacade rdbPoliticaDatosPersonales;
	
	@FindBy(id="continue-button")
	WebElementFacade btnAceptarPoliticas;
	
	@FindBy(id="checkbox-terms")
	WebElementFacade rdbTerminosyCondiciones;
	
	@FindBy(id="send_button")
	WebElementFacade btnContinuar;
	
	
	public void registrarPersona (String nombre, String primerApellido, String segundoApellido, String tipoDeIdentificacion,
			String numIdentificacion, String correo, String numCelular, String contrasena) {
		
		txtNombre.sendKeys(nombre);
		txtPrimerApellido.sendKeys(primerApellido);
		txtSegundoApellido.sendKeys(segundoApellido);
		cmbTipoDeDocumento.selectByVisibleText(tipoDeIdentificacion);
		txtNumeroDeDocumento.sendKeys(numIdentificacion);
		txtConfirmarNumeroDeDocumento.sendKeys(numIdentificacion);
		txtCorreo.sendKeys(correo);
		txtNumeroCelular.sendKeys(numCelular);
		txtContrasena.sendKeys(contrasena);
		txtConfirmarContrasena.sendKeys(contrasena);
		desplazarPaginaHaciaAbajo();
		aceptarPoliticas();
		aceptarTerminos();
		//btnContinuar.click();
		
	}
	
	public void desplazarPaginaHaciaAbajo() {
		JavascriptExecutor jse = (JavascriptExecutor)this.getDriver();
		jse.executeScript("window.scrollBy(0,1000000)", "");//scroll hacia abajo 
	}
	
	
	public void aceptarPoliticas() {
		rdbPoliticaDatosPersonales.click();
		JavascriptExecutor js = (JavascriptExecutor)this.getDriver(); 
		js.executeScript("document.getElementById('politics-modal-content').scrollTop += 10000", "");
		btnAceptarPoliticas.click();
		
	}
	
	public void aceptarTerminos() {
		rdbTerminosyCondiciones.click();
		JavascriptExecutor js = (JavascriptExecutor)this.getDriver(); 
		js.executeScript("document.getElementById('terms-modal-content').scrollTop += 60000", "");
		btnAceptarPoliticas.click();
		
	}
}
