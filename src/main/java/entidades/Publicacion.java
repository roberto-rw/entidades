package entidades;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.util.Calendar;
import java.util.Objects;

import jakarta.persistence.*;
import java.util.List;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.IntSequenceGenerator.class,
        property = "@id", scope = Publicacion.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "publicaciones")
public class Publicacion {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_publicacion")
    private Long id;

    @ManyToOne
    @JoinColumn( name = "id_usuario")
    private Usuario usuario;

    @Column( name = "fecha")
    private Calendar fecha;

    @Column( name = "texto")
    private String texto;

    @Lob
    @Column( name = "imagen", length=1000000)
    private byte[] imagen;

    @OneToMany( mappedBy = "publicacion", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Comentario> comentarios;
//
//    @OneToMany( mappedBy = "publicacion", cascade = CascadeType.ALL)
//    private List<Etiqueta> etiquetas;
//
    @OneToMany(mappedBy = "publicacion", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<Hashtag> hashtag;

    public Publicacion() {}

    public Publicacion(Long id) {
        this.id = id;
    }
    
    public Publicacion(Usuario usuario, Calendar fecha, String texto, byte[] imagen) {
        this.usuario = usuario;
        this.fecha = fecha;
        this.texto = texto;
        this.imagen = imagen;
    }

    public Publicacion(Usuario usuario, Calendar fecha, String texto) {
        this.usuario = usuario;
        this.fecha = fecha;
        this.texto = texto;
    }

    public Publicacion(Usuario usuario, Calendar fecha, byte[] imagen) {
        this.usuario = usuario;
        this.fecha = fecha;
        this.imagen = imagen;
    }

    public Long getId() {
        return id;
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

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public List<Hashtag> getHashtag() {
        return hashtag;
    }

    public void setHashtag(List<Hashtag> hashtag) {
        this.hashtag = hashtag;
    }

    
    
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
