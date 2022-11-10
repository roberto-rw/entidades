package peticiones;

import entidades.Comentario;

public class PeticionComentario extends AbstractPeticion {

    private Comentario comentario;

    public PeticionComentario() {
    }

    public PeticionComentario(String peticion, Comentario comentario) {
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
