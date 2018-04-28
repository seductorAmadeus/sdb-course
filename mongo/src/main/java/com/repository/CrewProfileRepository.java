package com.repository;

import com.entities.CrewProfile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "crew_profile")
public interface CrewProfileRepository extends MongoRepository<CrewProfile, String> {

    List<CrewProfile> findCrewProfileByExpeditionMemberProfile(@Param("expedition_member_profile") String expeditionMemberProfile);

}
