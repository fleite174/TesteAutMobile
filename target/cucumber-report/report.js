$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CriarLista.feature");
formatter.feature({
  "name": "To do microsoft list",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.background({
  "name": "Fazer login",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar a caixa de usuario",
  "keyword": "Quando "
});
formatter.match({
  "location": "CriarListaSteps.euSelecionarACaixaDeUsuario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digitar o email \"maratonaqa2022@outlook.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "CriarListaSteps.digitarOEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar no botao Sign in",
  "keyword": "E "
});
formatter.match({
  "location": "CriarListaSteps.acionarNoBotaoSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clica no campo password",
  "keyword": "E "
});
formatter.match({
  "location": "CriarListaSteps.clicaNoCampoPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"senha1234\"",
  "keyword": "E "
});
formatter.match({
  "location": "CriarListaSteps.informarASenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clica no botao Sign in",
  "keyword": "E "
});
formatter.match({
  "location": "CriarListaSteps.clicaNoBotaoSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario logado",
  "keyword": "Entao "
});
formatter.match({
  "location": "CriarListaSteps.usuarioLogado()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "excluir lista",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@cenario1"
    }
  ]
});
formatter.step({
  "name": "eu clicar na lista \"ListaEditada\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "CriarListaSteps.euClicarNaLista(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar nas opcoes",
  "keyword": "E "
});
formatter.match({
  "location": "CriarListaSteps.clicarNasOpcoes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em delete list",
  "keyword": "E "
});
formatter.match({
  "location": "CriarListaSteps.clicarEmDeleteList()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "confirmar o botao delete",
  "keyword": "E "
});
formatter.match({
  "location": "CriarListaSteps.confirmarOBotaoDelete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "lista deletada",
  "keyword": "Entao "
});
formatter.match({
  "location": "CriarListaSteps.listaDeletada()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});