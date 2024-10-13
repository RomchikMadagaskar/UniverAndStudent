package org.example;

import org.example.Models.Student;
import org.example.Models.University;
import org.example.Utilites.ReadXls;
import org.example.comparator.StudentInerfaceComparator;
import org.example.comparator.UniversityInterfaceComparator;
import org.example.comparator.UtilClassComparator;
import org.example.enums.StudentComparatorType;

import java.io.IOException;
import java.util.List;
import org.example.enums.UiversityComparatorType;

public class RunApp {
    public static void main(String[] args) throws IOException {

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
    }
}