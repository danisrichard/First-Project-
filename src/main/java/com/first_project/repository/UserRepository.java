package com.first_project.repository;

import com.first_project.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import java.util.concurrent.Future;

@Repository
public interface UserRepository extends CrudRepository<User,UUID> {

    // VERSION: A
    @Async
    @Query("SELECT * FROM USER WHERE FIRSTNAME = :FIRSTNAME")
    Future<User> findByFirstName(String firstName);

}
