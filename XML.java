package convertor;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import javax.xml.transform.*;

public class XML extends Writer {

    public void gettextWriter()
            throws ParserConfigurationException, IOException, SAXException, XMLStreamException, TransformerException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();
        Element root = document.createElement("students");
        Element font = document.createElement("student");
        Element root1 = document.createElement("name");
        Element font1 = document.createElement("grade");
        Element root2 = document.createElement("name");
        Element font2 = document.createElement("grade");
        Element root3 = document.createElement("name");
        Element font3 = document.createElement("grade");
        document.appendChild(root);
        root1.setTextContent("Иван Иванов");
        root.appendChild(root1);
        font1.setTextContent("4.8");
        root.appendChild(font1);
        root2.setTextContent("Мария Кузнецова");
        root.appendChild(root2);
        font2.setTextContent("5.0");
        root.appendChild(font2);
        root3.setTextContent("Степан Кузьмин");
        root.appendChild(root3);
        font3.setTextContent("3.6");
        root.appendChild(font3);

        DOMImplementation impl = document.getImplementation();
        DOMImplementationLS implLS = (DOMImplementationLS) impl.getFeature("LS", "3.0");
        LSSerializer ser = implLS.createLSSerializer();
        // ser.getDomConfig().setParameter("format-pretty", "true");

        LSOutput out = implLS.createLSOutput();
        out.setEncoding("UTF-8");
        out.setByteStream(Files.newOutputStream(
                Paths.get("C:/Users/supre/OneDrive/Рабочий стол/Новая папка (11)/convertor/temp.xml")));
        ser.write(document, out);

    }
}
