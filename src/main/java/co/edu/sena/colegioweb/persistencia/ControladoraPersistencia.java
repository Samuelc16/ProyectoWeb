/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.colegioweb.persistencia;

import co.edu.sena.colegioweb.logica.Estudiante;
import co.edu.sena.colegioweb.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RYZEN
 */
public class ControladoraPersistencia {
    
    EstudianteJpaController estudianteJpaController = new EstudianteJpaController(); 
    
    
    
    public void resgistrarEstudiante(Estudiante e){
        
        try {
            estudianteJpaController.create(e);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Estudiante> listarEstudiantes(){
    
        return estudianteJpaController.findEstudianteEntities();
    }

    public void borrarUsuario(int codigo_eliminar) {
        try {
            estudianteJpaController.destroy(codigo_eliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
