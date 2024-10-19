package org.example.utilites;

import org.example.models.AllData;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;
import java.util.logging.Logger;

public class XmlWriter {
    private static final Logger logger= Logger.getLogger(XmlWriter.class.getName());

    public static void writeToXml(AllData allData) {

        try {
            logger.info("Создание xml файла...");

            JAXBContext jaxbContext = JAXBContext.newInstance(AllData.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            try {
                logger.info("Создание директории выгрузки");
                Files.createDirectory(Path.of("./src/main/out/xmlReqs"));
            }catch(IOException e) {
                logger.info("дирректория уже существует"+e.toString());
            }

            File xmlFile = new File("./src/main/out/xmlReqs/req" + new Date().getTime() + ".xml");
            marshaller.marshal(allData, xmlFile);

        }catch(JAXBException jaxbException){
            logger.severe("Файл xml не создан!"+ jaxbException.toString());
            return;
        }
        logger.info("Создание xml файла успешно завершено");
    }
}
