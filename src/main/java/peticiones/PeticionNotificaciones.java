/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peticiones;

import entidades.Notificacion;
import entidades.Usuario;
import java.util.List;

/**
 *
 * @author Vastem
 */
public class PeticionNotificaciones extends AbstractPeticion{
    
    private List<Notificacion> notificaciones;
    private Usuario usuario;

    public PeticionNotificaciones() {
    }

    public PeticionNotificaciones(String peticion) {
        super(peticion);
    }
    
    public PeticionNotificaciones(String peticion, Usuario usuario) {
        super(peticion);
        this.usuario = usuario;
    }
    
    public PeticionNotificaciones(String peticion, String peticionRespuesta, Integer hashcodeSC, String respuesta, List<Notificacion> notificaciones, Usuario usuario) {
        super(peticion, peticionRespuesta, hashcodeSC, respuesta);
        this.notificaciones = notificaciones;
        this.usuario = usuario;
    }

    public PeticionNotificaciones(String peticion, String peticionRespuesta, Integer hashcodeSC, String respuesta, List<Notificacion> notificaciones) {
        super(peticion, peticionRespuesta, hashcodeSC, respuesta);
        this.notificaciones = notificaciones;
    }

    public PeticionNotificaciones(String peticion, Integer hashcodeSC, String respuesta, List<Notificacion> publicaciones) {
        super(peticion, hashcodeSC, respuesta);
        this.notificaciones = notificaciones;
    }

    public PeticionNotificaciones(String peticion, List<Notificacion> publicaciones) {
        super(peticion);
        this.notificaciones = notificaciones;
    }

    public PeticionNotificaciones(String peticion, Integer hashcodeSC, List<Notificacion> publicaciones) {
        super(peticion, hashcodeSC);
        this.notificaciones = notificaciones;
    }

    public List<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(List<Notificacion> notificaciones) {
        this.notificaciones = notificaciones;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
    
}
