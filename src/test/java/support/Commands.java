package support;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumber;

import java.time.Duration;

public class Commands extends RunCucumber {

public static void waitElementBeclickble(By element , Duration tempo) {
	WebDriverWait wait = new WebDriverWait ( getDriver () , tempo );
	wait.until ( ExpectedConditions.elementToBeClickable ( element ) );
}

public static void waitElementBeVisible(By element , int tempo) {
	WebDriverWait wait = new WebDriverWait ( getDriver () ,Duration.ofMinutes ( tempo ));
	wait.until ( ExpectedConditions.visibilityOfElementLocated(element));
}

public static void clickElement(By element){
	System.out.println ("###########################");
	try {
		System.out.println ("*************vai clicar no elemento:" + element);
		waitElementBeVisible (element, 10000 );
		getDriver ().findElement ( element ).click ();
		System.out.println ("**********clicou no elemento:" + element);
	} catch (Exception error){
		System.out.println ("**********Aconteceu um erro ao tentar clicar no elemento:" + element);
		System.out.println(error);
	}
	System.out.println ("###########################");
	}

public static void fillFiel(By element,String value){
	System.out.println ("###########################");
	try {
		System.out.println (" vai preecher o campo:" + element);
		waitElementBeclickble (element, Duration.ofDays ( 10000 ) );
		getDriver ().findElement ( element ).sendKeys (value);
		System.out.println (" preencheu o campo:" + element);
	} catch (Exception error){
		System.out.println ("********** Aconteceu um erro ao preencher o campo:" + element);
		System.out.println (error);
	}
	System.out.println ("###########################");
}
public static void checkMessage(By invalidInput , String expectedMessage){
	String actualMessage = ("");
	System.out.println ("###########################");
	try {
		System.out.println (" vai validar menssagem:" + expectedMessage);
		waitElementBeVisible(By.id("swal2-title"), 10000);
		actualMessage= getDriver().findElement(By.className("invalid_input")).getText();
		
		//Quando não der certo, vai quebrar o teste!!!
		Assert.assertEquals( "erro ao validar menssagem",expectedMessage,actualMessage);
		//Quando não der certo, vai quebrar o teste!!!
		
		System.out.println (" validou menssagem:" + expectedMessage);
	}catch (Exception error){
		System.out.println ("**********  Aconteceu um erro ao validar menssagem:" + expectedMessage);
		System.out.println ("**********  Mensagem esperada:" + expectedMessage);
		System.out.println ("**********  Mensagem atual:" + actualMessage);
		System.out.println (error);
		System.out.println ("###########################");
		
	}
}

}