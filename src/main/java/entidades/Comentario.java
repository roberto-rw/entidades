package entidades;

import jakarta.persistence.*;

import java.util.Calendar;
import java.util.Objects;

@Entity
@Table(name = "comentarios")
public class Comentario {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name = "id_comentario")
    private Long id;

    @Column( name = "fecha")
    private Calendar fecha;

    @OneToOne( cascade = CascadeType.ALL)
    @JoinColumn( name = "id_contenido")
    private Contenido contenido;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "id_publicacion")
    private Publicacion publicacion;

    public Comentario(){}

    public Comentario(Calendar fecha, Contenido contenido, Usuario usuario, Publicacion publicacion) {
        this.fecha = fecha;
        this.contenido = contenido;
        this.usuario = usuario;
        this.publicacion = publicacion;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comentario that = (Comentario) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
