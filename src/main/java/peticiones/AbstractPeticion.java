package peticiones;

public abstract class AbstractPeticion {

    private String peticion;

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

    
}
