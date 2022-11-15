package peticiones;

import java.net.Socket;

public abstract class AbstractPeticion {

    private String peticion;
    private Integer hashcodeSC;


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

    
    
}
