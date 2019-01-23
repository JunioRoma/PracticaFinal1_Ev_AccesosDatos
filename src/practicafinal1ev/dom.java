package practicafinal1ev;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import java.io.File;
import java.io.FileOutputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Junior
 */
public class dom {

    Document doc = null;

    public int guardarDOMcomoFILE(String ruta) {
        try {
            File archivo_xml = new File(ruta);
            OutputFormat format = new OutputFormat(doc);
            format.setIndenting(true);
            XMLSerializer serializer = new XMLSerializer(new FileOutputStream(archivo_xml), format);
            serializer.serialize(doc);
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    public int abrir_XML_DOM(File fichero) {

        try {
            //crea un objeto DocumentBuiderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);
            factory.setIgnoringElementContentWhitespace(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            doc = (Document) builder.parse(fichero);

            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public String recorrerDOMyMostrar() {

        String datos_nodo[] = null;
        String salida = "";
        Node node;
        try {
            //Obtenemos el primer nodo del Dom.
            Node raiz = doc.getFirstChild();
            NodeList listaNodos = raiz.getChildNodes();
            for (int i = 0; i < listaNodos.getLength(); i++) {
                node = listaNodos.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    datos_nodo = leeListaCoches(node);
                    salida = salida + "\n" + "marca; " + datos_nodo[0];
                    salida = salida + "\n" + "modelo; " + datos_nodo[1];
                    salida = salida + "\n" + "anioSalida; " + datos_nodo[2];
                    salida = salida + "\n" + "potencia; " + datos_nodo[3];
                    salida = salida + "\n" + "combustible; " + datos_nodo[4];
                    salida = salida + "\n" + "precio; " + datos_nodo[5];
                    salida = salida + "\n" + "peso; " + datos_nodo[6];
                    salida = salida + "\n" + "estrellasSeguridad; " + datos_nodo[7];
                    salida = salida + "\n" + "traccion; " + datos_nodo[8];
                    salida = salida + "\n" + "tipoChasis; " + datos_nodo[9];
                    salida = salida + "\n" + "-------------------------------------";
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return salida;

    }

    private String[] leeListaCoches(Node n) {

        String datos[] = new String[3];
        Node ntemp = null;
        int contador = 1;

        datos[0] = n.getAttributes().item(0).getNodeValue();

                NodeList nodos = n.getChildNodes();

        for (int i = 0; i < nodos.getLength(); i++) {
            ntemp = nodos.item(i);
            if (ntemp.getNodeType() == Node.ELEMENT_NODE) {
                datos[contador] = ntemp.getChildNodes().item(0).getNodeValue();
                contador++;
            }
        }

        return datos;

    }

    public int aniadirDom(File archivo, String marca, String modelo, String aniosalida,
            String potencia, String combustible, String precio, String peso,
            String estrellasSeguridad, String traccion, String tipoChasis) {
        try {

            Node cocheNode = doc.createElement("coche");

            ((Element) cocheNode).setAttribute("marca", marca);
            ((Element) cocheNode).setAttribute("modelo", modelo);
            ((Element) cocheNode).setAttribute("aniosalida", aniosalida);
            ((Element) cocheNode).setAttribute("potencia", potencia);
            ((Element) cocheNode).setAttribute("combustible", combustible);

            Node precioNode = doc.createElement("precio");

            Node precioTxNode = doc.createTextNode(precio);

            precioNode.appendChild(precioTxNode);

            Node pesoNode = doc.createElement("peso");
            Node pesoTxNode = doc.createTextNode(peso);
            pesoNode.appendChild(pesoTxNode);

            Node seguridadNode = doc.createElement("estrellasSeguridad");
            Node seguridadTxNode = doc.createTextNode(estrellasSeguridad);
            seguridadNode.appendChild(seguridadTxNode);

            Node traccionNode = doc.createElement("traccion");
            Node traccionTxNode = doc.createTextNode(traccion);
            traccionNode.appendChild(traccionTxNode);

            Node chasisNode = doc.createElement("tipoChasis");
            Node chasisTxNode = doc.createTextNode(tipoChasis);
            chasisNode.appendChild(chasisTxNode);

            cocheNode.appendChild(precioNode);
            cocheNode.appendChild(pesoNode);
            cocheNode.appendChild(seguridadNode);
            cocheNode.appendChild(traccionNode);
            cocheNode.appendChild(chasisNode);

            Node raiz = doc.getChildNodes().item(0);
            raiz.appendChild(cocheNode);

            File archivo_xml = archivo;
            OutputFormat format = new OutputFormat(doc);
            format.setIndenting(true);
            XMLSerializer serializer = new XMLSerializer(new FileOutputStream(archivo_xml), format);
            serializer.serialize(doc);

            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

    }

}
