package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	protected By pesquisar = By.xpath("//input[@id='search']");
	protected By btnPesquisar = By.xpath("//button[@alt='Buscar']");
	protected By selectBota = By.xpath("//img[@alt='Bota Chelsea Shoestock Tratorada Cano Baixo Feminina']");
	protected By selectTamanho = By.xpath("//a[@href='/p/bota-chelsea-shoestock-tratorada-cano-baixo-feminina-preto-O01-5445-006-38']");
	protected By btnComprar = By.xpath("//div[@class='action-buttons-main__cart']");
	protected By resumoCompra = By.xpath("//div[@qa-auto='cart-price']");

}