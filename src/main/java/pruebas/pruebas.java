package pruebas;

import entidades.*;
import jakarta.persistence.*;

import java.util.List;

public class pruebas {

    private static EntityManager em;
    private static EntityManagerFactory emF;

    public static void main(String args[]){

        emF = Persistence.createEntityManagerFactory("persistencia");
        em = emF.createEntityManager();

        em.getTransaction().begin();

//        Usuario u = em.find(Usuario.class, 1L);
        Usuario u = new Usuario("Evaristo");
//        Publicacion p = new Publicacion(u);
//
//        Etiqueta etiqueta = new Etiqueta(p, em.find(Usuario.class, 2L));
//        Etiqueta otraEtiqueta = new Etiqueta(p, em.find(Usuario.class, 3L));
//
//        Hashtag h = new Hashtag("Yecorazo2022");
//
//        HashtagPublicacion hp = new HashtagPublicacion(h,p);
//
//        h.setHashtagPublicaciones(List.of(hp));
//        em.persist(h);
//
//        p.setEtiquetas(List.of(etiqueta,otraEtiqueta));
//        p.setHashtagPublicaciones(List.of(hp));
//
//        em.persist(p);

        Publicacion p = em.find(Publicacion.class, 17L);
        em.remove(p);

        em.getTransaction().commit();
        em.close();

    }

    static void agregarUsuario(Usuario u){
        emF = Persistence.createEntityManagerFactory("persistencia");
        em = emF.createEntityManager();

        em.getTransaction().begin();

        em.persist(u);

        em.getTransaction().commit();
        em.close();
    }

    static void eliminarUsuario(Usuario u){
        emF = Persistence.createEntityManagerFactory("persistencia");
        em = emF.createEntityManager();

        em.getTransaction().begin();

        em.remove(u);

        em.getTransaction().commit();
        em.close();
    }

    static Usuario buscarUsuario(Long id){
        emF = Persistence.createEntityManagerFactory("persistencia");
        em = emF.createEntityManager();

        em.getTransaction().begin();

        Usuario u = em.find(Usuario.class, id);

        em.getTransaction().commit();
        em.close();
        return u;
    }

    static Publicacion buscarPublicacion(Long id){
        emF = Persistence.createEntityManagerFactory("persistencia");
        em = emF.createEntityManager();

        em.getTransaction().begin();

        Publicacion p = em.find(Publicacion.class, id);

        em.getTransaction().commit();
        em.close();
        return p;
    }

    static void agregarPublicacion(Publicacion p){
        emF = Persistence.createEntityManagerFactory("persistencia");
        em = emF.createEntityManager();

        em.getTransaction().begin();

        em.persist(p);

        em.getTransaction().commit();
        em.close();
    }

    static void eliminarPublicacion(Long id){
        emF = Persistence.createEntityManagerFactory("persistencia");
        em = emF.createEntityManager();

        em.getTransaction().begin();

        Publicacion p = em.find(Publicacion.class, id);
        em.remove(p);

        em.getTransaction().commit();
        em.close();
    }


}
