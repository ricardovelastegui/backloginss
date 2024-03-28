package ec.sasf.pruebaricardovelastegui.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ec.sasf.pruebaricardovelastegui.Dto.UsuarioDto;
import ec.sasf.pruebaricardovelastegui.Entity.Usuario;
import ec.sasf.pruebaricardovelastegui.Repository.UsuarioRepo;
import ec.sasf.pruebaricardovelastegui.Service.UsuarioService;


@Service
public class UsuarioIMPL  implements UsuarioService{


    @Autowired
    private UsuarioRepo usuarioRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addUsuario(UsuarioDto usuarioDto) {
        Usuario usuario = new Usuario(
            usuarioDto.getId(),
            usuarioDto.getUsername(),
            usuarioDto.getEmail(),
            this.passwordEncoder.encode(usuarioDto.getPassword())
        );

        usuarioRepo.save(usuario);
        return usuario.getUsername();
            
        
    }
    
}
