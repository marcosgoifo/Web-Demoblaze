package steps;


import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SignUp {
	
	private ChromeDriver driver = Hooks.getDriver();
	

	

	@Given("El usuario se encuentra en la pagina Home de demoblaze")
	public void el_usuario_se_encuentra_en_la_pagina_home_de_demoblaze() {
		
		Assert.assertEquals(Hooks.getTittleHomePage(),driver.getTitle());
		
        }
	

	@When("Hace click en el boton Sign up")
	public void hace_click_en_el_boton_sign_up() throws InterruptedException {
		
	    WebElement bottonSignUp = driver.findElement(By.id("signin2"));
	    bottonSignUp.click();
	    Thread.sleep(3000);
	
	    }

	
	@When("Completa el campo Username y Password y clickea en el boton Sign up")
	public void completa_el_campo_username_y_password_y_clickea_en_el_boton_sign_up() throws InterruptedException {
        
        WebElement userName1 = driver.findElement(By.id("sign-username"));
	    userName1.sendKeys(Hooks.getUserName());
	    
	    WebElement passWord1 = driver.findElement(By.id("sign-password"));
	    passWord1.sendKeys(Hooks.getPassWord());
	    
	    WebElement buttonSignUpSubmit = driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));
	    buttonSignUpSubmit.click();
	    Thread.sleep(3000);
	    
	   
	    }
	

	@Then("Se debe dar de alta correctamente al usuario")
	public void se_debe_dar_de_alta_correctamente_al_usuario() {
	    
		Alert alert = driver.switchTo().alert();
        String message = alert.getText();
        Assert.assertEquals("Sign up successful.", message);
        alert.accept();
	    
	   
	   }



	



	
}
