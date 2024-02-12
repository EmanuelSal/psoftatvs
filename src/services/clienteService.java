package services;

import models.Cliente;

public class clienteService {

    clienteRepository clienteRepository;

    public clienteService(clienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente cadastrarCliente(Cliente cliente) {
        Cliente clienteCadastrado = new Cliente(cliente.getNome(), cliente.getEmail(), cliente.getEndereco(), cliente.getCpf());
        clienteRepository.save(clienteCadastrado);
        return clienteCadastrado;
    }

    public Cliente buscarCliente(int cpf) {
        return clienteRepository.buscarCliente(cpf);
    }

    public void editarCliente(Cliente cliente) {
        
        Cliente clienteBuscado = clienteRepository.buscarCliente(cliente.getCpf());
        
        if (!clienteBuscado.isNull()) {
            
            clienteBuscado.setCpf(cliente.getCpf());
            clienteBuscado.setEmail(cliente.getEmail());
            clienteBuscado.setEndereco(cliente.getEndereco());
            clienteBuscado.setNome(cliente.getNome());

            clienteRepository.editarCliente(clienteBuscado);
        }

        else {
            throw new IllegalArgumentException("Cliente não encontrado");
        }
    }

}
