package peticiones;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import entidades.Hashtag;
import entidades.Publicacion;
import java.util.List;

public class PeticionPublicaciones extends AbstractPeticion {

    private List<Publicacion> publicaciones;
    private Hashtag hashtag;

    public PeticionPublicaciones() {
    }

    public PeticionPublicaciones(String peticion) {
        super(peticion);
    }
    
    public PeticionPublicaciones(String peticion, Hashtag hashtag) {
        super(peticion);
        this.hashtag = hashtag;
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

    public Hashtag getHashtag() {
        return hashtag;
    }

    public void setHashtag(Hashtag hashtag) {
        this.hashtag = hashtag;
    }
}
