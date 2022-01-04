package kasepulvida.service;

import kasepulvida.model.Cliente;
import kasepulvida.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClientesRepository repository;

    @Autowired
    public ClienteService (ClientesRepository repository){
        this.repository = repository;
    }

    @Autowired
    public void setRepository(ClientesRepository repository) {
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){

    }
}
