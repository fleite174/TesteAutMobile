package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

public class CriarListaSteps {
	
	TelaInicialPage telaInicial = new TelaInicialPage(driver);
	
	@Quando("eu selecionar a caixa de usuario")
	public void euSelecionarACaixaDeUsuario() {
		telaInicial.acionarBotaoInformarEmail();

	}
	@E("digitar o email {string}")
	public void digitarOEmail(String textoEmail) throws Throwable {
		telaInicial.campoInformarEmail(textoEmail);
	}

	@Quando("acionar no botao Sign in")
	public void acionarNoBotaoSignIn() {
		telaInicial.acionarBotaoSingInEmail();

	}

	@Quando("clica no campo password")
	public void clicaNoCampoPassword() {
		telaInicial.clickPassword();

	}

	@Quando("informar a senha {string}")
	public void informarASenha(String textoPassword) {
		telaInicial.campoPassword(textoPassword);
		
	}

	@Quando("clica no botao Sign in")
	public void clicaNoBotaoSignIn() {
		telaInicial.acionarBotaoSignInPassword();
	}

	@Entao("usuario logado")
	public void usuarioLogado() {
		
	}
	
	@Quando("eu acionar o botao New List")
	public void euAcionarOBotaoNewList() {
		telaInicial.acionarBotaoAddList();

	}
	
	@E("^clicar no titulo da lista$")
	public void clicarNoTituloDaLista() throws Throwable {
		telaInicial.acionarTitle();
		
	}

	@Quando("digitar o titulo da lista {string}")
	public void digitarOTituloDaLista(String textoTitle) {
		telaInicial.informarCampoTitle(textoTitle);

	}

	@Quando("acionar o botao create list")
	public void acionarOBotaoCreateList() {
		telaInicial.acionarCreateList();

	}

	@Quando("acionar o botao voltar")
	public void acionarOBotaoVoltar() {
		telaInicial.acionarBotaoVoltar();
		
	}
	

	@Entao("lista nova é criada")
	public void listaNovaÉCriada() {

	}
	
	@Quando("eu selecionar {string}")
	public void euSelecionar(String textoLista) {
		telaInicial.acionarLista1();

	}

	@Quando("clicar no botao adcionar tarefa")
	public void clicarNoBotaoAdcionarTarefa() {
		telaInicial.acionarAddTarefa();

	}

	@Quando("digitar a tarefa {string}")
	public void digitarATarefa(String textoNovoItem) {
		telaInicial.digitarNovaTask(textoNovoItem);

	}
	
	@Quando("tocar o botao adcionar")
	public void tocarOBotaoAdcionar() {
		telaInicial.clicarNovaTarefa();

	}

	@Entao("um item e adcionado")
	public void umItemEAdcionado() throws Throwable {

	}
	
	@Quando("eu clicar na {string}")
	public void euClicarLista1(String textoLista) {
		telaInicial.acionarLista1();

	}
	
	@Quando("clicar no titulo")
	public void clicarNoTitulo() {
		telaInicial.selecionarTitulo();

	}

	@Quando("clica no campo rename")
	public void clicaNoCampoRename() {
		telaInicial.clicarEditarTexto();

	}

	@Quando("digitar o nome {string}")
	public void digitarONome(String textoNome) {
		telaInicial.campoDigitarTexto(textoNome);

	}

	@Quando("clicar em save")
	public void clicarEmSave() {
		telaInicial.acionarBotaoSave();

	}

	@Entao("Lista editada")
	public void listaEditada() {
		
	}
	
	@Quando("eu clicar na lista {string}")
	public void euClicarNaLista(String textoListaEditada) {
		telaInicial.clicarListaEditada();

	}

	@Quando("clicar na tarefa {string}")
	public void clicarNaTarefa(String textoTarefa) {
		telaInicial.clicarTarefa();

	}

	@Quando("clicar na lixeira")
	public void clicarNaLixeira() {
		telaInicial.acionarDelete();

	}

	@Quando("confirmar a opcao delete")
	public void confirmarAOpcaoDelete() {
		telaInicial.confirmarDelete();

	}

	@Entao("item excluido")
	public void itemExcluido() {

	}
	
	@Quando("eu clicar na ListaEditada {string}")
	public void ClicarListaEditada(String textoListaEditada) {
		telaInicial.selecionarListaEditada();
	}
			
	@Quando("clicar nas opcoes")
	public void clicarNasOpcoes() {
		telaInicial.selecionarOpcoes();

	}

	@Quando("clicar em delete list")
	public void clicarEmDeleteList() {
		telaInicial.clicarDelete();

	}

	@Quando("confirmar o botao delete")
	public void confirmarOBotaoDelete() {
		telaInicial.confirmarDeleteList();

	}

	@Entao("lista deletada")
	public void listaDeletada() {
		assertTrue(driver.findElements(By.xpath("//android.widget.TextView[@text='ListaEditada']")).size()<1);
		
	}

}
