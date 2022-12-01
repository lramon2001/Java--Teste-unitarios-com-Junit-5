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
