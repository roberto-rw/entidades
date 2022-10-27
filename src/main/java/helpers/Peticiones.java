package helpers;

public class Peticiones {
    /// 101 -> 1 = Usuario, 0 = no se, 1 = Agregar
    public static String REGISTRAR_USUARIO = "100";
    public static String INICIAR_SESION = "101";
    public static String ACTUALIZAR_USUARIO = "102";
    public static String ELIMINAR_USUARIO = "103";

    public static String REGISTRAR_PUBLICACION = "200";
    public static String ACTUALIZAR_PUBLICACION= "201";
    public static String ELIMINAR_PUBLICACION = "202";

    public static String CONSULTAR_PUBLICACIONES = "203";
    public static String CONSULTAR_PUBLICACIONES_HASHTAG = "204";

    public static String AGREGAR_COMENTARIO = "300";
    public static String EDITAR_COMENTARIO = "301";
    public static String ELIMINAR_COMENTARIO = "302";

    public static String REGISTRAR_NOTIFICACION = "400";
    public static String ELIMINAR_NOTIFICACION = "401";

    public static String LOGGEAR = "500";
    public static String NOTIFICAR_TODOS = "600";
}
