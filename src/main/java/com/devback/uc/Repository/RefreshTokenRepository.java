package com.devback.uc.Repository;

import org.bson.types.ObjectId;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.devback.uc.Entity.RefreshToken;
@Repository
@Configuration
@EnableMongoRepositories(basePackages = "com.devback.uc.Repository.RefreshTokenRepository")
public interface RefreshTokenRepository extends MongoRepository<RefreshToken, String>{

	//void deleteById(String id);
	void deleteByOwner_id(ObjectId id);
	default void deleteByOwner_id(String id) {
		deleteByOwner_id(new ObjectId(id));
	}
	
}
