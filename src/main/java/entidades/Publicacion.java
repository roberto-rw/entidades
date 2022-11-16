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

    //@ManyToOne
    //@JoinColumn( name = "id_usuario")
    @Column( name = "id_usuario")
    private Long idUsuario;

    @Column( name = "fecha")
    private Calendar fecha;

    @Column( name = "texto")
    private String texto;

    @Lob
    @Column( name = "imagen")
    private byte[] imagen;

//    @OneToMany( mappedBy = "publicacion", cascade = CascadeType.ALL)
//    private List<Comentario> comentarios;
//
//    @OneToMany( mappedBy = "publicacion", cascade = CascadeType.ALL)
//    private List<Etiqueta> etiquetas;
//
//    @OneToMany(mappedBy = "publicacion", cascade = CascadeType.ALL)
//    private List<HashtagPublicacion> hashtagPublicaciones;

    public Publicacion() {}

    public Publicacion(Long usuario, Calendar fecha, String texto, byte[] imagen) {
        this.idUsuario = usuario;
        this.fecha = fecha;
        this.texto = texto;
        this.imagen = imagen;
    }

    public Publicacion(Long usuario, Calendar fecha, String texto) {
        this.idUsuario = usuario;
        this.fecha = fecha;
        this.texto = texto;
    }

    public Publicacion(Long usuario, Calendar fecha, byte[] imagen) {
        this.idUsuario = usuario;
        this.fecha = fecha;
        this.imagen = imagen;
    }

    public Long getId() {
        return id;
    }

    public Long getUsuario() {
        return idUsuario;
    }

    public void setUsuario(Long usuario) {
        this.idUsuario = usuario;
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

//    public List<Comentario> getComentarios() {
//        return comentarios;
//    }
//
//    public void setComentarios(List<Comentario> comentarios) {
//        this.comentarios = comentarios;
//    }
//
//    public List<Etiqueta> getEtiquetas() {
//        return etiquetas;
//    }
//
//    public void setEtiquetas(List<Etiqueta> etiquetas) {
//        this.etiquetas = etiquetas;
//    }
//
//    public List<HashtagPublicacion> getHashtagPublicaciones() {
//        return hashtagPublicaciones;
//    }
//
//    public void setHashtagPublicaciones(List<HashtagPublicacion> hashtagPublicaciones) {
//        this.hashtagPublicaciones = hashtagPublicaciones;
//    }

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
