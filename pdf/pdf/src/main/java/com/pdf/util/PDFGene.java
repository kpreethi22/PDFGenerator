package com.pdf.util;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;

public class PDFGene {

    private static final String FILE_NAME = "D:\\pdf doc\\pdf documentation\\sample1.pdf";

    public void writeUsingIText() {

        Document document = new Document();

        try {

            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));

            //open
            document.open();

            Paragraph p = new Paragraph();
            p.add("Reservation");
            p.setAlignment(Element.ALIGN_CENTER);

            document.add(p);



            Font f = new Font();
            f.setStyle(Font.BOLD);
            f.setSize(8);

            document.add(new Paragraph("reservation details", f));
            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(100);


            // t.setBorderColor(BaseColor.GRAY);
            // t.setPadding(4);
            // t.setSpacing(4);
            // t.setBorderWidth(1);


            PdfPCell c1 = new PdfPCell(new Phrase("Table Header 1"));
            c1.setColspan(2);
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);




            table.setHeaderRows(1);

            table.addCell("name");
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell("1.1");
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);

            table.addCell("age");
            table.addCell("2.2");

            document.add(table);



            //close
            document.close();

            System.out.println("Done");

        } catch (Exception e) {
            e.printStackTrace();


        }

    }
}



