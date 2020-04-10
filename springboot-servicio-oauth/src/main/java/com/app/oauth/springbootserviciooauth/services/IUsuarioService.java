package com.app.oauth.springbootserviciooauth.services;

import com.app.usuarios.commons.springbootserviciousuarioscommons.models.entity.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface IUsuarioService {
    public Usuario findByUsername(String username);
    public Usuario update(Usuario usuario, Long id);
}
