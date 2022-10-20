package entidades;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name = "etiquetas")
public class Etiqueta {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_etiqueta")
    private Long id;

    @ManyToOne
    @JoinColumn( name = "id_publicacion")
    private Publicacion publicacion;

    @ManyToOne
    @JoinColumn( name = "etiquetado")
    private Usuario etiquetado;

    private Etiqueta(){}
    public Etiqueta(Publicacion publicacion, Usuario etiquetado) {
        this.publicacion = publicacion;
        this.etiquetado = etiquetado;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Usuario getEtiquetado() {
        return etiquetado;
    }

    public void setEtiquetado(Usuario etiquetado) {
        this.etiquetado = etiquetado;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etiqueta etiqueta = (Etiqueta) o;
        return id.equals(etiqueta.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
