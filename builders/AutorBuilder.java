package br.com.lucasramon.lrbiblioteca.builders;

import java.time.LocalDate;

import br.com.lucasramon.lrbiblioteca.models.Autor;

public class AutorBuilder {
    private Autor autor;

    public static AutorBuilder builder(){
        var autor = new Autor();
        autor.setId(1L);
        autor.setDataNascimento(LocalDate.now().minusYears(50));
        autor.setDataFalecimento(LocalDate.now());
        autor.setNome("nome_autor");
        var autorBuilder = new AutorBuilder();
        autorBuilder.setAutor(autor);
        return autorBuilder;
    }

    public Autor build(){
        return this.autor;
    }
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    

}

