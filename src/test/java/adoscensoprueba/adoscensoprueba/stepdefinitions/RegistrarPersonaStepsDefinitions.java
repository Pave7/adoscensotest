package adoscensoprueba.adoscensoprueba.stepdefinitions;

import adoscensoprueba.adoscensoprueba.steps.RegistrarPersonaSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegistrarPersonaStepsDefinitions {

	//pasos del gherkin y conectar con el codigo
	@Steps
	RegistrarPersonaSteps registrarPersonaSteps;
	
	@Given ("^ingreso a la url de la pagina adoscenso$")
	public void ingresoALaUrlDeLaPaginaAdoscenso () {
		registrarPersonaSteps.abrirPaginaAdoscenso();	
	}
	
	@When ("^ingreso a la opcion crear cuenta$")
	public void ingresoALaOpcionCrearCuenta () {
		registrarPersonaSteps.irACrearCuenta();
		
	}
	
	@And ("^selecciono la opcion quiero invertir$")
	public void seleccionoLaOpcionQuieroInvertir () {
		registrarPersonaSteps.irAquieroInvertir(); 
		
	}
	
	@And ("^selecciono la opcion persona natural$")
	public void seleccionoLaOpcionPersonaNatural () {
		registrarPersonaSteps.irAPersonaNatural();
		
	}

	
	@And("^diligencio el formulario de registro \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void diligencioElFormularioDeRegistro(String nombre, String primerApellido, String segundoApellido, String tipoDeIdentificacion,
			String numIdentificacion, String correo, String numCelular, String contrasena) {
		registrarPersonaSteps.registrarPersona(nombre, primerApellido, segundoApellido, tipoDeIdentificacion, numIdentificacion, correo, numCelular, contrasena);
	}
	
	
	@Then ("^puedo finalizar el registro$")
	public void puedoFinalizarElRegistro () {
		System.out.println("No se puede llegar a la confirmación del registro del usuario porque hay un CAPTCHA");
	}
}
