package br.com.lucasramon.lrbiblioteca.services;

import java.time.LocalDate;
import java.util.List;

import br.com.lucasramon.lrbiblioteca.enums.Reputacao;
import br.com.lucasramon.lrbiblioteca.models.Autor;
import br.com.lucasramon.lrbiblioteca.models.Cliente;
import br.com.lucasramon.lrbiblioteca.models.Emprestimo;
import br.com.lucasramon.lrbiblioteca.models.Obra;

public class EmprestimoService {
    
    public Emprestimo novo(Cliente cliente, List<Obra> obras){
        LocalDate dia_do_emprestimo = LocalDate.now();
       if(cliente == null)
       {
        throw new IllegalArgumentException("O cliente não pode ser nulo");
       }
        LocalDate dia_para_devolver = LocalDate.now().plusDays(cliente.getReputacao().getDuracaoParaDevolucao());
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setCliente(cliente);
        emprestimo.setLivros(obras);
        emprestimo.setDataEmprestimo(dia_do_emprestimo);
        emprestimo.setDataDevolucao(dia_para_devolver);
        return emprestimo;
    }
   
    
}
