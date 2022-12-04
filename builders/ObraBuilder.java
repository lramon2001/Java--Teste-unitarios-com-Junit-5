package br.com.lucasramon.lrbiblioteca.builders;

import java.lang.module.ModuleDescriptor.Builder;

import br.com.lucasramon.lrbiblioteca.enums.Tipo;
import br.com.lucasramon.lrbiblioteca.models.Autor;
import br.com.lucasramon.lrbiblioteca.models.Obra;

public class ObraBuilder {
    private Obra obra;

    public static ObraBuilder builder (Autor autor){
        Obra obra = new Obra();
        obra.setAutor(autor);
        obra.setId(1L);
        obra.setNome("obra_nome");
        obra.setQtdPaginas(100);
        obra.setTipo(Tipo.LIVRO);

        var obraBuilder = new ObraBuilder();
        obraBuilder.setObra(obra);
        return obraBuilder;
    }

    public Obra build(){
        return this.obra;
    }
    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    
}
