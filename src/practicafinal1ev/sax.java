package practicafinal1ev;

/**
 *
 * @author Junior
 */
import java.io.File;
import javax.swing.JFileChooser;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class sax {

    SAXParser parser;
    ManejadorSAX sh;
    File fXML;

    public int abrir_XML_SAX(File fichero) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();

            parser = factory.newSAXParser();

            sh = new ManejadorSAX();
            fXML = fichero;
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    class ManejadorSAX extends DefaultHandler {

        int ultimoelement;
        String cadena_resultado = "";

        public ManejadorSAX() {
            ultimoelement = 0;
        }

        @Override
        public void startElement(String uri, String localName, String qName,
                Attributes atts) throws SAXException {
            if (qName.equals("coches")) {
                cadena_resultado = cadena_resultado + "Caracteristicas de cada coche; \n";
                cadena_resultado = cadena_resultado + "-------------------";
            }
            if (qName.equals("coche")) {
                cadena_resultado = cadena_resultado + "\nMarca: " + atts.getValue(atts.getQName(2)) + "\n ";
                ultimoelement = 1;
                cadena_resultado = cadena_resultado + "\nModelo: " + atts.getValue(atts.getQName(3)) + "\n ";
                ultimoelement = 2;
                cadena_resultado = cadena_resultado + "\nAñoDeSalida: " + atts.getValue(atts.getQName(0)) + "\n ";
                ultimoelement = 3;
                cadena_resultado = cadena_resultado + "\nPotencia: " + atts.getValue(atts.getQName(4)) + "\n ";
                ultimoelement = 4;
                cadena_resultado = cadena_resultado + "\nCombustible: " + atts.getValue(atts.getQName(1)) + "\n ";
                ultimoelement = 5;
            } else if (qName.equals("precio")) {
                ultimoelement = 6;
                cadena_resultado = cadena_resultado + "\nPrecio: ";
            } else if (qName.equals("peso")) {
                ultimoelement = 7;
                cadena_resultado = cadena_resultado + "\nPeso: ";
            } else if (qName.equals("estrellasSeguridad")) {
                ultimoelement = 8;
                cadena_resultado = cadena_resultado + "\nEstrellas de Seguridad: ";
            } else if (qName.equals("traccion")) {
                ultimoelement = 9;
                cadena_resultado = cadena_resultado + "\nTraccion: ";
            } else if (qName.equals("tipoChasis")) {
                ultimoelement = 10;
                cadena_resultado = cadena_resultado + "\nTipo de Chasis: ";
            }

        }

        @Override
        public void endElement(String uri, String localName, String qName)
                throws SAXException {
            if (qName.equals("coche")) {
                System.out.println("He encontrado el final de un elemento.");
                cadena_resultado = cadena_resultado + "\n ------------------------------------------------------------------";
                cadena_resultado = cadena_resultado + "\n ------------------------------------------------------------------";
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws
                SAXException {
            if (ultimoelement == 6) {
                for (int i = start; i < length + start; i++) {
                    cadena_resultado = cadena_resultado + ch[i];
                }
            } else if (ultimoelement == 7) {
                for (int i = start; i < length + start; i++) {
                    cadena_resultado = cadena_resultado + ch[i];
                }
            } else if (ultimoelement == 8) {
                for (int i = start; i < length + start; i++) {
                    cadena_resultado = cadena_resultado + ch[i];
                }
            } else if (ultimoelement == 9) {
                for (int i = start; i < length + start; i++) {
                    cadena_resultado = cadena_resultado + ch[i];
                }
            } else if (ultimoelement == 10) {
                for (int i = start; i < length + start; i++) {
                    cadena_resultado = cadena_resultado + ch[i];
                }
            }
        }
    }

    public String recorrerSAX() {
        try {
            parser.parse(fXML, sh);
            return sh.cadena_resultado;
        } catch (SAXException e) {
            e.printStackTrace();
            return "Error al parsear con SAX";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error al parsear con SAX";
        }
    }

}
