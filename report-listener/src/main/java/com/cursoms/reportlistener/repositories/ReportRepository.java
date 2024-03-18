package com.cursoms.reportlistener.repositories;

import com.cursoms.reportlistener.documents.ReportDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReportRepository extends MongoRepository<ReportDocument, String> {


}
