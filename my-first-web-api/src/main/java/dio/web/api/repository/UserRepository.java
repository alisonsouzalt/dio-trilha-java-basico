package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(Usuario usuario){
        if (usuario.getId()==null){
            System.out.println("SAVE - Recebdno o usuário na camada de repositório");
        } else {
            System.out.println("UPDATE - Recebdno o usuário na camada de repositório");
        }
        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DEELETE/id - Recebendo o id: %d para excluir um usuário"));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Alison", "12345"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("Alison", "12345");
    }
    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário", username));
        return new Usuario("Alison", "12345");
    }

}
