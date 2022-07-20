package com.codewithazam.com.codewithazam.review10;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/extra/info.xlsx";
        FileInputStream fis = new FileInputStream(filePath);

        Workbook work = new XSSFWorkbook(fis);

        Sheet sh = work.getSheet("Sheet1");

        Row row = sh.getRow(3);

        Cell cell = row.getCell(1);

        System.out.println(cell.toString());

        Row headerRow = sh.getRow(0);

        int cellNumber = headerRow.getLastCellNum();

        for (int i = 0; i < cellNumber; i++) {
            System.out.print (headerRow.getCell(i).toString() + ",");
        }


    }
}
