package peticiones;

import entidades.Comentario;
import java.net.Socket;

public class PeticionComentario extends AbstractPeticion {

    private Comentario comentario;

    public PeticionComentario() {
    }

    public PeticionComentario(String peticion, Integer hashcodeSC, Comentario comentario) {
        super(peticion, hashcodeSC);
        this.comentario = comentario;
    }

    public PeticionComentario( String peticion, Comentario comentario) {
        super(peticion);
        this.comentario = comentario;
    }
    
    

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

}
