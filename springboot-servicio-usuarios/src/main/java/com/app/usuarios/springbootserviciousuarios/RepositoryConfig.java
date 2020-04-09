package com.app.usuarios.springbootserviciousuarios;

import com.app.usuarios.commons.springbootserviciousuarioscommons.models.entity.Role;
import com.app.usuarios.commons.springbootserviciousuarioscommons.models.entity.Usuario;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Usuario.class, Role.class);
    }
}
