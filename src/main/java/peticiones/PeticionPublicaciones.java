package peticiones;

import entidades.Publicacion;
import java.util.List;

public class PeticionPublicaciones extends AbstractPeticion{
    private List<Publicacion> publicaciones;

    public PeticionPublicaciones(List<Publicacion> publicaciones, String peticion) {
        super(peticion);
        this.publicaciones = publicaciones;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
    
}
