package br.com.lucasramon.lrbiblioteca.services;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.lucasramon.lrbiblioteca.builders.AutorBuilder;
import br.com.lucasramon.lrbiblioteca.builders.ClienteBuilder;
import br.com.lucasramon.lrbiblioteca.builders.ObraBuilder;
import br.com.lucasramon.lrbiblioteca.enums.Reputacao;
import br.com.lucasramon.lrbiblioteca.models.Autor;
import br.com.lucasramon.lrbiblioteca.models.Cliente;
import br.com.lucasramon.lrbiblioteca.models.Emprestimo;
import br.com.lucasramon.lrbiblioteca.models.Obra;

public class EmprestimoServiceTeste {
    private static EmprestimoService emprestimoService;

    @BeforeAll
    public static void setup(){
        emprestimoService = new EmprestimoService();
    }
    @Test
    void quandoMetodoNovoForChamadoDeveRetornarEmprestimo() {
        // cenario
        Autor autor = AutorBuilder.builder().build();
        Cliente cliente = ClienteBuilder.builder().build();
        Obra obra = ObraBuilder.builder(autor).build() ;
        // execucao
        Emprestimo emprestimo = emprestimoService.novo(cliente, List.of(obra));
        // verificacao
        Assertions.assertEquals(cliente, emprestimo.getCliente());
        Assertions.assertEquals(List.of(obra), emprestimo.getLivros());
        Assertions.assertEquals(LocalDate.now(), emprestimo.getDataEmprestimo());
        Assertions.assertEquals(LocalDate.now().plusDays(cliente.getReputacao().getDuracaoParaDevolucao()), emprestimo.getDataDevolucao());

    }

    @Test
    void quandoMetodoNovoForChamadoComClienteDeReputacaoRuimNumeroDeDiasParaDevolucaoDeveSerUm() {
        // cenario
        Autor autor = AutorBuilder.builder().build();
        Cliente cliente = ClienteBuilder.builder().reputacao(Reputacao.RUIM).build();
        Obra obra = ObraBuilder.builder(autor).build();
        // execucao
        Emprestimo emprestimo = emprestimoService.novo(cliente, List.of(obra));
        // verificacao
        Assertions.assertEquals(cliente, emprestimo.getCliente());
        Assertions.assertEquals(List.of(obra), emprestimo.getLivros());
        Assertions.assertEquals(LocalDate.now(), emprestimo.getDataEmprestimo());
        Assertions.assertEquals(LocalDate.now().plusDays(1), emprestimo.getDataDevolucao());

    }

    @Test
    void quandoMetodoNovoForChamadoComClienteDeReputacaoRegularNumeroDeDiasParaDevolucaoDeveSerTres() {
        // cenario
        Autor autor = AutorBuilder.builder().build();
        Cliente cliente = ClienteBuilder.builder().reputacao(Reputacao.REGULAR).build();
        Obra obra = ObraBuilder.builder(autor).build();
        // execucao
        Emprestimo emprestimo = emprestimoService.novo(cliente, List.of(obra));
        // verificacao
        Assertions.assertEquals(cliente, emprestimo.getCliente());
        Assertions.assertEquals(List.of(obra), emprestimo.getLivros());
        Assertions.assertEquals(LocalDate.now(), emprestimo.getDataEmprestimo());
        Assertions.assertEquals(LocalDate.now().plusDays(3), emprestimo.getDataDevolucao());

    }


    @Test
    void quandoMetodoNovoForChamadoComClienteDeReputacaoBoaNumeroDeDiasParaDevolucaoDeveSerCinco() {
        // cenario
        Autor autor = AutorBuilder.builder().build();
        Cliente cliente = ClienteBuilder.builder().reputacao(Reputacao.BOA).build();
        Obra obra = ObraBuilder.builder(autor).build();
        // execucao
        Emprestimo emprestimo = emprestimoService.novo(cliente, List.of(obra));
        // verificacao
        Assertions.assertEquals(cliente, emprestimo.getCliente());
        Assertions.assertEquals(List.of(obra), emprestimo.getLivros());
        Assertions.assertEquals(LocalDate.now(), emprestimo.getDataEmprestimo());
        Assertions.assertEquals(LocalDate.now().plusDays(5), emprestimo.getDataDevolucao());

    }

    @Test
    void quandoMetodoNovoRecebeUmClienteNuloDeveLancarAexececaoIllegalArgumentException(){
        //cenario
         // cenario
         Autor autor = AutorBuilder.builder().build();
         Obra obra = ObraBuilder.builder(autor).build();
         // execucao
         var message_exceptions = Assertions.assertThrows(IllegalArgumentException.class, ()->emprestimoService.novo(null, List.of(obra)));
         Assertions.assertEquals("O cliente não pode ser nulo", message_exceptions.getMessage());
    }
    public EmprestimoService getEmprestimoService() {
        return emprestimoService;
    }
    public void setEmprestimoService(EmprestimoService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }
}
