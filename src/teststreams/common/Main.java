package teststreams.common;

import teststreams.buffers.Acceso_BufferedReader;
import teststreams.escribirPorCaracteres.Escribir_Fichero;
import teststreams.leyendoPorCaracteres.Acceso_Fichero;
import teststreams.serializacionObjetos.ObjetoParaSerializar;
import teststreams.serializacionObjetos.Serializador;

public class Main {

  public static void main(String[] args) {
    /*Leer un archivo como caracteres*/
    //Acceso_Fichero leyendo = new Acceso_Fichero();
    //leyendo.lee();

    //Escribir en un archivo como caracteres
    Escribir_Fichero escribiendo = new Escribir_Fichero();
    escribiendo.escribe();


    /* Serializacion */
    // Objeto ejemplo para serializar, importante que el objeto implemente la interfaz "Serializable"
    ObjetoParaSerializar objetoPruebaParaSerializar = new ObjetoParaSerializar();

    // Incluye los metodos para serializar un objeto a un archivo, y para des-serializarlo
    Serializador serializador = new Serializador();

    serializador.SerializarObjetoToArchivo(objetoPruebaParaSerializar);
    ObjetoParaSerializar ObjetoPruebaDeserializado = serializador.DesSerializarArchivoToObjeto();

    System.out.println("\n Los objetos coinciden en su datos? " + ObjetoPruebaDeserializado.equals(
        objetoPruebaParaSerializar));
    System.out.println(ObjetoPruebaDeserializado);

    // Leer un archivo mediante Buffer
    Acceso_BufferedReader nueva_lectura = new Acceso_BufferedReader();
    nueva_lectura.leer();
  }
}
