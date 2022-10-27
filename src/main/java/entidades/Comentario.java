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

    @Column( name = "texto")
    private String texto;

    @Lob
    @Column( name = "imagen")
    private byte[] imagen;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "id_publicacion")
    private Publicacion publicacion;

    public Comentario(){}

    public Long getId() {
        return id;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
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
