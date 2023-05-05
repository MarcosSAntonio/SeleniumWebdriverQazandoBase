package runner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;



public class RunBase {

static WebDriver driver = new ChromeDriver ();

public static WebDriver getDriver() {
    return driver;
}

public static WebDriver getDriver(String browser) {
    
    if (driver != null) {
        driver.quit ();
    }
    
    switch (browser) {
        case "chrome":
            driver = new ChromeDriver ();
            break;
        case "firefox":
            driver = new FirefoxDriver ();
            break;
        case "edge":
            throw new IllegalArgumentException ( "Edge ainda nao suportado" );
        default:
            throw new IllegalArgumentException ( "Navegador não encontrado! Passe um navegador existente: chrome, forefox ou edge." );
    }
    
    driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));
    return driver;
       }
       
    }
