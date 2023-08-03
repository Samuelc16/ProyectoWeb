/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.colegioweb.logica;

import co.edu.sena.colegioweb.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author RYZEN
 */
public class Controladora {
    
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    
    public void registrarEstudiante(Estudiante e){
    
        controladoraPersistencia.resgistrarEstudiante(e);
    }
    
    public List<Estudiante>listarEstudiantes(){
    
        return controladoraPersistencia.listarEstudiantes();
    }

    public void borrarUsuario(int codigo_eliminar) {
        controladoraPersistencia.borrarUsuario(codigo_eliminar);
    }
    
    
}
