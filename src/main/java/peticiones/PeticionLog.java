package peticiones;

public class PeticionLog extends AbstractPeticion{
    private String mensaje;

    public PeticionLog(){}

    public PeticionLog(String peticion, String mensaje){
        super(peticion);
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
