package helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import static helpers.Peticiones.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import peticiones.AbstractPeticion;
import peticiones.PeticionComentario;
import peticiones.PeticionNotificacion;
import peticiones.PeticionPublicacion;
import peticiones.PeticionPublicaciones;
import peticiones.PeticionUsuario;

public class ConvertirPeticion {

    public static AbstractPeticion PetitionConverter(String json, Integer hashcodeSC) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(json);
            String codigo = jsonNode.get("peticion").asText();
            AbstractPeticion peticion = null;// = objectMapper.readValue(json, BlackBoardObject.class);
            
            if(codigo.equals(REGISTRAR_USUARIO) || codigo.equals(INICIAR_SESION) || codigo.equals(ACTUALIZAR_USUARIO) || codigo.equals(ELIMINAR_USUARIO)){
                peticion = objectMapper.readValue(json, PeticionUsuario.class);
            }else if(codigo.equals(REGISTRAR_PUBLICACION) || codigo.equals(ACTUALIZAR_PUBLICACION) || codigo.equals(ELIMINAR_PUBLICACION) ){
                peticion = objectMapper.readValue(json, PeticionPublicacion.class);
            }else if(codigo.equals(AGREGAR_COMENTARIO) || codigo.equals(EDITAR_COMENTARIO) || codigo.equals(ELIMINAR_COMENTARIO)){
                peticion = objectMapper.readValue(json, PeticionComentario.class);
            }else if(codigo.equals(REGISTRAR_NOTIFICACION) || codigo.equals(ELIMINAR_NOTIFICACION)){
                peticion = objectMapper.readValue(json, PeticionNotificacion.class);
            }else if(codigo.equals(CONSULTAR_PUBLICACIONES) || codigo.equals(CONSULTAR_PUBLICACIONES_HASHTAG)){
                peticion = objectMapper.readValue(json, PeticionPublicaciones.class);
            }
            
            peticion.setHashcodeSC(hashcodeSC);
            //System.out.println(peticion);
            return peticion;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public static AbstractPeticion PetitionConverter(String json) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(json);
            String codigo = jsonNode.get("peticionRespuesta").asText();
            AbstractPeticion peticion = null;// = objectMapper.readValue(json, BlackBoardObject.class);
            
            if(codigo.equals(REGISTRAR_USUARIO) || codigo.equals(INICIAR_SESION) || codigo.equals(ACTUALIZAR_USUARIO) || codigo.equals(ELIMINAR_USUARIO) || codigo.equals(NOTIFICAR_CLIENTE)){
                peticion = objectMapper.readValue(json, PeticionUsuario.class);
            }else if(codigo.equals(REGISTRAR_PUBLICACION) || codigo.equals(ACTUALIZAR_PUBLICACION) || codigo.equals(ELIMINAR_PUBLICACION)){
                peticion = objectMapper.readValue(json, PeticionPublicacion.class);
            }else if(codigo.equals(AGREGAR_COMENTARIO) || codigo.equals(EDITAR_COMENTARIO) || codigo.equals(ELIMINAR_COMENTARIO)){
                peticion = objectMapper.readValue(json, PeticionComentario.class);
            }else if(codigo.equals(REGISTRAR_NOTIFICACION) || codigo.equals(ELIMINAR_NOTIFICACION)){
                peticion = objectMapper.readValue(json, PeticionNotificacion.class);
            }else if(codigo.equals(CONSULTAR_PUBLICACIONES) || codigo.equals(CONSULTAR_PUBLICACIONES_HASHTAG)){
                peticion = objectMapper.readValue(json, PeticionPublicaciones.class);
            }
            //System.out.println(peticion);
            return peticion;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static String JSONConverter(AbstractPeticion peticion) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(peticion);
            return json;
        } catch (JsonProcessingException ex) {
            Logger.getLogger(ConvertirPeticion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
