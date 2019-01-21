package practicafinal1ev;

import java.io.*;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import org.w3c.dom.*;
import org.xml.sax.InputSource;

/**
 *
 * @author Junior
 */
public class xpath {

    String salida = "";
    Document doc = null;

    public String EjecutaXPath(File fichero, String consulta) {

        try {
            //Crea un DocumentBuilderFactory para el dom
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            //Crear un árbol DOM con el archivo coche.xml
            Document XMLDoc = factory.newDocumentBuilder().parse(new InputSource(new FileInputStream(fichero)));
            DocumentBuilder builder = factory.newDocumentBuilder();
            doc = builder.parse(fichero);
            //Crea el objeto XPath
            XPath xpath = XPathFactory.newInstance().newXPath();

            //Crea un XPathExpression con la consulta deseada
            XPathExpression exp = xpath.compile(consulta);

            //Ejecuta la consulta indicando que se ejecute sobre el DOM y que devuelve
            //el resultado como una lista de nodos.
            Object result = exp.evaluate(XMLDoc, XPathConstants.NODESET);
            NodeList nodeList = (NodeList) result;

            //Ahora recorre la lista para sacar los resultados
            for (int i = 0; i < nodeList.getLength(); i++) {
                if (consulta.equals("/coches/coche")) {

                    salida = salida + "\n Marca: " + nodeList.item(i).getAttributes().getNamedItem("marca").getNodeValue();
                    salida = salida + "\n Modelo: " + nodeList.item(i).getAttributes().getNamedItem("modelo").getNodeValue();
                    salida = salida + "\n AñoDeSalida: " + nodeList.item(i).getAttributes().getNamedItem("anioSalida").getNodeValue();
                    salida = salida + "\n Potencia: " + nodeList.item(i).getAttributes().getNamedItem("potencia").getNodeValue();
                    salida = salida + "\n Combustible: " + nodeList.item(i).getAttributes().getNamedItem("combustible").getNodeValue();
//                    salida = salida + "\nPrecio" + nodeList.item(i).getTextContent();
//                    salida = salida + "\nPeso" + nodeList.item(i).getTextContent();
//                    salida = salida + "\nEstrellas Seguridad" + nodeList.item(i).getTextContent();
//                    salida = salida + "\nTraccion" + nodeList.item(i).getTextContent();
//                    salida = salida + "\nTipo de Chasis" + nodeList.item(i).getTextContent();
                } else {

                    salida = salida + "\n" + nodeList.item(i).getTextContent();
                    salida = salida + "\n-----------------------------";

                }

            }

            return salida;

        } catch (Exception ex) {
            System.out.println("Error:" + ex.toString());
            return consulta;
        }

    }

}
