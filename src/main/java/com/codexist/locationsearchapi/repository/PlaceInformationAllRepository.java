package com.codexist.locationsearchapi.repository;

import com.codexist.locationsearchapi.model.document.PlaceInformationAllDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlaceInformationAllRepository extends MongoRepository<PlaceInformationAllDocument, String> {

}
