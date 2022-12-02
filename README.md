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

Clique [aqui]() para verificar a implementação do teste e [aqui]() para analisar a funcionalidade desenvolvida.

