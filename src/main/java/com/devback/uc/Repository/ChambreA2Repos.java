package com.devback.uc.Repository;

import java.util.Optional;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.devback.uc.Entity.ChambreA1;
import com.devback.uc.Entity.ChambreA2;

@Repository
@Configuration
@EnableMongoRepositories(basePackages = "com.devback.uc.Repository.ChambreA2Repos")
public interface ChambreA2Repos extends MongoRepository<ChambreA2, String>  {

	Optional<ChambreA2> findById(int id);

	void deleteById(int id);

	void save(ChambreA1 car);

}
