package peticiones;

import entidades.Publicacion;

public class PeticionPublicacion extends AbstractPeticion {

    private Publicacion publicacion;

    public PeticionPublicacion(String peticion, Integer hashcodeSC, Publicacion publicacion) {
        super(peticion, hashcodeSC);
        this.publicacion = publicacion;
    }

    public PeticionPublicacion( String peticion, Publicacion publicacion) {
        super(peticion);
        this.publicacion = publicacion;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

}
