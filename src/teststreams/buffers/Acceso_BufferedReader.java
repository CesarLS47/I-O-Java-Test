package teststreams.buffers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Acceso_BufferedReader {

  public void leer() {

    try {
      // Se crea un objeto apuntando al archivo con el cual queremos conectar el buffer
      FileReader entrada = new FileReader("C:/Users/Cesar/Desktop/nuevo1.txt");

      // Se crea el buffer pasandole al constructor el archivo.
      BufferedReader buffer_lectura = new BufferedReader(entrada);

      // Creamos un string vacio donde almacenaremos cada linea del archivo.
      String linea = "";

      // Lectura del archivo mediante el método readLine()
      while (linea != null){
        linea = buffer_lectura.readLine();
        System.out.println(linea);
      }

      // Cerramos el archivo cuando dejamos de utilizarlo.
      buffer_lectura.close();
    } catch (IOException e) {
      System.out.println("Imposible abrir el archivo");
    }


  }
}
