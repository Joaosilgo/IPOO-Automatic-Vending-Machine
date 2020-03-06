# Relatório Mini-Projeto 3
## Introdução á Programação Orientada por Objetos

### Ano Letivo: 2015/2016

### Professor Fausto

## Máquina de venda automática

### Hugo Pereira nº 150 221 038
### João Gomes nº 150 221 001

## Introdução

Neste projeto iremos desenvolver utilizando a linguagem java e a Programação orientadada por objetos (POO), uma aplicação que tem como objetivo o controlo e a gestão de uma máquina de vendas automática.
Está irá possuir produtos alimentares, sendo a função a aquisição destes ao público.
A máquina ira permitir operações de venda destes mesmos produtos, que estarão localizados na máquina por compartimentos organizados por cada tipo de produto.
A sua aquisição irá ser feita a partir de um cartão eletrónico com saldo que debita automaticamente, quando o produto tenha sido adquirido.
A máquina também ira possuir uma classe independente que irá simular as operações de gestão da mesma.
Sendo assim possível introduzir, retirar ou substituir os produtos na máquina para assegurar a sua manutenção e bom funcionamento.

## Desenvolvimento
Este projeto foi desenvolvido utilizando a linguagem Java, colocando em prática os seus conceitos fundamentais do paradigma de Programação Orientada por Objetos, utilizando as regras de codificação convencionais do java nomeadamente notação camelCase, para todos os nomes dos métodos e os seus parâmetros sejam de variável local ou atributos definidos, e também utilizamos a notação PascalCase para identificar todos os nomes das classes. A implementação deste programa consiste em entidades que se convergem entre si para representar os elementos.
Os objetivos desta aplicação é recriar uma máquina de vendas automática.
As classes que se convergem para criar esta aplicação são:

* Cartão: A classe cartão foi implementada pra recriar o um cartão eletrónico recarregável com saldo.
Este possui uma identificação única gerado aleatoriamente e automaticamente quando se cria o cartão, no momento da sua criação este este é gerado logo com saldo não podendo ultrapassar o limite de 10€.
O cartão também possui métodos para o carregar, saber o dinheiro disponível atual e a sua identificação, vai também ser possível pagar com o cartão onde o preço do produto irá se descontado no saldo disponível.
Produto: Está classe irá criar um produto com um determinado nome e preço, irá ter metodologia para converter o saldo do cartão em euros, irá também ter um método toString(), que ira retornar toda a informação essencial do produto sendo: preço e nome.

* MaquinaAutomatica: Esta é uma das classes mais importantes, pois irá efetuar quase todos os métodos disponíveis da máquina automática.
Quando está é criada recebe um número de identificação e é reiniciada, quando reiniciada, ela cria um novo código secreto e um novo HashMap para guardar as referências dos produtos.
Esta classe tem métodos que geram códigos secretos aleatoriamente, e métodos para escolher a prateleira e a coluna desejada, irá também ser permitido confirmar (Ok()) e cancelar (cancel()) as operações de escolha de produto, depois de confirmada a compra será permitido a compra do produto.

* Gestor: A manutenção da máquina é feita a partir do gestor que pode adicionar, retirar ou substituir os produtos da máquina. As operações são simuladas utilizando um método que recebe o código “secreto. Este pode também reiniciar a máquina.

* Maquina: Está classe é responsável pela utilização do Scanner para ler os dados que o utilizador insere na maquina.

##  Conclusão
Com este projeto podemos desenvolver mais a nossa capacidade de implementação visto que tivemos mais liberdade para implementar as entidades de um modo a assegurar uma alta coesão de código, pois devido á escassez de tempo não conseguimos terminar o projeto a tempo, visto que surgiu uns problemas iniciais no esclarecimento do enunciado e na forma de representar os produtos na máquina.
