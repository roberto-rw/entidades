package peticiones;

import entidades.Publicacion;
import java.net.Socket;
import java.util.List;

public class PeticionPublicaciones extends AbstractPeticion{
    private List<Publicacion> publicaciones;

    public PeticionPublicaciones(String peticion,List<Publicacion> publicaciones) {
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
