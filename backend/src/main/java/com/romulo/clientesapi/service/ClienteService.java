package com.romulo.clientesapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.romulo.clientesapi.model.Cliente;
import com.romulo.clientesapi.repository.ClienteRepository;

/**
 * Camada de serviço responsável pelas regras de negócio
 * relacionadas à entidade Cliente.
 */
@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    /**
     * Retorna todos os clientes cadastrados no banco de dados.
     *
     * @return lista com todos os clientes
     */
    public List<Cliente> listar() {
        return repository.findAll();
    }

    /**
     * Salva um novo cliente ou atualiza um existente.
     *
     * @param cliente objeto com os dados a serem persistidos
     * @return cliente salvo com ID gerado
     */
    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    /**
     * Remove um cliente pelo seu identificador.
     *
     * @param id identificador do cliente a ser removido
     */
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}