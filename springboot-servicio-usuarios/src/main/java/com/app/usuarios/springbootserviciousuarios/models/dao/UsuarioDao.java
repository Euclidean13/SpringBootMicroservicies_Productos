package com.app.usuarios.springbootserviciousuarios.models.dao;

import com.app.usuarios.commons.springbootserviciousuarioscommons.models.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

// This annotation automatically adds CRUD RestAPI access
@RepositoryRestResource(path = "usuarios")
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long> {

    // For personalizing the url and the parameters
    @RestResource(path = "buscar-username")
    public Usuario findByUsername(@Param("nombre") String username);

    // If we want to find by more than one attribute just add And + Attribute_Name
    // public Usuario findByUsernameAndEmail(String username, String email);

    // To do a personalized query
    @Query("select u from Usuario u where u.username = ?1")
    public Usuario obtenerPorUsername(String username);
}
