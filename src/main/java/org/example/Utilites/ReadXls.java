package org.example.Utilites;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.Models.Student;
import org.example.Models.University;
import org.example.enums.StudyProfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadXls {
    private ReadXls(){

    }
    public static List<University> readXlsUniver(String patchFile) throws IOException{
        List<University> universities=new ArrayList<>();
        FileInputStream inputStream=new FileInputStream(patchFile);
        XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
        XSSFSheet sheet=workbook.getSheet("Университеты");
        Iterator<Row> rows=sheet.iterator();
        rows.next();

        while (rows.hasNext()){
            Row row=rows.next();
            University university=new University();
            universities.add(university);
            university.setId(row.getCell(0).getStringCellValue());
            university.setFullName(row.getCell(1).getStringCellValue());
            university.setShortName(row.getCell(2).getStringCellValue());
            university.setYearOfFoundation((int)row.getCell(3).getNumericCellValue());
            //строчка на 50% сфоормирована идеей, не уверен что она правильная
            university.setMainProfile(StudyProfile.valueOf(StudyProfile.class,row.getCell(4).getStringCellValue()));
        }
        return universities;
    }

    public static List<Student> readXlsStud(String patchFile)throws IOException{
        List<Student> students =new ArrayList<>();
        FileInputStream inputStream=new FileInputStream(patchFile);
        XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
        XSSFSheet sheet=workbook.getSheet("Студенты");
        Iterator<Row> rows=sheet.iterator();
        rows.next();

        while (rows.hasNext()){
            Row row= rows.next();
            Student student=new Student();
            students.add(student);
            student.setUniversityID(row.getCell(0).getStringCellValue());
            student.setFullName(row.getCell(1).getStringCellValue());
            student.setCurrentCourseNumber((int)row.getCell(2).getNumericCellValue());
            student.setAvgExamScore((float)row.getCell(3).getNumericCellValue());
        }
        return students;
    }
}
