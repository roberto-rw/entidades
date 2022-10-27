package entidades;

public class BlackBoardObject {
    private int peticion;
    private Usuario usuario;
    private Publicacion publicacion;
    private Comentario comentario;
    private Notificacion notificacion;

    public BlackBoardObject(int peticion, Usuario usuario) {
        this.peticion = peticion;
        this.usuario = usuario;
    }

    public BlackBoardObject(int peticion, Publicacion publicacion) {
        this.peticion = peticion;
        this.publicacion = publicacion;
    }

    public BlackBoardObject(int peticion, Comentario comentario) {
        this.peticion = peticion;
        this.comentario = comentario;
    }

    public BlackBoardObject(int peticion, Notificacion notificacion) {
        this.peticion = peticion;
        this.notificacion = notificacion;
    }

    public int getPeticion() {
        return peticion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public Notificacion getNotificacion() {
        return notificacion;
    }
}
