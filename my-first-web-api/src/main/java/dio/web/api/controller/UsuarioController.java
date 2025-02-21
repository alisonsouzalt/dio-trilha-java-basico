package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class UsuarioController {
    @Autowired
    private UserRepository repository;
    @GetMapping("/users")
    public List<Usuario>getUsers(){
        return repository.findAll();
    }
}
