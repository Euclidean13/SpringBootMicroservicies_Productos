package com.app.oauth.springbootserviciooauth.services;

import com.app.usuarios.commons.springbootserviciousuarioscommons.models.entity.Usuario;

public interface IUsuarioService {
    public Usuario findByUsername(String username);
}
