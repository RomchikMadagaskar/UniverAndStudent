package org.example;

import org.example.models.AllData;
import org.example.models.Statistics;
import org.example.models.Student;
import org.example.models.University;
import org.example.utilites.*;
import org.example.comparator.StudentInerfaceComparator;
import org.example.comparator.UniversityInterfaceComparator;
import org.example.comparator.UtilClassComparator;
import org.example.enums.StudentComparatorType;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import org.example.enums.UiversityComparatorType;

public class RunApp {

    private static final Logger logger= Logger.getLogger(RunApp.class.getName());

    public static void main(String[] args){

        try{
            java.util.logging.LogManager.getLogManager().readConfiguration(RunApp.class.getResourceAsStream("/logging.properties"));
        }catch(IOException e){
            System.out.println("Нет файла конфигурации логгера"+e.toString());
        }

        logger.info("Запуск приложения...");

        List<University> universities= ReadXls.readXlsUniver("./src/main/resources/universityInfo.xlsx");
        UniversityInterfaceComparator universityComparator= UtilClassComparator.getUniversityComparator(UiversityComparatorType.FULL_NAME);
        universities.stream()
                .sorted(universityComparator)
                .forEach(System.out::println);

        List<Student> students=ReadXls.readXlsStud("./src/main/resources/universityInfo.xlsx");
        StudentInerfaceComparator studentComparator=UtilClassComparator.getStudentComparator(StudentComparatorType.FULL_NAME);
        students.stream()
                .sorted(studentComparator)
                .forEach(System.out::println);
        List<Statistics>statisticsList= ProcessingStatistic.createStatisticsList(students,universities);
        XlsWriter.writeToXls(statisticsList,"./src/main/out/exports.xlsx");

        AllData allData=new AllData()
                .setStudentList(students)
                .setUniversityList(universities)
                .setStatisticsList(statisticsList)
                .setDateToFile(new Date());

        XmlWriter.writeToXml(allData);
        JsonWriter.listWriteToJson(allData);

        logger.info("Приложение успешно завершило свою работу...");
    }
}