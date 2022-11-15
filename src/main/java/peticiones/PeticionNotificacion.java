package peticiones;

import entidades.Notificacion;

public class PeticionNotificacion extends AbstractPeticion {

    private Notificacion notificacion;

    public PeticionNotificacion(String peticion, Integer hashcodeSC, Notificacion notificacion) {
        super(peticion, hashcodeSC);
        this.notificacion = notificacion;
    }

    public PeticionNotificacion( String peticion, Notificacion notificacion) {
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
