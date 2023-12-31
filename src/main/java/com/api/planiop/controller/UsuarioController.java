/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.planiop.controller;

import com.api.planiop.model.Usuario;
import com.api.planiop.service.IUsuarioService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@CrossOrigin(origins="*",methods={RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST,RequestMethod.PUT})
public class UsuarioController {
    
    @Autowired
    private IUsuarioService usuarioServ;
    
    @GetMapping("/usuario/ver")
    @ResponseBody
    public List<Usuario> verUsuarios(){
        return usuarioServ.getUsuarios();
    }
    @PostMapping("/usuario/new")
    public void agregarUsuario(@RequestBody Usuario usuario){
        usuarioServ.saveUsuario(usuario);
    }
    
    @DeleteMapping("/usuario/delete/{id}")
    public void borrarUsuario(@PathVariable Long id){
        usuarioServ.deleteUsuario(id);
      
        
    }
    @PostMapping("/login")
    public Optional login(@RequestBody Usuario usuario){
        return usuarioServ.findEmailPass(usuario);
        
    }
}
