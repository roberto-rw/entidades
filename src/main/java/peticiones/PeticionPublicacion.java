package peticiones;

import entidades.Publicacion;

public class PeticionPublicacion extends AbstractPeticion {

    private Publicacion publicacion;

    public PeticionPublicacion(String peticion, String peticionRespuesta, Integer hashcodeSC, String respuesta, Publicacion publicacion) {
        super(peticion, peticionRespuesta, hashcodeSC, respuesta);
        this.publicacion = publicacion;
    }

    public PeticionPublicacion(String peticion, Integer hashcodeSC, String respuesta,  Publicacion publicacion) {
        super(peticion, hashcodeSC, respuesta);
        this.publicacion = publicacion;
    }

    public PeticionPublicacion(String peticion, Integer hashcodeSC, Publicacion publicacion) {
        super(peticion, hashcodeSC);
        this.publicacion = publicacion;
    }

    public PeticionPublicacion(String peticion, Publicacion publicacion) {
        super(peticion);
        this.publicacion = publicacion;
    }

    public PeticionPublicacion() {
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

}
