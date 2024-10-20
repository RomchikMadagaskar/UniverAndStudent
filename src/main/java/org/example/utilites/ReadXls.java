package org.example.utilites;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.models.Student;
import org.example.models.University;
import org.example.enums.StudyProfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class ReadXls {

    private static final Logger logger= Logger.getLogger(ReadXls.class.getName());

        public static List<University> readXlsUniver(String patchFile){

            List<University> universities=new ArrayList<>();

           try{
               logger.info("Чтение файла xls для класса university");

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
           }catch (IOException e){
               logger.severe("Ошибка чтения файла...");
               return universities;
           }

        logger.info("Чтение xls для класса university файла успешно завершено!");
        return universities;
    }

    public static List<Student> readXlsStud(String patchFile){
        List<Student> students =new ArrayList<>();
        try {
            logger.info("Чтение файла xls для класса student");

            FileInputStream inputStream = new FileInputStream(patchFile);
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("Студенты");
            Iterator<Row> rows = sheet.iterator();
            rows.next();

            while (rows.hasNext()) {
                Row row = rows.next();
                Student student = new Student();
                students.add(student);
                student.setUniversityID(row.getCell(0).getStringCellValue());
                student.setFullName(row.getCell(1).getStringCellValue());
                student.setCurrentCourseNumber((int) row.getCell(2).getNumericCellValue());
                student.setAvgExamScore((float) row.getCell(3).getNumericCellValue());
            }
        }catch (IOException e){
            logger.severe("Ошибка чтения файла...");
            return students;
        }
        logger.info("Чтение xls для класса student файла успешно завершено!");
        return students;
    }
}
