package LW8.example4;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelFileExample {
    public static void main(String[] args) {
        try {
            String filePath = "untitled/src/LW8/example4/example.xlsx";
            FileInputStream inputStream = new FileInputStream(filePath);

            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            XSSFSheet sheet = workbook.getSheet("������");

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }

            workbook.close();
            inputStream.close();

        } catch (IOException e) {
            System.out.println("�������� ������: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
