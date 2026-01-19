package com.example.DocumentManagementApplication.service;

import com.example.DocumentManagementApplication.entity.Document;
import com.example.DocumentManagementApplication.exception.FileNotFoundException;
import com.example.DocumentManagementApplication.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class DocumentService {

    private final String UPLOAD_DIR = "uploads/";

    @Autowired
    private DocumentRepository repository;

    public Document uploadFile(MultipartFile file) throws IOException{

        if(file.getSize() > 5 * 1024 * 1024) {
            throw new RuntimeException("File size exceeds limit");
        }

        String type = file.getContentType();
        if(!type.equals("application/pdf") && !type.startsWith("image/")){
            throw new RuntimeException("Invalid file type");
        }

        Files.createDirectories(Paths.get(UPLOAD_DIR));
        Path path = Paths.get(UPLOAD_DIR + file.getOriginalFilename());
        Files.write(path, file.getBytes());

        Document doc = new Document();
        doc.setFileName(file.getOriginalFilename());
        doc.setFileType(type);
        doc.setFileSize(file.getSize());
        doc.setFilePath(path.toString());

        return repository.save(doc);
    }

    public Document getDocument(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new FileNotFoundException("File not found"));
    }
}
