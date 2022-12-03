package br.com.lucasramon.lrbiblioteca.models.services;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.lucasramon.lrbiblioteca.enums.Reputacao;
import br.com.lucasramon.lrbiblioteca.models.Autor;
import br.com.lucasramon.lrbiblioteca.models.Cliente;
import br.com.lucasramon.lrbiblioteca.models.Emprestimo;
import br.com.lucasramon.lrbiblioteca.models.Obra;
import br.com.lucasramon.lrbiblioteca.services.EmprestimoService;

public class EmprestimoServiceTeste {

    @Test
    void quandoMetodoNovoForChamadoDeveRetornarEmprestimo() {
        // cenario
        Autor autor = new Autor();
        autor.setNome("Autor_nome");
        autor.setDataNascimento(LocalDate.now());
        autor.setId(1L);
        Cliente cliente = new Cliente();
        cliente.setNome("Cliente_nome");
        cliente.setDataNascimento(LocalDate.now());
        cliente.setId(1L);
        cliente.setReputacao(Reputacao.BOA);
        cliente.setCpf("123.123.123-12");
        Obra obra = new Obra();
        obra.setId(1L);
        obra.setNome("Obra_nome");
        obra.setQtdPaginas(100);
        obra.setAutor(autor);
        // execucao
        EmprestimoService emprestimoService = new EmprestimoService();
        Emprestimo emprestimo = emprestimoService.novo(cliente, List.of(obra));

        // verificacao
        Assertions.assertEquals(cliente, emprestimo.getCliente());
        Assertions.assertEquals(List.of(obra), emprestimo.getLivros());
        Assertions.assertEquals(LocalDate.now(), emprestimo.getDataEmprestimo());
        Assertions.assertEquals(LocalDate.now().plusDays(emprestimoService.getDias_para_devolucao()), emprestimo.getDataDevolucao());

    }

    @Test
    void quandoMetodoNovoForChamadoComClienteDeReputacaoRuimNumeroDeDiasParaDevolucaoDeveSerUm() {
        // cenario
        Autor autor = new Autor();
        autor.setNome("Autor_nome");
        autor.setDataNascimento(LocalDate.now());
        autor.setId(1L);
        Cliente cliente = new Cliente();
        cliente.setNome("Cliente_nome");
        cliente.setDataNascimento(LocalDate.now());
        cliente.setId(1L);
        cliente.setReputacao(Reputacao.RUIM);
        cliente.setCpf("123.123.123-12");
        Obra obra = new Obra();
        obra.setId(1L);
        obra.setNome("Obra_nome");
        obra.setQtdPaginas(100);
        obra.setAutor(autor);
        // execucao
        EmprestimoService emprestimoService = new EmprestimoService();
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
        Autor autor = new Autor();
        autor.setNome("Autor_nome");
        autor.setDataNascimento(LocalDate.now());
        autor.setId(1L);
        Cliente cliente = new Cliente();
        cliente.setNome("Cliente_nome");
        cliente.setDataNascimento(LocalDate.now());
        cliente.setId(1L);
        cliente.setReputacao(Reputacao.REGULAR);
        cliente.setCpf("123.123.123-12");
        Obra obra = new Obra();
        obra.setId(1L);
        obra.setNome("Obra_nome");
        obra.setQtdPaginas(100);
        obra.setAutor(autor);
        // execucao
        EmprestimoService emprestimoService = new EmprestimoService();
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
        Autor autor = new Autor();
        autor.setNome("Autor_nome");
        autor.setDataNascimento(LocalDate.now());
        autor.setId(1L);
        Cliente cliente = new Cliente();
        cliente.setNome("Cliente_nome");
        cliente.setDataNascimento(LocalDate.now());
        cliente.setId(1L);
        cliente.setReputacao(Reputacao.BOA);
        cliente.setCpf("123.123.123-12");
        Obra obra = new Obra();
        obra.setId(1L);
        obra.setNome("Obra_nome");
        obra.setQtdPaginas(100);
        obra.setAutor(autor);
        // execucao
        EmprestimoService emprestimoService = new EmprestimoService();
        Emprestimo emprestimo = emprestimoService.novo(cliente, List.of(obra));

        // verificacao
        Assertions.assertEquals(cliente, emprestimo.getCliente());
        Assertions.assertEquals(List.of(obra), emprestimo.getLivros());
        Assertions.assertEquals(LocalDate.now(), emprestimo.getDataEmprestimo());
        Assertions.assertEquals(LocalDate.now().plusDays(5), emprestimo.getDataDevolucao());

    }
}
