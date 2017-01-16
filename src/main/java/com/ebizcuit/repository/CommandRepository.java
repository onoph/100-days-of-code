package com.ebizcuit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ebizcuit.domain.Command;

public interface CommandRepository extends MongoRepository<Command, Long> {

}
