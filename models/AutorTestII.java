package br.com.lucasramon.lrbiblioteca.models;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AutorTest {
   
    @Test
    void testaMetodoEstaVivoQuandoAutorTemDataDeFalecimentoNulaDeveRetornarTrue(){
        //cenário
        var autor = new Autor();
        //execução
        var estaVivo = autor.estaVivo();
        //verificação
        Assertions.assertTrue(estaVivo);;

    }

    @Test
    void testaMetodoEstaVivoQuandoAutorTemDataDeFalecimentoPreenchidaDeveRetornarFalse(){
        //cenario
        var autor = new Autor();
        autor.setDataFalecimento(LocalDate.now());
        //execução 
        var estaVivo = autor.estaVivo();
        //verificação
        Assertions.assertFalse(estaVivo);
    }

    

}
