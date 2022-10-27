package entidades;

public class BlackBoardObject {
    private String peticion;
    private Usuario usuario;
    private Publicacion publicacion;
    private Comentario comentario;
    private Notificacion notificacion;

    public BlackBoardObject(String peticion, Usuario usuario) {
        this.peticion = peticion;
        this.usuario = usuario;
    }

    public BlackBoardObject(String peticion, Publicacion publicacion) {
        this.peticion = peticion;
        this.publicacion = publicacion;
    }

    public BlackBoardObject(String peticion, Comentario comentario) {
        this.peticion = peticion;
        this.comentario = comentario;
    }

    public BlackBoardObject(String peticion, Notificacion notificacion) {
        this.peticion = peticion;
        this.notificacion = notificacion;
    }

    public String getPeticion() {
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
