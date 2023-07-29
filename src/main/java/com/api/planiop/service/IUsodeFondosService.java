/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.planiop.service;

import com.api.planiop.model.UsodeFondos;
import java.util.List;

/**
 *
 * @author user
 */
public interface IUsodeFondosService {
    
    public List <UsodeFondos> getUsodeFondos();
    
    public void saveUsodeFondos(UsodeFondos usodefondo);
    
    public void deleteUsodeFondos(Long id);
    
    public UsodeFondos findUsodeFondos(Long id);
    
}
