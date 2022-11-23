

package entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

@Entity
@Table( name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_usuario")
    private Long id;

    @Column( name = "usuario")
    private String usuario;

    @Column( name = "password")
    private String password;

    @Column( name = "correo")
    private String correo;

    @Column( name = "numero")
    private String numeroCelular;

    @Column( name = "fecha_nacimiento")
    private Calendar fechaNacimiento;

    @Column( name = "sexo")
    @Enumerated (EnumType.STRING)
    private Sexo sexo;

    @Lob
    @Column( name = "imagen_perfil")
    private byte[] imagenPerfil;

    @OneToMany( mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Publicacion> publicaciones;

//    @OneToMany( mappedBy = "etiquetado", cascade = CascadeType.ALL)
//    private List<Etiqueta> etiquetas;
//
//    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
//    private List<Comentario> comentarios;

    public Usuario(){}

    public Usuario(String usuario, String password, String correo, String numeroCelular, Calendar fechaNacimiento, Sexo sexo, byte[] imagenPerfil) {
        this.usuario = usuario;
        this.password = password;
        this.correo = correo;
        this.numeroCelular = numeroCelular;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.imagenPerfil = imagenPerfil;
    }

    public Usuario(String usuario){
        this.usuario = usuario;
    }

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }
    
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public byte[] getImagenPerfil() {
        return imagenPerfil;
    }

    public void setImagenPerfil(byte[] imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

//    public List<Publicacion> getPublicaciones() {
//        return publicaciones;
//    }
//
//    public void setPublicaciones(List<Publicacion> publicaciones) {
//        this.publicaciones = publicaciones;
//    }

    public Long getId() {
        return id;
    }

//    public List<Etiqueta> getEtiquetas() {
//        return etiquetas;
//    }
//
//    public List<Comentario> getComentarios() {
//        return comentarios;
//    }
//
//    public void setEtiquetas(List<Etiqueta> etiquetas) {
//        this.etiquetas = etiquetas;
//    }
//
//    public void setComentarios(List<Comentario> comentarios) {
//        this.comentarios = comentarios;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id.equals(usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
