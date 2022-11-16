package peticiones;

import java.net.Socket;

public class PeticionLog extends AbstractPeticion {

    private String mensaje;

    public PeticionLog() {
    }

    public PeticionLog(String peticion, Integer hashcodeSC, String respuesta, String mensaje) {
        super(peticion, hashcodeSC, respuesta);
        this.mensaje = mensaje;
    }

    public PeticionLog(String peticion, Integer hashcodeSC, String mensaje) {
        super(peticion, hashcodeSC);
        this.mensaje = mensaje;
    }

    public PeticionLog(String peticion, String mensaje) {
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
