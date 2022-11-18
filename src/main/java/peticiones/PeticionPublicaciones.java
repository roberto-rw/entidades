package peticiones;

import entidades.Publicacion;
import java.util.List;

public class PeticionPublicaciones extends AbstractPeticion {

    private List<Publicacion> publicaciones;

    public PeticionPublicaciones() {
    }

    public PeticionPublicaciones(String peticion) {
        super(peticion);
    }

    public PeticionPublicaciones(String peticion, String peticionRespuesta, Integer hashcodeSC, String respuesta, List<Publicacion> publicaciones) {
        super(peticion, peticionRespuesta, hashcodeSC, respuesta);
        this.publicaciones = publicaciones;
    }

    public PeticionPublicaciones(String peticion, Integer hashcodeSC, String respuesta, List<Publicacion> publicaciones) {
        super(peticion, hashcodeSC, respuesta);
        this.publicaciones = publicaciones;
    }

    public PeticionPublicaciones(String peticion, List<Publicacion> publicaciones) {
        super(peticion);
        this.publicaciones = publicaciones;
    }

    public PeticionPublicaciones(String peticion, Integer hashcodeSC, List<Publicacion> publicaciones) {
        super(peticion, hashcodeSC);
        this.publicaciones = publicaciones;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

}
