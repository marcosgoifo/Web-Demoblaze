package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Logout  {
	
	private ChromeDriver driver = Hooks.getDriver();
	
	
	@Given("El usuario se encuentra en la pagina Homepage")
	public void el_usuario_se_encuentra_en_la_pagina_homepage() {
	    
		Assert.assertEquals(Hooks.getTittleHomePage(),driver.getTitle());
		
	}
	@When("hace click en el boton Log in")
	public void hace_click_en_el_boton_log_in() throws InterruptedException {
		
		WebElement bottonLogIn = driver.findElement(By.id("login2"));
		bottonLogIn.click();
	    Thread.sleep(3000);
	    
	}
	@When("Completa el campo Username y Password y clickea en el boton Log in")
	public void completa_el_campo_username_y_password_y_clickea_en_el_boton_log_in() throws InterruptedException {
	   
		WebElement userName1 = driver.findElement(By.id("loginusername"));
	    userName1.sendKeys(Hooks.getUserName());
	    
	    WebElement passWord1 = driver.findElement(By.id("loginpassword"));
	    passWord1.sendKeys(Hooks.getPassWord());
	    
	    WebElement buttonSignUpSubmit = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
	    buttonSignUpSubmit.click();
	    Thread.sleep(3000);
	    
	}
	@Then("Se debe logear correctamente al usuario")
	public void se_debe_logear_correctamente_al_usuario() {
	    
		boolean existeElemento = driver.findElements(By.id("nameofuser")).size() != 0;
		Assert.assertTrue(existeElemento);
							
	}
	
	@Then("El usuario clikea en el boton logout")
	public void el_usuario_clikea_en_el_boton_logout() throws InterruptedException {
		
		WebElement bottonLogOut = driver.findElement(By.id("logout2"));
		bottonLogOut.click();
	    Thread.sleep(3000);
	   
	}
	@Then("Se realizar el Logout correctamente al usuario")
	public void se_realizar_el_logout_correctamente_al_usuario() {
		
		boolean existeElemento = driver.findElements(By.id("nameofuser")).size() == 0;
		Assert.assertFalse(existeElemento);
	 
	}



}
