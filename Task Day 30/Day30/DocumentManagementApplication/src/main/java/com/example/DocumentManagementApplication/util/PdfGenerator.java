package com.example.DocumentManagementApplication.util;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class PdfGenerator {

    public static String generatePdf(String text) throws Exception {

        String path = "uploads/generated.pdf";

        Document pdfDocument = new Document();

        PdfWriter.getInstance(pdfDocument, new FileOutputStream(path));
        pdfDocument.open();
        pdfDocument.add(new Paragraph(text));
        pdfDocument.close();

        return path;
    }
}
