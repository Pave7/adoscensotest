package adoscensoprueba.adoscensoprueba.steps;

import adoscensoprueba.adoscensoprueba.pages.CrearCuentaPage;
import adoscensoprueba.adoscensoprueba.pages.HomeAdoscensoPage;
import adoscensoprueba.adoscensoprueba.pages.RegistrarPage;
import adoscensoprueba.adoscensoprueba.pages.TipoDePersonaPage;
import net.thucydides.core.annotations.Step;

public class RegistrarPersonaSteps {

	// abrir metodo la pagina 
	
	HomeAdoscensoPage homeAdoscensoPage;
	CrearCuentaPage crearCuentaPage;
	TipoDePersonaPage tipoDePersonaPage;
	RegistrarPage registrarPage;
	
	@Step
	public void abrirPaginaAdoscenso () {
		homeAdoscensoPage.open();
		
	}
	
	@Step
	public void irACrearCuenta() {
		homeAdoscensoPage.irACrearCuenta();
	}
		
	@Step
	public void irAquieroInvertir() {
		crearCuentaPage.quieroInvertir();
	}
		 
	@Step
	public void irAPersonaNatural() {
		tipoDePersonaPage.personaNatural();
	}
	
	
	@Step
	public void registrarPersona(String nombre, String primerApellido, String segundoApellido, String tipoDeIdentificacion,
			String numIdentificacion, String correo, String numCelular, String contrasena) {
		
		registrarPage.registrarPersona(nombre, primerApellido, segundoApellido, tipoDeIdentificacion, numIdentificacion,
				correo, numCelular, contrasena);
	}
}
