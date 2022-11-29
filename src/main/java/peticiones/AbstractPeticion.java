package peticiones;

import java.net.Socket;

public abstract class AbstractPeticion {

    private String peticion;
    private String peticionRespuesta;
    private Integer hashcodeSC;
    private String respuesta;

    public AbstractPeticion(String peticion, String peticionRespuesta, Integer hashcodeSC, String respuesta) {
        this.peticion = peticion;
        this.peticionRespuesta = peticionRespuesta;
        this.hashcodeSC = hashcodeSC;
        this.respuesta = respuesta;
    }
    
    public AbstractPeticion(String peticion, Integer hashcodeSC, String respuesta) {
        this.peticion = peticion;
        this.hashcodeSC = hashcodeSC;
        this.respuesta = respuesta;
    }
    
    public AbstractPeticion(String peticion, Integer hashcodeSC) {
        this.peticion = peticion;
        this.hashcodeSC = hashcodeSC;
    }

    public AbstractPeticion(String peticion) {
        this.peticion = peticion;
    }
    
    public AbstractPeticion() {
    }

    public String getPeticion() {
        return peticion;
    }

    public void setPeticion(String peticion) {
        this.peticion = peticion;
    }

    public Integer getHashcodeSC() {
        return hashcodeSC;
    }

    public void setHashcodeSC(Integer hashcodeSC) {
        this.hashcodeSC = hashcodeSC;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public String getPeticionRespuesta() {
        return peticionRespuesta;
    }

    public void setPeticionRespuesta(String peticionRespuesta) {
        this.peticionRespuesta = peticionRespuesta;
    }
    
    

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
}
