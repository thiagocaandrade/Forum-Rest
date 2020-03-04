package br.com.alura.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Usuario;
import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	java.util.Optional<Usuario> findByEmail(String email);

}
