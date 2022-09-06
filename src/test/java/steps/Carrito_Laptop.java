package steps;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Carrito_Laptop {
	
	
	private ChromeDriver driver = Hooks.getDriver();
	
	
	@When("hace click en el boton de la categoria Laptops")
	public void hace_click_en_el_boton_de_la_categoria_laptops() throws InterruptedException {
	    
		WebElement categoriaLaptop = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]"));
		categoriaLaptop.click();
		Thread.sleep(3000);
	

	}

	@When("Selecciona el primer item llamado Sony vaio i5")
	public void selecciona_el_primer_item_llamado_sony_vaio_i5() throws InterruptedException {
	    
		WebElement laptop = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));
		laptop.click();
	    Thread.sleep(3000);
	    
	}

	@Then("Se abre la pagina principal de la laptop")
	public void se_abre_la_pagina_principal_de_la_laptop() throws InterruptedException  {
		

		Assert.assertEquals(driver.getCurrentUrl(),"https://www.demoblaze.com/prod.html?idp_=8");
		Thread.sleep(3000);
	
	}

	@Then("El usuario clikea en el boton AddToCard")
	public void el_usuario_clikea_en_el_boton_add_to_card() throws InterruptedException {
		
		WebElement addToCard = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
		addToCard.click();
		Thread.sleep(3000);
	    
	}

	@Then("Se debe agregar correctamente al carrito de compras")
	public void se_debe_agregar_correctamente_al_carrito_de_compras() {
	    
		Alert alert = driver.switchTo().alert();
        String message = alert.getText();
        Assert.assertEquals("Product added", message);
        alert.accept();
        
       
	}

}
