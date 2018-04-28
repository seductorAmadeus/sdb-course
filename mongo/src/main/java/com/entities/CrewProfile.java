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

    private String fullName;

    private String birthDate;

    private String city;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getRequiredAccessLevel() {
        return requiredAccessLevel;
    }

    public void setRequiredAccessLevel(Integer requiredAccessLevel) {
        this.requiredAccessLevel = requiredAccessLevel;
    }

    public String getSpecialSkills() {
        return specialSkills;
    }

    public void setSpecialSkills(String specialSkills) {
        this.specialSkills = specialSkills;
    }

    private Integer requiredAccessLevel;

    private String specialSkills;

    private String expeditionMemberProfile;

    private Integer responsibleForSystem;


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
