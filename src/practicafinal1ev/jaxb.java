package practicafinal1ev;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javaCoches.Coches;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Junior
 */
public class jaxb {

    Coches misCoches;
    List<Coches.Coche> pruebaCoche;
    File fichero;

    public int abrir_XML_JAXB(File fichero) {
        JAXBContext contexto;

        try {
            //creamos una instancia JAXB
            contexto = JAXBContext.newInstance(Coches.class);

            //creamos un objeto Ubnaesheller
            Unmarshaller u = contexto.createUnmarshaller();

            //desalizamos el fichero
            misCoches = (Coches) u.unmarshal(fichero);
            pruebaCoche.add(misCoches.getCoche());

            return 0;

        } catch (Exception ex) {
            ex.printStackTrace();
            return -1;
        }

    }

    public int guardar_XML_JAXB(File prueba17) {
        JAXBContext contexto;

        try {
         
            //creamos una instancia JAXB
            contexto = JAXBContext.newInstance(Coches.class);

            //creamos un objeto Ubnaesheller
            Marshaller u = contexto.createMarshaller();

            u.setProperty(u.JAXB_FORMATTED_OUTPUT, true);
            u.marshal(misCoches, fichero);

            return 0;

        } catch (Exception ex) {
            ex.printStackTrace();
            return -1;
        }

    }

    public String recorrerJAXByMostrar() {
        String datos_nodo[] = null;
        String cadena_resultado = "";
//Crea una lista con objetos de tipo libro.
        pruebaCoche = (List<Coches.Coche>) misCoches.getCoche();
//Recorre la lista para sacar los valores.
        for (int i = 0; i < pruebaCoche.size(); i++) {
            cadena_resultado = cadena_resultado + "\n" + "Marca: " + pruebaCoche.get(i).getMarca();
            cadena_resultado = cadena_resultado + "\n" + "Modelo: " + pruebaCoche.get(i).getModelo();
            cadena_resultado = cadena_resultado + "\n" + "Año de salida: " + pruebaCoche.get(i).getAnioSalida();
            cadena_resultado = cadena_resultado + "\n" + "Potencia: " + pruebaCoche.get(i).getPotencia();
            cadena_resultado = cadena_resultado + "\n" + "Combustible: " + pruebaCoche.get(i).getCombustible();
            cadena_resultado = cadena_resultado + "\n" + "Precio: " + pruebaCoche.get(i).getPrecio();
            cadena_resultado = cadena_resultado + "\n" + "Peso: " + pruebaCoche.get(i).getPeso();
            cadena_resultado = cadena_resultado + "\n" + "Estrellas de seguridad: " + pruebaCoche.get(i).getEstrellasSeguridad();
            cadena_resultado = cadena_resultado + "\n" + "Traccion: " + pruebaCoche.get(i).getTraccion();
            cadena_resultado = cadena_resultado + "\n" + "Tipo de chasis: " + pruebaCoche.get(i).getTipoChasis();
            

            cadena_resultado = cadena_resultado + "\n ----------------------------";
        }
        return cadena_resultado;
    }
    
    
    

}
