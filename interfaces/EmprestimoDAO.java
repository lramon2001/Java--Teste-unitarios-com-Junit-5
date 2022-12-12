package br.com.lucasramon.lrbiblioteca.dao;

import java.util.List;

import br.com.lucasramon.lrbiblioteca.models.Emprestimo;

public interface EmprestimoDAO {

    List<Emprestimo> buscarTodos(); 
    
}
