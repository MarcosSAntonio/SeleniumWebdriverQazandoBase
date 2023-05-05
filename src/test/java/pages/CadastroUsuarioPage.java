package pages;

import org.openqa.selenium.By;
import runner.RunCucumber;

import static support.Commands.*;

public class CadastroUsuarioPage extends RunCucumber {

    // elementos
    private final By campoNome = By.id("user");
    private final By campoEmail = By.id("email");
    private final By campoSenha = By.id("password");
    private final By botaoFazerCadastro= By.id("btnRegister");

    // ações / funções / métodos
    public void preencheNome(String nome){
        fillFiel ( campoNome,nome);
        
    }
    public void preencheEmail(String email){
        fillFiel (campoEmail,email);
        
    }

    public void preencherSenha(String senha){
        fillFiel (campoSenha,senha);
     
    }

    public void cadastrarUsuario(){
         clickElement(botaoFazerCadastro );
        
    }

    public void verificaCadastroSucesso(String element){
        checkMessage(By.id("swal2-title"),"Cadastro realizado!"  );
        
    }
}
