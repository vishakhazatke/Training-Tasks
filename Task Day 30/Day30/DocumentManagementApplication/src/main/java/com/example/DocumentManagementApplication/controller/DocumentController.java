package com.example.DocumentManagementApplication.controller;

import com.example.DocumentManagementApplication.entity.Document;
import com.example.DocumentManagementApplication.service.DocumentService;
import com.example.DocumentManagementApplication.util.PdfGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/documents")
public class DocumentController {

    @Autowired
    private DocumentService service;

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Document> upload(@RequestParam("file") MultipartFile file) throws IOException {
        return ResponseEntity.ok(service.uploadFile(file));
    }

    @GetMapping("/download/{id}")
    public ResponseEntity<Resource> download(@PathVariable Long id) throws IOException{

        Document doc = service.getDocument(id);
        Path path = Paths.get(doc.getFilePath());

        Resource resource = new UrlResource(path.toUri());

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=\"" + doc.getFileName() + "\"")
                .contentType(MediaType.parseMediaType(doc.getFileType()))
                .body(resource);
    }

    @GetMapping("/view/{id}")
    public ResponseEntity<Resource> viewImage(@PathVariable Long id) throws IOException{

        Document doc = service.getDocument(id);
        Path path = Paths.get(doc.getFilePath());

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(doc.getFileType()))
                .body(new UrlResource(path.toUri()));
    }

    @GetMapping("/generate-pdf")
    public String generatePdf() throws Exception{
        return PdfGenerator.generatePdf("Hello PDF from Spring Boot + MySQL");
    }
}
