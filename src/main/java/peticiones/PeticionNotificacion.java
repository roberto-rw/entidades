package peticiones;

import entidades.Notificacion;

public class PeticionNotificacion extends AbstractPeticion {

    private Notificacion notificacion;

    public PeticionNotificacion() {
    }

    public PeticionNotificacion(String peticion, String peticionRespuesta, Integer hashcodeSC, String respuesta, Notificacion notificacion) {
        super(peticion, peticionRespuesta, hashcodeSC, respuesta);
        this.notificacion = notificacion;
    }

    public PeticionNotificacion(Notificacion notificacion, String peticion, Integer hashcodeSC, String respuesta) {
        super(peticion, hashcodeSC, respuesta);
        this.notificacion = notificacion;
    }

    public PeticionNotificacion(Notificacion notificacion, String peticion, Integer hashcodeSC) {
        super(peticion, hashcodeSC);
        this.notificacion = notificacion;
    }

    public PeticionNotificacion(Notificacion notificacion, String peticion) {
        super(peticion);
        this.notificacion = notificacion;
    }

    public PeticionNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }
    
    public PeticionNotificacion(String peticion, Integer hashcodeSC, String respuesta, Notificacion notificacion) {
        super(peticion, hashcodeSC, respuesta);
        this.notificacion = notificacion;
    }

    public PeticionNotificacion(String peticion, Integer hashcodeSC, Notificacion notificacion) {
        super(peticion, hashcodeSC);
        this.notificacion = notificacion;
    }

    public PeticionNotificacion(String peticion, Notificacion notificacion) {
        super(peticion);
        this.notificacion = notificacion;
    }

    public Notificacion getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }
}
