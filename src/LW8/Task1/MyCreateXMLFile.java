package LW8.Task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import java.io.File;

public class MyCreateXMLFile {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("animals");
            doc.appendChild(rootElement);

            Element book1 = doc.createElement("animal");
            rootElement.appendChild(book1);

            Element title1 = doc.createElement("name");
            title1.appendChild(doc.createTextNode("Тузик"));
            book1.appendChild(title1);

            Element author1 = doc.createElement("genus");
            author1.appendChild(doc.createTextNode("Собака"));
            book1.appendChild(author1);

            Element year1 = doc.createElement("year");
            year1.appendChild(doc.createTextNode("2015"));
            book1.appendChild(year1);

            Element book2 = doc.createElement("animal");
            rootElement.appendChild(book2);

            Element title2 = doc.createElement("name");
            title2.appendChild(doc.createTextNode("Барсик"));
            book2.appendChild(title2);

            Element author2 = doc.createElement("genus");
            author2.appendChild(doc.createTextNode("Кошка"));
            book2.appendChild(author2);

            Element year2 = doc.createElement("year");
            year2.appendChild(doc.createTextNode("2020"));
            book2.appendChild(year2);

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(new File("untitled/src/LW8/Task1/animals.xml"));
            transformer.transform(source, result);
            System.out.println("XML-файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
