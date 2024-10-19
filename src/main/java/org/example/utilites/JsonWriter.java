package org.example.utilites;

import org.example.models.AllData;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Logger;

public class JsonWriter {
    private static final Logger logger= Logger.getLogger(JsonWriter.class.getName());

    public static void listWriteToJson(AllData allData){

        String writeToJson;
        try{
            Files.createDirectory(Path.of("./src/main/out/jsonReqs"));
            logger.info("Дирректория для выгрузки создана");
        }catch(IOException e){
            logger.info("Директория для выгрузки уже существует");
        }

        writeToJson=JsonUtil.collectionToJson(allData.getStudentList());
        try{
            FileOutputStream fileOutputStream=new FileOutputStream("./src/main/out/jsonReqs/students"+allData.getDateToFile().getTime()+".json");
            fileOutputStream.write(writeToJson.getBytes(StandardCharsets.UTF_8));
        }catch(IOException e){
            logger.severe("Ошибка записи в JSON studentList"+e.toString());
        }

        writeToJson=JsonUtil.collectionToJson(allData.getUniversityList());
        try{
            FileOutputStream fileOutputStream=new FileOutputStream("./src/main/out/jsonReqs/universities"+allData.getDateToFile().getTime()+".json");
            fileOutputStream.write(writeToJson.getBytes(StandardCharsets.UTF_8));
        }catch(IOException e){
            logger.severe("Ошибка записи в JSON universitiyList"+e.toString());
        }

        writeToJson=JsonUtil.collectionToJson(allData.getStatisticsList());
        try{
            FileOutputStream fileOutputStream=new FileOutputStream("./src/main/out/jsonReqs/statistics"+allData.getDateToFile().getTime()+".json");
            fileOutputStream.write(writeToJson.getBytes(StandardCharsets.UTF_8));
        }catch(IOException e){
            logger.severe("Ошибка записи в JSON statisticsList"+e.toString());
        }
    }
}
