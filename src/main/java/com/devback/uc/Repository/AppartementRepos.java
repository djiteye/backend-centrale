package com.devback.uc.Repository;
import java.util.Optional;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.devback.uc.Entity.Appartement;
@Repository
@Configuration
@EnableMongoRepositories(basePackages = "com.devback.uc.Repository.AppartementRepos")
public interface AppartementRepos extends MongoRepository<Appartement, String> {

	Optional<Appartement> findById(long id);

	void deleteById(long id);

}
