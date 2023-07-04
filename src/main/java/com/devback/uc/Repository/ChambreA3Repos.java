package com.devback.uc.Repository;

import java.util.Optional;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.devback.uc.Entity.ChambreA3;

@Repository
@Configuration
@EnableMongoRepositories(basePackages = "com.devback.uc.Repository.ChambreA3Repos")
public interface ChambreA3Repos extends MongoRepository<ChambreA3, String>{

	Optional<ChambreA3> findById(int id);

	void deleteById(int id);

}
