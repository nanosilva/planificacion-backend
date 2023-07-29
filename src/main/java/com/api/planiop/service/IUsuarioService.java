/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.Usuario;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author user
 */
public interface IUsuarioService  {
    public List <Usuario> getUsuarios();
    
    public void saveUsuario(Usuario usuario);
    
    public void deleteUsuario(Long id);
    
    public Usuario findUsuario(Long id);
    
    public Optional<Usuario> findEmailPass(Usuario usuario);
    
}
