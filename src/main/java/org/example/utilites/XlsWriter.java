package org.example.utilites;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.models.Statistics;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class XlsWriter {
    public static void writeToXls(List<Statistics> statistics,String patchFile)throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("statistic");
        int rowI=0;
        Row header= sheet.createRow(rowI++);
        CellStyle headerStyle=workbook.createCellStyle();
        Font headFont =workbook.createFont();
        headFont.setFontHeightInPoints((short) 14);
        headFont.setBold(true);
        headerStyle.setFont(headFont);


        Cell profCellHead=header.createCell(0);
        profCellHead.setCellValue("Профиль обучения");
        profCellHead.setCellStyle(headerStyle);
        sheet.autoSizeColumn(0);

        Cell avgCellHead=header.createCell(1);
        avgCellHead.setCellValue("Средний балл за экзамен");
        avgCellHead.setCellStyle(headerStyle);
        sheet.autoSizeColumn(1);

        Cell totalStudCellHead=header.createCell(2);
        totalStudCellHead.setCellValue("Количество студентов по профилю");
        totalStudCellHead.setCellStyle(headerStyle);
        sheet.autoSizeColumn(2);

        Cell totalUniverCellHead=header.createCell(3);
        totalUniverCellHead.setCellValue("Количество университетов по профилю");
        totalUniverCellHead.setCellStyle(headerStyle);
        sheet.autoSizeColumn(3);

        Cell universCellHead=header.createCell(4);
        universCellHead.setCellValue("Университеты наименования");
        universCellHead.setCellStyle(headerStyle);
        sheet.autoSizeColumn(4);

        for(Statistics stat:statistics){
            Row tableRow=sheet.createRow(rowI++);

            Cell profCell=tableRow.createCell(0);
            profCell.setCellValue(stat.getProfile().getProfileName());

            Cell avgCell=tableRow.createCell(1);
            avgCell.setCellValue(stat.getAvgExamScore());

            Cell totalStudCell= tableRow.createCell(2);
            totalStudCell.setCellValue(stat.getTotalStudProf());

            Cell totalUniverCell=tableRow.createCell(3);
            totalUniverCell.setCellValue(stat.getTotalUniverProf());

            Cell universCell=tableRow.createCell(4);
            universCell.setCellValue(stat.getUniverName());
        }

        FileOutputStream outputStream=new FileOutputStream(patchFile);
        workbook.write(outputStream);
        workbook.close();

    }
}
