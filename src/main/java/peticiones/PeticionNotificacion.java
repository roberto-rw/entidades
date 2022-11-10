package peticiones;

import entidades.Notificacion;

public class PeticionNotificacion extends AbstractPeticion{
    private Notificacion notificacion;

    public PeticionNotificacion(Notificacion notificacion, String peticion) {
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
