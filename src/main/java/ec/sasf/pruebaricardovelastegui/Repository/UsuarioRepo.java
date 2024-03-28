package ec.sasf.pruebaricardovelastegui.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import ec.sasf.pruebaricardovelastegui.Entity.Usuario;

@EnableJpaRepositories
@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Long>{
    
}
