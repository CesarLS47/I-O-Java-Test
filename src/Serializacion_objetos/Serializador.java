package Serializacion_objetos;

import java.io.*;

public class Serializador {

    // Obtiene por entrada un objeto de tipo "ObjetoParaSerializar"
    // Crea un archivo con la extensión ".ser" de bytes donde almacenar el objeto
    // Vuelca el objeto en el disco en el archivo "*.ser"

    public void SerializarObjetoToArchivo(ObjetoParaSerializar inputObjeto) {
        FileOutputStream archivo_salida;

        try {
            // Se crea el archivo sobre el que se va escribir
            archivo_salida = new FileOutputStream("clientes.ser");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            // Se crea el stream apuntando al archivo creado
            // Stream para conectar el objeto con el archivo de bytes.
            ObjectOutputStream salida = new ObjectOutputStream(archivo_salida);

            // Se utiliza el metodo writeObject() pasandole el objeto que queremos serializar.
            salida.writeObject(inputObjeto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Toma el archivo creado con el método "SerializarObjetoToArchivo" y lo introduce a la memoria devolviendolo como parámetro.
    public ObjetoParaSerializar DesSerializarArchivoToObjeto(){
        ObjetoParaSerializar objetoCreado;
        FileInputStream archivo_input;
        ObjectInputStream objeto_deserializado;

        try {
            archivo_input = new FileInputStream("clientes.ser");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            objeto_deserializado = new ObjectInputStream(archivo_input);
            objetoCreado = (ObjetoParaSerializar) objeto_deserializado.readObject();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return objetoCreado;
    }

}
