import java.io.File;
import java.io.IOException;

public class CreandoArchivos {
    public static void main(String[] args) {

        // Path con la ruta del nuevo directorio que queremos crear
        // en este caso datos_economicos
        String directory_path = File.separator + "" +
                File.separator + "" +
                File.separator + "" +
                File.separator + "ejemplo" +
                File.separator + "datos_economicos";

        // Path con la ruta del nuevo archivo que queremos crear
        // dentro de datos_economicos
        String file_path = File.separator + "" +
                File.separator + "" +
                File.separator + "" +
                File.separator + "ejemplo" +
                File.separator + "datos_economicos" +
                File.separator + "economia.txt";

        crearDirectorio(directory_path);
        try {
            crearArchivo(file_path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void crearDirectorio(String path) {
        File newDirectorio = new File(path);
        if (newDirectorio.exists()) System.out.println("El directorio no se ha creado porque ya existe");
        else {
            newDirectorio.mkdir();
            System.out.println("Directorio creado correctamente");
        }
    }

    static void crearArchivo(String path) throws IOException {
        File newFile = new File(path);
        if (newFile.exists()) System.out.println("El archivo no se ha creado porque ya existe");
        else {
            newFile.createNewFile();
            System.out.println("Archivo creado correctamente");
        }
    }
}