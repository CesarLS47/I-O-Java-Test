package teststreams.leyendoPorCaracteres;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Acceso_Fichero {
    // Atributos
    private FileReader archivo_entrada;

    // Métodos
    private void AbrirArchivo(){
        try {
            archivo_entrada = new FileReader("C:/Users/Cesar/Desktop/nuevo1.txt");
            System.out.println("-Archivo abierto con éxito");
        } catch (FileNotFoundException e) {
            System.out.println("-No se ha encontrado el archivo especificado");
            throw new RuntimeException(e);
        }
    }

    public void lee(){
        this.AbrirArchivo();

        Scanner scanner_lineas = new Scanner(archivo_entrada);

        System.out.println("-Contenido del archivo:");
        while (scanner_lineas.hasNext()){
            System.out.println(scanner_lineas.nextLine());
        }

        CerrarArchivo();
    }

    private void CerrarArchivo(){
        try {
            archivo_entrada.close();
            System.out.println("-Archivo cerrado con éxito");
        } catch (IOException e) {
            System.out.println("-Error al cerrar el archivo");
            throw new RuntimeException(e);
        }
    }
}