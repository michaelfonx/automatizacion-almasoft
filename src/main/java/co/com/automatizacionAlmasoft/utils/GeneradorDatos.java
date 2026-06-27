package co.com.automatizacionAlmasoft.utils;

import java.util.Random;

public class GeneradorDatos {

    private static final Random RANDOM = new Random();

    public static String generarDocumento() {
        return String.valueOf(
                100000000 + RANDOM.nextInt(900000000)
        );
    }

    public static String generarTelefono() {
        return "3" +
                (100000000 + RANDOM.nextInt(899999999));
    }

    public static String generarCorreo() {
        return "usuario"
                + System.currentTimeMillis()
                + "@gmail.com";
    }

    public static String generarNombreProducto() {
        return "Producto_" + System.currentTimeMillis();
    }

    public static String generarDescripcionProducto() {
        return "Descripcion automatica " + System.currentTimeMillis();
    }

    public static String generarPrecio() {
        return String.valueOf(
                10000 + new Random().nextInt(500000)
        );
    }

    public static String nombreSubcategoria() {
        return "SubCategoria_" + System.currentTimeMillis();
    }


}