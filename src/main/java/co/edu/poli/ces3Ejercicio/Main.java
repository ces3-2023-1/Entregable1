package co.edu.poli.ces3Ejercicio;

import co.edu.poli.ces3Ejercicio.models.Producto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class Main {
    public Main() {

    }
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new XmlMapper();
            InputStream inputStream = new FileInputStream(new File("src\\resourses\\Producto.xml"));//lectura de datos, cactura de entrada por teclado
            TypeReference<List<Producto>> typeReference = new TypeReference<List<Producto>>() {};

            List<Producto> listaProductos = mapper.readValue(inputStream,typeReference);

            System.out.println("coool!!");
            //System.out.println(System.getProperty("user.dir"));
        }
        catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
