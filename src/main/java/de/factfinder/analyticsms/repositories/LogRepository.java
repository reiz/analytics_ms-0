package de.factfinder.analyticsms.repositories;

import de.factfinder.analyticsms.models.Log;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository extends MongoRepository<Log, String> {

}
