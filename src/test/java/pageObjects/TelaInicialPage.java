package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TelaInicialPage {
	
	public static final String xpathPassword = "//android.widget.EditText[@package='com.microsoft.todos']";	
	public static final String idEmail = "com.microsoft.todos:id/email_phone_edit_text";
	public static final String idEditText = "com.microsoft.todos:id/edit_text";
	public static final String xpathListaEditada = "//android.widget.TextView[@text='ListaEditada']";
	
	public TelaInicialPage (AppiumDriver<?> driver) {
		  PageFactory.initElements(new AppiumFieldDecorator(driver), this);		  
	}
	
	@AndroidFindBy(id = idEmail)
	private MobileElement clickInformarEmail;
	
	@AndroidFindBy(id = idEmail)
	private MobileElement campoInformarEmail;
	
	@AndroidFindBy(id = "com.microsoft.todos:id/sign_in_button")
	private MobileElement botaoSignInEmail;
	
	@AndroidFindBy(xpath = xpathPassword)
	private MobileElement clickPassword;
	
	@AndroidFindBy(xpath = xpathPassword)
	private MobileElement informarPassword;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Sign in']")
	private MobileElement botaoSignInPassword;

	@AndroidFindBy(id = "com.microsoft.todos:id/create_list_text_view")
	private MobileElement botaoAddList;
	
	@AndroidFindBy(id = idEditText)
	private MobileElement campoTitleClick;
	
	@AndroidFindBy(id = idEditText)
	private MobileElement campoTitle;
	
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement acionarCreateList;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton")
	private MobileElement botaoVoltar;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Lista1']")
	private MobileElement acionarLista1;
	
	@AndroidFindBy(id = "com.microsoft.todos:id/new_todo_fab")
	private MobileElement acionarAddTarefa;
	
	@AndroidFindBy(id = "com.microsoft.todos:id/create_task_edit_text")
	private MobileElement digitarTarefa;
	
	@AndroidFindBy(id = "com.microsoft.todos:id/create_task_image_button")
	private MobileElement adicionarTarefa;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton")
	private MobileElement clicarVoltar;
	
	@AndroidFindBy(id = "com.microsoft.todos:id/name_background")
	private MobileElement clicarTitulo;
	
	@AndroidFindBy(id = idEditText)
	private MobileElement clicarEditarTexto;
	
	@AndroidFindBy(id = idEditText)
	private MobileElement digitarTextoEditado;
	
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement acionarBotaoSave;
	
	@AndroidFindBy(xpath = xpathListaEditada)
	private MobileElement clicarListaEditada;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='caminhar']")
	private MobileElement clicarTarefa;
	
	@AndroidFindBy(id = "com.microsoft.todos:id/delete")
	private MobileElement acionarBotaoDelete;
	
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement confimarDelete;
	
	@AndroidFindBy(xpath = xpathListaEditada)
	private MobileElement selecionarListaEditada;
	
	@AndroidFindBy(accessibility = "More options")
	private MobileElement clicarOpcoes;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Delete list']")
	private MobileElement clicarDelete;
	
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement confimarDeleteList;
	
	public void acionarBotaoInformarEmail() {
		clickInformarEmail.click();
	}
	
	public void campoInformarEmail(String textoEmail) {
		campoInformarEmail.sendKeys(textoEmail);
	}
	
	public void acionarBotaoSingInEmail() {
		botaoSignInEmail.click();
	}
	
	public void clickPassword() {
		clickPassword.click();
	}
	
	public void campoPassword(String textoPassword) {
		informarPassword.sendKeys(textoPassword);
	}
	
	public void acionarBotaoSignInPassword() {
		botaoSignInPassword.click();
	}
	
	
	public void acionarBotaoAddList() {
		botaoAddList.click();
	}
	
	public void acionarTitle() {
		campoTitleClick.click();
	}
	
	public void informarCampoTitle(String textoTitle) {
		campoTitle.sendKeys(textoTitle);
	}
	
	public void acionarCreateList() {
		acionarCreateList.click();
	}
	
	public void acionarBotaoVoltar( ) {
		botaoVoltar.click();
	}
	
	public void acionarLista1( ) {
		acionarLista1.click();
	}
	
	public void acionarAddTarefa( ) {
		acionarAddTarefa.click();
	}
	
	public void digitarNovaTask(String textoTarefa) {
		digitarTarefa.sendKeys(textoTarefa);
	}
	
	public void clicarNovaTarefa( ) {
		adicionarTarefa.click();
	}
		
	public void selecionarLista1( ) {
		acionarLista1.click();
	}
	
	public void selecionarTitulo( ) {
		clicarTitulo.click();
	}
	
	public void clicarEditarTexto( ) {
		clicarEditarTexto.click();
	}
	
	public void campoDigitarTexto(String campoTexto) {
		digitarTextoEditado.sendKeys(campoTexto);
	}
	
	public void acionarBotaoSave( ) {
		acionarBotaoSave.click();
	}
	
	public void acionarVoltar( ) {
		clicarVoltar.click();
	}
	
	public void clicarListaEditada( ) {
		clicarListaEditada.click();
	}
	
	public void clicarTarefa( ) {
		clicarTarefa.click();
	}
	
	public void acionarDelete( ) {
		acionarBotaoDelete.click();
	}
	
	public void confirmarDelete( ) {
		confimarDelete.click();
	}
	
	public void selecionarListaEditada( ) {
		selecionarListaEditada.click();
	}
	
	public void selecionarOpcoes( ) {
		clicarOpcoes.click();
	}
	
	public void clicarDelete( ) {
		clicarDelete.click();
	}
	
	public void confirmarDeleteList( ) {
		confimarDeleteList.click();
	}
	
	
	
}
