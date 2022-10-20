package entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "notificaciones")
public class Notificacion {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id_notificacion")
    private Long id;

    @ManyToOne
    @JoinColumn( name = "id_destinatario")
    private Usuario destinatario;

    @Column(name = "mensaje")
    private String mensaje;
}
