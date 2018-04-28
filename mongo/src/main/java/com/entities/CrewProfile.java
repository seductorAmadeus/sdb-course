package com.entities;

import com.annotation.CascadeSave;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "crew_profile")
public class CrewProfile {

    @Id
    private String id;

    @DBRef
    @Field("personalData")
    @CascadeSave
    private PersonalData personalData;

    private String expeditionMemberProfile;

    private Integer responsibleForSystem;

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public String getExpeditionMemberProfile() {
        return expeditionMemberProfile;
    }

    public void setExpeditionMemberProfile(String expeditionMemberProfile) {
        this.expeditionMemberProfile = expeditionMemberProfile;
    }

    public Integer getResponsibleForSystem() {
        return responsibleForSystem;
    }

    public void setResponsibleForSystem(Integer responsibleForSystem) {
        this.responsibleForSystem = responsibleForSystem;
    }

}
