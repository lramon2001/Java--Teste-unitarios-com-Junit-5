# Java--Teste-unitários-com-Junit-5
Java- Teste unitários com Junit 5 :coffee: :heavy_check_mark: - Repositório criado para documentar o processo de aprendizagem da ferramenta JUnt 5

## Aula 1

Na aula 1 foi demonstrado como adicionar o junit como dependência maven e como efetuar o primeiro.

Dependência adicionada ao pom.xml:
```xml 
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>s
    <version>5.9.1</version>
</dependency>
```
## Aula 2

Na aula 2 foi demonstrado como codificar um método da forma mais simples possível assim como a estrutura básica de uma classe de teste (cenário,execução e verificação).

Deixarei aqui um exemplo de teste automátizado e o link para a classe que implementa outros casos de teste.

```java
   @Test
    void testaMetodoEstaVivoQuandoAutorTemDataDeFalecimentoNulaDeveRetornarTrue(){
        //cenário
        var autor = new Autor();
        //execução
        var estaVivo = autor.estaVivo();
        //verificação
        Assertions.assertEquals(true, estaVivo);

    }
```
- Clique [aqui](https://github.com/lramon2001/Java--Teste-unitarios-com-Junit-5/blob/main/models/AutorTest.java) para verificar as implementações.
## Aula 3

Na aula 3 o professor explorou os diversos métodos estáticos da classe Assertions. Desta forma,modifiquei os métodos para utilizar os métodos Assertions.assertTrue() e Assertions.assertFalse();

```java
  @Test
    void testaMetodoEstaVivoQuandoAutorTemDataDeFalecimentoNulaDeveRetornarTrue(){
        //cenário
        var autor = new Autor();
        //execução
        var estaVivo = autor.estaVivo();
        //verificação
        Assertions.assertTrue(estaVivo);;

    }
```

Clique [aqui](https://github.com/lramon2001/Java--Teste-unitarios-com-Junit-5/blob/main/models/AutorTestII.java) para verificar as implementações.

## Aula 4

Na aula 4 foi demonstrado a famosa técnica do TDD (Test Driven Development) que seria o desenvolvimento orientado a testes. O TDD é pautado em três etapas:
- Escrevemos um Teste que inicialmente não passa (Red);
- Adicionamos uma nova funcionalidade do sistema;
- Fazemos o Teste passar (Green);
- Refatoramos o código da nova funcionalidade (Refactoring).

No nosso caso implementamos a funcionalidade de empréstimo na camada serviço da biblioteca e escrevemos o teste (antes) para a funcionalidade.

Clique [aqui](https://github.com/lramon2001/Java--Teste-unitarios-com-Junit-5/blob/main/services/EmprestimoServiceTest.java) para verificar a implementação do teste e [aqui](https://github.com/lramon2001/Java--Teste-unitarios-com-Junit-5/blob/main/services/EmprestimoService.java) para analisar a funcionalidade desenvolvida.

## Aula 5
Na aula 5 o professor sugeriu que refatorassemos o código da funcionalidade para que, dessa forma, garantir aumento na legibilidade e qualidade do código. Caso deseje verificar a minha refatoração que consistiu em retirar um magic number e outros code smell basta clicar [aqui](https://github.com/lramon2001/Java--Teste-unitarios-com-Junit-5/blob/main/services/EsprestimoServiceRefatorado.java);

## Aula 6
Na aula 6 o professor sugeriu mais um exercicio do TDD. Desta forma implementei um método que modifica o prazo para devolução de acordo com a reputação do autor. A implementação está disponível [aqui]() e os testes estão disponiveis [aqui]().

## Aula 7
Na aula 7 o professor sugeriu que fizessemos uma refatorção do código para finalizar as etapas do TDD. Diante dessa tarefa, melhorei a qualidade do código retirando os if,else if e else alinhados e adicionando um método abstrado para o enum. Esse tipo de pattern é conhecido com strategy pattern
Clique [aqui](https://github.com/lramon2001/Java--Teste-unitarios-com-Junit-5/blob/main/enums/Reputacao.java) para conferir a implementação dos métodos abstratos e aqui para olhar a implementação do método após a refatoração.

