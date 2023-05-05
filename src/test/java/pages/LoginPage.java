package pages;

import org.openqa.selenium.By;
import runner.RunCucumber;

import static support.Commands.*;

public class LoginPage extends RunCucumber {

private final By botaoAcessarLogin = By.cssSelector(".right_list_fix > li > a > .fa-user");
    private final By campoEmail = By.id("user");
    private final By campoSenha = By.id("password");
    private final By botaoFazerLogin = By.id("btnLogin");
    private final By botaoAcessarCadastro = By.cssSelector(".right_list_fix > li > a > .fa-lock");

    // ações / funções / métodos
    public void acessarAplicao() {
        // elementos
        String URL = "http://automationpratice.com.br/";
        getDriver("chrome").get( URL );
    }

    public void acessarTelaLogin() {
    clickElement(botaoAcessarLogin);
    }

    public void preencheEmail(String email){
        fillFiel ( campoEmail,email );
        
    }

    public void preencherSenha(String senha){
        fillFiel ( campoSenha, senha);
       
    }

    public void clicarLogin(){
        clickElement ( botaoFazerLogin );
    }

    public void verificaLoginSucesso(){
        checkMessage(By.id("swal2-title"),"login realizado" );
       
    }

    public void verificaCampoVazio(String message){
        checkMessage(By.className("invalid_input"),message);
        
          }

    public void acessarTelaCadastro(){
        clickElement ( botaoAcessarCadastro );
    }

}
