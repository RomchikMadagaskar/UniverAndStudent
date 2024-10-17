package org.example.utilites;

import org.example.models.AllData;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Date;

public class XmlWriter {
    public static void writeToXml(AllData allData)throws JAXBException{

        JAXBContext jaxbContext=JAXBContext.newInstance(AllData.class);
        Marshaller marshaller= jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);

        //Files.createDirectory((Paths.get("xmlDir")));
        File xmlFile=new File("./xmlDir/genXml"+ new Date().getTime()+".xml");
        marshaller.marshal(allData,xmlFile);
    }
}
