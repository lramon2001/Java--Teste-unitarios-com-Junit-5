package br.com.lucasramon.lrbiblioteca.services;

import java.time.LocalDate;
import java.util.List;

import br.com.lucasramon.lrbiblioteca.enums.Reputacao;
import br.com.lucasramon.lrbiblioteca.models.Autor;
import br.com.lucasramon.lrbiblioteca.models.Cliente;
import br.com.lucasramon.lrbiblioteca.models.Emprestimo;
import br.com.lucasramon.lrbiblioteca.models.Obra;

public class EmprestimoService {
    private int dias_para_devolucao =3;
    public Emprestimo novo(Cliente cliente, List<Obra> obras){
        LocalDate dia_do_emprestimo = LocalDate.now();
        if(cliente.getReputacao() == Reputacao.RUIM){
            dias_para_devolucao = 1;
        }
        else if(cliente.getReputacao() == Reputacao.REGULAR){
            dias_para_devolucao = 3;
        }
        else{
            dias_para_devolucao = 5;
        }
        LocalDate dia_para_devolver = LocalDate.now().plusDays(dias_para_devolucao);
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setCliente(cliente);
        emprestimo.setLivros(obras);
        emprestimo.setDataEmprestimo(dia_do_emprestimo);
        emprestimo.setDataDevolucao(dia_para_devolver);
        return emprestimo;
    }
    public int getDias_para_devolucao() {
        return dias_para_devolucao;
    }
    public void setDias_para_devolucao(int dias_para_devolucao) {
        this.dias_para_devolucao = dias_para_devolucao;
    }
    
    
}
