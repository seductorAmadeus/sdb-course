package com.repository;

import com.entities.SpaceshipDescription;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "spaceship_description", path = "spaceship_description")
public interface SpaceshipDescriptionRepository extends MongoRepository<SpaceshipDescription, String> {
}
