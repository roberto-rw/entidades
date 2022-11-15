package peticiones;

import entidades.Usuario;

public class PeticionUsuario extends AbstractPeticion {

    private Usuario usuario;

    public PeticionUsuario() {
    }

    public PeticionUsuario( String peticion, Integer hashcodeSC, Usuario usuario) {
        super(peticion, hashcodeSC);
        this.usuario = usuario;
    }

    public PeticionUsuario( String peticion, Usuario usuario) {
        super(peticion);
        this.usuario = usuario;
    }
    
    

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        
        return super.toString()+"PeticionUsuario{" + "usuario=" + usuario + '}';
    }

    
    
    
    
}
