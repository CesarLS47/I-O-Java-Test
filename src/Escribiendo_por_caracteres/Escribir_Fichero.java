package Escribiendo_por_caracteres;

import java.io.FileWriter;
import java.io.IOException;


public class Escribir_Fichero{
    // Atributos
    private FileWriter salida;

    // Métodos

    private void AbrirArchivo(){
        try {
            salida = new FileWriter("C:/Users/Cesar/Desktop/nuevo2.txt");
            System.out.println("-Archivo creado con éxito");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("-No se ha podido crear el archivo");

            throw new RuntimeException(e);
        }
    }

    public void escribe(){
        AbrirArchivo();
        final String frase = "Esto no vale";

        for (int i = 0; i < frase.length(); i++){
            try {
                salida.write(frase.charAt(i));
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }

        CerrarArchivo();
    }

    private void CerrarArchivo(){
        try {
            salida.close();
            System.out.println("-Archivo cerrado con éxito");
        } catch (IOException e) {
            System.out.println("-Error al cerrar el archivo");
            throw new RuntimeException(e);
        }
    }

}