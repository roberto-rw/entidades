package entidades;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "contenidos")
public class Contenido {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_contenido")
    private Long id;

    @Column( name = "texto")
    private String texto;

    @Lob
    @Column( name = "imagen")
    private byte[] imagen;

    @OneToOne(mappedBy = "contenido")
    private Publicacion publicacion;

    @OneToOne(mappedBy = "contenido")
    private Comentario comentario;

    public Contenido(){}

    public Contenido(String texto, byte[] imagen, Publicacion publicacion) {
        this.texto = texto;
        this.imagen = imagen;
        this.publicacion = publicacion;
    }

    public Contenido(String texto, byte[] imagen, Comentario comentario) {
        this.texto = texto;
        this.imagen = imagen;
        this.comentario = comentario;
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

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contenido contenido = (Contenido) o;
        return id.equals(contenido.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
