import teststreams.escribirPorCaracteres.Escribir_Fichero;
import teststreams.leyendoPorCaracteres.Acceso_Fichero;
import teststreams.serializacionObjetos.ObjetoParaSerializar;
import teststreams.serializacionObjetos.Serializador;

public class Main {
    public static void main(String[] args) {
        /*Para Leer un archivo como caracteres*/
        Acceso_Fichero leyendo = new Acceso_Fichero();
        leyendo.lee();

        //Para escribir en un archivo como caracteres
        Escribir_Fichero escribiendo = new Escribir_Fichero();
        escribiendo.escribe();


        /* Serializacion */

        // Objeto ejemplo para serializar, importante que el objeto implemente la interfaz "Serializable"
        ObjetoParaSerializar prueba = new ObjetoParaSerializar();

        // Incluye los metodos para serializar un objeto a un archivo, y para des-serializarlo
        Serializador serializador_des= new Serializador();

        serializador_des.SerializarObjetoToArchivo(prueba);
        ObjetoParaSerializar vuelta = serializador_des.DesSerializarArchivoToObjeto();

    }
}
