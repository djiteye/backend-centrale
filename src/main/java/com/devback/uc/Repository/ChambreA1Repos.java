package com.devback.uc.Repository;

import java.util.Optional;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.devback.uc.Entity.ChambreA1;

@Repository
@Configuration
@EnableMongoRepositories(basePackages = "com.devback.uc.Repository.ChambreA1Repos")
public interface ChambreA1Repos extends MongoRepository<ChambreA1, String> {

	Optional<ChambreA1> findById(int id);

	void deleteById(long id);

}
