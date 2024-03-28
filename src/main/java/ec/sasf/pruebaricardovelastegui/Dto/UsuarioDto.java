package ec.sasf.pruebaricardovelastegui.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {

    private Long id;
    private String username;

    private String email;
    private String password;

    @Override
    public String toString() {
        return "UsuarioDto{" + "id=" + id + ", username='" + username + '\'' + ", email='" + email + '\'' + ", password='" + password + '\'' + '}';
    }
    
}
