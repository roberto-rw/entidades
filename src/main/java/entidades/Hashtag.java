package entidades;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "hashtags")
public class Hashtag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hashtag")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "hashtag", cascade = CascadeType.ALL)
    private List<HashtagPublicacion> hashtagPublicaciones;

    public Hashtag() {}

    public Hashtag(String nombre) {
        this.nombre = nombre;
    }

    public Hashtag(String nombre, List<HashtagPublicacion> hashtagPublicaciones) {
        this.nombre = nombre;
        this.hashtagPublicaciones = hashtagPublicaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<HashtagPublicacion> getHashtagPublicaciones() {
        return hashtagPublicaciones;
    }

    public void setHashtagPublicaciones(List<HashtagPublicacion> hashtagPublicaciones) {
        this.hashtagPublicaciones = hashtagPublicaciones;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hashtag hashtag = (Hashtag) o;
        return id.equals(hashtag.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
