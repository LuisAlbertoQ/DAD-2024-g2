package com.example.mscliente.service.inpm;

import com.example.mscliente.entity.Clientes;
import com.example.mscliente.repository.ClientesRepository;
import com.example.mscliente.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientesServiceinpm  implements ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;


    @Override
    public List<Clientes> listar() {
        return clientesRepository.findAll();
    }

    @Override
    public Clientes guardar(Clientes clientes) {
        return clientesRepository.save(clientes);
    }

    @Override
    public Clientes actualizar(Clientes clientes) {
        return clientesRepository.save(clientes);
    }

    @Override
    public Optional<Clientes> listarPorld(Integer id) {
        return clientesRepository.findById(id);
    }

    @Override
    public void eliminarPorld(Integer id) {
        clientesRepository.deleteById(id);

    }
}
