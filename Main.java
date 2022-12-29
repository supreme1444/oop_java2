package convertor;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

public class Main {
    public static   void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XMLStreamException, TransformerException
    {
      SimpleText si= new SimpleText();
      XML xm = new XML();
      Json js = new Json();
        si.gettextWriter();
        xm.gettextWriter();
        js.gettextWriter();

        System.out.println(si);
       
       
        
       
            
    }
}
