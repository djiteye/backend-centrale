package com.devback.uc.Repository;
import java.util.Optional;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.devback.uc.Entity.Chambre;
@Repository
@Configuration
@EnableMongoRepositories(basePackages = "com.devback.uc.Repository.ChambreRepos")
public interface ChambreRepos extends MongoRepository<Chambre, String> {

	Optional<Chambre> findById(int id);

	void deleteById(long id);

}
