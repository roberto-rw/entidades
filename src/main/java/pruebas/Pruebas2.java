package pruebas;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entidades.Sexo;
import entidades.Usuario;
import helpers.Peticiones;
import java.util.Calendar;
import peticiones.AbstractPeticion;
import peticiones.PeticionComentario;
import peticiones.PeticionNotificacion;
import peticiones.PeticionPublicacion;
import peticiones.PeticionUsuario;

public class Pruebas2 {

    public static void main(String[] args) throws JsonProcessingException {
        Usuario usuario = new Usuario("kura", "1234", "asd@gmail.com", "2131231", Calendar.getInstance(), Sexo.HOMBRE, null);
        AbstractPeticion peticion = new PeticionUsuario(Peticiones.REGISTRAR_USUARIO, usuario);
        ObjectMapper om = new ObjectMapper();
        String json = om.writeValueAsString(peticion);
        System.out.println(json);
        System.out.println("---------------------------");

        if (peticion instanceof PeticionPublicacion) {
            AbstractPeticion peticion2 = om.readValue(json, PeticionPublicacion.class);
            System.out.println(peticion2);
        }else if (peticion instanceof PeticionComentario) {
            AbstractPeticion peticion2 = om.readValue(json, PeticionComentario.class);
            System.out.println(peticion2);
        }else if (peticion instanceof PeticionNotificacion) {
            AbstractPeticion peticion2 = om.readValue(json, PeticionNotificacion.class);
            System.out.println(peticion2);
        }else if (peticion instanceof PeticionUsuario) {
            AbstractPeticion peticion2 = om.readValue(json, PeticionUsuario.class);
            System.out.println(peticion2);
        }

        //Convertir la peticion a un PeticionPublicacion
//        try {
//            System.out.println("------------------------------");
//            AbstractPeticion peticion2 = om.readValue(json, PeticionPublicacion.class);
//            System.out.println(peticion2);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        //Convertir la peticion a un PeticionComentario
//        try {
//            System.out.println("------------------------------");
//            AbstractPeticion peticion2 = om.readValue(json, PeticionComentario.class);
//            System.out.println(peticion2);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        //Convertir la peticion a un PeticionNotificacion
//        try {
//            System.out.println("------------------------------");
//            AbstractPeticion peticion2 = om.readValue(json, PeticionNotificacion.class);
//            System.out.println(peticion2);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        //Convertir la peticion a un PeticionUsario
//        try {
//            System.out.println("------------------------------");
//            AbstractPeticion peticion2 = om.readValue(json, PeticionUsuario.class);
//            System.out.println(((PeticionUsuario) peticion2).getUsuario().getUsuario());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        //...
    }
}
