#language:pt
#encoding: UTF-8

Funcionalidade: To do microsoft list


Contexto: Fazer login
Quando eu selecionar a caixa de usuario
E digitar o email "maratonaqa2022@outlook.com"
E acionar no botao Sign in
E clica no campo password
E informar a senha "senha1234"
E clica no botao Sign in
Entao usuario logado

Cenario: Criar uma lista
Quando eu acionar o botao New List
E clicar no titulo da lista
E digitar o titulo da lista "Lista1"
E acionar o botao create list
E acionar o botao voltar
Entao lista nova é criada

Cenario: adcionar um item
Quando eu selecionar "Lista1"
E clicar no botao adcionar tarefa
E digitar a tarefa "caminhar"
E tocar o botao adcionar
Entao um item e adcionado

Cenario: editar uma lista
Quando eu clicar na "Lista1"
E clicar no titulo
E clica no campo rename
E digitar o nome "ListaEditada"
E clicar em save
Entao Lista editada

Cenario: excluir um item
Quando eu clicar na lista "ListaEditada"
E clicar na tarefa "caminhar"
E clicar na lixeira
E confirmar a opcao delete
Entao item excluido

@cenario1
Cenario: excluir lista
Quando eu clicar na lista "ListaEditada"
E clicar nas opcoes
E clicar em delete list
E confirmar o botao delete
Entao lista deletada



