package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CadastroUsuarioPage;
import pages.LoginPage;
import runner.RunCucumber;

import static support.Utils.getRandomEmail;

public class CadastroUsuarioSteps extends RunCucumber {

    LoginPage loginPage = new LoginPage();
    CadastroUsuarioPage cadastroPage = new CadastroUsuarioPage();

    @Dado("^que estou na tela de cadastro de usuário$")
    public void que_estou_na_tela_de_login() {
        loginPage.acessarAplicao();
        loginPage.acessarTelaCadastro();
    }

    @Dado("^preencho todos os campos obrigatórios$")
    public void preencho_campos_obrigatorios() {
        cadastroPage.preencheNome("Eduardo");
        cadastroPage.preencheEmail(getRandomEmail() );
        cadastroPage.preencherSenha("1234567");
    }

    @Quando("^clico em cadastrar$")
    public void clico_cadastrar() {
        cadastroPage.cadastrarUsuario();
    }
    @Entao("^vejo mensagem de usuário cadastrado com sucesso$")
    public void vejo_mensagem_cadastro_sucesso() {
        cadastroPage.verificaCadastroSucesso( element );
    }

}
