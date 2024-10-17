package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.models.Statistics;
import org.example.models.Student;
import org.example.models.University;
import org.example.utilites.ProcessingStatistic;
import org.example.utilites.ReadXls;
import org.example.utilites.XlsWriter;
import org.example.comparator.StudentInerfaceComparator;
import org.example.comparator.UniversityInterfaceComparator;
import org.example.comparator.UtilClassComparator;
import org.example.enums.StudentComparatorType;

import java.io.IOException;
import java.util.List;
import org.example.enums.UiversityComparatorType;

public class RunApp {

    private static final Logger logger= LogManager.getLogger(RunApp.class.getName());

    public static void main(String[] args) throws IOException{


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
        XlsWriter.writeToXls(statisticsList,"./src/main/resources/exports.xlsx");
    }
}