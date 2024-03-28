package ec.sasf.pruebaricardovelastegui.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.sasf.pruebaricardovelastegui.Dto.UsuarioDto;
import ec.sasf.pruebaricardovelastegui.Service.UsuarioService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")


public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;


    @PostMapping("/save")
    public String saveUsuario(@RequestBody UsuarioDto usuarioDto){
        String id = usuarioService.addUsuario(usuarioDto);
        return id;
    }

    
}
