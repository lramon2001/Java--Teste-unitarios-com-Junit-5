package br.com.lucasramon.lrbiblioteca.builders;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.lucasramon.lrbiblioteca.enums.Reputacao;
import br.com.lucasramon.lrbiblioteca.models.Cliente;

public class ClienteBuilder {
    private Cliente cliente;
    //String nome, LocalDate dataNascimento, String cpf, Reputacao reputacao

    public static ClienteBuilder builder(){
        var cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("nome_cliente");
        cliente.setCpf("123.123.123-12");
        cliente.setDataNascimento(LocalDate.now().minusYears(30));
        cliente.setReputacao(Reputacao.REGULAR);

        var clienteBuilder = new ClienteBuilder();
        clienteBuilder.setCliente(cliente);

        return clienteBuilder;
    }

    public Cliente build(){
        return this.cliente;
    }

    public ClienteBuilder reputacao(Reputacao reputacao){
        this.cliente.setReputacao(reputacao);
        return this;

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
}
