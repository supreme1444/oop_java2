package convertor;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.xml.sax.SAXException;

public abstract class Writer {
    public abstract void gettextWriter() throws TransformerConfigurationException, TransformerFactoryConfigurationError, ParserConfigurationException, IOException, SAXException, XMLStreamException, TransformerException;
    
}

    


   
