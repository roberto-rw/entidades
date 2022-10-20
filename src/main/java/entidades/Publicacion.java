package entidades;


import java.util.Calendar;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "publicaciones")
public class Publicacion {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_publicacion")
    private Long id;

    @ManyToOne
    @JoinColumn( name = "usuario_id")
    private Usuario usuario;

    @Column( name = "fecha")
    private Calendar fecha;

    @OneToOne( cascade = CascadeType.ALL)
    @JoinColumn( name = "id_contenido")
    private Contenido contenido;

    @OneToMany( mappedBy = "publicacion", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;

    @OneToMany( mappedBy = "publicacion", cascade = CascadeType.ALL)
    private List<Etiqueta> etiquetas;

    @OneToMany(mappedBy = "publicacion", cascade = CascadeType.ALL)
    private List<HashtagPublicacion> hashtagPublicaciones;

    public Publicacion() {}

    public Publicacion(Usuario usuario, Calendar fecha, Contenido contenido) {
        this.usuario = usuario;
        this.fecha = fecha;
        this.contenido = contenido;
    }

    public Publicacion(Usuario usuario, Calendar fecha, Contenido contenido, List<Etiqueta> etiquetas) {
        this.usuario = usuario;
        this.fecha = fecha;
        this.contenido = contenido;
        this.etiquetas = etiquetas;
    }

    public Publicacion(Usuario usuario) {
        this.usuario = usuario;
    }


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public List<Etiqueta> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<Etiqueta> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public Long getId() {
        return id;
    }

    public List<HashtagPublicacion> getHashtagPublicaciones() {
        return hashtagPublicaciones;
    }

    public void setHashtagPublicaciones(List<HashtagPublicacion> hashtagPublicaciones) {
        this.hashtagPublicaciones = hashtagPublicaciones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publicacion that = (Publicacion) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
