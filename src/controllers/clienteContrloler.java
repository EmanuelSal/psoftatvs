package controllers;

import services.clienteService;
import models.Cliente;

public class clienteContrloler {

    private clienteService clienteService;


    public clienteContrloler(clienteService clienteService) {
        this.clienteService = clienteService;
    }

    public Cliente cadastrarCliente(Cliente cliente) {
       
        if (!cliente.isNull() && cliente.getNome() != null && !cliente.getNome().isEmpty()) {
           return clienteService.cadastrarCliente(cliente);
        } else {
            throw new IllegalArgumentException("Cliente invalido");
        }
    }

    public Cliente buscarCliente(int cpf) {
        String cpfString = String.valueOf(cpf);
        if (!cpfString.isEmpty()) {
            return clienteService.buscarCliente(cpf);
        } else {
            throw new IllegalArgumentException("Cpf invalido ou não encontrado");
        }
    }

    public void editarCliente(Cliente cliente) {
        if (!cliente.isNull() && cliente.getNome() != null && !cliente.getNome().isEmpty()) {
            clienteService.editarCliente(cliente);
        }
    }

    public void deletarCliente() {

    }

    public void listarClientes() {

    }   

    public void listarEnderecos() {

    }



    
}
