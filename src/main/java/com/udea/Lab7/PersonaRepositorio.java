/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.LabWebServices;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author juand
 */
public interface PersonaRepositorio  extends Repository<Persona, Integer>{
    List<Persona>findAll();
    Persona findById(int id);
    Persona save(Persona p);
     void delete(Persona p);
        
    
}
