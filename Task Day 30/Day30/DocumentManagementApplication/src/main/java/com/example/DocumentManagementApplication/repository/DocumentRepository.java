package com.example.DocumentManagementApplication.repository;

import com.example.DocumentManagementApplication.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DocumentRepository extends JpaRepository<Document, Long> {

    Optional<Document> findByFileName(String fileName);
}
