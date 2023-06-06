package com.devback.uc.Repository;

import java.util.Optional;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.devback.uc.Entity.User;

@Repository
@Configuration
@EnableMongoRepositories(basePackages = "com.devback.uc.Repository.UserRepos")
//@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
public interface UserRepos extends MongoRepository<User, String>{

	Optional<User> findByUsername(String username);

}
