package entidades;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "hashtag_publicacion")
public class HashtagPublicacion {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id_hashtag_publicacion")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_hashtag")
    private Hashtag hashtag;

    @ManyToOne
    @JoinColumn(name = "id_publicacion")
    private Publicacion publicacion;

    public HashtagPublicacion(){}

    public HashtagPublicacion(Hashtag hashtag, Publicacion publicacion) {
        this.hashtag = hashtag;
        this.publicacion = publicacion;
    }

    public Hashtag getHashtag() {
        return hashtag;
    }

    public void setHashtag(Hashtag hashtag) {
        this.hashtag = hashtag;
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
        HashtagPublicacion that = (HashtagPublicacion) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
