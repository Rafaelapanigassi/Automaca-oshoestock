package metodo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;

import drivers.Drivers;

public class Metodos extends Drivers {
	
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
		
	}
	public void validarResumoCompra(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, textoCapturado);
	}

}